package animal;

public class Mammal extends Animal {

	// ATRIBUTOS
	protected String hairColor;

	// MÉTODO SOBREPOSTO DA CLASSE ANIMAL
	@Override
	public void makeSound() {
		System.out.println("Som de mamífero");
	}

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
 

}
