package at.flockenberger.bdo.world.node;

import at.flockenberger.bdo.util.BDOUtil;

/**
 * <h1>BDONodes</h1><br>
 * An enum containing (almost) every node in black desert
 * 
 * @author Flockenberger
 *
 */
public enum BDONodes {
	ABANDONED_IRON_MINE("Abandoned Iron Mine"), AHTO_FARM("Ahto Farm"), AKMAN("Akman"),
	AKUM_ROCKY_MOUNTAIN("Akum Rocky Mountain"), ALBRESSER_ISLAND("Albresser Island"), ALEJANDRO_FARM("Alejandro Farm"),
	ALTAS_FARMLAND("Altas Farmland"), ANCIENT_FISSURE("Ancient Fissure"), ANCIENT_RUINS("Ancient Ruins"),
	ANCIENT_STONE_CHAMBER("Ancient Stone Chamber"), ANGIE_ISLAND("Angie Island"),
	AREHA_PALM_FOREST("Areha Palm Forest"), BAEZA_ISLAND("Baeza Island"), BALENOS_FOREST("Balenos Forest"),
	BAMBU_VALLEY("Bambu Valley"), BARATER_ISLAND("Barater Island"), BARTALI_FARM("Bartali Farm"),
	BASHIM_BASE("Bashim Base"), BAZAAR_FARMLAND("Bazaar Farmland"), BEHR_RIVERHEAD("Behr Riverhead"),
	BEIRUWA_ISLAND("Beiruwa Island"), BERNIANTO_FARM("Bernianto Farm"), BREE_TREE_RUINS("Bree Tree Ruins"),
	CAPOTIA("Capotia"), CASTA_FARM("Casta Farm"), CASTLE_RUINS("Castle Ruins"), COASTAL_CAVE("Coastal Cave"),
	COASTAL_CLIFF("Coastal Cliff"), COSTA_FARM("Costa Farm"), CRESCENT_MOUNTAINS("Crescent Mountains"),
	CRESCENT_SHRINE("Crescent Shrine"), CRON_CASTLE_SITE("Cron Castle Site"), DATON_ISLAND("Daton Island"),
	DELINGHART_ISLAND("DelingHart Island"), DORMANN_LUMBER_CAMP("Dormann Lumber Camp"),
	DUVENCRUNE_FARMLAND("Duvencrune Farmland"), EHWAZ_HILL("Ehwaz Hill"), ELRIC_SHRINE("Elric Shrine"),
	EPHDE_RUNE_ISLAND("Ephde Rune Island"), ERDAL_FARM("Erdal Farm"), FINTO_FARM("Finto Farm"),
	FOHALAM_FARM("Fohalam Farm"), FOREST_OF_PLUNDER("Forest Of Plunder"), FOREST_OF_SECLUSION("Forest of Seclusion"),
	FOUNTAIN_OF_ORIGIN("Fountain of Origin"), GAVINYA_COASTAL_CLIFF("Gavinya Coastal Cliff"),
	GAVINYA_GREAT_CRATER("Gavinya Great Crater"), GAVINYA_VOLCANO("Gavinya Volcano"),
	GERVISH_MOUNTAINS("Gervish Mountains"), GLISH_RUINS("Glish Ruins"), GLISH_SWAMP("Glish Swamp"),
	GLUTONI_CAVE("Glutoni Cave"), GOBLIN_CAVE("Goblin Cave"), GORGO_ROCK_BELT("Gorgo Rock Belt"),
	HEXE_STONE_WALL("Hexe Stone Wall"), HOLO_FOREST("Holo Forest"), IMP_CAVE("Imp Cave"),
	INVERNEN_ISLAND("Invernen Island"), IRIS_CANYON("Iris Canyon"), IVERO_CLIFF("Ivero Cliff"),
	KAMASILVE_TEMPLE("Kamasilve Temple"), KARANDA_RIDGE("Karanda Ridge"), KASULA_FARM("Kasula Farm"),
	KEPLAN_QUARRY("Keplan Quarry"), KHALK_CANYON("Khalk Canyon"), KHIMUT_LUMBER_CAMP("Khimut Lumber Camp"),
	KHURUTO_CAVE("Khuruto Cave"), KMACH_CANYON("Kmach Canyon"), KUNIDS_VACATION_SPOT("Kunid's Vacation Spot"),
	LAKE_FLONDOR("Lake Flondor"), LEICAL_FALLS("LeiCal Falls"), LISZ_ISLAND("Lisz Island"), LOGGIA_FARM("Loggia Farm"),
	LONGLEAF_TREE_FOREST("Longleaf Tree Forest"), LONGLEAF_TREE_SENTRY_POST("Longleaf Tree Sentry Post"),
	LOONEY_CABIN("Looney Cabin"), LOOPY_TREE_FOREST("Loopy Tree Forest"), LOURUVE_ISLAND("Louruve Island"),
	LUIVANO_ISLAND("Luivano Island"), LUMBERJACKS_REST_AREA("Lumberjack's Rest Area"),
	LYNCH_FARM_RUINS("Lynch Farm Ruins"), LYNCH_RANCH("Lynch Ranch"), MANSHA_FOREST("Mansha Forest"),
	MARAK_FARM("Marak Farm"), MARIE_CAVE("Marie Cave"), MARIVENO_ISLAND("Mariveno Island"), MARNIS_2ND("Marni's 2nd"),
	MEDIAH_NORTHERN_HIGHLANDS("Mediah Northern Highlands"), MEDIAH_SHORE("Mediah Shore"),
	MODRIC_ISLAND("Modric Island"), MORETTI_PLANTATION("Moretti Plantation"), NADA_ISLAND("Nada Island"),
	NORTHERN_CIENAGA("Northern Cienaga"), NORTHERN_HEIDEL_QUARRY("Northern Heidel Quarry"),
	NORTHERN_PLAIN_OF_SERENDIA("Northern Plain of Serendia"), NORTHERN_SAND_DUNE("Northern Sand Dune"),
	NORTHERN_WHEAT_PLANTATION("Northern Wheat Plantation"), OBEN_ISLAND("Oben Island"), OLD_DANDELION("Old Dandelion"),
	OMAR_LAVA_CAVE("Omar Lava Cave"), ORFFS_ISLAND("Orffs Island"), OZE_PASS("Oze Pass"),
	PHONIELS_CABIN("Phoniel's Cabin"), PILAVA_ISLAND("Pilava Island"), PILGRIMS_HAVEN("Pilgrim's Haven"),
	PILGRIMS_SANCTUM("Pilgrim's Sanctum"), POLLYS_FOREST("Polly's Forest"), PRIMAL_GIANT_POST("Primal Giant Post"),
	PUJARA_ISLAND("Pujara Island"), PUJIYA_CANYON("Pujiya Canyon"), QUINT_HILL("Quint Hill"),
	RANDIS_ISLAND("Randis Island"), RHUA_TREE_STUB("Rhua Tree Stub"), RHUTUM_OUTSTATION("Rhutum Outstation"),
	ROUD_SULFUR_WORKS("Roud Sulfur Works"), SERCA_ISLAND("Serca Island"), SERENDIA_SHRINE("Serendia Shrine"),
	SHADY_TREE_FOREST("Shady Tree Forest"), SHAKATU_FARMLAND("Shakatu Farmland"),
	SHEREKHAN_NECROPOLIS("Sherekhan Necropolis"), SHURI_FARM("Shuri Farm"), SOUTHERN_CIENAGA("Southern Cienaga"),
	SOUTHERN_KAMASYLVIA("Southern Kamasylvia"), STARS_END("Star's End"), STAREN_ISLAND("Staren Island"),
	STONETAIL_WASTELAND("StoneTail Wasteland"), TARAMURA_ISLAND("Taramura Island"), TEYAMAL_ISLAND("Teyamal Island"),
	THERMIAN_CLIFF("Thermian Cliff"), TITIUM_VALLEY("Titium Valley"), TOOTH_FAIRY_FOREST("Tooth Fairy Forest"),
	TOSCANI_FARM("Toscani Farm"), TREANT_FOREST("Treant Forest"), TSHIRA_RUINS("Tshira Ruins"),
	VALENCIA_PLANTATION("Valencia Plantation"), VETERANS_CANYON("Veteran's Canyon"),
	VIV_FORETTAS_CABIN("Viv Forettas Cabin"), WALE_FARM("Wale Farm"), WEENIE_CABIN("Weenie Cabin"),
	WEITA_ISLAND("Weita Island"), WOLF_HILLS("Wolf Hills"), ERR_NODE_NOT_FOUND("ERR NODE NOT FOUND");

	private String name;

	BDONodes(String n) {
		this.name = n;
	}

	/**
	 * 
	 * @return the name of the node
	 */
	public String getName() {
		return name;
	}

	/**
	 * Checks if the given name maches a node and returns the first matching node.
	 * Note: This method uses a contains call, not an equals!
	 * 
	 * @param name the name to search
	 * @return the found {@link BDONodes} or {@link #ERR_NODE_NOT_FOUND}
	 */
	public static BDONodes getByName(String name) {
		for (BDONodes n : BDONodes.values()) {
			if (BDOUtil.containsIgnoreCase(n.getName(), name)) {
				return n;
			}
		}
		return BDONodes.ERR_NODE_NOT_FOUND;
	}

}