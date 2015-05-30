/**
 * Created by harikris on 30/05/15.
 */
public class Utils {
    public static void generateFizzBuzz(){
        for(int i=1;i<=100;i++){
            if(i%3==0){
                System.out.println("Buzz");
            }
            else if(i%5==0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void generatePrimeFactors(int n){
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        for(int i=3; i< Math.sqrt(n);i=i+2){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
        }
        if (n>2){
            System.out.println(n);
        }
    }
}
