package hoekcel.inputvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputChecker {

    public boolean onlyDigits(String input) {

        String regexOld = "-?[0-9]+";
        String regex = "-?[0-9]?[0-9]*";

        Pattern p = Pattern.compile(regex);

        if (input == null) {
            return false;
        }

        Matcher m = p.matcher(input);

        return !m.matches();
    }

    public boolean isNegative(String input) {
        String regex = "[0-9]?[0-9]*";

        Pattern p = Pattern.compile(regex);

        if (input == null) {
            return false;
        }

        Matcher m = p.matcher(input);

        return !m.matches();

    }

    public static void main(String[] args) {

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.isNegative("1"));
    }
}
