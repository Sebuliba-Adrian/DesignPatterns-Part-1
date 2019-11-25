package batchprocessor;
/**
 * Annuity
 */
public class Annuity extends Customer implements MonthlyItem {
    protected double paymentAmount;

    @Override
    public void process(String data) {
        String[] allData = data.split(" ");
        firstName = allData[0];
        lastName = allData[1];
        paymentAmount = Double.parseDouble(allData[2]);
        // TODO Auto-generated method stub
        System.out.println("Processing annuity for " + firstName + " " + lastName + " in the amount of "+ paymentAmount); // Could be a web service that actually sends out that check
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}