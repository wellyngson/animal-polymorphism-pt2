package animal;

public abstract class Animal {

	// ATRIBUTOS
	protected float weight;
	protected int years, members;
	
	// MÉTODOS ABSTRATOS
	public abstract void makeSound();

	// MÉTODOS ESPECIAIS GETTERS E SETTERS
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}
	
}
