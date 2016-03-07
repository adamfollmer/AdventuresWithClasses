import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		YearlyUpdate yearlyUpdate = new YearlyUpdate();
		Scanner input = new Scanner(System.in);
		City city = new City ("BEAVER DAM");
		Car car = new Car ("BEATER");
		Home home = new Home ("PARENTS BASEMENT");
		Job job = new Job ("MINIMUM WAGE");
		String name;
		String userInput = null;

		
		System.out.println("Hi! What's your name?");
		name = input.nextLine().toUpperCase();
		Person character = new Person (name);
		System.out.println();
		System.out.println("Hi " + character.name + ". Welcome to life.");
		System.out.println("You are a young adult entering the work force. You will decide your: JOB, CITY, HOME, and CAR");
		System.out.println();
		System.out.println("Make sure to watch your HEALTH, HAPPINESS, AND MONEY. You can also keep track of your FRIENDS");
		System.out.println();
		System.out.println("This is how you'll start off:");
		do {
			yearlyUpdate.printUpdates (character);
			
			System.out.println("What do you want to change?");
			userInput = input.nextLine().toUpperCase();
			if (userInput.equals("CITY")){
				character.currentCity = city.cityMove (city);
				city.locationName = character.currentCity;
			} else if (userInput.equals("CAR")){
				character.currentCar = car.newCar (car);
				car.type = character.currentCar;
			} else if (userInput.equals("HOME")){
				character.currentHome = home.newHome (home);
				home.type = character.currentHome;
			} else if (userInput.equals("JOB")){
				character.currentCareer = job.newJob (job, character);
				job.job = character.currentCareer;
			} else {
				System.out.println("No changes this year!");
				System.out.println();
			}
			character.educationYears = job.addEducation(job, character);
			System.out.println();
			
			character.age++;
			character.money = character.moneyChanges(character.age, character.money, job.salary, car.cost, home.cost);
			character.health = character.healthChange(character.age, character.currentCity);
			character.happiness = character.happinessChange(character.happiness, city.happinessFactor, job.happinessFactor, home.happinessFactor, car.happinessFactor, character.married);
		} while (character.health > 0);
			
		
		System.out.println("Well " + character.name + ", it was a good run.");
		System.out.println("Your final stats:");
		System.out.println();
		System.out.println("Money: " + "$" + character.money);
		System.out.println("Happiness: " + character.happiness);
	}

}
