package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    private BankAccount acc;

    @Before
    public void setUp() {
        acc = new BankAccount(100.0);
    }

    @After
    public void tearDown() {
        acc = null;
    }

    @Test
    public void testDeposit() {
        acc.deposit(50.0);
        assertEquals(150.0, acc.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        acc.withdraw(30.0);
        assertEquals(70.0, acc.getBalance(), 0.001);
    }
}
