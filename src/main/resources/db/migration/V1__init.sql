-- noinspection SqlNoDataSourceInspection
CREATE TABLE IF NOT EXISTS conference (
    id SERIAL PRIMARY KEY,
    title VARCHAR(20),
    description VARCHAR(20),
    city VARCHAR(20),
    total_assistants INT
    );

CREATE TABLE IF NOT EXISTS assistant (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(20),
    rolee VARCHAR(20),
    age INT,
    conference_id INT REFERENCES conference(id)
    );