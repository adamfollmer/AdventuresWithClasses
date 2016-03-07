import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		TextUpdates printText = new TextUpdates();
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
		printText.introduction(character.name);
		do {
			printText.printUpdates (character);
			
			System.out.println("What do you want to change?");
			userInput = input.nextLine().toUpperCase();
			if (userInput.equals("CITY")){
				character.currentCity = city.cityMove (city);
				city = city.classChangeJob(character.currentCity);
			} else if (userInput.equals("CAR")){
				character.currentCar = car.newCar (car);
				car = car.classChangeCar(character.currentCar);
			} else if (userInput.equals("HOME")){
				character.currentHome = home.newHome (home);
				home = home.classChangeHome(character.currentHome);
			} else if (userInput.equals("JOB")){
				character.currentCareer = job.newJob (job, character);
				job = job.classChangeJob(character.currentCareer);
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
			
		printText.finalCredits(character);
	}

}
