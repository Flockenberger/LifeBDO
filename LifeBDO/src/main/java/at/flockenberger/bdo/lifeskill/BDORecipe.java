package at.flockenberger.bdo.lifeskill;

import java.util.List;

import at.flockenberger.bdo.item.BDOItem;
import at.flockenberger.bdo.item.BDOItemEffect;
import at.flockenberger.bdo.item.BDOItemIngredient;

/**
 * <h1>BDORecipe</h1><br>
 * Represents any cooking recipe in BDO.
 * 
 * @author Flockenberger
 *
 */
public class BDORecipe extends BDORecipeBase {

	
	private BDOLifeSkillLevel level;
	private int xp;
	private List<BDOItemEffect> effects;

	public BDORecipe(BDOItem recipeItem, BDOLifeSkills lifeSkill, BDOLifeSkillLevel level, int xp,
			List<BDOItemEffect> effects, List<BDOItemIngredient> ingredients) {
		super();
		this.product = recipeItem;
		this.lifeSkill = lifeSkill;
		this.level = level;
		this.xp = xp;
		this.effects = effects;
		this.ingredients = ingredients;
	}

	/**
	 * @return the product which this recipe makes
	 */
	public BDOItem getProduct() {
		return product;
	}

	/**
	 * @return the needed skill level for this recipe
	 */
	public BDOLifeSkillLevel getLevel() {
		return level;
	}

	/**
	 * @return the xp received when crafting one
	 */
	public int getXp() {
		return xp;
	}

	/**
	 * @return the effects the product applies
	 */
	public List<BDOItemEffect> getEffects() {
		return effects;
	}

	/**
	 * @return the ingredients to make the product
	 */
	public List<BDOItemIngredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @return the lifeskill which this recipe applies to
	 */
	public BDOLifeSkills getLifeSkill() {
		return lifeSkill;
	}

	@Override
	public String toString() {
		return "BDORecipe [product=" + product + ", lifeSkill=" + lifeSkill + ", level=" + level + ", xp=" + xp
				+ ", effects=" + effects + ", ingredients=" + ingredients + "]";
	}

}
