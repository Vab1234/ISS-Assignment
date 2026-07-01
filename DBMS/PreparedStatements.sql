use shop;
desc products;
select * from products;
prepare SearchByCategory from 'select productName, price, stock from products where category = ?';
set @cam = 'Camera';
execute SearchByCategory using @cam;
deallocate prepare SearchByCategory;