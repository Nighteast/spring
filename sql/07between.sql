-- between

SELECT * FROM products
WHERE Price >= 10 AND Price <=13;
SELECT * FROM products
WHERE Price BETWEEN 10 AND 13;  -- 값 포함됨 (<=, >=)
SELECT * FROM products
WHERE Price >= 10 AND Price <13;
SELECT * FROM products
WHERE Price BETWEEN 10 AND 12.99;   -- 값을 포함 시키고 싶지 않다면 이런 식으로 사용해야 함

SELECT *
FROM products
WHERE Price BETWEEN '10' AND '13';

SELECT * FROM customers WHERE CustomerName BETWEEN 'a' AND 'b';
SELECT * FROM orders WHERE OrderDate BETWEEN '1996-01-01' AND '1996-12-31';