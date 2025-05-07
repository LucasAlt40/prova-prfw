
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('CARRO', 2,10.50);
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('MOTO', 1,5.50);
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('CAMINHAO', 4,25.50);

insert INTO veiculos (placa, modelo, cor, tipo_id) values ('XPTO', "GOL QUADRADO", 'BRANCO', 1)

delete from users;
insert into users (username, password, enabled) values ('doug', '{noop}paty', true);
insert into users (username, password, enabled) values ('tintin', '{noop}milu', true);

delete from authorities;
insert into authorities (username, authority) values ('doug', 'ROLE_USER');
insert into authorities (username, authority) values ('tintin', 'ROLE_USER');
insert into authorities (username, authority) values ('tintin', 'ROLE_ADMIN');