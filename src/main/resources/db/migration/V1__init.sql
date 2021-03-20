CREATE SEQUENCE IF NOT EXISTS igm_user_id_seq;

CREATE TABLE IF NOT EXISTS igm_user (
  id bigint NOT NULL PRIMARY KEY DEFAULT (NEXT VALUE FOR igm_user_id_seq),
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email_id VARCHAR(100),
  iso_country_code VARCHAR(100)
  );