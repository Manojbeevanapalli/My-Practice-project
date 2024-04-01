//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class NumberCheck {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You provided the number: " );
            return;
        }

        // Convert the command-line argument to an integer
        int number = Integer.parseInt(args[0]);

        if (number > 0) {
            System.out.println("The number is positive.");
        }
    }
}

