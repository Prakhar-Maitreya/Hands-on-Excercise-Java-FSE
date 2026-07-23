CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_dept IN NUMBER,
    p_bonus IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET salary = salary + (salary * (p_bonus / 100))
    WHERE department_id = p_dept;
    COMMIT;
END;
/

CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from IN NUMBER,
    p_to IN NUMBER,
    p_amt IN NUMBER
) AS
    v_bal NUMBER;
BEGIN
    SELECT balance INTO v_bal FROM Accounts WHERE account_id = p_from FOR UPDATE;
    IF v_bal >= p_amt THEN
        UPDATE Accounts SET balance = balance - p_amt WHERE account_id = p_from;
        UPDATE Accounts SET balance = balance + p_amt WHERE account_id = p_to;
        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
    END IF;
END;
/
