public class Main {
    public static void main(String[] args) {
        //Bank duckBank = new Bank("12345678901",500,"Duck","duck@duck.org","081122334455");
        Bank duckBank = new Bank();

        System.out.println(duckBank.getAccountNumber());
        System.out.println(duckBank.getAccountBalance());
//        duckBank.setAccountNumber("12345678901");
//        duckBank.setCustomerName("Duck");
//        duckBank.setEmail("duck@duck.org");
//        duckBank.setPhoneNumber("122334545");
//        duckBank.setAccountBalance(1000);

        duckBank.deposit(10000);
        duckBank.withdrawal(2000);

        Bank newDuck = new Bank("New Duck","duckNew@duck.org","12345");

        System.out.println("AccountNo: " + newDuck.getAccountNumber() + "; name " + newDuck.getCustomerName());
    }
}
