CREATE OR REPLACE PROCEDURE TransferFunds(
    p_src IN NUMBER,
    p_dst IN NUMBER,
    p_amt IN NUMBER
) AS
    v_bal NUMBER;
BEGIN
    SELECT balance INTO v_bal FROM Accounts WHERE account_id = p_src FOR UPDATE;
    IF v_bal >= p_amt THEN
        UPDATE Accounts SET balance = balance - p_amt WHERE account_id = p_src;
        UPDATE Accounts SET balance = balance + p_amt WHERE account_id = p_dst;
        COMMIT;
    ELSE
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance');
    END IF;
END;
/
