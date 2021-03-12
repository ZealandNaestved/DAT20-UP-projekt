import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC05Test {


    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "To millioner";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
            fail("setProfitBeforeInterest fejlede ikke");
        } catch (Exception e){
            var testOutput = e.getMessage();

            Assertions.assertEquals("Tegn kan ikke benyttes. " +
                    "Du skal angive et heltal uden tegn " +
                    "(tegn kan f.eks. være kommer, punktum, procent og meget andet).", testOutput);
        }
    }

    //Negativ numbers
    @Test
    public void TestCase02() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "-40163000";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
            fail("setMarkedsfoeringsbidrag fejlede ikke");
        } catch (Exception e){
            var testOutput = e.getMessage();
            Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.", testOutput);
        }
    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "4.0163.000";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
            fail("setProfitBeforeInterest fejlede ikke");
        } catch (Exception e){

            var testOutput = e.getMessage();
            Assertions.assertEquals("Tegn kan ikke benyttes. " +
                    "Du skal angive et heltal uden tegn " +
                    "(tegn kan f.eks. være kommer, punktum, procent og meget andet).", testOutput);
        }
    }

    //comma
    @Test
    public void TestCase04() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "4,0163,000";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
            fail("setProfitBeforeInterest fejlede ikke");
        } catch (Exception e){
            var testOutput = e.getMessage();

            Assertions.assertEquals("Tegn kan ikke benyttes. " +
                    "Du skal angive et heltal uden tegn " +
                    "(tegn kan f.eks. være kommer, punktum, procent og meget andet).", testOutput);
        }
    }


    //Negativ number and comma
    @Test
    public void TestCase05() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "-4,0163,000";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
            fail("setProfitBeforeInterest fejlede ikke");
        } catch (Exception e){
            var testOutput = e.getMessage();
            Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.", testOutput);
        }
    }

    //number zero
    @Test
    public void TestCase06() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "0";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 1000);
    }

    //Number less than thousand, ones
    @Test
    public void TestCase07() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "2";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 1000);
    }

    //Number less than thousand, tens
    @Test
    public void TestCase08() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "28";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 1000);
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "917";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 999);
    }

    //Numbers
    @Test
    public void TestCase10() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "312";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 1000);
    }
    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "%";

        try{
            incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
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
        var earningsContribution = "1000000";
        var depreciation = "2000000";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == -1000);
    }


    //Input is less than gross profit
    @Test
    public void TestCase13() {

        var incomeStatement = new IncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "800000";

        incomeStatement.setProfitBeforeInterest(earningsContribution, depreciation);
        Assertions.assertTrue(incomeStatement.getProfitBeforeInterest() == 200);
    }
}
