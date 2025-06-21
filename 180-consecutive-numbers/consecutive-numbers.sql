# Write your MySQL query statement below
SELECT DISTINCT n1.num as ConsecutiveNums
FROM Logs n1
JOIN Logs n2 ON n1.id = n2.id-1
Join Logs n3 ON n1.id = n3.id-2
where n1.num=n2.num and n1.num=n3.num;
