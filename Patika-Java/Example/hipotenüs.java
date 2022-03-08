import java.util.Scanner;
public class NewMain1 {

     
    public static void main(String[] args) {
        int a,b,c;
        double d;
        Scanner klavye = new Scanner(System.in);
        System.out.println("1. KenarÄ± giriniz:");
        a = klavye.nextInt();
        System.out.println("2. KenarÄ± giriniz:");
        b = klavye.nextInt();
        System.out.println("3. Kenarı giriniz:");
        c = klavye.nextInt();
        
        d = (a+b+c)/2;
        int alan = (int) (d*(d-a)*(d-b)*(d-c));
        System.out.println("Üçgenin alanı:"+alan);
        
        
        
        
    }
    
}
