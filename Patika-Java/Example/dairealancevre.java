import java.util.Scanner;
public class ilk17 {

    
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int r;
        float  cevre,alan,pi = (float) 3.14;
        System.out.println("Daire yarı çapını giriniz:");
        r = klavye.nextInt();
        cevre = 2*pi*r;
        alan = pi*(r*r);
        System.out.println("Dairenin Alanı:"+alan);
        System.out.println("Dairenın Cevresi:"+cevre);
        
        
    }
    
}
