class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public void eat() {
        System.out.println("Животное ест " + food);
    }

    public void sleep() {
        System.out.println("Животное спит");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Собака лает");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест " + food);
    }

    public void bark() {
        System.out.println("Гав-гав!");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кошка мяучит");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест " + food);
    }

    public void meow() {
        System.out.println("Мяу-мяу!");
    }
}

class Horse extends Animal {
    private String maneColor;

    public Horse(String food, String location, String maneColor) {
        super(food, location);
        this.maneColor = maneColor;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь фыркает");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + food);
    }

    public void neigh() {
        System.out.println("Игого!");
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Ветеринар лечит животное:");
        System.out.println("Еда: " + animal.food);
        System.out.println("Местоположение: " + animal.location);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Кость", "Дом", "Далматин");
        Cat cat = new Cat("Рыба", "Дом", "Рыжий");
        Horse horse = new Horse("Сено", "Стойло", "Каштановый");

        Veterinarian vet = new Veterinarian();

        vet.treatAnimal(dog);
        vet.treatAnimal(cat);
        vet.treatAnimal(horse);
    }
}
