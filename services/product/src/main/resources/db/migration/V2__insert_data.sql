-- Insert more data into category table
INSERT INTO category (id, description, "name") VALUES
(nextval('category_seq'), 'Health and personal care products', 'Health & Personal Care'),
(nextval('category_seq'), 'Toys and games for children', 'Toys & Games'),
(nextval('category_seq'), 'Automotive parts and accessories', 'Automotive'),
(nextval('category_seq'), 'Office supplies and stationery', 'Office Supplies'),
(nextval('category_seq'), 'Music instruments and accessories', 'Music'),
(nextval('category_seq'), 'Electronics and gadgets', 'Electronics'),
(nextval('category_seq'), 'Books and literature', 'Books'),
(nextval('category_seq'), 'Home and kitchen appliances', 'Home & Kitchen'),
(nextval('category_seq'), 'Fashion and clothing', 'Fashion'),
(nextval('category_seq'), 'Sports and outdoor equipment', 'Sports');


-- Insert more data into product table
INSERT INTO product (id, description, "name", available_quantity, price, category_id) VALUES
(nextval('product_seq'), 'Electric toothbrush with multiple brush heads', 'Electric Toothbrush', 60, 89.99, 501),
(nextval('product_seq'), 'Building blocks set for kids', 'Building Blocks', 120, 39.99, 551),
(nextval('product_seq'), 'Car air freshener with long-lasting scent', 'Car Air Freshener', 200, 9.99, 851),
(nextval('product_seq'), 'Pack of 12 ballpoint pens', 'Ballpoint Pens', 150, 12.99, 651),
(nextval('product_seq'), 'Acoustic guitar with carrying case', 'Acoustic Guitar', 25, 199.99, 701),
(nextval('product_seq'), 'Wireless headphones with noise cancellation', 'Wireless Headphones', 80, 149.99, 751),
(nextval('product_seq'), 'Cookbook with healthy recipes', 'Cookbook', 90, 24.99, 851),
(nextval('product_seq'), 'Non-stick frying pan', 'Frying Pan', 50, 34.99, 851),
(nextval('product_seq'), 'Womens summer dress', 'Summer Dress', 70, 49.99, 951),
(nextval('product_seq'), 'Tennis racket with cover', 'Tennis Racket', 35, 79.99, 951),
(nextval('product_seq'), 'Smartphone with 6GB RAM and 128GB storage', 'Smartphone', 50, 699.99, 751),
(nextval('product_seq'), 'Science fiction novel', 'Sci-Fi Book', 100, 19.99, 801),
(nextval('product_seq'), 'Blender with multiple speed settings', 'Blender', 30, 49.99, 851),
(nextval('product_seq'), 'Mens casual shirt', 'Casual Shirt', 75, 29.99, 901),
(nextval('product_seq'), 'Yoga mat with non-slip surface', 'Yoga Mat', 40, 24.99, 951);
