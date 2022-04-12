CREATE DATABASE IF NOT EXISTS iphone_inventory;

USE iphone_inventory;

CREATE USER IF NOT EXISTS 'inventory_admin'@'%' IDENTIFIED BY '123456';

GRANT ALL PRIVILEGES ON iphone_inventory.* TO 'inventory_admin'@'%';

FLUSH PRIVILEGES;