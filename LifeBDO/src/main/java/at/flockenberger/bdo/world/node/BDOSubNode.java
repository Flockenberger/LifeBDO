package at.flockenberger.bdo.world.node;

import java.util.List;

import at.flockenberger.bdo.item.BDOItem;

/**
 * <h1>BDOSubNode</h1><br>
 * Represents a Sub-Node of a Master-Node
 * 
 * @author Flockenberger
 *
 */
public class BDOSubNode {

	private int cpCost;
	private List<BDOItem> items;

	public BDOSubNode() {
	}

	public BDOSubNode(int cpCost, List<BDOItem> items) {
		super();
		this.cpCost = cpCost;
		this.items = items;
	}

	/**
	 * 
	 * @return the cost for this sub-node
	 */
	public int getCpCost() {
		return cpCost;
	}

	/**
	 * 
	 * @return the items that can be obtained by this node
	 */
	public List<BDOItem> getItems() {
		return items;
	}

	@Override
	public String toString() {
		return "BDOSubNode [cpCost=" + cpCost + ", items=" + items + "]";
	}

}
