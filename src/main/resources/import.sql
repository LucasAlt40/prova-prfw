
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('CARRO', 2,10.50);
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('MOTO', 1,5.50);
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('CAMINHAO', 4,25.50);

insert INTO veiculos (placa, modelo, cor, tipo_id) values ('XPTO', 'GOL QUADRADO', 'BRANCO', 1)
insert INTO veiculos (placa, modelo, cor, tipo_id) values ('PXTO', 'CG 150', 'PRETO', 2)
insert INTO veiculos (placa, modelo, cor, tipo_id) values ('HPTO', 'SCANIA 3000', 'VERDE', 3)


delete from users;
insert into users (username, password, enabled) values ('lucas', '{noop}123', true);

delete from authorities;
insert into authorities (username, authority) values ('lucas', 'ROLE_USER');
insert into authorities (username, authority) values ('lucas', 'ROLE_ADMIN');