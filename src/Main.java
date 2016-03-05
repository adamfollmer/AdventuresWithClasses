import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String userInput = null;
		City temporaryCity = new City ("BEAVER DAM");
		
		System.out.println("Hi! What's your name?");
		name = input.nextLine().toUpperCase();
		Person character = new Person (name);
		System.out.println();
		System.out.println("Hi " + character.name + ". Welcome to life.");
		System.out.println("You are a young adult entering the work force. You will decide your: JOB, CITY, HOUSE, CAR, and CAREER.");
		System.out.println();
		System.out.println("Make sure to watch your HEALTH, HAPPINESS, AND MONEY. You can also keep track of your FRIENDS");
		System.out.println();
		System.out.println("This is how you'll start off:");
		do {
			System.out.println("Your new year stats: ");
			System.out.println("You are " + character.age + " years old.");
			System.out.println("Money: " + "$" + character.money);
			System.out.println("Happiness: " + character.happiness);
			System.out.println("Your health is " + character.health + "/100");
			System.out.println("You live in " + character.currentCity + ".");
			System.out.println("You drive a " + character.currentCar + ".");
			System.out.println("You live in " + character.currentHome + ".");
			System.out.println("You are currently " + character.currentCareer + ".");
			System.out.println();
			
			System.out.println("What do you want to change?");
			userInput = input.nextLine().toUpperCase();
			if (userInput.equals("CITY")){
				System.out.println("What city?");
				userInput = input.nextLine().toUpperCase();
				while (userInput.equals("HELP")){
					temporaryCity.help();
					userInput = input.nextLine().toUpperCase();
				}
				City userCity = new City (userInput); 
				character.currentCity = userCity.locationName;
				System.out.println("You have successfully moved to " + userCity.locationName + ".");
				System.out.println();
			}
			
			
			character.age = character.yearAge(character.age);
			character.money = character.yearTaxes(character.age, character.money);
			character.health = character.healthChange(character.age, character.currentCity);
			character.happiness = character.happinessChange(character.age, character.currentCity, character.money, character.friends.length, character.kids.length, character.married);
		} while (character.health > 0);
			
		
		System.out.println("Well " + character.name + ", it was a good run.");
		System.out.println("Your final stats:");
		System.out.println();
		System.out.println("Money: " + "$" + character.money);
		System.out.println("Happiness: " + character.happiness);
	}

}
