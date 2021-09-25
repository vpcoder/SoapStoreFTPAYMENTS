DROP TABLE IF EXISTS user;
CREATE TABLE user(
    id BIGINT PRIMARY KEY,
    login VARCHAR(255),
    password VARCHAR(255)
);

DROP TABLE IF EXISTS request;
CREATE TABLE request(
    id BIGINT auto_increment PRIMARY KEY,
    user_id BIGINT,
    name VARCHAR(255),
    method VARCHAR(255),
    body VARCHAR(30000)
);