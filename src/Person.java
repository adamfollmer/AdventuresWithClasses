
public class Person {
	String name;
	int age;
	double money;
	boolean married;
	double happiness;
	int health;
	int educationYears;
	String currentCity;
	String currentCar;
	String currentHome;
	String currentCareer;

	public Person(String Name) {
		name = Name;
		age = 18;
		money = 100;
		married = false;
		happiness = 50;
		health = 100;
		currentCity = "BEAVER DAM";
		currentCar = "BEATER";
		currentHome = "YOUR PARENTS BASEMENT";
		currentCareer = "UNEMPLOYED";
		educationYears = 0;
	}

	public double moneyChanges(int age, double money, double salary, double car, double home) {
		money = money + 100 * (age / 18); //serves as taxes for the character
		money = money + salary - car - home;
		return money;
	}

	public int healthChange(int age, String city) {
		if (age <= 30) {
			health -= 1;
		} else if (age >= 60) {
			health -= 2;
		}
		return health;
	}

	public double happinessChange(double happiness, double cityFactor, double jobFactor, double homeFactor, double carFactor,  boolean married) {
		happiness = happiness + cityFactor + jobFactor + homeFactor + carFactor;
		if (married = true){
			happiness++;
		}
		return happiness;
	}
}
