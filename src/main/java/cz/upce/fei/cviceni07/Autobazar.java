package cz.upce.fei.cviceni07;

public class Autobazar {
    private String jmeno;
    private Automobil[] automobily;

    public Autobazar(String jmeno, int velikost) {
        this.jmeno = jmeno;
        this.automobily = new Automobil[velikost];
    }
    
    public void vypisAutobazar() {
        for (int i = 0; i < automobily.length; i++) {
            if (automobily[i] != null) {
                System.out.println(i + " = " + automobily[i]);
            }
        }
    }
    
    public void pridejAutomobil(Automobil automobil) {
        for (int i = 0; i < automobily.length; i++) {
            if (automobily[i] == null) {
                automobily[i] = automobil;
                break;
            }
        }
    }
    
    public double prumernaSpotreba() {
        double suma = 0;
        int index = 0;
        for (int i = 0; i < automobily.length; i++) {
            if (automobily[i] != null) {
            suma+= automobily[i].getPrumernaSpotreba();
            ++index;
            }
        }
        return suma / automobily.length;
    }
    
    public double nejmensiSpotreba () {
        double nejmensiSpotreba = automobily[0].getPrumernaSpotreba();
        for (int i = 0; i < automobily.length; i++) {
            if (automobily[i] != null) {
                if (nejmensiSpotreba > automobily[i].getPrumernaSpotreba()) {
                    nejmensiSpotreba = automobily[i].getPrumernaSpotreba();
                }
                   
            } 
        }
        return nejmensiSpotreba;
    }
    
//    public boolean obsahujeVyrobce() {
//        String obsahujiciVyrobce = "UPCEmobil";
//        for (int i = 0; i < automobily.length; i++) {
//            if(automobily[i].getVyrobce() == obsahujiciVyrobce)  {
//                
//           }
//        }
//        
//        return obsahujeVyrobce;
//    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
   

    @Override
    public String toString() {
        return "Autobazar{" + "jmeno = " + jmeno + ", automobily = " + automobily + '}';
    }
    
    
    
}
