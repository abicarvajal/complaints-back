CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    identification VARCHAR(255) UNIQUE
);

INSERT INTO users (name, identification) VALUES
('Alicia Chavez', '1758635569'),
('Bernardo Naranjo', '075589562'),
('Carlos Tapia', '1853692265');