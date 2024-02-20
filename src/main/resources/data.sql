INSERT INTO tb_user (name, email, password) values ('Pedro', 'pedro@gmail.com', '123');
INSERT INTO tb_user (name, email, password) values ('Pedro', 'pedro@gmail.com', '123');

INSERT INTO tb_role (authority) values ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) values ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) values (1, 1);
INSERT INTO tb_user_role (user_id, role_id) values (2, 1);
INSERT INTO tb_user_role (user_id, role_id) values (2, 2);
