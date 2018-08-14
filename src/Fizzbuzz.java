public class Fizzbuzz {
    private boolean divisibleByThree;
    private boolean divisibleByFive;

    public void solution() {
        for (int i = 1; i <= 100; i++) {
            divisibleByThree = i % 3 == 0;
            divisibleByFive = i % 5 == 0;

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
