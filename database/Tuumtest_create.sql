-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-04-27 17:23:30.39

-- tables
-- Table: account
CREATE TABLE account (
    id serial  NOT NULL,
    customer_id int  NOT NULL,
    currencies_id int  NOT NULL,
    available_amount int  NOT NULL,
    CONSTRAINT account_pk PRIMARY KEY (id)
);

-- Table: country
CREATE TABLE country (
    id serial  NOT NULL,
    country_name varchar(255)  NOT NULL,
    CONSTRAINT country_pk PRIMARY KEY (id)
);

-- Table: currencies
CREATE TABLE currencies (
    id serial  NOT NULL,
    currency varchar(255)  NOT NULL,
    CONSTRAINT currencies_pk PRIMARY KEY (id)
);

-- Table: customer
CREATE TABLE customer (
    id serial  NOT NULL,
    country_id int  NOT NULL,
    currencies_id int  NOT NULL,
    customer_id int  NOT NULL,
    CONSTRAINT customer_pk PRIMARY KEY (id)
);

-- Table: transaction_direction
CREATE TABLE transaction_direction (
    id serial  NOT NULL,
    direction char(1)  NOT NULL,
    descripiton varchar(255)  NOT NULL,
    CONSTRAINT transaction_direction_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: account_currencies (table: account)
ALTER TABLE account ADD CONSTRAINT account_currencies
    FOREIGN KEY (currencies_id)
    REFERENCES currencies (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: account_customer (table: account)
ALTER TABLE account ADD CONSTRAINT account_customer
    FOREIGN KEY (customer_id)
    REFERENCES customer (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: customer_country (table: customer)
ALTER TABLE customer ADD CONSTRAINT customer_country
    FOREIGN KEY (country_id)
    REFERENCES country (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: customer_currencies (table: customer)
ALTER TABLE customer ADD CONSTRAINT customer_currencies
    FOREIGN KEY (currencies_id)
    REFERENCES currencies (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

