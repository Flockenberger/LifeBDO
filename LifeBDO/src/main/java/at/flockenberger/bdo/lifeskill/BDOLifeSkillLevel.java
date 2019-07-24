package at.flockenberger.bdo.lifeskill;

import at.flockenberger.bdo.util.BDOUtil;

/**
 * <h1>BDOLifeSkillLevel</h1> <br>
 * Represents a LifeSkill level.
 * 
 * @author Flockenberger
 *
 */
public enum BDOLifeSkillLevel {

	BEGINNER(0), APPRENTICE(1), SKILLED(2), PROFESSIONAL(3), ARTISAN(4), MASTER(5), GURU(6);

	private int grade; // conversion from int ids to actual level (beginner etc. ...)
	private int level = 0; // the level 0-10 for e.g. Beginner 10

	private BDOLifeSkillLevel(int grade) {
		this.grade = grade;
	}

	/**
	 * Optional level to further specifie the LifeSkill level. For example to
	 * Specifiy Beginner 10. Instead of just beginner.
	 * 
	 * @param lvl the level to set.
	 */
	public void setLevel(int lvl) {
		this.level = BDOUtil.checkRange(lvl, 0, 10, 0);
	}

	/**
	 * @return the level that has been set with {@link #setLevel(int)} or 0
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * @return the LifeSkillLevel as number 0-6
	 */
	public int toGrade() {
		return this.grade;
	}

	public static BDOLifeSkillLevel getFromString(String str) {
		if (str.contains("Beg"))
			return BDOLifeSkillLevel.BEGINNER;
		else if (str.contains("Ap"))
			return BDOLifeSkillLevel.APPRENTICE;
		else if (str.contains("Skil"))
			return BDOLifeSkillLevel.SKILLED;
		else if (str.contains("Art"))
			return BDOLifeSkillLevel.ARTISAN;
		else if (str.contains("Mas"))
			return BDOLifeSkillLevel.MASTER;
		else
			return BDOLifeSkillLevel.GURU;
	}
}