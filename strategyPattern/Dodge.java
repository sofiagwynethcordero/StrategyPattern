package strategyPattern;

public class Dodge implements DefenseStrategy{
    public void defend(){
        System.out.println("dodging to avoid attack!");
    }
}
