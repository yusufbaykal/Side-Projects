import java.util.Scanner;
public class NewMain {

     
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int mat,fizik,kimya,turkce,tarih,muzik;
        System.out.println("Matematik notunuzu giriniz:");
        mat = klavye.nextInt();
        System.out.println("Fizik Notunuzu giriniz:");
        fizik = klavye.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = klavye.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce = klavye.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = klavye.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik = klavye.nextInt();
        
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = (toplam / 6);
        System.out.println("Tüm derslerinizin ortalaması:"+ortalama);
        
        
        
    }
    
}
