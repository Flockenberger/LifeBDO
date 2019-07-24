package at.flockenberger.bdo.item;

/**
 * <h1>BDOItemGrade</h1><br>
 * Item grades in BDO as enum.
 * 
 * @author Flockenberger
 *
 */
public enum BDOItemGrade {

	WHITE(0), GREEN(1), BLUE(2), GOLD(3), ORANGE(4);

	private int grade;

	BDOItemGrade(int id) {
		this.grade = id;
	}

	/**
	 * Returns the grade based on id. <br>
	 * 0 = white, 4=orange
	 * 
	 * @param id the id to get the grade
	 * @return {@link BDOItemGrade}. If the id was not found
	 *         {@link BDOItemGrade#WHITE} will be returned
	 */
	public static BDOItemGrade getGrade(int id) {
		for (BDOItemGrade g : BDOItemGrade.values()) {
			if (g.getItemGrade() == id) {
				return g;
			}
		}
		return WHITE;
	}

	public int getItemGrade() {
		return grade;
	}

}
