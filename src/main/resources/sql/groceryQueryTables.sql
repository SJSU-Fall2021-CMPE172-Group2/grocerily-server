select product_id, product_name, cat_name
from products p
 inner join category c 
 on p.cat_id = c.cat_id;
 
 select product_name,unit_price,quantity,expiration
 from products p
 inner join inventory i
 on p.product_id = i.product_id;