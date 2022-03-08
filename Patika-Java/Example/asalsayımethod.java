import java.util.Scanner;
public class NewMain18 {
    

    static void  asalsayı(int sayi){ 
        int sayac = 0;
        for (int i =1; i <sayi; i++) {
            if(sayi%i==0){
                sayac=sayac+1;
            }
            if(sayac>1){
                System.out.println("Sayı asal değildir"+sayi+"Bölünme sayısı"+sayac);
            }
            else{
                System.out.println("Girilen sayı asaldır"+sayi+"Bölünme sayısı"+sayac);
            }
        }
    }

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = klavye.nextInt();
        System.out.println(asalsayı(sayi));
    }


}
