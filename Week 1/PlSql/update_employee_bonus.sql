CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_dept IN NUMBER,
    p_pct IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * (p_pct / 100))
    WHERE department_id = p_dept;
    COMMIT;
END;
/
