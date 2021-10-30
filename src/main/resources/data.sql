
INSERT INTO category(cat_name) VALUES('fruit');
INSERT INTO category(cat_name) VALUES('vegitable');

INSERT INTO product(product_name, cat_id) VALUES('apple', 1);   
INSERT INTO product(product_name, cat_id) VALUES('banana', 1);   
INSERT INTO product(product_name, cat_id) VALUES('Lettuce', 2);  
INSERT INTO product(product_name, cat_id) VALUES('Cucumber', 2);  

INSERT INTO supplier(supplier_name, supplier_contact) VALUES('Dole fresh vegetables Inc.', '+18003333888');
INSERT INTO supplier(supplier_name, supplier_contact) VALUES('Fresh & Best Produce', '+14089379005');

INSERT INTO supply(product_id, sup_id) VALUES(1, 1);
INSERT INTO supply(product_id, sup_id) VALUES(3, 1);
INSERT INTO supply(product_id, sup_id) VALUES(2, 2);
INSERT INTO supply(product_id, sup_id) VALUES(4, 2);

INSERT INTO store(store_contact, store_name, store_address) VALUES('+14082071126', 'Whole Foods', '777 The Alameda, San Jose, CA 95126');   
INSERT INTO store(store_contact, store_name, store_address) VALUES('+14088820999', 'Safeway', '1300 W San Carlos St, San Jose, CA 95126');  

INSERT INTO inventory(product_id, store_id, quantity, unit_price, stock_date) VALUES (1, 1, 5, 1, '2021-01-01');


COMMIT;