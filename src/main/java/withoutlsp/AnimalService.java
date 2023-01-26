package withoutlsp;

public class AnimalService {

    public static void main(String[] args) {

        System.out.println("Animal: Ostrich");
        Ostrich ostrich = new Ostrich();
        ostrich.toEat();
        ostrich.toFly();

        System.out.println("Animal: Parrot");
        Parrot parrot = new Parrot();
        parrot.toEat();
        parrot.toFly();

        System.out.println("Animal: Penguin");
        Penguin penguin = new Penguin();
        penguin.toEat();
        penguin.toFly();
    }
}
