import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("please enter how many fibonacci numbers you want :  ");
int n= scan.nextInt();
int[] s= new int[n];
s[0]=0;s[1]=1;
System.out.print(s[0]+" "+s[1]);
for(int i=2;i<n;i++){
s[i]=s[i-2]+s[i-1];
System.out.print(" "+s[i]);
}
}
}
