SELECT *
FROM customers
WHERE CustomerName = 'Around the Horn';
SELECT *
FROM customers
WHERE CustomerName LIKE '%the%';
SELECT *
FROM customers
WHERE CustomerName LIKE '%ch%';

-- LIKE : 검색
-- %, _ 기호와 같이 사용
SELECT * FROM customers
WHERE CustomerName LIKE 'ch%'; -- % : 0개 이상의 문자 (ch로 시작하는 문자)
SELECT * FROM customers
WHERE CustomerName LIKE '%er'; -- % : er로 끝나는 문자
SELECT * FROM customers
WHERE CustomerName LIKE '%er%'; -- % : 중간에 er이 있는 문자

SELECT * FROM employees
WHERE FirstName LIKE '_____';   -- _ : 1개의 아무 문자
SELECT * FROM employees
WHERE LastName LIKE '____';     -- _ : 4글자

SELECT * FROM employees
WHERE LastName Like '_e%';

