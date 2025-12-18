package ui;

import java.util.Scanner;
import java.util.Locale;

public class MenuUI {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a mathematical expression (Enter /help " +
                    "to learn about commands and how to perform possible" +
                    " operations.)\n(Enter /exit to exit)");
            String expression = scanner.nextLine();
            if (expression.equals("/help")) {
                HelpUI.start();
                scanner.nextLine();
            }
            if (expression.equals("/exit")) {
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            }
        }
    }
}
