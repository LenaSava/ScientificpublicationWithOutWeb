package view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    new Locale("ua", "UA"));
    //new Locale("en"));

    public void printMessage(Object message) {
        System.out.println(message);
    }

    public void printStringInput(String message) {
        printMessage("\n" + bundle.getString(message));
    }
}