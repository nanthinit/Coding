package december.oops;

public class Trainer {
	
	String dept = "Java", institute ="Payulagam";
	private int salary = 10000;
	
	Trainer(String dept,String institute)
	{
		this.dept = dept;
		this.institute = institute;
	}

	public static void main(String[] args) {

		Trainer trainerKumar = new Trainer("CSE","payilagam"); 
		trainerKumar.training();
		

	}

	public int getSalary()
	{
		return salary;
	}
	
	public void training()
	{
		System.out.println("Training Course Name is "+ this.dept);
		System.out.println("Training institute Name is "+ this.institute );
	}


}
