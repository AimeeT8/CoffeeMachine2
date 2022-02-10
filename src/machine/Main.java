package machine;

import java.util.Scanner;

/**
 * @author: A Temple
 * @2022-02-07
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finished = false;
        CoffeeMachine2 coffeeMachine = new CoffeeMachine2();

        do {
            if (coffeeMachine.getState() == State.MAIN_MENU) {
                mainMenu();
            }
            String action = scanner.nextLine();
            if ("exit".equals(action)) {
                finished = true;
            } else {
                coffeeMachine.chooseAction(action);
            }

        } while(!finished);
        scanner.close();

    }
    public static void mainMenu() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
    }
}
