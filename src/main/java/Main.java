public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Please enter two numbers");
            return;
        }

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber));
    }
}