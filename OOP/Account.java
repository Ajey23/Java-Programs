public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositeFunds(double depositAmount) {

        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount +" made. New balance is $" + balance);

    }

    public void withdrawFunds(double withdrawAmount) {

        if(balance - withdrawAmount < 0) {
            System.out.println("Insufficient Funds! You Only Have $" + balance + " in Your Account.");
        }
        else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " Processed, Remaining Balance = $" + balance);
        }
    }

    //GETTER
    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return  balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }

    //SETTER
    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


}
