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


INSERT INTO product(product_name,cat_id) VALUES('Corn',1);

INSERT INTO supply(product_id,sup_id) VALUES (1,1);

INSERT INTO inventory(quantity,unit_price,stock_date,product_id,store_id) VALUES(100, 0.50,'2021-10-02',1,1);