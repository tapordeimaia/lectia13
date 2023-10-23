package automobil;

public class AutomobilCombustibil extends Automobil{
    int combustibil = 0;
    @Override
    public void accelereaza() {
        System.out.println("Accelereaza Combustibil");
    }
    public  void alimenteaza(){
        System.out.println("Alimentat");
        combustibil++;
    }
}
