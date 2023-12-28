abstract class Animal {

    private boolean mammals;
    private boolean carnivorous;

    private MOOD mood;

    public Animal(boolean mammals, boolean carnivorous, int mood) {
        this.mammals = mammals;
        this.carnivorous = carnivorous;
        this.mood = MOOD.values()[mood];
    }
    public abstract void sayHello();
    public abstract void sayHello(int mood);
    public  boolean isMammals(){
        return mammals;
    }
    public void setMammals(boolean isMammals){
        this.mammals = isMammals;
    }
    public  boolean isCarnivorous(){
        return carnivorous;
    }
    public void setCarnivorous(boolean isCarnivorous){
        this.carnivorous = isCarnivorous;
    }
}
