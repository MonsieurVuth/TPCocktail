package cocktail;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main (String[] args) throws IllegalArgumentException, ParseException, InterruptedException
{
	Barman barman1 = new Barman();
	Barman barman2 = new Barman();
	barman1.setCocktail("Mojito");
	barman1.setNom("Pierre");
	barman1.setDuree(100);
	
	ArrayList<Ingredient> listIngredient1 = new ArrayList<Ingredient>();
	ArrayList<Ingredient> listIngredient2 = new ArrayList<Ingredient>();
	
	Ingredient menthe = new Ingredient();
	Ingredient glacepilee = new Ingredient();
	Ingredient citronvert = new Ingredient();
	Ingredient limonade = new Ingredient();
	
	
	
	menthe.setNameIngredient("Menthe");
	glacepilee.setNameIngredient("Glace pilée");
	citronvert.setNameIngredient("Citron");
	limonade.setNameIngredient("Limonade");
	
	
	barman2.setCocktail("Caïpiroska");
	barman2.setNom("Daravuth");
	barman2.setDuree(300);
	
	Ingredient orange = new Ingredient();
	Ingredient grenadine = new Ingredient();
	
	orange.setNameIngredient("Orange");
	grenadine.setNameIngredient("Grenadine");
	
	//Barman Pierre
	listIngredient1.add(menthe);
	listIngredient1.add(glacepilee);
	listIngredient1.add(citronvert);
	listIngredient1.add(limonade);
	
	//Barman Daravuth
	listIngredient2.add(orange);
	listIngredient2.add(grenadine);
	listIngredient2.add(glacepilee);
	listIngredient2.add(menthe);
	
	//Ajout ingredient
	barman1.listIngredient = listIngredient1;
	barman2.listIngredient = listIngredient2;
	
	
	barman1.start();	
	barman2.start();
	
	try {
		barman1.join();
		barman2.join();
	}catch(Exception ex) {}
	
}
}
