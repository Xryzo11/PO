import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Testy ONP -----");
        String rpn = "3 4 + 2 5 - -";
        System.out.println(rpn + " => " + RPNCalculator.calculateRPN(rpn));
        rpn = "8 0 1 2 + - +";
        System.out.println(rpn + " => " + RPNCalculator.calculateRPN(rpn));

        System.out.print("\n");
        System.out.println("----- Test symulacji przeglądarki -----");
        BrowserSimulation sim1 = new BrowserSimulation();
        System.out.println("//visitPage(\"chrome://newtab\")");
        sim1.visitPage("chrome://newtab");
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//visitPage(\"google.com\")");
        sim1.visitPage("google.com");
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//visitPage(\"youtube.com\")");
        sim1.visitPage("youtube.com");
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//goBack()");
        sim1.goBack();
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//visitPage(\"wp.pl\")");
        sim1.visitPage("wp.pl");
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//goBack()");
        sim1.goBack();
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//goBack()");
        sim1.goBack();
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());
        System.out.println("//goBack()");
        sim1.goBack();
        System.out.println("Obecna strona: " + sim1.getCurrentUrl());

        System.out.print("\n");
        System.out.println("----- Manualny test symulacji -----");
        BrowserSimulation sim2 = new BrowserSimulation();
        System.out.println("Możliwe polecenia:");
        System.out.println("visit *url*");
        System.out.println("back");
        System.out.println("exit");
        System.out.print("\n");
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        while (loop) {
            System.out.print("> ");
            String com = sc.nextLine();
            if (com.equals("exit")) {
                loop = false;
            }
            if (com.startsWith("back")) {
                sim2.goBack();
                System.out.println("Obecna strona: " + sim2.getCurrentUrl());
            }
            if (com.startsWith("visit ")) {
                sim2.visitPage(com.substring(6));
                System.out.println("Obecna strona: " + sim2.getCurrentUrl());
            }
        }
    }
}
