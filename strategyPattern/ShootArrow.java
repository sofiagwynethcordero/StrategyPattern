package strategyPattern;

public class ShootArrow implements AttackStrategy{
    public void attack(){
        System.out.println("shooting an arrow!");
    }
}