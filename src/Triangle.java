import java.util.Scanner;

public class Triangle {
    // Any reasoning for why the access to this variable is undeclared?
    // Other classes have it private?
    Scanner reader = new Scanner(System.in);

    public void triangleSolutions() {
        System.out.println("Printing single asterisk:\n*\n");

        System.out.println("Enter a horizontal line length: ");
        int lineLength = reader.nextInt();
        System.out.println("");
        printHorizontalLine(lineLength);

        System.out.println("Enter a vertical line length: ");
        lineLength = reader.nextInt();
        printVerticalLine(lineLength);

        System.out.println("Enter a right-angled triangle depth: ");
        int triangleDepth = reader.nextInt();
        printRightAngledTriangle(triangleDepth);
    }

    private void printHorizontalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    private void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }

        System.out.println("");
    }

    // Good reuse of another method
    private void printRightAngledTriangle(int n) {
        for (int i = 0; i <= n; i++) {
            printHorizontalLine(i);
        }
    }
}
