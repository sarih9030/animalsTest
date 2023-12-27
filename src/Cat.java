public class Cat extends Animal implements Land{
    private static int numberOfLegs = 4;
    public Cat(boolean mammals, boolean carnivorous, int mood) {
        super(mammals, carnivorous, mood );
    }
@Override
public void sayHello(){
    System.out.println("meow~");
}
    @Override
    public void sayHello(int mood){
        if(MOOD.values()[mood] == MOOD.MOOD_HAPPY)
            System.out.println("purr, purr");
        else
            System.out.println("hiss");
    }
    @Override
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
