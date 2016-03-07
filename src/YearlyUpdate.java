public class YearlyUpdate {
	
	public class yearlyUpdate {
		
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
}
