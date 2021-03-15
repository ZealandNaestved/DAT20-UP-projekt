import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC04Test {

    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();
    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000";
        var cashCapacityCosts = "To millioner";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
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
        var marketingContribution = "1000";
        var cashCapacityCosts = "-100";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.", errorMessage);
    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000";
        var cashCapacityCosts = "100.";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
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
        var marketingContribution = "1000";
        var cashCapacityCosts = "10,0.";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
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
        var marketingContribution = "1000";
        var cashCapacityCosts = "-10,0.";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
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
        var marketingContribution = "1000";
        var cashCapacityCosts = "0";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(1000, incomeStatement.getEarningsContribution());
    }

    /*//Number less than thousand, ones
    @Test
    public void TestCase07() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000000";
        var cashCapacityCosts = "2";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(1000000, incomeStatement.getEarningsContribution());
    }


    //Number less than thousand, tens
    @Test
    public void TestCase08() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000000";
        var cashCapacityCosts = "28";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(1000000, incomeStatement.getEarningsContribution());
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000000";
        var cashCapacityCosts = "917";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(999000, incomeStatement.getEarningsContribution());
    }

    //Numbers
    @Test
    public void TestCase10() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000000";
        var cashCapacityCosts = "312";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(1000000, incomeStatement.getEarningsContribution());
    }*/
    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000";
        var cashCapacityCosts = "%";
        var errorMessage = "";

        try{
            var earningsContribution = incomeStatement.
                    calculateEarningsContribution(marketingContribution, cashCapacityCosts);
            incomeStatement.setEarningsContribution(earningsContribution);
            fail("setEarningsContribution fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    //Input larger
    @Test
    public void TestCase12() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "1000000";
        var cashCapacityCosts = "2000000";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(-1000000, incomeStatement.getEarningsContribution());
    }


    //Input is less than gross profit
    @Test
    public void TestCase13() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var marketingContribution = "2000000";
        var cashCapacityCosts = "1000000";

        var earningsContribution = incomeStatement.
                calculateEarningsContribution(marketingContribution, cashCapacityCosts);
        incomeStatement.setEarningsContribution(earningsContribution);
        Assertions.assertEquals(1000000, incomeStatement.getEarningsContribution());
    }
}
