package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            int result = 1;
            int j = 1;
            while (j <= i) {
                result = result * j;
                j++;
            }
            i++;
            System.out.println(result);
        }


    }
}
