package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power < 0){
            System.out.println("too much power");
            return;
        }
        int i = 0;
        int result = 1;
        System.out.println(result);
        while (i <= power-1){
            result = 2 * result;
            System.out.println(result);
            i++;
        }

    }
}
