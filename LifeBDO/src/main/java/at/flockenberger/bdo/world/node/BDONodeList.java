package at.flockenberger.bdo.world.node;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import at.flockenberger.bdo.item.BDOItem;
import at.flockenberger.bdo.util.BDOUtil;

/**
 * <h1>BDONodeList</h1><br>
 * Container class which holds every node in BDO.
 * 
 * @author Flockenberger
 *
 */
public class BDONodeList {

	private List<BDONode> nodes = new ArrayList<BDONode>();

	public BDONodeList() {

	}

	public BDONodeList(List<BDONode> n) {
		this.nodes = n;
	}

	/**
	 * 
	 * @return a {@link List} with every {@link BDONode}
	 */
	public List<BDONode> getNodes() {
		return nodes;
	}

	/**
	 * Returns a {@link List} of {@link BDONode} where all nodes have the given cp
	 * cost. <br>
	 * Note: This does only take the Master-Nodes into account!
	 * 
	 * @param cp the cp cost
	 * @return list of nodes
	 */
	public List<BDONode> getNodesWithCP(int cp) {
		return nodes.stream().filter(p -> p.getCpCost() == cp).collect(Collectors.toList());
	}

	/**
	 * Searches for the given node. <br>
	 * Note: The first found node will be returned.
	 * 
	 * @param name the name of the node to search
	 * @return the found node
	 */
	public BDONode searchNode(String name) {
		Optional<BDONode> res = nodes.stream().filter(p -> BDOUtil.containsIgnoreCase(p.getNode().getName(), name))
				.findFirst();
		if (res.isPresent())
			return res.get();
		else
			return null;
	}

	/**
	 * Returns a {@link List} of {@link BDONode} with every Master-Node which has
	 * the given {@link BDOItem} as a product of a Sub-Node.
	 * 
	 * @param item the item to search
	 * @return a list of nodes
	 */
	public List<BDONode> getNodesWithItems(BDOItem item) {
		return nodes.stream().filter(node -> node.getSubNodes().stream().anyMatch(
				sub -> sub.getItems().stream().anyMatch(i -> BDOUtil.containsIgnoreCase(i.getName(), item.getName()))))
				.collect(Collectors.toList());
	}

	@Override
	public String toString() {
		return "BDONodeList [nodes=" + nodes + "]";
	}

}
