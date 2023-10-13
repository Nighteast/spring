-- 비상관쿼리 : 외부커리의 컬럼이 내부쿼리에 사용되지 않을 때


-- 상관쿼리 : 외부커리의 컬럼이 내부쿼리에 사용될 때
-- 성능저하 주의해야함.
-- 각 공급자가 있는 나라의 고객 수는?
USE w3schools;
SELECT *
FROM suppliers;

SELECT COUNT(*)
FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 1);
SELECT COUNT(*)
FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 2);
SELECT COUNT(*)
FROM customers
WHERE Country = (SELECT Country FROM suppliers WHERE SupplierID = 3);

SELECT s.supplierID,
       (SELECT COUNT(*) FROM customers WHERE customers.Country = s.Country) AS 'Number Of Customers'
FROM suppliers s;
-- suppliers 레코드 각각 29번 실행

-- 예) 각 직원보다 나이가 많은 직원의 수 (lastName, NumberOfEmp)

SELECT LastName,
       (SELECT COUNT(*) FROM employees e2
                        WHERE e1.BirthDate > e2.BirthDate) AS 'NumberOfEmp'
FROM employees e1;




