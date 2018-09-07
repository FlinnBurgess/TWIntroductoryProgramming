public class Fizzbuzz {
    // TODO
    // What is the minimum required variable access level here?
    private boolean divisibleByThree;
    private boolean divisibleByFive;

    public void solution() {
        for (int i = 1; i <= 100; i++) {
            divisibleByThree = i % 3 == 0;
            divisibleByFive = i % 5 == 0;

            // TODO
            // Is there a way to further simplify this method by removing code?
            // what if this 'if' would disappear?
            if (divisibleByFive && divisibleByThree) {
                System.out.println("FizzBuzz");
                continue;
            }

            if (divisibleByThree) {
                System.out.println("Fizz");
                continue;
            }

            if (divisibleByFive) {
                System.out.println("Buzz");
                continue;
            }

            System.out.println(i);
        }
    }
}
