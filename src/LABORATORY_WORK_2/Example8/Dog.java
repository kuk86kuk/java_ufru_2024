package LABORATORY_WORK_2.Example8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    public String getBreed() {
        return breed;
    }
}