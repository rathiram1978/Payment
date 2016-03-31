public class Payment {

	public static void main(String[] args) {
		// create a person 
		Person person  = new Person();
		person.setFirstName("Jerine71");
		person.setLastName("Joseph");
		person.setHourlyRate(75);
		System.out.println(person.toString());
		// Calculating the monthly wages
		System.out.println(person.getPayment(160));
		// printing for default person;
		Person p = new Person();
		System.out.println(p.toString());
		System.out.println(p.getPayment(40));
		
	}

}
