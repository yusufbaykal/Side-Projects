import java.util.Scanner;
public class ilk25 {

   
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kaç adet sayı girişi olacak");
        int sayi = klavye.nextInt();
        System.out.println("\n 1. Toplama İşlemi");
        System.out.println("\n 2. Çıkarma İşlemi");
        System.out.println("\n 3. Çarpma İşlemi");
        System.out.println("\n 4. Bölme İşlemi");
        String sayılar="";
        int islem = klavye.nextInt();
        int sonuc=0;
        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+"Sayı giriniz:");
            int girilen_sayi = klavye.nextInt();
            if(islem==1){
                sonuc = sonuc+girilen_sayi;
            }
            if (islem==2){
                sonuc = sonuc-girilen_sayi;
            }
            if (islem==3){
                sonuc = sonuc*girilen_sayi;
            }
            if(islem==4){
                sonuc = sonuc/girilen_sayi;
            }
            sayılar=sayılar+","+girilen_sayi;
             
            
            
        }
        System.out.println("Sayılar"+sayılar);
        System.out.println("İşlemin Sonucu:"+sonuc);
    }
    
}
