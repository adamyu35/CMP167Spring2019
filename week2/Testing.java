
public class Testing {

	public static void main(String[] args) {
		Person person1 = new Person("Shaky", 16, 'm');
		Person person2 = new Person("Abdullah", 16, 'm');
		Person person3 = new Person("Raj", 16, 'm');
		Person person4 = new Person("Alina", 16, 'f');
		Person person5 = new Person("Jason", 18, 'm');
				
		DMV.generateDL(person1.age, false);
		DMV.generateDL(person2.age, true);
		DMV.generateDL(person3.age, false);
		DMV.generateDL(person4.age, false);
		DMV.generateDL(person5.age, true);
		
	}

}
