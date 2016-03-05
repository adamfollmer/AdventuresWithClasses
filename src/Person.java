
public class Person {
	String name;
	int age;
	double money;
	boolean married;
	String[] friends = new String[10];
	String[] kids = new String[3];
	int happiness;
	int health;
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
	}

	public int yearAge(int age) {
		age++;
		return age;
	}

	public double yearTaxes (int age, double money) {
		money = money + 100 * (age / 18);
		return money;
	}
	public int healthChange (int age, String city){
		if (age <= 30) {
			health -= 1;
		} else if (age >= 60){
			health -= 2;
		}
		return health;
	}
	public int happinessChange (int age, String city, double money, int friends, int kids, boolean married){
		happiness++;
		return happiness;
	}
}
