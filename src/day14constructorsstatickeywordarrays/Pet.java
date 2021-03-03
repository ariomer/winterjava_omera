package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		Dog.eat();//To access static method just class name is enough
		
		Dog dog1 = new Dog();
		dog1.drink();//To access non-static methods, you must create object
		dog1.eat();//To access static methods, you can use object as well but it is not recommended, because it is long way
				   //and Java gives you notification with yellow underline
		
	}

}
