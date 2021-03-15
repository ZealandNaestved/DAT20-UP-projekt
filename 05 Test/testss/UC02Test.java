import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC02Test {


    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();
    //Negative tal
    @Test
    public void TestCase01() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "-1000";
        var costOfGoods = "10000";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.",
                errorMessage);
    }

    //Negativ numbers
    @Test
    public void TestCase02() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000";
        var costOfGoods = "-10000";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Negative tal kan ikke benyttes. Du skal angive et heltal.",
                errorMessage);

    }

    //Punktum
    @Test
    public void TestCase03() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000";
        var costOfGoods = "10.000";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
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
        var turnover = "1000";
        var costOfGoods = "10,1";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
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
        var turnover = "1000";
        var costOfGoods = "-401630,00";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
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
        var turnover = "1000";
        var costOfGoods = "0";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(1000, incomeStatement.getGrossProfits());
    }

    /*//Number less than thousand, ones
    @Test
    public void TestCase07() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000000";
        var costOfGoods = "2";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(1000000, incomeStatement.getGrossProfits());
    }


    //Number less than thousand, tens
    @Test
    public void TestCase08() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000000";
        var costOfGoods = "28";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(1000000, incomeStatement.getGrossProfits());
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000000";
        var costOfGoods = "917";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(999000, incomeStatement.getGrossProfits());
    }*/

    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000";
        var costOfGoods = "%";
        var errorMessage = "";

        try{
            var grossProfit = incomeStatement.
                    calculateGrossProfit(turnover, costOfGoods);
            incomeStatement.setGrossProfits(grossProfit);
            fail("setGrossProfit fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }

    @Test
    public void TestCase12() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000000";
        var costOfGoods = "2000000";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(-1000000, incomeStatement.getGrossProfits());
    }



    @Test
    public void TestCase13() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var turnover = "1000000";
        var costOfGoods = "800000";

        var grossProfit = incomeStatement.
                calculateGrossProfit(turnover, costOfGoods);
        incomeStatement.setGrossProfits(grossProfit);

        Assertions.assertEquals(200000, incomeStatement.getGrossProfits());
    }
}
