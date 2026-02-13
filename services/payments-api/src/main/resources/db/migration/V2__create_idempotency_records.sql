CREATE TABLE idempotency_records (
    id UUID PRIMARY KEY,
    idempotency_key VARCHAR(200) NOT NULL,
    route VARCHAR(200) NOT NULL,
    request_hash VARCHAR(128) NOT NULL,
    response_code INT NOT NULL,
    response_body TEXT NOT NULL,
    created_at TIMESTAMP WITH TIME ZONE NOT NULL
);

CREATE UNIQUE INDEX ux_idempotency_key_route
ON idempotency_records (idempotency_key, route);
