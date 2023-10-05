SELECT CustomerName, City, Country FROM customers WHERE Country = 'spain';
SELECT CustomerName, City, Country FROM customers WHERE city = 'Madrid';
SELECT CustomerName, City, Country FROM customers
WHERE city = 'Madrid' AND Country = 'spain';
SELECT CustomerName, City, Country FROM customers
WHERE city = 'Madrid' AND Country != 'spain';
SELECT CustomerName, City, Country FROM customers
WHERE city != 'Madrid' AND Country = 'spain';
SELECT CustomerName, City, Country FROM customers
WHERE city != 'Madrid' AND Country != 'spain';
SELECT CustomerName, City, Country FROM customers
WHERE NOT (city = 'Madrid' AND Country = 'spain');

SELECT CustomerName, City, Country FROM customers
WHERE City != 'Madrid' OR Country != 'Spain';

SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid';
SELECT CustomerName, City, Country FROM customers
WHERE Country = 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid' OR Country = 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE Country = 'UK' OR Country = 'Spain';

SELECT * FROM products
WHERE Price >= 10.00 AND Price <= 20.00;
SELECT * FROM customers
WHERE CustomerName >= 'c' AND CustomerName <'d';
SELECT * FROM employees
WHERE BirthDate >= '1958-01-01' AND BirthDate < '1959-01-01';

--

