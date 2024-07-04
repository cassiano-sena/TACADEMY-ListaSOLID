public class Main {
    public static void main(String[] args) {
        //SRP (Single Responsibility Principle
        System.out.println("\n\n\n");
        System.out.println("SRP: ");
        ReportGenerator generator = new ReportGenerator();
        ReportPrinter printer = new ReportPrinter();
        generator.generateSalesReport();
        printer.printReport();

        //OCP (Open/Closed Principle)
        System.out.println("\n\n\n");
        System.out.println("OCP: ");
        Order studentOrder = new Order(129, new StudentDiscount());
        Order seniorOrder = new Order(1593, new SeniorDiscount());
        System.out.println("student: " + studentOrder.calculateFinalAmount());
        System.out.println("SDenior: " + seniorOrder.calculateFinalAmount());

        //LSP (Liskov Substitution Principle)
        System.out.println("\n\n\n");
        System.out.println("LSP: ");
        Account checkingAccount = new CheckingAccount(213);
        Account savingsAccount = new SavingsAccount(453);
        checkingAccount.withdraw(34);
        savingsAccount.withdraw(23);
        System.out.println("Checking Account: " + checkingAccount.getBalance());
        System.out.println("Savings: " + savingsAccount.getBalance());
        savingsAccount.withdraw(24);

        //ISP (Interface Segregation Principle)
        System.out.println("\n\n\n");
        System.out.println("ISP: ");
        SimplePrinter basicPrinter = new BasicPrinter();
        VeryGoodPrinter multiPrinter = new VeryGoodPrinter();
        basicPrinter.printDocument("Basic Document");
        multiPrinter.printDocument("Very good Document");
        multiPrinter.scanDocument("Document to Scan");
        multiPrinter.faxDocument("Document to Fax");

        //DIP (Dependency Inversion Principle)
        System.out.println("\n\n\n");
        System.out.println("DIP: ");
        PaymentSystem creditCardSystem = new PaymentSystem(new CreditCardPayment());
        PaymentSystem payPalSystem = new PaymentSystem(new PayPalPayment());
        creditCardSystem.processPayment(643);
        payPalSystem.processPayment(3124);
    }
}