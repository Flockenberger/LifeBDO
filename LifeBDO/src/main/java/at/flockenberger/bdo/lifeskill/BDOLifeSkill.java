package at.flockenberger.bdo.lifeskill;

import java.util.List;

/**
 * <h1>BDOLifeSkill</h1><br>
 * Represents a life skill in BDO.
 * 
 * @author Flockenberger
 *
 */
public interface BDOLifeSkill {
	/**
	 * @return a list of all cooking recipes
	 */
	public List<BDORecipe> getAllRecipes();

	/**
	 * Searches for a recipe based on the products name
	 * 
	 * @param name the name of the product to make
	 * @return the found {@link BDORecipe} object or null
	 */
	public BDORecipeBase searchRecipe(String name);

	/**
	 * Searches for a recipe based on the products id
	 * 
	 * @param id the id of the product to make
	 * @return the found {@link BDORecipe} object or null
	 */
	public BDORecipeBase searchRecipe(int id);

}
