package strategyPattern;

public class Archer implements Character{
    public void attack(){
        System.out.print("Archer ");
        ShootArrow shootArrow = new ShootArrow();
        shootArrow.attack();
    }

    public void defend(){
        System.out.print("Archer ");
        Dodge dodge = new Dodge();
        dodge.defend();
    }
}