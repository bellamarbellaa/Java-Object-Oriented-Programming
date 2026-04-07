package DogInKennel;

public class Kennel {
    public static void main(String[] args) {
        //Create dogs using the constructor (and give initial Name and Age)
        Dog d1 = new Dog("Strawberry Shortcake", 2);
        Dog d2 = new Dog("Blueberry Muffin", 4);
        Dog d3 = new Dog("Choco Pie", 6);


        //Update Choco Pie's age from 6 to 5 using the setter
        d3.setAge(5);


        //Display using regular print statements and getters
        System.out.println("Dog 1: " + d1.getName() + ", Age: " + d1.getAge() + ", Human Years: " + d1.getHumanYears());
        System.out.println("Dog 2: " + d2.getName() + ", Age: " + d2.getAge() + ", Human Years: " + d2.getHumanYears());
        System.out.println("Dog 3: " + d3.getName() + ", Age: " + d3.getAge() + ", Human Years: " + d3.getHumanYears());
    }
}

