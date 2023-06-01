INSERT INTO tb_users (username, name, password) VALUES ('senseei', 'Gabriel de Jesus', '123456');
INSERT INTO tb_users (username, name, password) VALUES ('joaquim', 'Joaquim', '123456');

INSERT INTO tb_cycles (price, minutes) VALUES (14.9, 20);
INSERT INTO tb_cycles (price, minutes) VALUES (16.9, 25);
INSERT INTO tb_cycles (price, minutes) VALUES (18.9, 30);

INSERT INTO tb_laundries (name) VALUES ('Unidade de São Paulo');

INSERT INTO tb_machines (machine_type, locked, wash_capacity, laundry_id) VALUES ('Lavadora', false, 100, 1);
INSERT INTO tb_machines (machine_type, locked, wash_capacity, laundry_id) VALUES ('Lavadora', false, 100, 1);
INSERT INTO tb_machines (machine_type, locked, wash_capacity, laundry_id) VALUES ('Lavadora', false, 100, 1);
INSERT INTO tb_machines (machine_type, locked, drying_capacity, laundry_id) VALUES ('Secadora', false, 100, 1);
INSERT INTO tb_machines (machine_type, locked, drying_capacity, laundry_id) VALUES ('Secadora', false, 100, 1);
INSERT INTO tb_machines (machine_type, locked, drying_capacity, laundry_id) VALUES ('Secadora', false, 100, 1);

INSERT INTO tb_orders (person_id, date) VALUES (1, '2023-05-15');

INSERT INTO tb_item_orders (order_id, machine_id, cycle_id) VALUES (1, 1, 1);