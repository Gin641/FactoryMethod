public class Test {
    public static void main(String[] args) {
        FactoryAnimal factoryAnimal = new FactoryAnimal();
        Animal animal1 = factoryAnimal.getAnimal("feline");
        System.out.println("Cat sound: " + animal1.makeSound());
        Animal animal2 = factoryAnimal.getAnimal("canine");
        System.out.println("Dog sound: " + animal2.makeSound());
    }
}
