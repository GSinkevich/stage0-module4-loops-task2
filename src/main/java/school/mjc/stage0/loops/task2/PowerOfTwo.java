package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power < 0){
            System.out.println("too much power");
        }
        int i = 0;
        int result = 0;

        while (i < power){
            result = 2 * result;
            System.out.println(result);
            i++;
        }

    }
}
