import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() throws Exception {
        BankAccount account = new BankAccount("Amanda", "Nunes", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @org.junit.Test
    public void withdraw() throws Exception {
        BankAccount account = new BankAccount("Steve", "Joynt", 10000, BankAccount.SAVINGS);
        double balance = account.withdraw(8880, false);
        assertEquals(1120, balance, 0);

    }

    @org.junit.Test
    public void getBalance_deposit() throws Exception {
        BankAccount account = new BankAccount("Roy", "Rama", 2000, BankAccount.CHECKING);
        account.deposit(1500, true);
        assertEquals(3500, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() throws Exception {
        BankAccount account = new BankAccount("Tom", "Hagen", 500, BankAccount.SAVINGS);
        account.withdraw(200, false);
        assertEquals(300, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Joe", "Shuma", 100, BankAccount.CHECKING);
        assertTrue("is not checking", account.isChecking());
    }

}