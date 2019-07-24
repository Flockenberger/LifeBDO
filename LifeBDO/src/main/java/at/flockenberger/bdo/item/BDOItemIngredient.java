package at.flockenberger.bdo.item;

import java.util.List;

/**
 * <h1>BDOItemIngredient</h1><br>
 * Represents any ingredient for cooking and alchemy recipes.
 * 
 * @author Flockenberger
 */
public class BDOItemIngredient {

	private List<BDOItem> item;
	private int amount;

	public BDOItemIngredient(List<BDOItem> item, int amount) {
		super();
		this.item = item;
		this.amount = amount;
	}

	/**
	 * @return the item which this ingredient actually is
	 */
	public List<BDOItem> getItem() {
		return item;
	}

	/**
	 * Sets the item for this ingredient
	 * 
	 * @param item the item to set
	 */
	public void setItem(List<BDOItem> item) {
		this.item = item;
	}

	/**
	 * @return the amount of items you need
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * Sets the amount of items needed for this ingredient
	 * 
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BDOItemIngredient [item=" + item + ", amount=" + amount + "]";
	}

}
