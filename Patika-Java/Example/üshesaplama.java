import java.util.Scanner; 
public class NewMain4 {

     
    public static void main(String[] args) {
         Scanner klavye = new Scanner(System.in);
         System.out.println("Sayı girinz:");
         int sayi = klavye.nextInt();
         System.out.println("Üs olacak sayı:");
         int us = klavye.nextInt();
         int toplam = 1;
         for (int i = 1; i <=us; i++) {
            toplam *=sayi;
        }
         System.out.println("Toplam:"+toplam);
    
}
}
