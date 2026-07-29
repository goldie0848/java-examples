class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

interface Pet {
    void play();
}

interface Guard {
    void protect();
}

class DogService extends Dog implements Pet, Guard {
    
    public void play() {