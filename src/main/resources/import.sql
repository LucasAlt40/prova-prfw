
INSERT INTO tipo_veiculos (tipo, quantidade_vagas, preco_hora) values ('CARRO', 2,10.50);

delete from users;
insert into users (username, password, enabled) values ('doug', '{noop}paty', true);
insert into users (username, password, enabled) values ('tintin', '{noop}milu', true);

delete from authorities;
insert into authorities (username, authority) values ('doug', 'ROLE_USER');
insert into authorities (username, authority) values ('tintin', 'ROLE_USER');
insert into authorities (username, authority) values ('tintin', 'ROLE_ADMIN');