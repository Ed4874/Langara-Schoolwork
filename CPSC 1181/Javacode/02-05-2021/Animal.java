/* Student Name: Edward Lu
 * Student Number: 100359822
 * Date Written: January 5, 2021
 * Purpose: This program will serve as the superclass for all animal types
 * */

public abstract class Animal {
    private double weight;
    private AnimalMovement movement;
    private AnimalClass classification;

    public Animal(double weight, AnimalMovement movement, AnimalClass classification) {
        this.weight = weight;
        this.movement = movement;
        this.classification = classification;
    }

    public enum AnimalMovement {
        WALK, SWIM, CRAWL, FLY
    }

    public enum AnimalClass {
        MAMMAL, REPTILE, BIRD, INSECT
    }

    public String getWeight() {
        return String.valueOf(this.weight);

    }
    public String howTheyMove() {
        return movement.toString();
    }
    public String getAnimalClass() {
        return classification.toString();
    }

    public String toString () {
        return "\n" + getWeight() + ", " + howTheyMove() + ", " + getAnimalClass();
    }
}
