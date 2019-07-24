import at.flockenberger.bdo.core.LifeBDO;
import at.flockenberger.bdo.item.BDOItemList;
import at.flockenberger.bdo.lifeskill.alchemy.BDOLifeSkillAlchemy;
import at.flockenberger.bdo.lifeskill.cooking.BDOLifeSkillCooking;
import at.flockenberger.bdo.lifeskill.processing.BDOLifeSkillProcessing;
import at.flockenberger.bdo.world.node.BDONodeList;

public class BDOTest {

	public static void main(String[] args) {

		LifeBDO bdo = new LifeBDO();
		BDOItemList items = bdo.getItems();
		BDOLifeSkillAlchemy alchemy = bdo.getAlchemyRecipes();
		BDOLifeSkillCooking cooking = bdo.getCookingRecipes();
		BDOLifeSkillProcessing processing = bdo.getProcessingRecipes();
		BDONodeList nodes = bdo.getNodeList();

		System.out.println(alchemy.searchRecipe("Antidote Elixir"));
		System.out.println(cooking.searchRecipe("Honey Wine"));
		System.out.println(processing.searchRecipe("Acacia Plank"));
		System.out.println(nodes.searchNode("Farm"));
		System.out.println(nodes.getNodesWithCP(3));
		System.out.println(nodes.getNodesWithItems(items.searchItem("Trace")));

	}
}