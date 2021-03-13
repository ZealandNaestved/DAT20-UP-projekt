package hoekcel.model;

import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.inputvalidation.InputChecker;

public class IncomeStatement {

    InputChecker inputChecker;

    private int turnover;
    private int productConsumption;
    private int grossProfits;
    private int marketingCost;
    private int marketingContribution;
    private int capacityCost;
    private int earningsContribution;
    private int depreciations;
    private int profitBeforeInterest;
    private int interest;
    private int result;

    public IncomeStatement() {
        inputChecker = new InputChecker();
    }


    public int calculateTurnover(String amountOfGoods, String priceOfgood) throws DoesNotContainNumbersOnly, EmptyInput, NegativNumberException {
        checkInputNotEmpty(amountOfGoods);
        checkInputNotEmpty(priceOfgood);
        checkInputsNondigits(amountOfGoods);
        checkInputsNondigits(priceOfgood);
        checkNegativ(amountOfGoods);
        checkNegativ(priceOfgood);

        int amountOfGoodsAsint = Integer.parseInt(amountOfGoods);
        int priceOfGoodAsint = Integer.parseInt(priceOfgood);

        return amountOfGoodsAsint * priceOfGoodAsint;
    }

    public int calculateProductConsumption(String amountOfGoods, String priceOfgood) throws DoesNotContainNumbersOnly, EmptyInput, NegativNumberException {
        checkInputNotEmpty(amountOfGoods);
        checkInputNotEmpty(priceOfgood);
        checkInputsNondigits(amountOfGoods);
        checkInputsNondigits(priceOfgood);
        checkNegativ(amountOfGoods);
        checkNegativ(priceOfgood);

        int amountOfGoodsAsint = Integer.parseInt(amountOfGoods);
        int priceOfGoodAsint = Integer.parseInt(priceOfgood);

        return amountOfGoodsAsint * priceOfGoodAsint;
    }



    public int calculateGrossProfit(String turnover, String costOfGoods) throws EmptyInput, DoesNotContainNumbersOnly, NegativNumberException {
        checkInputNotEmpty(turnover);
        checkInputNotEmpty(costOfGoods);
        checkInputsNondigits(turnover);
        checkInputsNondigits(costOfGoods);
        checkNegativ(turnover);
        checkNegativ(costOfGoods);

        int turnoverAsint = Integer.parseInt(turnover);
        int costOfGoodsAsint = Integer.parseInt(costOfGoods);


        return (turnoverAsint - costOfGoodsAsint);
    }

    public int calculateMarketingContribution(String grossProfit, String salesPromotionCosts) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(grossProfit);
        checkInputNotEmpty(salesPromotionCosts);
        checkInputsNondigits(grossProfit);
        checkInputsNondigits(salesPromotionCosts);
        checkNegativ(salesPromotionCosts);

        int grossProfitsAsint = Integer.parseInt(grossProfit);
        int salesPromotionCostsAsint = Integer.parseInt(salesPromotionCosts);

        return grossProfitsAsint - salesPromotionCostsAsint;
    }

    public int calculateEarningsContribution(String marketingContribution, String cashCapacityCosts) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(marketingContribution);
        checkInputsNondigits(marketingContribution);
        checkInputNotEmpty(cashCapacityCosts);
        checkInputsNondigits(cashCapacityCosts);
        checkNegativ(marketingContribution);
        checkNegativ(cashCapacityCosts);

        int marketingContributionAsint = Integer.parseInt(marketingContribution);
        int cashCapacityCostsAsint = Integer.parseInt(cashCapacityCosts);

        return marketingContributionAsint - cashCapacityCostsAsint;
    }

    public int calculateProfitBeforeInterest(String earningsContribution, String depreciation) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(earningsContribution);
        checkInputNotEmpty(depreciation);
        checkInputsNondigits(earningsContribution);
        checkInputsNondigits(depreciation);
        checkNegativ(depreciation);


        int earningsContributionAsint = Integer.parseInt(earningsContribution);
        int depreciationAsint = Integer.parseInt(depreciation);

        return earningsContributionAsint - depreciationAsint;
    }

    public int calculateResult(String profitBeforeInterest, String interest) throws DoesNotContainNumbersOnly, EmptyInput {
        checkInputNotEmpty(profitBeforeInterest);
        checkInputNotEmpty(interest);
        checkInputsNondigits(profitBeforeInterest);
        checkInputsNondigits(interest);


        int profitBeforeInterestAsint = Integer.parseInt(profitBeforeInterest);
        int depreciationAsint = Integer.parseInt(interest);

        return profitBeforeInterestAsint - depreciationAsint;
    }

    public void setTurnover(int turnover) {
        this.turnover = turnover;
    }

    public void setProductConsumption(int productConsumption) {
        this.productConsumption = productConsumption;
    }

    public void setMarketingCost(int marketingCost) {
        this.marketingCost = marketingCost;
    }

    public void setGrossProfits(int grossProfits) {
        this.grossProfits = grossProfits;
    }

    public void setMarketingContribution(int marketingContribution) {
        this.marketingContribution = marketingContribution;
    }

    public void setCapacityCost(int capacityCost) {
        this.capacityCost = capacityCost;
    }

    public void setEarningsContribution(int earningsContribution) {
        this.earningsContribution = earningsContribution;
    }

    public void setDepreciations(int depreciations) {
        this.depreciations = depreciations;
    }

    public void setProfitBeforeInterest(int profitBeforeInterest) {
        this.profitBeforeInterest = profitBeforeInterest;
    }
    public void setInterest(int interest) {
        this.interest = interest;
    }
    public void setResult(int result) {
        this.result = result;
    }

    public int getTurnover() {
        return this.turnover;
    }
    public int getProductConsumption() {
        return this.productConsumption;
    }
    public int getGrossProfits() {
        return this.grossProfits;
    }
    public int getMarketingCost() {
        return this.marketingCost;
    }
    public int getMarketingContribution() {
        return this.marketingContribution;
    }

    public int getCapacityCost() {
        return this.capacityCost;
    }

    public int getEarningsContribution() {
        return this.earningsContribution;
    }

    public int getDepreciations() {
        return this.depreciations;
    }

    public int getProfitsBeforeInterest() {
        return this.profitBeforeInterest;
    }

    public int getInterest() {
        return this.interest;
    }

    public int getResult() {
        return result;
    }

    private void checkInputsNondigits(String input) throws DoesNotContainNumbersOnly {
        if (!inputChecker.onlyDigits(input)) {
            throw new DoesNotContainNumbersOnly("Tegn kan ikke benyttes. " +
                    "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).");
        }
    }

    private void checkNegativ(String salesPromotionCosts) throws NegativNumberException {
        if (inputChecker.isNegative(salesPromotionCosts)) {
            throw new NegativNumberException("Negative tal kan ikke benyttes. Du skal angive et heltal.");
        }
    }

    private void checkInputNotEmpty(String input) throws EmptyInput {
        if (input.isEmpty()) {
            throw new EmptyInput("Indput mangler");
        }
    }
}
