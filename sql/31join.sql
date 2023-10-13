USE w3schools;

-- JOIN을 사용하지 않는다면
SELECT DISTINCT CustomerID
FROM orders
ORDER BY 1;

SELECT CustomerName
FROM customers
WHERE CustomerID
          NOT IN (SELECT DISTINCT CustomerID
                  FROM orders
                  ORDER BY 1);

-- JOIN을 사용한다면

SELECT c.CustomerName
FROM customers c
         LEFT JOIN orders o
                   ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL;


-- 주문을 처리한 적 없는 직원을 찾기
SELECT e.LastName, e.FirstName
FROM employees e
         LEFT JOIN orders o
                   ON e.EmployeeID = o.EmployeeID
WHERE o.EmployeeID IS NULL;

SELECT DISTINCT EmployeeID
FROM orders
ORDER BY 1;
SELECT COUNT(*)
FROM employees;

INSERT INTO employees (LastName, FirstName, BirthDate, Photo, Notes)
VALUES ('손', '흥민', '2000-01-01', '사진1', '축구선수');


-- 프로그래머스 없어진 기록 찾기
/*SELECT o.ANIMAL_ID, o.NAME
FROM ANIMAL_OUTS o
         LEFT JOIN ANIMAL_INS i
                   ON o.ANIMAL_ID = i.ANIMAL_ID
WHERE i.ANIMAL_ID IS NULL
ORDER BY 1;*/