package hoekcel.model;
import java.math.BigInteger;
import java.util.LinkedHashMap;

public class IncomeStatement {

    private BigInteger turnover= new BigInteger("0");
    private BigInteger productConsumption = new BigInteger("0");
    private BigInteger grossProfits = new BigInteger("0");
    private BigInteger marketingCost = new BigInteger("0");
    private BigInteger marketingContribution = new BigInteger("0");
    private BigInteger capacityCost = new BigInteger("0");
    private BigInteger earningsContribution = new BigInteger("0");
    private BigInteger depreciations = new BigInteger("0");
    private BigInteger profitBeforeInterest = new BigInteger("0");
    private BigInteger interest = new BigInteger("0");
    private BigInteger result = new BigInteger("0");

    public static void main(String[] args) {
        var incomeStatement = new IncomeStatement();
        incomeStatement.getFieldsAndValues().forEach((k,v)->
                System.out.println("key: " + k + "value: " + v));
    }

    public LinkedHashMap<Object, Object> getFieldsAndValues() {

        var linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(0, turnover);
        linkedHashMap.put(1, productConsumption);
        linkedHashMap.put(2, grossProfits);
        linkedHashMap.put(3, marketingCost);
        linkedHashMap.put(4, marketingContribution);
        linkedHashMap.put(5, capacityCost);
        linkedHashMap.put(6, earningsContribution);
        linkedHashMap.put(7, profitBeforeInterest);
        linkedHashMap.put(8, profitBeforeInterest);
        linkedHashMap.put(9, interest);
        linkedHashMap.put(10, result);

        return linkedHashMap;
    }

    public BigInteger calculateTurnover(BigInteger amountOfGoods, BigInteger priceOfgood) {

        return amountOfGoods.multiply(priceOfgood);
    }

    public BigInteger calculateProductConsumption(BigInteger amountOfGoods, BigInteger priceOfgood) {

        return amountOfGoods.multiply(priceOfgood);
    }

    public BigInteger calculateGrossProfit(BigInteger turnover, BigInteger costOfGoods) {

        return turnover.subtract(costOfGoods);
    }

    public BigInteger calculateMarketingContribution(BigInteger grossProfits, BigInteger salesPromotionCosts) {

        return grossProfits.subtract(salesPromotionCosts);
    }

    public BigInteger calculateEarningsContribution(BigInteger marketingContribution, BigInteger cashCapacityCosts)  {

        return marketingContribution.subtract(cashCapacityCosts);
    }

    public BigInteger calculateProfitBeforeInterest(BigInteger earningsContribution, BigInteger depreciation)  {

        return earningsContribution.subtract(depreciation);
    }

    public BigInteger calculateResult(BigInteger profitBeforeInterest, BigInteger interest) {

        return profitBeforeInterest.subtract(interest);
    }

    public void setTurnover(BigInteger turnover) {
        this.turnover = turnover;
    }

    public void setProductConsumption(BigInteger productConsumption) {
        this.productConsumption = productConsumption;
    }

    public void setMarketingCost(BigInteger marketingCost) {
        this.marketingCost = marketingCost;
    }

    public void setGrossProfits(BigInteger grossProfits) {
        this.grossProfits = grossProfits;
    }

    public void setMarketingContribution(BigInteger marketingContribution) {
        this.marketingContribution = marketingContribution;
    }

    public void setCapacityCost(BigInteger capacityCost) {
        this.capacityCost = capacityCost;
    }

    public void setEarningsContribution(BigInteger earningsContribution) {
        this.earningsContribution = earningsContribution;
    }

    public void setDepreciations(BigInteger depreciations) {
        this.depreciations = depreciations;
    }

    public void setProfitBeforeInterest(BigInteger profitBeforeInterest) {
        this.profitBeforeInterest = profitBeforeInterest;
    }
    public void setInterest(BigInteger interest) {
        this.interest = interest;
    }
    public void setResult(BigInteger result) {
        this.result = result;
    }

    public BigInteger getTurnover() {
        return this.turnover;
    }
    public BigInteger getProductConsumption() {
        return this.productConsumption;
    }
    public BigInteger getGrossProfits() {
        return this.grossProfits;
    }
    public BigInteger getMarketingCost() {
        return this.marketingCost;
    }
    public BigInteger getMarketingContribution() {
        return this.marketingContribution;
    }

    public BigInteger getCapacityCost() {
        return this.capacityCost;
    }

    public BigInteger getEarningsContribution() {
        return this.earningsContribution;
    }

    public BigInteger getDepreciations() {
        return this.depreciations;
    }

    public BigInteger getProfitsBeforeInterest() {
        return this.profitBeforeInterest;
    }

    public BigInteger getInterest() {
        return this.interest;
    }

    public BigInteger getResult() {
        return result;
    }

}
