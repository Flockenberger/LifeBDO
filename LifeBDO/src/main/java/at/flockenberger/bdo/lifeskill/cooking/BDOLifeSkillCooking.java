package at.flockenberger.bdo.lifeskill.cooking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import at.flockenberger.bdo.lifeskill.BDOLifeSkill;
import at.flockenberger.bdo.lifeskill.BDORecipe;

/**
 * <h1>BDOCookingList</h1><br>
 * Has every cooking recipe (that I could find).
 * 
 * @author Flockenberger
 *
 */
public class BDOLifeSkillCooking implements BDOLifeSkill {

	private List<BDORecipe> recipes = new ArrayList<BDORecipe>();

	/**
	 * @return a list of all cooking recipes
	 */
	public List<BDORecipe> getAllRecipes() {
		return recipes;
	}

	/**
	 * {@inheritDoc}
	 */
	public BDORecipe searchRecipe(String name) {
		Optional<BDORecipe> res = recipes.stream().filter(p -> p.getProduct().getName().equalsIgnoreCase(name))
				.findFirst();
		if (res.isPresent())
			return res.get();
		else
			return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public BDORecipe searchRecipe(int id) {
		Optional<BDORecipe> res = recipes.stream().filter(p -> p.getProduct().getId() == id).findFirst();
		if (res.isPresent())
			return res.get();
		else
			return null;
	}

	@Override
	public String toString() {
		return "BDOCookingList [recipes=" + recipes + "]";
	}

}
