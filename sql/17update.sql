SELECT * FROM products;
SELECT * FROM products WHERE ProductID = 1;

UPDATE products
SET ProductName = '차이즈',
    Unit = '10박스',
    Price = 36.00
WHERE ProductID = 1;

UPDATE products
set ProductName = '두부김치';   -- WHERE 꼭 쓸 것 !!!!!

-- 예) 1번 고객의 이름 수정하기
SELECT * FROM customers WHERE CustomerID = 4;
UPDATE customers
SET CustomerName = '손흥민'
WHERE CustomerID = 4;
-- 예) 5번 직원의 notes 변경하기
SELECT * FROM employees WHERE EmployeeID = 5;
UPDATE employees
SET Notes = '가나다라'
WHERE EmployeeID = 5;
-- 예) 1번 공급자의 전화번호, 주소 변경하기
SELECT * FROM suppliers WHERE SupplierID = 1;
UPDATE suppliers
SET Address = '런던',
    Phone = '010-9999-9999'
WHERE SupplierID = 1;

--
SELECT * FROM products
WHERE CategoryID = 1;

UPDATE products
SET Price = Price * 2
WHERE CategoryID = 1;

SELECT * FROM shippers;


