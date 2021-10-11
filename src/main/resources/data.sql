DROP TABLE IF EXISTS houses;

CREATE TABLE houses (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              bedrooms NUMBER,
                              bathrooms NUMBER

);

INSERT INTO houses (bedrooms, bathrooms) VALUES
(2, 4),
(3, 3),
(4, 8);