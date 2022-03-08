import java.util.Scanner;
public class NewMain8 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("n1 Sayısını giriniz:");
        int n1 =klavye.nextInt();
        System.out.println("n2 Sayısını giriniz:");
        int n2 = klavye.nextInt();
        int ebob=1;
        int ekok;
        
        for (int i = 1; i <=n1 && i<=n2; ++i) {
        
            if(n1%1==0 && n2%i==0)
                ebob=i;
        }
        ekok=(n1*n2)/ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);
        
        
        
    }
    
}
