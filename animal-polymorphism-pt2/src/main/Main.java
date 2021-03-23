package main;
import animal.Dog;

public class Main {

	public static void main(String[] args) {

		// CRIANDO O OBJETO CACHORRO
		Dog dog = new Dog();
				
		// UTILIZANDO OS MÉTODOS
		dog.toReact("Olá");
		dog.toReact(11, 10);
		dog.toReact(true);
	}

}
