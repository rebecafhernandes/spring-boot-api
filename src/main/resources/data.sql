INSERT INTO ADDRESS(address_id, street, number, city) VALUES (1, 'Rua Pioneiro Ladislau Lonkoski', '1159', 'Campo Mourão');

INSERT INTO CUSTOMER(customer_id, name, date_of_birth, address_id) VALUES (1, 'Rebeca', to_date('24/03/1993','dd/MM/yyyy'), 1);

INSERT INTO OFFER(offer_id, name, description, customer_id, creation_date, expiration_date) VALUES (1, 'Teste', 'Testando API Rest do zero.', 1, to_date('22/09/2020', 'dd/MM/yyyy'), to_date('24/09/2020', 'dd/MM/yyyy'));