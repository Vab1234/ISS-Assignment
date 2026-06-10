create database shop;
use shop;
create table customers(
    -> customerId int auto_increment primary key,
    -> fullName varchar(100) not null,
    -> email varchar(100) unique not null,
    -> phone varchar(10) not null,
    -> registrationDate date default (current_date)
    -> );

create table products(
    -> productId int auto_increment primary key,
    -> productName varchar(100) not null,
    -> category varchar(50) not null,
    -> price decimal(10 , 2) not null check(price > 0),
    -> stock int default 10
    -> );

create table orders(
    -> orderId int auto_increment primary key,
    -> customerId int,
    -> orderDate date not null,
    -> status varchar(30) default "Pending",
    -> foreign key (customerId) references customers(customerId) on delete cascade
    -> )

create table orderItems(
    -> orderItemId int auto_increment primary key,
    -> orderId int,
    -> productId int,
    -> quantity int not null check(quantity > 0),
    -> foreign key (orderId) references orders(orderId),
    -> foreign key (productId) references products(productId)
    -> );
desc customers;
desc products;
desc orders;
desc orderItems;