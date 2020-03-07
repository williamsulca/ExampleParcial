create database multa;
use multa;
create table multa02
(codigo int auto_increment,
DNI int,
multa varchar(30),
monto numeric(8.2),
PRIMARY KEY (codigo)
);
insert into multa02(DNI,multa,monto)
 values(11111111,'Alta Velocidad',450);

select*from multa02;

