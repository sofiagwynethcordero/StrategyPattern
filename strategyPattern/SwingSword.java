package strategyPattern;

public class SwingSword implements AttackStrategy{
    public void attack(){
        System.out.println("attacks with a sword!");
    }
}