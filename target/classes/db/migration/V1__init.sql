-- Tabla client
CREATE TABLE client (
     id SERIAL ,
    fullname VARCHAR(100) NOT NULL,
    age INT NOT NULL,
     address VARCHAR(255),
    PRIMARY KEY (id),
     UNIQUE (address)
);

-- Tabla invoice
CREATE TABLE invoice (
        id SERIAL ,
        code VARCHAR(100) NOT NULL,
        create_at DATE NOT NULL,
        total_amount DECIMAL(10,2) NOT NULL,
        client_id INT,
        PRIMARY KEY(id),
         FOREIGN KEY (client_id) REFERENCES client(id)
);
