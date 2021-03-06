import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// Unused imports.

public class Solutions {
    // TODO
    // Unused variable declaration
    Scanner reader = new Scanner(System.in);

    public static void main(String args[]) {
        Solutions solutions = new Solutions();

        // I understand why you needed this check here, but what if your solution
        // didn't require upfront arguments?
        if (args.length != 1 && args.length != 2) {
            solutions.printIncorrectArgsMessage();
            return;
        }

        // Variables and constants are better at the top of the method.
        List<String> validArgs = Arrays.asList("triangle", "diamond", "fizzbuzz", "primefactors");

        if (!validArgs.contains(args[0])) {
            solutions.printIncorrectArgsMessage();
            return;
        }

        switch (args[0]) {
            case "triangle":
                Triangle triangle = new Triangle();
                triangle.triangleSolutions();
                break;
            case "diamond":
                Diamond diamond = new Diamond();
                diamond.diamondSolutions();
                break;
            case "fizzbuzz":
                Fizzbuzz fizzbuzz = new Fizzbuzz();
                fizzbuzz.solution();
                break;
            case "primefactors":
                if (args.length != 2) {
                    solutions.printIncorrectArgsMessage();
                    return;
                }

                int n = Integer.parseInt(args[1]);
                PrimeFactors primeFactors = new PrimeFactors();
                primeFactors.generate(n);
                break;
            default:
                solutions.printIncorrectArgsMessage();
        }
    }

    private void printIncorrectArgsMessage() {
        System.out.println("Invalid arguments. The valid arguments are as follows:\ntriangle\ndiamond\nfizzbuzz\nprimefactors n");
    }
}
