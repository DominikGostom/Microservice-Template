CREATE TABLE IF NOT EXISTS wallet(
    id BIGSERIAL PRIMARY KEY,
    user_id BIGSERIAL REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS coin(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255),
    coin_value DECIMAL
);

CREATE TABLE IF NOT EXISTS wallet_coin(
    coin_id BIGSERIAL REFERENCES coin(id),
    wallet_id BIGSERIAL REFERENCES wallet(id),
    number_of_coin INT CHECK(number_of_coin > 0 )
);

