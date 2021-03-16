package hoekcel.validationHandler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputValidation {

    public boolean onlyDigits(String input) {
        if (input == null) return false;

        String regex = "-?[0-9]?[0-9]*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(input);

        return !m.matches();
    }

    public boolean isNegative(String input) {
        if (input == null) return false;

        String regex = "[0-9]?[0-9]*";

        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(input);

        return !m.matches();
    }
}
