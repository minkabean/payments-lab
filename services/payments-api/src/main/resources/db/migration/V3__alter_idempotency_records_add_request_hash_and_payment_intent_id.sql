-- 1) Add columns needed for idempotency behavior
ALTER TABLE idempotency_records
  ADD COLUMN IF NOT EXISTS request_hash TEXT NOT NULL DEFAULT '',
  ADD COLUMN IF NOT EXISTS payment_intent_id UUID NULL;

-- 2) Enforce uniqueness of the key (single-tenant, single-endpoint lab scope)
CREATE UNIQUE INDEX IF NOT EXISTS ux_idempotency_records_key
  ON idempotency_records (idempotency_key);

-- 3) Optional: link to payment_intents (recommended)
ALTER TABLE idempotency_records
  ADD CONSTRAINT fk_idempotency_payment_intent
  FOREIGN KEY (payment_intent_id) REFERENCES payment_intents(id);
