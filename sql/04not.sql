SELECT * FROM customers;
SELECT CustomerName, Country FROM customers WHERE Country = 'Germany';
SELECT CustomerName, Country FROM customers WHERE NOT Country = 'Germany';
-- 예) 1번 카테고리에 속하지 않는 상품들 조회
SELECT CategoryID, CategoryName FROM categories WHERE NOT CategoryID = 1;
-- 예) Japan에 있지 않은 공급자들 조회
SELECT SupplierName, Country FROM suppliers WHERE NOT Country = 'Japan';
