public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.setAccountNumber("12345678901");
        bank.setCustomerName("Duck");
        bank.setEmail("duck@duck.org");
        bank.setPhoneNumber("122334545");
        bank.setAccountBalance(1000);

        bank.deposit(10000);
        bank.withdrawal(2000);
    }
}
