import java.util.Math;
import java.util.Scanner;


class Main {
    static Scanner c = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n = c.nextInt();
        if (prime(n)) {
         System.out.println(n+" is a prime number");  
        }else
        System.out.println(n+" is not a prime number");

    }
    public static boolean prime(int num) {
        if (num<0||num%2==0)
            return false;
        double r=Math.sqrt(num);
        if(r != Math.floor(r)){
            System.out.println(Math.floor(r));
            for(int i=2;i<Math.floor(r)+1;i++){
                if(r%i==0)
                    return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}