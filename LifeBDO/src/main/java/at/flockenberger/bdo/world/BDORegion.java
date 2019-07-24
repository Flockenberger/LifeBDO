package at.flockenberger.bdo.world;

import at.flockenberger.bdo.util.BDOUtil;
import at.flockenberger.bdo.world.node.BDONodes;

/**
 * <h1>BDORegion</h1><br>
 * Currently all regions in BDO as an enum
 * 
 * @author Flockenberger
 *
 */
public enum BDORegion {
	MEDIAH("Mediah"), VALENCIA("Valencia"), DRIEGHAN("Drieghan"), SEA_WEST("Sea - West"), SERENDIA("Serendia"),
	BALENOS("Balenos"), SEA_CENTRAL("Sea Central"), CALPHEON("Calpheon"), KAMASYLVIA("Kamasylvia"),
	SEA_ISLAND("Sea Island"), SEA_MARGORIA("Sea Margoria"), STARS_END("Star's_End"),
	ERR_REGION_NOT_FOUND("ERR REGION NOT FOUND");

	private String name;

	BDORegion(String n) {
		this.name = n;
	}

	/**
	 * 
	 * @return the name of the region
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Checks if the given name maches a region and returns the first matching one.
	 * Note: This method uses a contains call, not an equals!
	 * 
	 * @param name the name to search
	 * @return the found {@link BDORegion} or {@link #ERR_REGION_NOT_FOUND}
	 */
	public static BDORegion getByName(String name) {

		for (BDORegion region : BDORegion.values()) {
			if (BDOUtil.containsIgnoreCase(region.getName(), name)) {
				return region;
			}
		}
		return BDORegion.ERR_REGION_NOT_FOUND;
	}

}
