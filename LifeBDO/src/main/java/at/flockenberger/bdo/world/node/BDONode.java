package at.flockenberger.bdo.world.node;

import java.util.List;

import at.flockenberger.bdo.world.BDORegion;

/**
 * <h1>BDONode</h1><br>
 * Represents a Node in BDO.
 * 
 * @author Flockenberger
 *
 */
public class BDONode {

	private BDONodes node;
	private BDORegion region;
	private int cpCost;
	private List<BDOSubNode> subNodes;

	public BDONode() {

	}

	public BDONode(BDONodes node, BDORegion region, int cpCost, List<BDOSubNode> subNodes) {
		super();
		this.node = node;
		this.region = region;
		this.cpCost = cpCost;
		this.subNodes = subNodes;
	}

	/**
	 * 
	 * @return the name/enum of this node
	 */
	public BDONodes getNode() {
		return node;
	}

	/**
	 * 
	 * @return the region this node is located in
	 */
	public BDORegion getRegion() {
		return region;
	}

	/**
	 * 
	 * @return the cp cost for this master node
	 */
	public int getCpCost() {
		return cpCost;
	}

	/**
	 * 
	 * @return a list of all sub-nodes
	 */
	public List<BDOSubNode> getSubNodes() {
		return subNodes;
	}

	@Override
	public String toString() {
		return "BDONode [node=" + node + ", region=" + region + ", cpCost=" + cpCost + ", subNodes=" + subNodes + "]";
	}

}
