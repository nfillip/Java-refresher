public class Main extends java.lang.Object {
    public static void main(String[] args) {
        // car
        // Car car = new Car();
        // car.setMake("Honda");
        // System.out.println("make = " + car.getMake());
        // car.describeCar();

        //customer
        // Customer newCustomer = new Customer("Tim", 1000, "tim@gmail.com");
        // Customer newCustomerDefault = new Customer();
        // System.out.println(newCustomer.getName());
        // System.out.println(newCustomerDefault.getName());

        //student
        // for (int i = 1; i<=5; i++){
        //     Student s = new Student("S92300" + i, switch (i) {
        //         case 1 -> "Mary";
        //         case 2 -> "Carol";
        //         case 3 -> "Tim";
        //         case 4 -> "Harry";
        //         case 5 -> "Lisa";
        //         default -> "Anonymous";
        //     }, "05/11/195", "Java Masterclass");
        //     System.out.println(s);
        // }
        //LPA Student
        // for (int i = 1; i<=5; i++){
        //     LPAStudent s = new LPAStudent("S92300" + i, switch (i) {
        //         case 1 -> "Mary";
        //         case 2 -> "Carol";
        //         case 3 -> "Tim";
        //         case 4 -> "Harry";
        //         case 5 -> "Lisa";
        //         default -> "Anonymous";
        //     }, "05/11/195", "Java Masterclass");
        //     System.out.println(s);
        // }
        // Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "JavaMasterclass");
        // LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
        // System.out.println(pojoStudent);
        // System.out.println(recordStudent);
        // System.out.println(pojoStudent.getName());
        // System.out.println(recordStudent.name());
        
        //ANIMAL DOG FISH INHERITANCE
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Lab Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", .25, 2,3);
        doAnimalStuff(goldie, "fast");
        
    }

    //ANIMAL DOG FISH INERITANCE
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}


    
