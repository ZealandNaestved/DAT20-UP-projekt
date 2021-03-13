import hoekcel.exceptions.DoesNotContainNumbersOnly;
import hoekcel.exceptions.EmptyInput;
import hoekcel.model.IncomeStatementFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class UC06Test {

    IncomeStatementFactory incomeStatementFactory = new IncomeStatementFactory();

    @Test
    public void TestCase01() throws DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var profitBeforeInterest = "2000000";
        var interest = "-1000000";

        var result = incomeStatement.
                calculateResult(profitBeforeInterest, interest);
        incomeStatement.setResult(result);

        Assertions.assertEquals(3000000, incomeStatement.getResult());
    }

    @Test
    public void TestCase02() throws DoesNotContainNumbersOnly, EmptyInput {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var profitBeforeInterest = "2000000";
        var interest = "1000000";

        var result = incomeStatement.
                calculateResult(profitBeforeInterest, interest);
        incomeStatement.setResult(result);

        Assertions.assertEquals(1000000, incomeStatement.getResult());
    }

    @Test
    public void TestCase03() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var profitBeforeInterest = "2000000";
        var interest = "";
        var errorMessage = "";

        try{
            var result = incomeStatement.
                    calculateResult(profitBeforeInterest, interest);
            incomeStatement.setResult(result);
            fail("setResult fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Indput mangler",
                errorMessage);
    }

    @Test
    public void TestCase04() {

        var incomeStatement = incomeStatementFactory.getIncomeStatement();
        var profitBeforeInterest = "2000000";
        var interest = "ff";
        var errorMessage = "";

        try{
            var result = incomeStatement.
                    calculateResult(profitBeforeInterest, interest);
            incomeStatement.setResult(result);
            fail("setResult fejlede ikke");
        } catch (Exception e){
            errorMessage = e.getMessage();
        }

        Assertions.assertEquals("Tegn kan ikke benyttes. " +
                        "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).",
                errorMessage);
    }
}

