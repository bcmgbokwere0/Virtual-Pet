package virtual_pet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        List<VirtualPet> necessities = new ArrayList<VirtualPet>();
        Scanner gameplay = new Scanner(System.in);
        VirtualPet Pet = new VirtualPet();
        System.out.println(
                "Welcome to Brian's WCCI Virtual Pet Program! Here you can take care of your own virtual friend :)");
        System.out.println("Please input the name of your pet: ");
        Pet.setName(gameplay.nextLine());
        System.out.println("Wow " + Pet.getName() + " is an awesome name.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Hope you're ready to have fun with your new virtual friend! You need to help take care of your pet "+ Pet.getName() + " by feeding them, giving them water, playing with them, and making them happy! Lets get right into things!");
        System.out.println(
                "---- Input any button to start! ----");
        Pet.setHunger(100);
        Pet.setThirst(100);
        Pet.setTiredness(100);
        Pet.setMood(100);
        necessities.add(Pet);
        int option;
        boolean quitGame = false;
    }

}
