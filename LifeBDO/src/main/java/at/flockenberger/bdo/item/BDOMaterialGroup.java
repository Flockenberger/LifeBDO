package at.flockenberger.bdo.item;

import java.util.ArrayList;
import java.util.List;

import at.flockenberger.bdo.util.BDOUtil;

public class BDOMaterialGroup {

	private List<BDOItem> meat;
	private List<BDOItem> reptileMeat;
	private List<BDOItem> flour;
	private List<BDOItem> dough;
	private List<BDOItem> fruits;
	private List<BDOItem> cereals;
	private List<BDOItem> vegetables;
	private List<BDOItem> seafood;
	private List<BDOItem> fish;
	private List<BDOItem> blood1;
	private List<BDOItem> blood2;
	private List<BDOItem> blood3;
	private List<BDOItem> blood4;
	private List<BDOItem> blood5;
	private List<BDOItem> plants;

	public List<BDOItem> getBlood1() {
		return blood1;
	}

	public List<BDOItem> getBlood3() {
		return blood3;
	}

	public List<BDOItem> getBlood4() {
		return blood4;
	}

	public List<BDOItem> getBlood5() {
		return blood5;
	}

	public List<BDOItem> getBlood2() {
		return blood2;
	}

	public List<BDOItem> getPlants() {
		return plants;
	}

	public List<BDOItem> getMeat() {
		return meat;
	}

	public List<BDOItem> getReptileMeat() {
		return reptileMeat;
	}

	public List<BDOItem> getFlour() {
		return flour;
	}

	public List<BDOItem> getDough() {
		return dough;
	}

	public List<BDOItem> getFruits() {
		return fruits;
	}

	public List<BDOItem> getCereals() {
		return cereals;
	}

	public List<BDOItem> getVegetables() {
		return vegetables;
	}

	public List<BDOItem> getSeafood() {
		return seafood;
	}

	public List<BDOItem> getFish() {
		return fish;
	}

	public List<BDOItem> getByName(String name) {
		if (BDOUtil.containsIgnoreCase(name, "meat") && !BDOUtil.containsIgnoreCase(name, "reptile"))
			return getMeat();
		else if (BDOUtil.containsIgnoreCase(name, "reptile"))
			return getReptileMeat();
		else if (BDOUtil.containsIgnoreCase(name, "flour"))
			return getFlour();
		else if (BDOUtil.containsIgnoreCase(name, "dough"))
			return getDough();
		else if (BDOUtil.containsIgnoreCase(name, "fruit"))
			return getFruits();
		else if (BDOUtil.containsIgnoreCase(name, "cereal") || BDOUtil.containsIgnoreCase(name, "starch"))
			return getCereals();
		else if (BDOUtil.containsIgnoreCase(name, "vegetable"))
			return getVegetables();
		else if (BDOUtil.containsIgnoreCase(name, "seafood"))
			return getSeafood();
		else if (BDOUtil.containsIgnoreCase(name, "fish"))
			return getFish();
		else if (BDOUtil.containsIgnoreCase(name, "plant"))
			return getPlants();
		else if (BDOUtil.containsIgnoreCase(name, "blood 2"))
			return getBlood2();
		else if (BDOUtil.containsIgnoreCase(name, "blood 1"))
			return getBlood1();
		else if (BDOUtil.containsIgnoreCase(name, "blood 3"))
			return getBlood3();
		else if (BDOUtil.containsIgnoreCase(name, "blood 4"))
			return getBlood4();
		else if (BDOUtil.containsIgnoreCase(name, "blood 5"))
			return getBlood5();
		else {
			List<BDOItem> s = new ArrayList<BDOItem>();
			s.add(new BDOItem(name));
			return s;
		}
	}

}
