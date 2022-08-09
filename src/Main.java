import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose operation");
            System.out.println("1. Add");
            System.out.println("2. Show");
            System.out.println("3. Delete");
            String choice = scanner.nextLine();
            if (choice.equals("end")) {
                System.out.println("Shopping finished");
                break;
            } else if (choice.equals("1")) {
                System.out.println("What purchase do You want to add?");
                String purchase = scanner.nextLine();
                list.add(purchase);
                System.out.println("Purchase overall: " + list.size());
            } else if (choice.equals("2")) {
                System.out.println("Shopping list");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
            } else if (choice.equals("3")) {
                System.out.println("Shopping list");
                for (int i = 0; i < list.size(); i++) {
                    System.out.println((i + 1) + ". " + list.get(i));
                }
                System.out.println("What would You like to delete? Enter number or name");
                String delete = scanner.nextLine();
                int parseDelete = 0;
                try {
                    parseDelete = Integer.parseInt(delete);
                } catch (NumberFormatException e) {
                    list.remove(delete);
                    System.out.println("Purchase " + delete + " deleted. Shopping list:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
                if (parseDelete != 0) {
                    String indexDelete = list.get(parseDelete - 1);
                    list.remove(parseDelete - 1);
                    System.out.println("Purchase " + indexDelete + " deleted. Shopping list:");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println((i + 1) + ". " + list.get(i));
                    }
                }
            }
        }
    }
}