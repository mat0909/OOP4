public class Activity {
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.setName("kurimaw");
        puppy.bark();

        puppy.addPuppy("jik");
        puppy.addPuppy("jok");
        puppy.addPuppy("jak");
        puppy.addPuppy("jek");

        System.out.println("Number of puppies: " + puppy.showNumOfPuppies()); 
        puppy.showPuppies(); 
    }
}