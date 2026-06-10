use shop;
show tables;

desc customers;
insert into customers values
    -> (default , "Varun Budhani" , "varunbudhani1954@gmail.com" , "7020965092" , default),
    -> (default , "Veer Budhani" , "budhaniveer@gmail.com" , "1234567890" , default);
insert into customers values
    -> (default , "Yuvansh Karmani" , "abcd@gmail.com" , "1111111111" , default),
    -> (default , "Vanshika" , "1234@gmail.com" , "2222222222" , default),
    -> (default , "Sejal" , "0000@gmail.com" , "3333333333" , default);
select * from customers;

desc products;
insert into products values
    -> (default , "Sony camera" , "Camera" , 150000 , 10),
    -> (default , "Dyson Vaccum cleaner" , "Cleaning" , 100000 , default),
    -> (default , "Sony ps5"  , "Gaming" , 50000 , 5),
    -> (default , "Evofox Controller"  , "Gaming" , 2000 , 50),
    -> (default , "Iphone 17 pro" , "Phone" , 138000 , default);
select * from products;

desc orders;
insert into orders values
    -> (default , 1 , "2026-06-11" , "Order Received"),
    -> (default , 5 , "2026-06-11" , "Delivered"),
    -> (default , 3 , "2026-06-13" , "Shipped"),
    -> (Default , 4 , "2026-07-25" , "Delivered");
select * from orders;

desc orderItems;
insert into orderItems values
    -> (default , 1 , 5 , 1),
    -> (default , 2 , 5 , 2),
    -> (default , 3 , 3 , 1),
    -> (default , 4 , 1 , 4);
select * from orderItems;

update customers set fullName = "Sejal Budhani" where fullName = "Sejal";
update customers set fullName = "Vanshika Ambwani" where fullName = "Vanshika";

select * from customers where fullName like "%arun%";
select * from products order by price desc;
select * from orders order by orderDate;
select concat(productName , " has stock " , stock , " left") from products;
select count(productId) from products;
select fullName as "Customer Name" , email as "Customer Email" from customers;
select productId , productName , price from products where price between 100000 and 200000;
select * from orders order by orderDate desc limit 1;
delete from products where productName = "Dyson Vaccum cleaner";
