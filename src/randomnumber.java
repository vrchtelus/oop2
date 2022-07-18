import java.util.Random;
public class randomnumber {
    public static void ranNumber(){
        Random random = new Random();
        int min = 0;
        int max = 200;
        int number = random.nextInt(min,max) ;
        double result = number * 1.3;
        System.out.println("Number and increase: Number "+number + " result: " + result);
    }
}
