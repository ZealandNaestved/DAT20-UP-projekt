import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.exceptions.NegativNumberException;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC01Test {


    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();

    //Text
    @Test
    public void TestCase01() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var amountOfGoods = "1000";
        var priceOfGood = "To millioner";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
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
        var amountOfGoods = "1000";
        var priceOfGood = "-10";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
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
        var amountOfGoods = "1000";
        var priceOfGood = "100.00";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
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
        var amountOfGoods = "1000";
        var priceOfGood = "100,00";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
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
        var amountOfGoods = "1000";
        var priceOfGood = "-100,00";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
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
        var amountOfGoods = "1000";
        var priceOfGood = "0";

        var turnover = incomeStatement.
                calculateTurnover(amountOfGoods, priceOfGood);
        incomeStatement.setTurnover(turnover);

        Assertions.assertEquals(0, incomeStatement.getTurnover());
    }

    //Number less than thousand, ones
    @Test
    public void TestCase07() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var amountOfGoods = "2";
        var priceOfGood = "3";

        var turnover = incomeStatement.
                calculateTurnover(amountOfGoods, priceOfGood);
        incomeStatement.setTurnover(turnover);

        Assertions.assertEquals(6, incomeStatement.getTurnover());
    }


    //Number less than thousand, tens
    @Test
    public void TestCase08() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var amountOfGoods = "1000000";
        var priceOfGood = "28";

        var turnover = incomeStatement.
                calculateTurnover(amountOfGoods, priceOfGood);
        incomeStatement.setTurnover(turnover);

        Assertions.assertEquals(28000000, incomeStatement.getTurnover());
    }

    // Number less than thousand, hundred
    @Test
    public void TestCase09() throws NegativNumberException, DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var amountOfGoods = "1000000";
        var priceOfGood = "917";

        var turnover = incomeStatement.
                calculateTurnover(amountOfGoods, priceOfGood);
        incomeStatement.setTurnover(turnover);

        Assertions.assertEquals(917000000, incomeStatement.getTurnover());
    }

    //Percentage character
    @Test
    public void TestCase11() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var amountOfGoods = "%";
        var priceOfGood = "10000";
        var errorMessage = "";

        try{
            var turnover = incomeStatement.
                    calculateTurnover(amountOfGoods, priceOfGood);
            incomeStatement.setTurnover(turnover);
            fail("setTurnover fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }
}
