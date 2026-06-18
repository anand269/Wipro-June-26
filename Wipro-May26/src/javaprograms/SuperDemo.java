package javaprograms;

class Animal {
	int price=1000;
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Dog extends Animal {
		
	 public Dog()
	 {
		 int price=super.price+500;
		// System.out.println(price);
	 }
	  public void animalSound() {
	    super.animalSound(); // Call the parent method
	   System.out.println(super.price+200);
	    System.out.println("The dog says: bow wow");
	  }
	}
	
	class Cat extends Animal {
		  public void animalSound() {
		    super.animalSound(); // Call the parent method
		    System.out.println("The cat says: meow meow");
		  }
		}

	public class SuperDemo {
	  public static void main(String[] args) {
	    Dog myDog = new Dog();//constructor
	    myDog.animalSound();
	    Cat c = new Cat();
	    c.animalSound();
	  }
	}