package strategyPattern;

public class Wizard implements Character{
    public void attack(){
        System.out.print("Wizard ");
        CastSpell castSpell = new CastSpell();
        castSpell.attack();
    }

    public void defend(){
        System.out.print("Wizard ");
        CreateMagic createMagic = new CreateMagic();
        createMagic.defend();
        System.out.println();
    }
}
