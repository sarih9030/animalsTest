public class Frog extends Animal implements Land, Water {
    private static int numberOfLegs = 2;

    public Frog(boolean mammals, boolean carnivorous, int mood) {
        //the frog neither mammalian nor carnivorous
        super(false, false, mood);
    }

    @Override
    public void sayHello() {
        //must override abstract function but not necessary here ?
    }

    @Override
    public void sayHello(int mood) {
        if (MOOD.values()[mood] == MOOD.MOOD_HAPPY)
            System.out.println("quack quack quack");
        else
            System.out.println("I can not say hello, i am into the water :(");
    }

    @Override
    public boolean hasGills() {
        return true;
    }

    @Override
    public boolean hasLaysEggs() {
        return false;
    }

    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
