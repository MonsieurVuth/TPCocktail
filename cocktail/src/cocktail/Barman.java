package cocktail;

import java.util.ArrayList;

public class Barman extends Thread {
	String nom;
	String cocktail;
	long duree;
	public ArrayList<Ingredient> listIngredient;
	
	public long getDuree() {
		return duree;
	}
	public void setDuree(long duree) {
		this.duree = duree;
	}

 public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCocktail() {
		return cocktail;
	}

	public void setCocktail(String cocktail) {
		this.cocktail = cocktail;
	}


public void run()
{
	
	try {
		for(int i = 0; i <= 5; i++) {
			// Prendre tous les ingrédients
			for(Ingredient ingredient : listIngredient) {
				ingredient.prendre();
			}
			System.out.println("Préparation d'un : " + this.cocktail);
			sleep(this.duree);
			System.out.println("Fin Préparation d'un : " + this.cocktail);
			// Poser tous les ingrédients
			for(Ingredient ingredients : listIngredient) {
				ingredients.poser();
			}
			Thread.sleep(this.duree/4);
		}	
	}catch(Exception ex){
	}
}
}

	

