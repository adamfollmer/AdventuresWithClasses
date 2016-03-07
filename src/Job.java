import java.util.Scanner;

public class Job {
	String job;
	double salary;
	int happinessFactor;
	int educationYears;
	
	public Job (String Job) {
		job = Job;
		switch (job) {
		case "STUDENT":
			salary = -1000;
			happinessFactor = 1;
			educationYears = 1;
			break;
		case "DOCTOR" :
			salary = 10000;
			happinessFactor = -1;
			educationYears = 0;
			break;
		case "PROGRAMMER":
			salary = 5000;
			happinessFactor = 2;
			educationYears = 0;
		case "MANAGER" :
			salary = 4000;
			happinessFactor = 1;
			educationYears = 0;
			break;
		default: 
			job = "MINIMUM WAGE";
			salary = 1000;
			happinessFactor = -2;
			educationYears = 0;
		}
	}
	public void help (){
		System.out.println("Pick from: ");
		System.out.println("STUDENT, DOCTOR, PROGRAMMER, , MANAGER, or MINIMUM WAGE");
	}
	
	public String newJob (Job job, Person person){
		String userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("What job do you want? Type HELP for options");
		userInput = input.nextLine().toUpperCase();
		while (userInput.equals("HELP")) {
			job.help();
			userInput = input.nextLine().toUpperCase();
		}
		userInput = job.educationVerify(userInput, person);
		System.out.println("You have become a " + userInput + ".");
		System.out.println();
		return userInput;
	}
	public Job classChangeJob (String job){
		Job newJob = new Job (job);
		return newJob;
	}
	
	public int addEducation (Job job, Person person){
		person.educationYears = person.educationYears + job.educationYears;
		return person.educationYears;
	}
	
	public String educationVerify (String oldInput, Person person){
		String userInput = oldInput;
		Scanner input = new Scanner (System.in);
		if (oldInput.equals("DOCTOR") && person.educationYears < 8) {
			System.out.println("You need more education, become a student first");
			userInput = input.nextLine().toUpperCase();
		} else {
			oldInput = userInput;
		}
		return userInput;
	}
}
