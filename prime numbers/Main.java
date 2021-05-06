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
        double r=Math.sqrt(num);
        int p=(int)Math.floor(r);
        if(r != p){
            for(int i=2;i<p+1;i++){
                if(num%i==0)
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