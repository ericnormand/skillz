-- name: create-skill-table!
-- Creates the table for all of the skills.
CREATE TABLE IF NOT EXISTS skills (
       id BIGSERIAL PRIMARY KEY,
       name TEXT NOT NULL
)


