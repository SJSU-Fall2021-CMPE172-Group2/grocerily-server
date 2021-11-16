CREATE TABLE store
(
  store_id INT AUTO_INCREMENT NOT NULL,
  store_contacts VARCHAR(50) NOT NULL, 
  store_name VARCHAR(20) NOT NULL, 
  store_address VARCHAR(50) NOT NULL,
  PRIMARY KEY(store_id)
);

CREATE TABLE supplier
(
  sup_name VARCHAR(20) NOT NULL,
  sup_id  INT AUTO_INCREMENT NOT NULL,
  sup_contacts VARCHAR(20) NOT NULL,
  PRIMARY KEY (sup_id)
);

CREATE TABLE category
(
  cat_id INT AUTO_INCREMENT NOT NULL,
  cat_name VARCHAR(50) NOT NULL,
  PRIMARY KEY (cat_id)
);
CREATE TABLE user
(
  user_id INT AUTO_INCREMENT NOT NULL,
  user_name varchar(20) NOT NULL,
  password_hash varchar(20) NOT NULL,
  title varchar(20) NOT NULL,
  PRIMARY KEY (user_id)
);

CREATE TABLE product
(
  product_name VARCHAR(20) NOT NULL,
  product_id INT AUTO_INCREMENT NOT NULL,
  cat_id INT NOT NULL,
  PRIMARY KEY (product_id),
  FOREIGN KEY (cat_id) REFERENCES category(cat_id)
);

CREATE TABLE supply
(
  product_id INT NOT NULL,
  sup_id  INT NOT NULL,
  PRIMARY KEY (product_id, sup_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id),
  FOREIGN KEY (sup_id) REFERENCES supplier(sup_id)
);

CREATE TABLE inventory
(
  quantity INT NOT NULL,
  unit_price FLOAT NOT NULL,
  stock_date DATE NOT NULL,
  product_id INT NOT NULL,
  store_id INT NOT NULL,
  PRIMARY KEY (product_id, store_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id),
  FOREIGN KEY (store_id) REFERENCES store(store_id)
);