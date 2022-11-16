package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int n = 2;
        boolean check = true;
        while (n < printToInclusive) {
            int j = 2;
            while (j <= Math.sqrt(n)) {
                if (n % j == 0) {
                    check = false;
                    break;
                }
                j++;
            }
            if (check) {
                System.out.println(n);
            } else {
                check = true;
            }
            n++;
        }
    }
}
