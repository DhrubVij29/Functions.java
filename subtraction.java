import java.util.Scanner;

public class subtraction {

    public static int getsub(int n1,int n2,int b){
        int rev=0;
        int c=0;
        int p=1;
        while(n1>0||n2>0||c>0){
            int d1 =n1%10;
            int d2 =n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=0;
            d2=d2+c;
            if(d2>=d1){
                c=0;
                d=d2-d1;
            }else{
                c=-1;
                d= d2+8-d1;
            }
            
          
            rev+=d*p;
            p=p*10;
        }
        return rev;
    }
    public static void main(String []args){
        Scanner sc =new Scanner (System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int b=sc.nextInt();
        int f=getsub(n1, n2, b);
        System.out.println(f);
    }
    

}
