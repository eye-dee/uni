CREATE TABLE client
(
  id          SERIAL PRIMARY KEY,
  client_name VARCHAR(255) NOT NULL UNIQUE,
  age         INT          NOT NULL
);

CREATE TABLE book
(
  id        SERIAL PRIMARY KEY,
  client_id INT REFERENCES client (id) ON DELETE CASCADE,
  sum       INT NOT NULL
);