package hoekcel.model;

import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.inputvalidation.InputChecker;

public class IncomeStatement {

    InputChecker inputChecker;
    private long turnover;
    private long productConsumption;
    private long grossProfits;
    private long marketingCost;
    private long marketingContribution;
    private long capacityCost;
    private long earningsContribution;
    private long depreciations;
    private long profitBeforeInterest;
    private long interest;
    private long result;

    public IncomeStatement() {
        inputChecker = new InputChecker();
    }


    public long calculateTurnover(String amountOfGoods, String priceOfgood) throws DoesNotContainNumbersOnly, EmptyInput, NegativNumberException {
        checkInputNotEmpty(amountOfGoods);
        checkInputNotEmpty(priceOfgood);
        checkInputsNondigits(amountOfGoods);
        checkInputsNondigits(priceOfgood);
        checkNegativ(amountOfGoods);
        checkNegativ(priceOfgood);

        long amountOfGoodsAsint = Long.parseLong(amountOfGoods);
        long priceOfGoodAsint = Long.parseLong(priceOfgood);

        return amountOfGoodsAsint * priceOfGoodAsint;
    }

    public long calculateProductConsumption(String amountOfGoods, String priceOfgood) throws DoesNotContainNumbersOnly, EmptyInput, NegativNumberException {
        checkInputNotEmpty(amountOfGoods);
        checkInputNotEmpty(priceOfgood);
        checkInputsNondigits(amountOfGoods);
        checkInputsNondigits(priceOfgood);
        checkNegativ(amountOfGoods);
        checkNegativ(priceOfgood);

        long amountOfGoodsAsint = Long.parseLong(amountOfGoods);
        long priceOfGoodAsint = Long.parseLong(priceOfgood);

        return amountOfGoodsAsint * priceOfGoodAsint;
    }



    public long calculateGrossProfit(String turnover, String costOfGoods) throws EmptyInput, DoesNotContainNumbersOnly, NegativNumberException {
        checkInputNotEmpty(turnover);
        checkInputNotEmpty(costOfGoods);
        checkInputsNondigits(turnover);
        checkInputsNondigits(costOfGoods);
        checkNegativ(turnover);
        checkNegativ(costOfGoods);

        long turnoverAsint = Long.parseLong(turnover);
        long costOfGoodsAsint = Long.parseLong(costOfGoods);


        return (turnoverAsint - costOfGoodsAsint);
    }

    public long calculateMarketingContribution(String grossProfit, String salesPromotionCosts) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(grossProfit);
        checkInputNotEmpty(salesPromotionCosts);
        checkInputsNondigits(grossProfit);
        checkInputsNondigits(salesPromotionCosts);
        checkNegativ(salesPromotionCosts);

        long grossProfitsAsint = Long.parseLong(grossProfit);
        long salesPromotionCostsAsint = Long.parseLong(salesPromotionCosts);

        return grossProfitsAsint - salesPromotionCostsAsint;
    }

    public long calculateEarningsContribution(String marketingContribution, String cashCapacityCosts) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(marketingContribution);
        checkInputsNondigits(marketingContribution);
        checkInputNotEmpty(cashCapacityCosts);
        checkInputsNondigits(cashCapacityCosts);
        checkNegativ(marketingContribution);
        checkNegativ(cashCapacityCosts);

        long marketingContributionAsint = Long.parseLong(marketingContribution);
        long cashCapacityCostsAsint = Long.parseLong(cashCapacityCosts);

        return marketingContributionAsint - cashCapacityCostsAsint;
    }

    public long calculateProfitBeforeInterest(String earningsContribution, String depreciation) throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {
        checkInputNotEmpty(earningsContribution);
        checkInputNotEmpty(depreciation);
        checkInputsNondigits(earningsContribution);
        checkInputsNondigits(depreciation);
        checkNegativ(depreciation);


        long earningsContributionAsint = Long.parseLong(earningsContribution);
        long depreciationAsint = Long.parseLong(depreciation);

        return earningsContributionAsint - depreciationAsint;
    }

    public long calculateResult(String profitBeforeInterest, String interest) throws DoesNotContainNumbersOnly, EmptyInput {
        checkInputNotEmpty(profitBeforeInterest);
        checkInputNotEmpty(interest);
        checkInputsNondigits(profitBeforeInterest);
        checkInputsNondigits(interest);


        long profitBeforeInterestAsint = Long.parseLong(profitBeforeInterest);
        long depreciationAsint = Long.parseLong(interest);

        return profitBeforeInterestAsint - depreciationAsint;
    }

    public void setTurnover(long turnover) {
        this.turnover = turnover;
    }

    public void setProductConsumption(long productConsumption) {
        this.productConsumption = productConsumption;
    }

    public void setMarketingCost(long marketingCost) {
        this.marketingCost = marketingCost;
    }

    public void setGrossProfits(long grossProfits) {
        this.grossProfits = grossProfits;
    }

    public void setMarketingContribution(long marketingContribution) {
        this.marketingContribution = marketingContribution;
    }

    public void setCapacityCost(long capacityCost) {
        this.capacityCost = capacityCost;
    }

    public void setEarningsContribution(long earningsContribution) {
        this.earningsContribution = earningsContribution;
    }

    public void setDepreciations(long depreciations) {
        this.depreciations = depreciations;
    }

    public void setProfitBeforeInterest(long profitBeforeInterest) {
        this.profitBeforeInterest = profitBeforeInterest;
    }
    public void setInterest(long interest) {
        this.interest = interest;
    }
    public void setResult(long result) {
        this.result = result;
    }

    public long getTurnover() {
        return this.turnover;
    }
    public long getProductConsumption() {
        return this.productConsumption;
    }
    public long getGrossProfits() {
        return this.grossProfits;
    }
    public long getMarketingCost() {
        return this.marketingCost;
    }
    public long getMarketingContribution() {
        return this.marketingContribution;
    }

    public long getCapacityCost() {
        return this.capacityCost;
    }

    public long getEarningsContribution() {
        return this.earningsContribution;
    }

    public long getDepreciations() {
        return this.depreciations;
    }

    public long getProfitsBeforeInterest() {
        return this.profitBeforeInterest;
    }

    public long getInterest() {
        return this.interest;
    }

    public long getResult() {
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
