package animal;

public class Dog extends Wolf{

	@Override
	public void makeSound() {
		System.out.println("au au au");
	}
	
	public void toReact(String phrase) {
		if (phrase.equals("Toma comida") || phrase.equals("Olá")) {
			System.out.println("Abanar e latir");
			this.makeSound();
		} else {
			System.out.println("Rosnar");
		}
		
	}
	
	public void toReact(int hour, int minute) {
		if (hour < 12) {
			System.out.println("Abanar o rabo");
		} else if (hour >=18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e latir");
			this.makeSound();
		}
	}
	
	public void toReact(boolean owner) {
		if (owner) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e latir");
			this.makeSound();
		}
	}
	
	public void toReact(int years, float weight) {
		if (years < 5) {
			if (weight < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
				this.makeSound();
			}
		} else {
			if (weight < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}
	
}
