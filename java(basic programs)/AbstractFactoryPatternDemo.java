interface Bird {
    public void fly();
    public void makesound();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("flying");
    }
    public void makesound() {
        System.out.println("chi chi");
    }
}

interface ToyDuck {
    public void squack();
}

class PlasticToyDuck implements ToyDuck {
    public void squack() {
        System.out.println("squack");
    }
}

class BirdAdapter implements ToyDuck {
    Bird bird;

    BirdAdapter(Bird bird) {   // Correct constructor
        this.bird = bird;
    }

    public void squack() {     // Adapter uses bird sound
        bird.makesound();
    }
}

class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        // DECLARE VARIABLES
        Sparrow sparrow;
        PlasticToyDuck plasticToyDuck;
        ToyDuck birdAdapter;

        // CREATE OBJECTS
        sparrow = new Sparrow();
        plasticToyDuck = new PlasticToyDuck();
        birdAdapter = new BirdAdapter(sparrow);

        System.out.println("Sparrow:");
        sparrow.fly();
        sparrow.makesound();

        System.out.println("\nToy Duck:");
        plasticToyDuck.squack();

        System.out.println("\nBird Adapter:");
        birdAdapter.squack();
    }
}