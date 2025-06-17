CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
Declare offsetval int;
set offsetval=N-1;
  RETURN (
    select distinct salary from Employee 
    order by salary DESC
    limit 1 offset offsetval
      # Write your MySQL query statement below.

  );
END