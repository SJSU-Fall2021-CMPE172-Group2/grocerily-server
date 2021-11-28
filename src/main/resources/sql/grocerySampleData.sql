INSERT INTO store(store_contacts,store_name,store_address) VALUES('5103431203','kIM Convience Store','2650 Lincoln st, SF,CA,94043');
INSERT INTO store(store_contacts,store_name,store_address) VALUES('4157781009','kIM Convience Store','33815 Frank st, Fremont,CA,94043');

INSERT INTO supplier(sup_name,sup_contacts) VALUES('Green Farm',6503431103);

INSERT INTO category(cat_name) VALUES('Produce');
INSERT INTO category(cat_name) VALUES('Grains');
INSERT INTO category(cat_name) VALUES('Bakery');
INSERT INTO category(cat_name) VALUES('Dairy');
INSERT INTO category(cat_name) VALUES('Meat');
INSERT INTO category(cat_name) VALUES('Snacks');
INSERT INTO category(cat_name) VALUES('Drinks');
INSERT INTO category(cat_name) VALUES('Frozen');


INSERT INTO products(product_name,cat_id) VALUES('Corn',1);
INSERT INTO products(product_name,cat_id) VALUES('Apple',1);
INSERT INTO products(product_name,cat_id) VALUES('Orange',1);
INSERT INTO products(product_name,cat_id) VALUES('Banana',1);
INSERT INTO products(product_name,cat_id) VALUES('Egg',4);

INSERT INTO supply(product_id,sup_id) VALUES (1,1);

INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(100, 1.50,'2021-10-02',1,1);
INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(200, 2.50,'2021-9-02',2,1);
INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(300, 3.50,'2021-7-02',3,1);
INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(400, 4.50,'2021-6-02',4,1);
INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(500, 5.50,'2021-4-02',5,1);
INSERT INTO inventory(quantity,unit_price,expiration,product_id,store_id) VALUES(600, 6.50,'2021-1-02',5,1);