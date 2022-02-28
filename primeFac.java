import java.util.Scanner;

public class primeFac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        for(int i=2; i<=n;){
            while(n%i==0){
                n = n/i;
                System.out.println(i);
            }i++;
        }System.out.println();

    }
}
