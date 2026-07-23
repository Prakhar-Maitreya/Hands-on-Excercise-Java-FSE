DECLARE
    CURSOR c1 IS SELECT customer_id, age FROM Customers;
BEGIN
    FOR r IN c1 LOOP
        IF r.age > 60 THEN
            UPDATE Loans SET interest_rate = interest_rate - 1 WHERE customer_id = r.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/
