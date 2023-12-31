package info3.game.modele.map;

/*
 * Enumeration of every different type of tiles
 */
public enum EnumTiles {
	CALM_WATER, STORMY_WATER, RAGING_WATER, KRAKEN_WATER, SAND_WATER, STORMY_SAND_WATER, RAGING_SAND_WATER, SAND, GRASS,
	TRANSITION_GRASS_UNDER_SAND, TRANSITION_GRASS_ON_TOP_OF_SAND, TRANSITION_GRASS_ON_LEFT_OF_SAND,
	TRANSITION_GRASS_ON_RIGHT_OF_SAND, TRANSITION_GRASS_ON_TOP_AND_UNDER_OF_SAND,
	TRANSITION_GRASS_UNDER_AND_ON_LEFT_OF_SAND, TRANSITION_GRASS_UNDER_AND_ON_RIGHT_OF_SAND,
	TRANSITION_GRASS_ON_TOP_AND_ON_LEFT_OF_SAND, TRANSITION_GRASS_ON_TOP_AND_ON_RIGHT_OF_SAND,
	TRANSITION_GRASS_ON_LEFT_AND_ON_RIGHT_OF_SAND, TRANSITION_GRASS_UNDER_AND_ON_LEFT_AND_ON_TOP_OF_SAND,
	TRANSITION_GRASS_UNDER_AND_ON_RIGHT_AND_ON_TOP_OF_SAND, TRANSITION_GRASS_UNDER_AND_ON_LEFT_AND_ON_RIGHT_OF_SAND,
	TRANSITION_GRASS_ON_RIGHT_AND_ON_LEFT_AND_ON_TOP_OF_SAND, TRANSITION_GRASS_ANGLE_SAND_TOP_LEFT,
	TRANSITION_GRASS_ANGLE_SAND_TOP_RIGHT, TRANSITION_GRASS_ANGLE_SAND_BOTTOM_LEFT,
	TRANSITION_GRASS_ANGLE_SAND_BOTTOM_RIGHT, TREASUR, CRAB_SPAWNER, CRAB_SPAWNER_TRANSITION, TREE, CALM_SEA_CHEST,
	STORMY_SEA_CHEST, RAGING_SEA_CHEST, RED_FLOWER, YELLOW_FLOWER, BLUE_FLOWER, SHELLFISH_1, SHELLFISH_2, SHELLFISH_3,
	PONTOON, GRASS_WITH_ROCK_1, GRASS_WITH_ROCK_2, MOUTAIN, CALM_SEA_ENNEMIE, STORMY_SEA_ENNEMIE, RAGING_SEA_ENNEMIE,
	HARBOR_SAND, CRAB_KING_LAND, CRAB_KING, KRAKEN_TENTACLE, CALM_WATER_PRE_DAMAGE, STORMY_WATER_PRE_DAMAGE,
	RAGING_WATER_PRE_DAMAGE, KRAKEN_WATER_PRE_DAMAGE, CALM_WATER_DAMAGING, STORMY_WATER_DAMAGING, RAGING_WATER_DAMAGING,
	KRAKEN_WATER_DAMAGING, CALM_FAKE_SEA_CHEST, STORMY_FAKE_SEA_CHEST, RAGING_FAKE_SEA_CHEST, POISONED_WATER;

	// water tile : CALM_SATER, STORMY_WATER, RARGING_WATER
	// sand tile : SAND_WATER, SAND, SHELLFISH_1, SHELLFISH_2, SHELLFISH_3
	// other : grass / transition / special tiles
}
