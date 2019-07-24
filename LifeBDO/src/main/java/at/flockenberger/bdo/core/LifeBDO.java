package at.flockenberger.bdo.core;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

import at.flockenberger.bdo.item.BDOItemList;
import at.flockenberger.bdo.item.BDOMaterialGroup;
import at.flockenberger.bdo.lifeskill.alchemy.BDOLifeSkillAlchemy;
import at.flockenberger.bdo.lifeskill.cooking.BDOLifeSkillCooking;
import at.flockenberger.bdo.lifeskill.processing.BDOLifeSkillProcessing;
import at.flockenberger.bdo.util.BDOUtil;
import at.flockenberger.bdo.world.node.BDONodeList;

/**
 * <h1>LifeBDO</h1><br>
 * The main class of this little api. It allows access to all items, recipes,
 * nodes etc.
 * 
 * @author Flockenberger
 *
 */
public class LifeBDO {

	private BDOItemList items;
	private BDOLifeSkillCooking cookingRecipes;
	private BDOLifeSkillAlchemy alchemyRecipes;
	private BDONodeList nodeList;
	private BDOLifeSkillProcessing processingRecipes;

	private BDOMaterialGroup materials;

	public LifeBDO() {
		_loadItems();
		_loadCooking();
		_loadMaterialGroups();
		_loadAlchemy();
		_loadProcessing();
		_loadNodes();
	}

	/**
	 * 
	 * @return a {@link BDOItemList} this class is a container which holds all items
	 */
	public BDOItemList getItems() {
		return items;
	}

	/**
	 * 
	 * @return {@link BDOLifeSkillCooking}, a container class which holds all
	 *         cooking recipes
	 */
	public BDOLifeSkillCooking getCookingRecipes() {
		return cookingRecipes;
	}

	/**
	 * 
	 * @return {@link BDOLifeSkillAlchemy}, a container class which holds all
	 *         alchemy recipes
	 */
	public BDOLifeSkillAlchemy getAlchemyRecipes() {
		return alchemyRecipes;
	}

	/**
	 * 
	 * @return {@link BDONodeList}, a container class which holds all nodes
	 */
	public BDONodeList getNodeList() {
		return nodeList;
	}

	/**
	 * 
	 * @return {@link BDOLifeSkillProcessing}, a container class which holds all
	 *         processing recipes
	 */
	public BDOLifeSkillProcessing getProcessingRecipes() {
		return processingRecipes;
	}

	/**
	 * 
	 * @return {@link BDOMaterialGroup}, a container class which holds all materials
	 */
	public BDOMaterialGroup getMaterials() {
		return materials;
	}

	private void _loadCooking() {
		try {
			cookingRecipes = BDOUtil.toObject(
					IOUtils.toString(LifeBDO.class.getResourceAsStream("/recipesCooking.json"), "UTF-8"),
					BDOLifeSkillCooking.class);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void _loadMaterialGroups() {
		try {
			materials = BDOUtil.toObject(
					IOUtils.toString(LifeBDO.class.getResourceAsStream("/materialGroups.json"), "UTF-8"),
					BDOMaterialGroup.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void _loadAlchemy() {
		try {
			alchemyRecipes = BDOUtil.toObject(
					IOUtils.toString(LifeBDO.class.getResourceAsStream("/recipesAlchemy.json"), "UTF-8"),
					BDOLifeSkillAlchemy.class);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void _loadItems() {
		try {
			items = BDOUtil.toObject(IOUtils.toString(LifeBDO.class.getResourceAsStream("/items.json"), "UTF-8"),
					BDOItemList.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void _loadProcessing() {
		try {
			processingRecipes = BDOUtil.toObject(
					IOUtils.toString(LifeBDO.class.getResourceAsStream("/recipesProcessing.json"), "UTF-8"),
					BDOLifeSkillProcessing.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void _loadNodes() {
		try {
			nodeList = BDOUtil.toObject(IOUtils.toString(LifeBDO.class.getResourceAsStream("/nodes.json"), "UTF-8"),
					BDONodeList.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
