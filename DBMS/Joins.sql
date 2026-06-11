use store;
desc customers;
desc orders;

-- Inner join query to know the names of the customers who have placed orders along with the order details
select orderId , orderDate , fullName , status from orders inner join customers on orders.customerId = customers.customerId;

-- Left join query to know the names of the customers who have not placed any orders
select fullName , email , phone from customers c left join orders o on c.customerId = o.customerId where o.orderId is null;

-- 3 tables joined to know the names of the customers who have placed orders along with the order details and the products they ordered 
select c.fullName , o.orderId , oi.productId , oi.quantity from customers c inner join orders o on c.customerId = o.customerId inner join orderItems oi on o.orderId = oi.orderId where c.fullName = "Varun Budhani";

-- 4 tables joined to know the names of the customers who have placed orders along with the order details and the products they ordered and their category
select c.fullName , o.orderDate , oi.productId , p.productName , p.category from customers c inner join orders o on c.customerId = o.customerId inner join orderItems oi on o.orderId = oi.orderId inner join products p on oi.productId = p.productId;

-- Aggregate function with group by to know the total amount spent by each customer
select c.fullName , SUM(oi.quantity * p.price) as "Total Spent" from customers c inner join orders o on c.customerId = o.customerId inner join orderItems oi on o.orderId = oi.orderId inner join products p on oi.productId = p.productId group by c.fullName;

-- Left join query to know the names of the products along with the quantity ordered
select productName , quantity from products p left join orderItems oi on p.productId = oi.productId;

-- Right join query to know the names of the customers along with the order details
select * from orders o right join customers c on o.customerId = c.customerId;

-- Union query to know the names of the products that are either in the "Phone" category or in the "Gaming" category
select * from products where category = "Phone" UNION select * from products where category = "Gaming";

-- Intersect query to know the names of the customers who have placed orders
select customerId from customers INTERSECT select customerId from orders;

-- Full outer join query to know the names of the customers along with the order details, including those who have not placed any orders and those orders that do not have any customers
select * from customers c left join orders o on c.customerId = o.customerId UNION select * from customers c right join orders o on c.customerId = o.customerId;

-- Create a view to know the names of the customers who have placed orders along with the order details and the products they ordered and their category
create view vw_customerOrderReport as select c.fullName , o.orderDate , oi.productId , p.productName , p.category from customers c inner join orders o on c.customerId = o.customerId inner join orderItems oi on o.orderId = oi.orderId inner join products p on oi.productId = p.productId;

select * from vw_customerOrderReport;

