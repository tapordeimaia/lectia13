package automobil;

public class AutomobilService {
    public void apeleaza(Automobil automobil){
        automobil.accelereaza();

        if(automobil instanceof AutomobilElectric){
            AutomobilElectric automobilElectric = (AutomobilElectric) automobil;
            automobilElectric.incarcare();
            System.out.println("Kw:" + automobilElectric.kw);
        }
        if(automobil instanceof AutomobilCombustibil){
            AutomobilCombustibil automobilCombustibil = (AutomobilCombustibil) automobil;
            automobilCombustibil.alimenteaza();
            System.out.println("Comb: " + automobilCombustibil.combustibil);
        }


    }
}
