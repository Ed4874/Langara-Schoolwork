/* Student Name: Edward Lu
* Student Number: 100359822
* Date Written: January 5, 2021
* Purpose: This program will serve as subclass Snake under superclass Animal*/

public class Snake extends Animal {
    String snakeType;
    boolean poisonous;


    public Snake(double weight, Animal.AnimalMovement movement, Animal.AnimalClass classification, String snakeType, boolean poisonous) {
        super(weight, movement, classification);
        this.snakeType = snakeType;
        this.poisonous = poisonous;
    }

    public String getSnakeType() {
        return this.snakeType;
    }

    public boolean isPoisonous() {
        return this.poisonous;

    }
    @Override
    public String toString() {
        return "\nSnake[ weight: " + getWeight() + ", movement: " + howTheyMove() + ", Class: " + getAnimalClass()
                + ", snake type: " + getSnakeType() + ", isPoisonous: " + isPoisonous() + "]";
    }
}
