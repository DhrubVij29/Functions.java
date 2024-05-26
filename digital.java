
import java.util.*;
public class digital {
    public static int dig(int n,int digit) {
        int count = 0;
        while (n != 0) {
            int div = n % 10;

            n = n / 10;
            if (div == digit) {
                count++;
            }

        }
       return count;
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = sc.nextInt();
        int f=dig( n, digit);
        System.out.println(f);

    }
    

    }


