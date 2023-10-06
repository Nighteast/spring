SELECT * FROM employees;
SELECT EmployeeID, LastName FROM employees;

-- AS : 컬럼명(테이블명) 변경
SELECT EmployeeID AS id,
       LastName AS name
FROM employees;

SELECT EmployeeID,
       CONCAT(FirstName, ' ', LastName) AS fullName
From employees;

-- AS 생략 가능
SELECT EmployeeID,
       CONCAT(FirstName, ' ', LastName) fullName
From employees;

-- backtick ``으로 키워드나 특수문자 사용 가능
SELECT EmployeeID,
       CONCAT(FirstName, ' ', LastName) `full name`
From employees;

-- 예) 공급자의 이름(supplierName), 주소(address, city, country),
--     전화번호(phone -> phone number)
-- supplierName, address, phone number
SELECT supplierName,
       CONCAT(Address, ' ', city, ' ', country) AS address,
       Phone AS `phone number`
FROM suppliers;

SELECT * FROM products;
SELECT * FROM categories;

SELECT p.ProductName,
       c.CategoryName
FROM products AS p
         JOIN categories c
              ON p.CategoryID = c.CategoryID;



