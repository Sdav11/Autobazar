package cz.upce.fei.cviceni07;

public class Cviceni07 {

    public static void main(String[] args) {
        Automobil automobil = new Automobil("Skoda", "Octavia", 3.9);
        Automobil automobil2 = new Automobil("Mazda", "Model X", 6.0);
        Automobil automobil3 = new Automobil("UPCEmobil", "Model FEI", 5.1);
        Automobil automobil4 = new Automobil("Tesla", "Model S", 3.8);
        Automobil automobil5 = new Automobil("Froid", "Model C++", 4.2);
        
        
        System.out.println(automobil);
        
        Autobazar autobazar = new Autobazar("AAA", 10);
        System.out.println(autobazar);
        autobazar.vypisAutobazar();
        autobazar.pridejAutomobil(automobil);
        autobazar.pridejAutomobil(automobil2);
        autobazar.pridejAutomobil(automobil3);
        autobazar.pridejAutomobil(automobil4);
        autobazar.pridejAutomobil(automobil5);
        autobazar.vypisAutobazar();
        
          
        System.out.println("Prumerna spotreba = "+ autobazar.prumernaSpotreba());
        System.out.println("Nejmensi spotřeba = " + autobazar.nejmensiSpotreba());
        
    }
            
}
