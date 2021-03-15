import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC03Test {

    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();
    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "To millioner";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //Negativ numbers
    @Test
    public void TestCase02() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "-40163000";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.", errorMessage);
    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "401.630.00";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //comma
    @Test
    public void TestCase04() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "401,630,00";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //Negativ number and comma
    @Test
    public void TestCase05() {
        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "-401630,00";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //number zero
    @Test
    public void TestCase06() throws DoesNotContainNumbersOnly, NegativNumberException, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "0";

        long marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        System.out.println(marketingContribution);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(1000, incomeStatement.getMarketingContribution());
    }

    //Number less than thousand, ones
   /* @Test
    public void TestCase07() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "2";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(1000000, incomeStatement.getMarketingContribution());
    }


    //Number less than thousand, tens
    @Test
    public void TestCase08() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "28";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(1000000, incomeStatement.getMarketingContribution());
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "917";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(999000,incomeStatement.getMarketingContribution() );
    }

    //Numbers
    @Test
    public void TestCase10() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "312";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(1000000, incomeStatement.getMarketingContribution());
    }*/
    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "%";
        var errorMessage = "";

        try{
            var marketingContribution = incomeStatement.
                    calculateMarketingContribution(grossProfit, salesPromotionCosts);
            incomeStatement.setMarketingContribution(marketingContribution);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //Input larger than gross profit
    @Test
    public void TestCase12() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "2000000";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);


        Assertions.assertEquals(-1000000, incomeStatement.getMarketingContribution());
    }


    //Input is less than gross profit
    @Test
    public void TestCase13() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "800000";

        var marketingContribution = incomeStatement.
                calculateMarketingContribution(grossProfit, salesPromotionCosts);
        incomeStatement.setMarketingContribution(marketingContribution);

        Assertions.assertEquals(200000, incomeStatement.getMarketingContribution());
    }
}
