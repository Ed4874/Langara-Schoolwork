/* Student Name: Edward Lu
 * Student Number: 100359822
 * Date Written: January 5, 2021
 * Purpose: This program will serve as the subclass Dog under superclass Animal
 * */

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(double weight, Animal.AnimalMovement movement, Animal.AnimalClass classification, String breed) {
        super(weight, movement, classification);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "\nDog[ weight: " + getWeight() + ", movement: " + howTheyMove() + ", classification: " + getAnimalClass() + ", breed: " + breed + "]";
    }
}
