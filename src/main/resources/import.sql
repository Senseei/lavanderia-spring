INSERT INTO tb_users (username, name, password) VALUES ('senseei', 'Gabriel de Jesus', '123456');
INSERT INTO tb_users (username, name, password) VALUES ('joaquim', 'Joaquim', '123456');

INSERT INTO tb_cycles (price, seconds) VALUES (14.9, 1800);
INSERT INTO tb_cycles (price, seconds) VALUES (16.9, 2100);
INSERT INTO tb_cycles (price, seconds) VALUES (18.9, 2400);

INSERT INTO tb_laundries (name) VALUES ('Unidade de São Paulo');

INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Lavadora', false, 1);
INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Lavadora', false, 1);
INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Lavadora', false, 1);
INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Secadora', false, 1);
INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Secadora', false, 1);
INSERT INTO tb_machines (type, locked, laundry_id) VALUES ('Secadora', false, 1);

INSERT INTO tb_orders (person_id, date) VALUES (1, '2023-05-15');

INSERT INTO tb_item_orders (order_id, person_id, machine_id, cycle_id) VALUES (1, 1, 1, 1);