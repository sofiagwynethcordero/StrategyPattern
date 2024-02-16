package strategyPattern;

public class Knight implements Character{

    public void attack(){
        System.out.print("Knight ");
        SwingSword swingSword = new SwingSword();
        swingSword.attack();
    }

    public void defend(){
        System.out.print("Knight ");
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        CreateMagic createMagic = new CreateMagic();

        shield.defend();
        System.out.print("Knight ");

        dodge.defend();
        System.out.print("Knight ");

        createMagic.defend();
        System.out.println();

    }
}
