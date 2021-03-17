package hoekcel.controller.errorHandler;

import java.util.Locale;

public class InputErrorHandler {
    public static String getHeaderText(String messageName) {
        return switch (messageName.toLowerCase()) {
            case "tegn" -> "Du kan ikke bruge tegn.";
            case "negativ" -> "Negative tal kan ikke benyttes";
            default -> null;
        };
    }

    public static String getMessageText(String messageName) {
        return switch (messageName.toLowerCase()) {
            case "tegn" -> "Du skal angive et heltal uden tegn (tegn kan f.eks. være komma, punktum, procent og meget andet).";
            case "negativ" -> "Negative tal kan ikke benyttes. Du skal angive et positivt tal.";
            default -> null;
        };
    }
}
