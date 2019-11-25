/**
 * Annuity
 */
public class Annuity extends Customer implements MonthlyItem {
    protected double paymentAmount;
    protected String policyType;

    @Override
    public void process(String data) {
        // TODO Auto-generated method stub

    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }
}