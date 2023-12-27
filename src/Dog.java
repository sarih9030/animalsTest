public class Dog extends Animal implements Land {
    private static int numberOfLegs = 4;

    public Dog(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood);
    }

    @Override
    public void sayHello() {
        System.out.println("wagging my tail");
    }

    @Override
    public void sayHello(int mood) {
        if (MOOD.values()[mood] == MOOD.MOOD_HAPPY)
            System.out.println("I am barking loudly!");
        else
            System.out.println("whooping");
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
