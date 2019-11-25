/**
 * Employee
 */
public class Employee implements MonthlyItem {
    protected String firstName;
    protected String lastName;
    protected double payrollAmount;
    protected String bankName;
    protected String routingTransit;
    protected String accountNumber;

    @Override
    public void process(String data) {
      String[] allData = data.split(" ");
      firstName = allData[0];
      lastName = allData[1];
      payrollAmount = Double.parseDouble(allData[2]);
      bankName = allData[3];
      routingTransit = allData[4];
      accountNumber = allData[5];

      System.out.println("Processing payroll for " + firstName +" "+ lastName+ " in the amount of "+ payrollAmount);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPayrollAmount() {
        return payrollAmount;
    }

    public void setPayrollAmount(double payrollAmount) {
        this.payrollAmount = payrollAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getRoutingTransit() {
        return routingTransit;
    }

    public void setRoutingTransit(String routingTransit) {
        this.routingTransit = routingTransit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}