CREATE TABLE users
(
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100) NOT NULL,
    enabled  BOOLEAN      NOT NULL
);

CREATE TABLE authorities
(
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    CONSTRAINT fk_user FOREIGN KEY (username) REFERENCES users (username)
);

CREATE UNIQUE INDEX idx_user_authority ON authorities (username, authority);
