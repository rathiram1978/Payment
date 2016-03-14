
public class Payment {

	public static void main(String[] args) {
		// create a person 
		Person person  = new Person();
		person.setFirstName("Jerine");
		person.setLastName("Joseph");
		person.setHourlyRate(75);
		System.out.println(person.toString());
		System.out.println(person.getPayment(160));
	}

}
