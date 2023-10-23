import automobil.Automobil;
import automobil.AutomobilCombustibil;
import automobil.AutomobilElectric;
import automobil.AutomobilService;

public class Main {
    public static void main(String[] args) {
//        Automobil automobil = new AutomobilCombustibil();
//        boolean isElectric = automobil instanceof AutomobilElectric;
//        boolean isCombustibil = automobil instanceof AutomobilCombustibil;
//        System.out.println("isElectric: "+isElectric);
//        System.out.println("isCombustibil: "+isCombustibil);

        AutomobilService automobilService = new AutomobilService();
        automobilService.apeleaza(new AutomobilElectric());
        automobilService.apeleaza(new AutomobilCombustibil());
    }
}