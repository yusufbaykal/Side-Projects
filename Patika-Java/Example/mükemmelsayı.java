import java.util.Scanner;
public class NewMain9 {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Bir sayı giriniz:");
        int sayi = klavye.nextInt();
        for (int i = 1; i <sayi; i++) {
            if(sayi % i == 0){
                toplam+=i;
            }
            
        }
        if(sayi == toplam){
            System.out.println(sayi+"'sayısı Mükemmel sayıdır");
        }
        else{
            System.out.println(sayi+"'sayısı Mükememl sayı değildir");
        }
         
        }
    }
