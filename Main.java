import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Problem> problems = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== DSA Problem Tracker =====");
            System.out.println("1. Add a problem");
            System.out.println("2. View all problems");
            System.out.println("3. Mark problem as solved");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter problem name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter topic (Array/String/etc.): ");
                    String topic = sc.nextLine();

                    Problem p = new Problem(name, topic, "Unsolved");
                    problems.add(p);

                    System.out.println("Problem added successfully!");
                    break;

                case 2:
                    if (problems.isEmpty()) {
                        System.out.println("No problems added yet.");
                    } else {
                        System.out.println("\n--- Problem List ---");
                        for (int i = 0; i < problems.size(); i++) {
                            System.out.println((i + 1) + ". " + problems.get(i));
                        }
                    }
                    break;

                case 3:
                    if (problems.isEmpty()) {
                        System.out.println("No problems to update.");
                    } else {
                        System.out.print("Enter problem number to mark as solved: ");
                        int index = sc.nextInt();

                        if (index > 0 && index <= problems.size()) {
                            problems.get(index - 1).setStatus("Solved");
                            System.out.println("Problem marked as solved!");
                        } else {
                            System.out.println("Invalid problem number.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Keep grinding 💪");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
