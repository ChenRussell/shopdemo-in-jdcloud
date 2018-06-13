drop database IF EXISTS shop;
create database shop;
use shop;
create table s_user(
	userid int(11) primary key auto_increment,
	username varchar(100),
	password varchar(100)
);
create table s_order(
	orderid int(11) primary key auto_increment,
	ordernum varchar(100),
	ordertime datetime,
	producttime varchar(100),
	remark varchar(100),
	user_id int(11),
	CONSTRAINT FOREIGN KEY(user_id) REFERENCES s_user(userid)
);

