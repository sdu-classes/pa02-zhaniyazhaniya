public class Main {
   public static void main (String[] args){
        Animal animal = new Animal("Tiger");
        System.out.println(animal);
       
        Mammal mammal = new Mammal("Wolf");
        System.out.println(mammal);
        
        Dog dog = new Dog("Copper");
        Dog dog2 = new Dog("Ruby");
        System.out.println(dog);
        dog.greets();
        dog2.greets();
        
        Cat cat = new Cat("Coco");
        System.out.println(cat);
        cat.greets();
    }
}
