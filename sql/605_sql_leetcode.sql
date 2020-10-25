SELECT s1.id, s1.visit_date, s1.people
FROM stadium s1
WHERE (SELECT COUNT(*)
       FROM stadium s2
       WHERE s1.id < s2.id + 1 AND s1.id > s2.id - 3 AND s2.people>=100) = 3
       OR
       (SELECT COUNT(*)
       FROM stadium s3
       WHERE s1.id < s3.id + 2 AND s1.id > s3.id - 2 AND s3.people>=100) = 3
       OR
       (SELECT COUNT(*)
       FROM stadium s4
       WHERE s1.id < s4.id + 3 AND s1.id > s4.id - 1 AND s4.people>=100) = 3 
