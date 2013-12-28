package net.tds.elementals.item;

import net.minecraft.item.Item;
import net.tds.elementals.lib.Config;


public class Items {

    public static Item spawnCrystal;
    public static Item essence;
    public static Item resolver;

    public Items() {

        init();
    }

    private void init() {

        spawnCrystal = new ItemSpawningCrystal(Config.crystalID).setTextureName("quartz");
        essence = new ItemEssence(Config.essenceID).setTextureName("elementals:essence");
        resolver = new ItemPetResolver(Config.resolverID).setTextureName("quartz");
    }
}
