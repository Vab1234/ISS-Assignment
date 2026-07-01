use shop;
select * from products;
delimiter //
create procedure AddStock(IN prod_id int, IN added_amount int)
BEGIN
    update products set stock = stock + added_amount where productId = prod_id;
end //
delimiter ;

call addstock(4 , 50);
select * from products;
