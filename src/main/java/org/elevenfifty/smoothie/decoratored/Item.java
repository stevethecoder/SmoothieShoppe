package org.elevenfifty.smoothie.decoratored;

import java.util.List;

import org.elevenfifty.smoothie.beans.Ingredient;
import org.elevenfifty.smoothie.beans.Recipe;

public interface Item {

	public String getName();

	public List<String> getInstructions();

	public double getCost();

	public List<Ingredient> getIngredients();
	
	public List<Recipe> getRecipt();
	
	public void consumeIngredients();

}
