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
(nextval('product_seq'), 'Electric toothbrush with multiple brush heads', 'Electric Toothbrush', 60, 89.99, (SELECT id FROM category WHERE "name" = 'Health & Personal Care')),
(nextval('product_seq'), 'Building blocks set for kids', 'Building Blocks', 120, 39.99, (SELECT id FROM category WHERE "name" = 'Toys & Games')),
(nextval('product_seq'), 'Car air freshener with long-lasting scent', 'Car Air Freshener', 200, 9.99, (SELECT id FROM category WHERE "name" = 'Automotive')),
(nextval('product_seq'), 'Pack of 12 ballpoint pens', 'Ballpoint Pens', 150, 12.99, (SELECT id FROM category WHERE "name" = 'Office Supplies')),
(nextval('product_seq'), 'Acoustic guitar with carrying case', 'Acoustic Guitar', 25, 199.99, (SELECT id FROM category WHERE "name" = 'Music')),
(nextval('product_seq'), 'Wireless headphones with noise cancellation', 'Wireless Headphones', 80, 149.99, (SELECT id FROM category WHERE "name" = 'Electronics')),
(nextval('product_seq'), 'Cookbook with healthy recipes', 'Cookbook', 90, 24.99, (SELECT id FROM category WHERE "name" = 'Books')),
(nextval('product_seq'), 'Non-stick frying pan', 'Frying Pan', 50, 34.99, (SELECT id FROM category WHERE "name" = 'Home & Kitchen')),
(nextval('product_seq'), 'Women’s summer dress', 'Summer Dress', 70, 49.99, (SELECT id FROM category WHERE "name" = 'Fashion')),
(nextval('product_seq'), 'Tennis racket with cover', 'Tennis Racket', 35, 79.99, (SELECT id FROM category WHERE "name" = 'Sports')),
(nextval('product_seq'), 'Face moisturizer for sensitive skin', 'Face Moisturizer', 100, 24.99, (SELECT id FROM category WHERE "name" = 'Health & Personal Care')),
(nextval('product_seq'), 'Plush teddy bear', 'Teddy Bear', 80, 19.99, (SELECT id FROM category WHERE "name" = 'Toys & Games')),
(nextval('product_seq'), 'Car phone holder', 'Phone Holder', 150, 14.99, (SELECT id FROM category WHERE "name" = 'Automotive')),
(nextval('product_seq'), 'Pack of 6 highlighters', 'Highlighters', 200, 7.99, (SELECT id FROM category WHERE "name" = 'Office Supplies')),
(nextval('product_seq'), 'Electric piano keyboard', 'Electric Keyboard', 40, 299.99, (SELECT id FROM category WHERE "name" = 'Music')),
(nextval('product_seq'), '4K Ultra HD Smart TV', 'Smart TV', 60, 399.99, (SELECT id FROM category WHERE "name" = 'Electronics')),
(nextval('product_seq'), 'Mystery thriller novel', 'Thriller Novel', 120, 15.99, (SELECT id FROM category WHERE "name" = 'Books')),
(nextval('product_seq'), 'Stainless steel toaster', 'Toaster', 70, 29.99, (SELECT id FROM category WHERE "name" = 'Home & Kitchen')),
(nextval('product_seq'), 'Men’s running shoes', 'Running Shoes', 90, 79.99, (SELECT id FROM category WHERE "name" = 'Fashion')),
(nextval('product_seq'), 'Outdoor camping tent', 'Camping Tent', 50, 99.99, (SELECT id FROM category WHERE "name" = 'Sports'));
