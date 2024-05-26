import java.util.*;
public class problem{

    public static void display (int n,int r, int npr){
        System.out.println(n +"p"+ r +"="+ npr);

    }
    public static int fact(int x){
        int f =1;
        for(int i=1; i<=x; i++){
             f=f*i;
        }
       
        return f;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n =sc.nextInt();
        int r =sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(n-r);
        int npr = nfact / rfact;
        display(n, r, npr);
        
}
}