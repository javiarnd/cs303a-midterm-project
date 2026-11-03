public abstract class Animal extends FarmAsset {
    protected int age;
    protected String breed;
    protected int groomingScore;

    Animal() {
        super();
        this.age = 0;
        this.breed = "";
        this.groomingScore = 100;
    }

    Animal(String farmName, int age, String breed, int groomingScore) {
        super(farmName);
        this.age = age;
        this.breed = breed;
        this.groomingScore = groomingScore;
    }

    abstract void grooming();
}
