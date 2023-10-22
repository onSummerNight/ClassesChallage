public class Bank {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999",100.55,customerName,email,phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public Bank(){
        this("66112",2.5,"Default Duck","Default Email","Default Phone");
        System.out.println("Empty constructor called");
    }

    public Bank(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber){
        System.out.println("Bank constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = email;
    }

    public void deposit(int amount){
        System.out.println("Deposit Confirmation");
        System.out.println("--------------------");
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Name   : " + this.customerName);
        System.out.println("Deposit Amount : " + amount);
        System.out.println("--------------------");
        System.out.println("Remaining Balance : " + (this.accountBalance += amount));
    }
    public void withdrawal(int amount){
        if (this.accountBalance < amount){
            System.out.println("Your Account Balance Not Enough For This Transaction");
        } else {
            System.out.println("Withdrawal Confirmation");
            System.out.println("-----------------------");
            System.out.println("Account Number    : " + this.accountNumber);
            System.out.println("Account Name      : " + this.customerName);
            System.out.println("Current Balance   : " + this.accountBalance);
            System.out.println("Withdrawal Amount : " + amount);
            System.out.println("----------------------");
            System.out.println("Remaining Balance : " + (this.accountBalance -= amount));
        }
    }
}
