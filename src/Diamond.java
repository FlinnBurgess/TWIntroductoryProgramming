import java.util.Scanner;

public class Diamond {
    Scanner reader = new Scanner(System.in);

    public void diamondSolutions() {
        System.out.println("Enter a depth for the isosceles triangle: ");
        int triangleDepth = reader.nextInt();
        printIsoscelesTriangle(triangleDepth);
    }

    private void printIsoscelesTriangle(int n) {
        int maxWidth = (n * 2) - 1;

        for (int i = 1; i <= maxWidth; i += 2) {
            printCenteredLine(i, maxWidth);
        }
    }

    private void printCenteredLine(int lineLength, int maxLength) {
        int indentation = (maxLength - lineLength) / 2;

        for (int i = 0; i < indentation; i++) {
            System.out.print(" ");
        }

        for (int i = 0; i < lineLength; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }
}
