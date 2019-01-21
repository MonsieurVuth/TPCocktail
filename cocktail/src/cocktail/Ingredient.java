package cocktail;

public class Ingredient {
String nameIngredient;
private int sem = 1;
public String getNameIngredient() {
	return nameIngredient;
}

public void setNameIngredient(String name) {
	this.nameIngredient = name;
}

public synchronized void prendre() throws InterruptedException {
	if(sem  == 0) {
		wait();
	}
	sem = sem - 1;
	Thread.sleep(15);
}

public synchronized void poser() {
	sem +=1;
	notify();
}

}
