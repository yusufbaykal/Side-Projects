import java.util.Scanner;
public class ilk23 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz:");
        int sayi = klavye.nextInt();
        System.out.println("2. Sayıyı giriniz:");
        int sayi1 = klavye.nextInt();
        System.out.println("3. Sayıyı giriniz:");
        int sayi2 = klavye.nextInt();
        
        if(sayi>sayi1&&sayi>sayi2){
            System.out.println("1. Sayı Büyüktür");
        }
        else if(sayi1>sayi&&sayi1>sayi2){
            System.out.println("2. Sayı Büyüktür");
        }
        else if(sayi2>sayi&&sayi2>sayi1){
            System.out.println("3. Sayı Büyüktür");
        }
    }
    
}
