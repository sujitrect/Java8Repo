package com.sujit.j8.funciface;

public class FIfaceIntroDCOLKeyWord2 {
	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
		System.out.println(person);
		
		PersonFactory2<Person> personFactory2 = Person::new;
		person = personFactory2.create();
		System.out.println(person);
	}
}

class Person {
    String firstName = "first";
    String lastName = "last";

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
    	return firstName + ":" + lastName;
    }
}

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
interface PersonFactory2<P extends Person> {
    P create();
}