package at.flockenberger.bdo.item;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import at.flockenberger.bdo.util.BDOUtil;

/**
 * <h1>BDOItemList</h1><br>
 * A List of {@link BDOItem}.
 * 
 * @author Flockenberger
 *
 */
public class BDOItemList {

	public List<BDOItem> items = new ArrayList<BDOItem>();

	/**
	 * @return all items that are in the list
	 */
	public List<BDOItem> getAllItems() {
		return items;
	}

	/**
	 * Searches all items for the given name. The <b>first </b> found item will be
	 * returned.
	 * 
	 * @param name the name to search for
	 * @return the found item or null if it could not be found
	 */
	public BDOItem searchItem(String name) {
		Optional<BDOItem> res = items.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst();
		if (res.isPresent())
			return res.get();
		else
			return new BDOItem(name);
	}

	public BDOItem searchItemContainsName(String name) {
		BDOItem res = items.stream().filter(p -> BDOUtil.containsIgnoreCase(p.getName(), name)).findFirst()
				.orElse(null);
		return res;
	}

	/**
	 * Searches all items for the given name. A list of all items that contain the
	 * name will be returned.
	 * 
	 * @param name the name to search
	 * @return a list of found items
	 */
	public List<BDOItem> searchItems(String name) {
		return items.stream().filter(p -> p.getName().contains(name)).collect(Collectors.toList());
	}

	/**
	 * Searches all items for the given id. The <b>first </b> found item will be
	 * returned.
	 * 
	 * @param id the id to search for
	 * @return the found item or null if it could not be found
	 */
	public BDOItem searchItem(int id) {
		Optional<BDOItem> res = items.stream().filter(p -> p.getId() == (id)).findFirst();
		if (res.isPresent())
			return res.get();
		else
			return null;
	}

	@Override
	public String toString() {
		return "BDOItemList [items=" + items + "]";
	}

}
