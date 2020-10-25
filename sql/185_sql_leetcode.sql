SELECT d.Name AS "Department", e.Name AS "Employee", e.Salary
FROM Employee e
JOIN Department d on e.DepartmentId = d.Id
JOIN (
    SELECT e.Name, COUNT(DISTINCT e2.Salary) AS "Rownum"
    FROM Employee e
    JOIN Employee e2 on e.DepartmentId = e2.DepartmentId
    WHERE  e.Salary <= e2.Salary AND e.DepartmentId = e2.DepartmentId
    GROUP BY e.Id ) t on e.Name = t.Name
WHERE t.RowNum <=3
ORDER BY d.Name ASC, e.Salary DESC
;
