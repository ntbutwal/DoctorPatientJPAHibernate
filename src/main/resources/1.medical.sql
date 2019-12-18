create database medical;
use medical;

create table doctor(
id bigint auto_increment not null,
name varchar(100) not null,
speciality varchar(50) not null,
department varchar(60) not null,
phone varchar(20) not null,
primary key (id));

select *from doctor;

create table patients(
id bigint auto_increment not null,
name varchar(50) not null,
email varchar(50) not null,
phone varchar(30) not null,
last_four_ssn varchar(10) not null,
dob date not null,
primary key (id));

select *from patients;

