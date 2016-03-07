public class TextUpdates {
	
	public class yearlyUpdate {
		
	}
	public void introduction(String name){
		System.out.println();
		System.out.println("Hi " + name + ". Welcome to life.");
		System.out.println("You are a young adult entering the work force. You will decide your: JOB, CITY, HOME, and CAR");
		System.out.println("The goal of life is to either make the most money or obtain the most happiness, or both.");
		System.out.println();
		System.out.println("Make sure to watch your HEALTH, HAPPINESS, AND MONEY.");
		System.out.println();
		System.out.println("This is how you'll start off:");
	}
	public void printUpdates(Person person) {
		System.out.println("Your new year stats: ");
		System.out.println("You are " + person.age + " years old.");
		System.out.println("Money: " + "$" + person.money);
		System.out.println("Happiness: " + person.happiness);
		System.out.println("Your health is " + person.health + "/100");
		System.out.println("You have " + person.educationYears + " years of education.");
		System.out.println("You live in " + person.currentCity + ".");
		System.out.println("You drive a " + person.currentCar + ".");
		System.out.println("You live in a " + person.currentHome + ".");
		System.out.println("You are currently a " + person.currentCareer + ".");
		System.out.println();
	}
	
	public void finalCredits (Person person){
		System.out.println("Well " + person.name + ", it was a good run.");
		System.out.println("Your final stats:");
		System.out.println();
		System.out.println("Money: " + "$" + person.money);
		System.out.println("Happiness: " + person.happiness);
	}
}
