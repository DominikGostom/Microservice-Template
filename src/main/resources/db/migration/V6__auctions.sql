CREATE TABLE auctions (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    end_time TIMESTAMP WITH TIME ZONE NOT NULL,
    starting_price NUMERIC(10, 2) NOT NULL,
    buy_now_price NUMERIC(10, 2) NOT NULL
);

CREATE TABLE bids (
    id BIGSERIAL PRIMARY KEY,
    auction_id BIGINT NOT NULL,
    bidder_name VARCHAR(255) NOT NULL,
    bid_amount NUMERIC(10, 2) NOT NULL,
    bid_time TIMESTAMP WITH TIME ZONE NOT NULL,
    FOREIGN KEY (auction_id) REFERENCES auctions(id)
);