CREATE DATABASE springapp;

GRANT ALL ON springapp.* TO springappuser@'%' IDENTIFIED BY 'pspringappuser';
GRANT ALL ON springapp.* TO springappuser@localhost IDENTIFIED BY 'pspringappuser';

USE springapp;

CREATE TABLE transactions (
  id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT,
  amount decimal(15,2),
  transactiondate date,
  effectivedate date,
  subject varchar(255),
  extraInformation varchar(255)
);
CREATE INDEX transactions_subject ON transactions(subject);