# --- !Ups
 
CREATE TABLE Cook (
    id bigint NOT NULL,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)
);
 
# --- !Downs
 
DROP TABLE Cook;