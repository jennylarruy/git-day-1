package gitday1;

public class Main {

    public static void main(String[] args) {
        System.out.println(increment(2));
        System.out.println(decrement(2));
        System.out.println(multiply(2,3));
        System.out.println(doubleInt(5));
        System.out.println(division(6, 2));
        System.out.println(powerOfTwo(2));

    }

    private static int division (int i, int j) {
        return (i / j);
    }

    private static int increment (int i){
        i++;
        return i;
    }

    private static int decrement (int i){
        i--;
        return i;
    }

    private static int multiply (int i, int j){
        return (i*j);
    }

    private static int powerOfTwo (int i){
        return (2<<i);
    }

    private static int doubleInt (int i){
        return (i*2);
    }

}
