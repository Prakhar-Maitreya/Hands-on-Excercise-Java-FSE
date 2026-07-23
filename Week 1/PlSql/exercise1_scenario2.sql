DECLARE
    CURSOR c1 IS SELECT customer_id, balance FROM Customers;
BEGIN
    FOR r IN c1 LOOP
        IF r.balance > 10000 THEN
            UPDATE Customers SET is_vip = 'TRUE' WHERE customer_id = r.customer_id;
        END IF;
    END LOOP;
    COMMIT;
END;
/
