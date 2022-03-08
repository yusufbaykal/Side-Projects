import java.util.Scanner;
public class NewMain6 {

     
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = klavye.nextInt();
        double result = 0.0;
        for (double i = 1; i <=sayi; i++) {
            result+=(1/i);
        }
        System.out.println(result);
    }
    
}
