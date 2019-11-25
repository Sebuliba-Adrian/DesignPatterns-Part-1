package batchprocessor;

/**
 * MonthlyInsurance
 */
public class MonthlyInsurance extends Customer implements MonthlyItem {
    protected double billAmount;

    @Override
    public void process(String data) {
        // TODO Auto-generated method stub

    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }


    
}