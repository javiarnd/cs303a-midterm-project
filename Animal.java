public abstract class Animal extends FarmAsset {
    protected int age;
    protected int groomingScore;

    Animal() {
        super();
        this.age = 0;
        this.groomingScore = 100;
    }

    Animal(String farmName, int age, int groomingScore) {
        super(farmName);
        this.age = age;
        this.groomingScore = groomingScore;
    }

    abstract void performGrooming();
}
