import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.fail;

public class UC03Test {

    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "To millioner";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){

        }
    }

    //Negativ numbers
    @Test
    public void TestCase02() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "-40163000";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){

        }
    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "401.630.00";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){

        }
    }

    //comma
    @Test
    public void TestCase04() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "401,630,00";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){

        }
    }

    //Negativ number and comma
    @Test
    public void TestCase05() {
        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "-401,630,00";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){

        }
    }

    //number zero
    @Test
    public void TestCase06() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "0";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 1000);
    }

    //Number less than thousand, ones
    @Test
    public void TestCase07() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "2";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 1000);
    }

    //Number less than thousand, tens
    @Test
    public void TestCase08() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000";
        var salesPromotionCosts = "28";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 1000);
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "917";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 999);
    }

    //Numbers
    @Test
    public void TestCase10() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "312";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 1000);
    }
    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "%";

        try{
            incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            var testOutput = e.getMessage();
            Assertions.assertEquals("Tegn kan ikke benyttes. " +
                    "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).", testOutput);
        }
    }

    //Input larger than gross profit
    @Test
    public void TestCase12() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "2000000";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == -1000);
    }


    //Input is less than gross profit
    @Test
    public void TestCase13() {

        var incomeStatement = new IncomeStatement();
        var grossProfit = "1000000";
        var salesPromotionCosts = "800000";

        incomeStatement.setMarketingContribution(grossProfit, salesPromotionCosts);

        Assertions.assertTrue(incomeStatement.getMarketingContribution() == 200);
    }
}
