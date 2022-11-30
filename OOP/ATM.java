public class ATM {

    public static void main(String[]  args) {

        Account ajayAccount = new Account();

        //ACCOUNT INFORMATION
        ajayAccount.setNumber("123456");
        ajayAccount.setBalance(100.00);
        ajayAccount.setCustomerName("Ajay Patil");
        ajayAccount.setCustomerEmail("ajay123@gmail.com");
        ajayAccount.setCustomerPhone("(+91) 910605");

        //PERFORMING DIFFERENT OPERATION ON IT
        ajayAccount.withdrawFunds(20.0); //Remaining Balance is 80.0
        ajayAccount.withdrawFunds(30.0); //Remaining Balance is 50.0

        ajayAccount.depositeFunds(150.0); //New Balance is 200.0
        ajayAccount.depositeFunds(300.0); //New Balance is 500.0

    }
}
