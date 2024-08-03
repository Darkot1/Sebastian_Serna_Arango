create database Airport;

use Airport;

create table airline(
id_airline int primary key auto_increment,
model varchar(50),
capacity varchar(50)
);


create table passenger(
id_passenger int primary key auto_increment,
name varchar(50),
lastname varchar(50),
dni varchar(11)
);

create table flight(
id_flight int primary key auto_increment,
destination varchar(50),
departure_date date,
departure_time time,
id_airline int,
foreign key (id_airline) references airline(id_airline) on delete cascade
);


create table reservation(
id_reservation int primary key auto_increment,
id_passenger int,
reservation_date date,
foreign key (id_passenger) references passenger(id_passenger),
id_flight int,
foreign key (id_flight) references flight(id_flight) on delete cascade,
seat varchar(2)
);


select * from airline;

select * from flight;

select * from passenger;

select * from reservation;




