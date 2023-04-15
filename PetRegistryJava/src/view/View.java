package view;

import java.util.Locale;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    public void showMainMenu(){
        System.out.println("""
                \n
                \n
                1 - show animal
                2 - add animal
                3 - edit animal
                4 - delete animal
                5 - play with animal
                6 - create new command
                7 - print counter
                8 - save db
                q - exit
                """);
    }

    public int enterId(){
        int number;
        do {
            System.out.println("Enter id animal: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Enter integer number.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        return number-1;
    }

    public int enterIdCommand(){
        int number;
        do {
            System.out.println("Enter id command: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error! Enter integer number.");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        return number-1;
    }



    public String enterName(){
        String str;
        System.out.print("Enter animal's name: \n");
        do {
            str = scanner.nextLine();
        } while (str.isEmpty());
        return str;

    }

    public String enterType(){
        String str;
        System.out.print("Enter type animal 'Home' or 'Wild': \n");
        do {
            str = scanner.nextLine();
        } while (!(str.equals("Wild") || str.equals("Home")));
        return str.toUpperCase(Locale.ROOT);
    }

    public String enterNewCommand(){
        String str;
        System.out.print("Enter new command: \n");
        do {
            str = scanner.nextLine();
        } while (str.isEmpty());
        return str;
    }

    public double enterAge(){
//        System.out.println("Enter age and month animal (example: 1.6, 3.5): ");
        String number;
        do {
            System.out.println("Enter age and month animal (example: 1.6, 3.5): ");
            while (!scanner.hasNext()) {
                System.out.println("Error! Enter double number.");
                scanner.next();
            }
            number = scanner.nextLine();
        } while (!isNumeric(number));
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(String.valueOf(s));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }




    public void viewAddAnimal(){
        System.out.println("animal add");
    }

    public void viewEditAnimal(){
        System.out.println("edit animal");
    }

    public void deleteAnimal(){
        System.out.println("delete animal");
    }

    public void enter(){
        System.out.println("Enter your choice: ");
    }
}
