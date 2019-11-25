package batchprocessor;

/**
 * MutualFund
 */
public class MutualFund extends Customer implements MonthlyItem {
    protected String ticker;
    protected double lastClose;
    protected double percentChange;

    @Override
    public void process(String data) {
        // TODO Auto-generated method stub
        String[] allData = data.split(",");
        String fullName = allData[0];
        String[] allFullname = fullName.split(" ");
        firstName = allFullname[0];
        lastName = allFullname[1];
        ticker = allData[1];
        lastClose = Double.parseDouble(allData[2]);
        percentChange = Double.parseDouble(allData[3]);

        System.out.println("Processing mutual fund for : " + fullName + " ticker: " + ticker);

    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getLastClose() {
        return lastClose;
    }

    public void setLastClose(double lastClose) {
        this.lastClose = lastClose;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    
}