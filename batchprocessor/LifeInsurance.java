package batchprocessor;

/**
 * LifeInsurance
 */
public class LifeInsurance extends Customer implements MonthlyItem {
    
    protected double billAmount;
    protected String policyType;

    
    @Override
    public void process(String data) {
        String[] allData = data.split(" ");
        firstName = allData[0];
        lastName = allData[1];
        billAmount = Double.parseDouble(allData[2]); 
        policyType = allData[3];

        System.out.println("Processing life insurance for "+ firstName + " " + lastName + " in the amount of "+ billAmount);
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    
}