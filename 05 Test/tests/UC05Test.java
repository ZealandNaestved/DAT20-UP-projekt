import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC05Test {


    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();
    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "To millioner";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
            fail("setProfitBeforeInterest fejlede ikke");
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
        var earningsContribution = "1000";
        var depreciation = "-40163000";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
            fail("setProfitBeforeInterest fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.", errorMessage);
    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000";
        var depreciation = "4.0163.000";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
            fail("setProfitBeforeInterest fejlede ikke");
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
        var earningsContribution = "1000";
        var depreciation = "401.630,00";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
            fail("setProfitBeforeInterest fejlede ikke");
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
        var earningsContribution = "1000";
        var depreciation = "-401630,00";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setProfitBeforeInterest(profitBeforeInterest);
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
        var earningsContribution = "1000000";
        var depreciation = "0";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(1000000, incomeStatement.getProfitsBeforeInterest());
    }

    /*//Number less than thousand, ones
    @Test
    public void TestCase07() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "2";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(1000000, incomeStatement.getProfitsBeforeInterest());
    }


    //Number less than thousand, tens
    @Test
    public void TestCase08() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "28";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(1000000, incomeStatement.getProfitsBeforeInterest());
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "917";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(999000, incomeStatement.getProfitsBeforeInterest());
    }

    //Numbers
    @Test
    public void TestCase10() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "312";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(1000000, incomeStatement.getProfitsBeforeInterest());
    }*/
    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "%";
        var errorMessage = "";

        try{
            var profitBeforeInterest = incomeStatement.
                    calculateProfitBeforeInterest(earningsContribution, depreciation);
            incomeStatement.setMarketingContribution(profitBeforeInterest);
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
        var earningsContribution = "1000000";
        var depreciation = "2000000";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);


        Assertions.assertEquals(-1000000, incomeStatement.getProfitsBeforeInterest());
    }


    //Input is less than gross profit
    @Test
    public void TestCase13() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var earningsContribution = "1000000";
        var depreciation = "800000";

        var profitBeforeInterest = incomeStatement.
                calculateProfitBeforeInterest(earningsContribution, depreciation);
        incomeStatement.setProfitBeforeInterest(profitBeforeInterest);

        Assertions.assertEquals(200000, incomeStatement.getProfitsBeforeInterest());
    }
}
