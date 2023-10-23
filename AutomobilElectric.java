package automobil;

public class AutomobilElectric extends Automobil{
    int kw = 0;
    @Override
    public void accelereaza() {
        System.out.println("Accelereaza Electtic");
    }
    public void incarcare(){
        System.out.println("Incarcat");
        kw++;
    }
}
