import java.util.*;

class Main {

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("please enter the the number that you want it's factorial");
int n=scan.nextInt();
long  s=1;
for(int i=1;i<=n;i++)
s*=i;
System.out.println("the factorial of "+n+" is : "+s);
}


}
