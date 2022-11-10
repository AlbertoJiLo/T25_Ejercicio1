
DROP table IF EXISTS fabricantes;
DROP table IF EXISTS articulos;

create table fabricantes(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100)
	);

create table articulos(
	id int auto_increment PRIMARY KEY,
	nombre varchar(100),
	precio INT,
    fabricante_id INT,
    FOREIGN KEY (fabricante_id) REFERENCES fabricantes(id) ON DELETE CASCADE ON UPDATE CASCADE 
    );
    


insert into fabricantes (nombre) values('Apple');
insert into fabricantes (nombre) values('Samsung');
insert into fabricantes (nombre) values('Nokia');
insert into fabricantes (nombre) values('HTC');


insert into articulos (nombre, precio, fabricante_id) values('Iphone','800', '1');
insert into articulos (nombre, precio, fabricante_id) values('Galaxy','700', '2');
insert into articulos (nombre, precio, fabricante_id) values('3310','30', '3');
insert into articulos (nombre, precio, fabricante_id) values('One','180', '4');

