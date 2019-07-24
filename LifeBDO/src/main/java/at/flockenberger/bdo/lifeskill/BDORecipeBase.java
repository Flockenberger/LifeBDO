package at.flockenberger.bdo.lifeskill;

import java.util.List;

import at.flockenberger.bdo.item.BDOItem;
import at.flockenberger.bdo.item.BDOItemIngredient;

public class BDORecipeBase {
	protected BDOItem product;
	protected BDOLifeSkills lifeSkill;
	protected List<BDOItemIngredient> ingredients;
}
