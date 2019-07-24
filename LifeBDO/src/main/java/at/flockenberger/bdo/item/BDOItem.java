package at.flockenberger.bdo.item;

/**
 * <h1>BDOItem</h1> <br>
 * Represents an Item in BDO.
 * 
 * @author Flockenberger
 *
 */
public class BDOItem {

	private int id;
	private String name;
	private int grade;
	private String icon;

	public BDOItem(String name) {
		this.name = name;
	}

	/**
	 * @return the item id. In BDO itself this is often referred to as "mainKey"
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name of the item
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the grade of the item as {@link BDOItemGrade}
	 */
	public BDOItemGrade getGrade() {
		return BDOItemGrade.getGrade(grade);
	}

	/**
	 * @return the icon of the item as String-URL
	 */
	public String getIcon() {
		return icon;
	}

	@Override
	public String toString() {
		return "BDOItem [id=" + id + ", name=" + name + ", grade=" + BDOItemGrade.getGrade(grade) + ", icon=" + icon
				+ "]";
	}

}
