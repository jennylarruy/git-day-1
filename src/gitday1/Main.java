package gitday1;

public class Main {

    public static void main(String[] args) {
        System.out.println(increment(2));
        System.out.println(decrement(2));

    }

    private static int increment (int i){
        i++;
        return i;
    }

    private static int decrement (int i){
        i--;
        return i;
    }

}
