package nyugtaprojektek;

/* Probléma:
a 3. tétel árát 650-ről átírtuk 1320-ra.
Így szinte minden változott, mindenhez hozzá kell nyúlni
Refaktorizálás:
anmit egynél többször használunk, 
azt kiszervezzük változóba és erre hivatkozunk
*/

public class Nyugta2 {

    public static void main(String[] args) {
        
        String csillagok = "*******************";
        System.out.println(csillagok);
        System.out.println("     Nyugta 2");
        
        System.out.println(csillagok);
        
        String huf = "Ft";
        int tetel1 = 350, tetel2 = 90, tetel3 = 1320;
        
        System.out.printf("Tétel 1:     %d %s\n", tetel1, huf);
        
        System.out.printf("Tétel 1:      %d %s\n", tetel2, huf);
        
        System.out.printf("Tétel 3:    %d %s\n", tetel3, huf);

        
        String duplaVonal = "===================";
        System.out.println(duplaVonal);
        
        
        int osszesen = tetel1 + tetel2 + tetel3;
        System.out.printf("Összesen:   %d %s\n", osszesen, huf);
        

        String szaggatottVonal = "-------------------";
        System.out.println(szaggatottVonal);
        
        int kedvMertek = 10;
        int kedvezmeny = osszesen / kedvMertek;
        
        System.out.printf("Kedvezmény:  %d %s\n", kedvezmeny, huf);
        
        System.out.printf("(%d%%)\n", kedvMertek);
        
        
        System.out.println(duplaVonal);
        
        int fizetendo = osszesen - kedvezmeny;
        
        System.out.printf("Fizetendő:  %d %s\n", fizetendo, huf);
        double euro = fizetendo / 350.0;
        huf = "\u20ac"; //EZ NEM JÓ!!!!
        System.out.printf("            %f %s\n", euro, huf);
        
        
        
        System.out.println(szaggatottVonal);
        
        System.out.println("");
       
        String rovidVonal = "_______";
        System.out.print(rovidVonal);
        String rovidVonalValaszto = "     ";
        System.out.print(rovidVonalValaszto);
        System.out.println(rovidVonal);
        
        System.out.print(" Dátum");
        
        System.out.print(rovidVonalValaszto);
        
        System.out.println("   Név");
        
        
        System.out.println(csillagok);
        
        System.out.println("        CÉG");
        
        System.out.println(csillagok);
    }

}
