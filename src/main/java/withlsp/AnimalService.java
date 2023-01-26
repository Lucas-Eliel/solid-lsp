package withlsp;

public class AnimalService {

    public static void main(String[] args) {

        System.out.println("Animal: Avestruz");
        Ostrich ostrich = new Ostrich();
        ostrich.toEat();

        System.out.println("Animal: Papagaio");
        Parrot parrot = new Parrot();
        parrot.toEat();
        parrot.toFly();

        System.out.println("Animal: Pinguim");
        Penguin penguin = new Penguin();
        penguin.toEat();
    }
}
