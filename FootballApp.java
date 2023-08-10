package FootballReport;

import java.util.Scanner;

public class FootballApp {
    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        DisplayMatchResult observer1 = new DisplayMatchResult();
        DisplayMatchResult observer2 = new DisplayMatchResult();

        match.addObserver(observer1);
        match.addObserver(observer2);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score: ");
            input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            match.setScore(input);
        }

        scanner.close();
    }
}
