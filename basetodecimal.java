import java.util.*;
public class basetodecimal {

    public static int getBase(int n,int b){
        int rev=0;
        int p=1;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            rev=rev+rem*p;
            p=p*b;


        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int f=getBase(n,b);
        System.out.println(f);
    }
}
    
