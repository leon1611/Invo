Tabla lead
CREATE TABLE lead (
                      id SERIAL ,
                      fullname VARCHAR(100) NOT NULL,
                      email VARCHAR(100) UNIQUE,
                      phone VARCHAR(20),
                      status VARCHAR(50),
                      created_at DATE NOT NULL ,
                      PRIMARY KEY (id),
                      UNIQUE (email)
);

-- Tabla activity
CREATE TABLE activity (
                          id SERIAL,
                          lead_id INT,
                          client_id INT,
                          description VARCHAR(250) NOT NULL,
                          activity_date DATE NOT NULL ,
                          PRIMARY KEY(id),
                          FOREIGN KEY (lead_id) REFERENCES lead(id),
                          FOREIGN KEY (client_id) REFERENCES client(id)
);
