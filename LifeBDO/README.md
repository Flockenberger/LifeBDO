# HOW-TO
Currently the "api" is very simple, it will get more features over time!

Here is a little example on how to use it and what is currently possible

More doc can be found here: https://flockenberger.github.io/LifeBDO/

```java
public static void main(String[] args) {

		LifeBDO bdo = new LifeBDO(); //create a new LifeBDO object
		
		BDOItemList items = bdo.getItems(); //returns a BDOItemList -> contains all items
		BDOLifeSkillAlchemy alchemy = bdo.getAlchemyRecipes(); //contains all alchemy recipes
		BDOLifeSkillCooking cooking = bdo.getCookingRecipes(); //contains all cooking recipes
		BDOLifeSkillProcessing processing = bdo.getProcessingRecipes(); // contains all processing recipes
		BDONodeList nodes = bdo.getNodeList(); //contains all nodes

		//searching for recipes either per name or id
		System.out.println(alchemy.searchRecipe("Antidote Elixir"));
		System.out.println(cooking.searchRecipe("Honey Wine"));
		System.out.println(processing.searchRecipe("Acacia Plank"));
		
		//searching for specific nodes
		System.out.println(nodes.searchNode("Farm"));
		System.out.println(nodes.getNodesWithCP(3));
		System.out.println(nodes.getNodesWithItems(items.searchItem("Trace")));

	}
```
