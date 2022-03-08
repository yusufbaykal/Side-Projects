import java.util.Scanner;
 
public class NewMain1 {
 
 
    public static void main(String[] args) {
 
    	int yil;
    	Scanner klavye = new Scanner(System.in);
    	System.out.println("Bir yıl girin:");
    	yil = klavye.nextInt();
    	klavye.close();
        boolean artikMi = false;
 
        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artikMi = true;
                else
                    artikMi = false;
            }
            else
                artikMi = true;
        }
        else {
            artikMi = false;
        }
 
        if(artikMi==true)
            System.out.println(yil + " artık bir yıldır.");
        else
            System.out.println(yil + " artık bir yıl değildir.");
    }
}
