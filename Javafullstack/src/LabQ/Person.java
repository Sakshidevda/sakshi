package LabQ;

public class Person {
	
	 private int age;

	    public Person(int age) throws InvalidAgeException {
	        if (age < 18 || age > 100) {
	            throw new InvalidAgeException("Age must be between 18 and 100");
	        }
	        this.age = age;
	    }

	    public int getAge() {
	        return age;
	    }
	    
	    public static void main(String[] args) {
	        try {
	            // Create a Person object with a valid age
	            Person person1 = new Person(25);
	            System.out.println("Person 1 Age: " + person1.getAge());

	            // Attempt to create a Person object with an invalid age
	            Person person2 = new Person(15); // This will throw InvalidAgeException
	            System.out.println("Person 2 Age: " + person2.getAge());
	        } catch (InvalidAgeException e) {
	            System.out.println("Invalid Age Exception: " + e.getMessage());
	        }
	    }
	}


