package bank;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void newAccount_balanceIsEqualsZero() {
        Account account = new Account();
        assertEquals(0, account.getBalance());

    }

    @Test
    public void newAccount_deposit() {
        Account account = new Account();
        assertEquals(0, account.getBalance());
        account.deposit(3000);
        assertEquals(3000, account.getBalance());
        account.deposit(7000);
        assertEquals(10000, account.getBalance());


    }

    @Test
    public void newAccount_withdraw() {
        Account account = new Account();
        account.deposit(3000);
        assertEquals(3000, account.getBalance());
        account.withdraw(3000);
        assertEquals(0, account.getBalance());

    }

    @Test
    public void newAccount_depositNegative() {
        Account account = new Account();
        account.deposit(-3000);
        assertEquals(0, account.getBalance());

    }
}
