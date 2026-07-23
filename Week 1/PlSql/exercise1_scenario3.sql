DECLARE
    CURSOR c1 IS SELECT loan_id, customer_id, due_date FROM Loans WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;
BEGIN
    FOR r IN c1 LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder for customer ' || r.customer_id);
    END LOOP;
END;
/
