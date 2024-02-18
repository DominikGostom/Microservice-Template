CREATE TABLE IF NOT EXISTS conversation(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(1000),
    description VARCHAR(1000),
    controversial_topics_id INT REFERENCES controversial_topics(id),
    start_time TIMESTAMP NOT NULL,
    finish_time TIMESTAMP,
    video_identifier VARCHAR(255),
    public_conv BOOLEAN NOT NULL,
    save_stats BOOLEAN NOT NULL,
    max_viewers INT,
    average_viewers INT
    );

CREATE TABLE IF NOT EXISTS conversation_users(
   id BIGSERIAL PRIMARY KEY,
   conversation_id BIGSERIAL REFERENCES conversation(id),
   user_id BIGSERIAL REFERENCES users(id)
);


CREATE TABLE IF NOT EXISTS user_voters (
   id BIGSERIAL PRIMARY KEY,
   conversation_user_id BIGSERIAL REFERENCES conversation_users(id)
);