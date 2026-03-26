CREATE TABLE IF NOT EXISTS users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    identification VARCHAR(255) UNIQUE
);

CREATE TABLE IF NOT EXISTS complaints (
    id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INTEGER NOT NULL,
    complaint_type VARCHAR(50) NOT NULL,
    detail VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

INSERT INTO users (name, identification) VALUES
('Alicia Chavez', '1758635569'),
('Bernardo Naranjo', '075589562'),
('Carlos Tapia', '1853692265');