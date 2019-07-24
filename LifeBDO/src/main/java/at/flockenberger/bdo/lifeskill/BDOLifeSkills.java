package at.flockenberger.bdo.lifeskill;

import at.flockenberger.bdo.util.BDOUtil;

/**
 * <h1>BDOLifeSkills</h1><br>
 * All life skills in BDO.
 * 
 * @author Flockenberger
 *
 */
public enum BDOLifeSkills {

	COOKING("Cooking"), PROCESSING("Processing"), GATHERING("Gathering"), FISHING("Fishing"), HUNTING("Hunting"),
	ALCHEMY("Alchemy"), TRAINING("Training"), TRADE("Trade"), FARMING("Farming"), SAILING("Sailing"),
	CHOPPING("Chopping"), DRYING("Drying"), FILTERING("Filtering"), GRINDING("Grinding"), HEATING("Heating"),
	SHAKING("Shaking"), ERR_LIFESKILL_NOT_FOUND("ERR LIFE SKILL NOT FOUND");

	private String name;

	BDOLifeSkills(String n) {
		this.name = n;
	}

	/**
	 * 
	 * @return the name of the life skill
	 */
	public String getName() {
		return name;
	}

	/**
	 * Checks if the given name maches a life skill and returns the first matching
	 * one. Note: This method uses a contains call, not an equals!
	 * 
	 * @param name the name to search
	 * @return the found {@link BDOLifeSkills} or {@link #ERR_LIFESKILL_NOT_FOUND}
	 */
	public static BDOLifeSkills getByName(String name) {

		for (BDOLifeSkills region : BDOLifeSkills.values()) {
			if (BDOUtil.containsIgnoreCase(region.getName(), name)) {
				return region;
			}
		}
		return BDOLifeSkills.ERR_LIFESKILL_NOT_FOUND;
	}
}
