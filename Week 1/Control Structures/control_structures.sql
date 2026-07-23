DECLARE
    v_age NUMBER;
    v_rate NUMBER;
    v_bal NUMBER;
BEGIN
    FOR c IN (SELECT customer_id, age, interest_rate FROM Customers) LOOP
        IF c.age > 60 THEN
            UPDATE Customers SET interest_rate = interest_rate - 1 WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;

    FOR c IN (SELECT customer_id, balance FROM Customers) LOOP
        IF c.balance > 10000 THEN
            UPDATE Customers SET is_vip = 'TRUE' WHERE customer_id = c.customer_id;
        END IF;
    END LOOP;

    FOR l IN (SELECT loan_id, customer_id, due_date FROM Loans WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder for customer ' || l.customer_id);
    END LOOP;
END;
/
