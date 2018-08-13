import java.util.Scanner;

public class Diamond {
    private Scanner reader = new Scanner(System.in);

    public void diamondSolutions() {
        System.out.println("Enter a depth for the isosceles triangle: ");
        int triangleDepth = reader.nextInt();
        printIsoscelesTriangle(triangleDepth);

        System.out.println("Enter a diameter for a regular diamond: ");
        int diamondDiameter = reader.nextInt();
        printRegularDiamond(diamondDiameter);

        System.out.println("Enter a diameter for the named diamond: ");
        diamondDiameter = reader.nextInt();
        printDiamondWithName(diamondDiameter);
    }

    private void printIsoscelesTriangle(int n) {
        int maxWidth = (n * 2) - 1;

        for (int lineLength = 1; lineLength <= maxWidth; lineLength += 2) {
            printCenteredLine(lineLength, maxWidth);
        }
    }

    private void printRegularDiamond(int diameter) {
        int maxWidth = (diameter * 2) - 1;

        printIsoscelesTriangle(diameter);

        for (int lineLength = maxWidth - 2; lineLength >= 1; lineLength -= 2) {
            printCenteredLine(lineLength, maxWidth);
        }
    }

    private void printDiamondWithName(int diameter) {
        int maxWidth = (diameter * 2) - 1;

        for (int lineLength = 1; lineLength < maxWidth; lineLength += 2) {
            printCenteredLine(lineLength, maxWidth);
        }

        System.out.print("Flinn\n");

        for (int lineLength = maxWidth - 2; lineLength >= 1; lineLength -= 2) {
            printCenteredLine(lineLength, maxWidth);
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
