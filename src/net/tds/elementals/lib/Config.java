package net.tds.elementals.lib;

import net.minecraftforge.common.Configuration;

import java.io.File;

public class Config {

	public static Configuration conf;
	
	public static final String CATEGORY_MODID = "Mod ID Values";
	public static boolean playerMessage;
	
	public static int crystalID;
    public static int essenceID;
    public static int resolverID;
    
    public static int airPetID;
    public static int earthPetID;
    public static int firePetID;
    public static int lightPetID;
    public static int undeadPetID;
    public static int waterPetID;
    
    public static int airBossID;
    public static int earthBossID;
    public static int fireBossID;
    public static int lightBossID;
    public static int undeadBossID;
    public static int waterBossID;
    
    public static int fireSpawn;
    public static int waterSpawn;
    public static int earthSpawn;

    public Config(File file) {
		
		conf = new Configuration(file);
		
		conf.load();
		
		playerMessage = conf.get(conf.CATEGORY_GENERAL, "Should messages sent to the player also be sent to the server/console", false).getBoolean(false);
		
		crystalID = conf.get(conf.CATEGORY_ITEM, "Item ID for Summoning Crystal", 24380).getInt();
        essenceID = conf.get(conf.CATEGORY_ITEM, "Item ID for Essences", 24381).getInt();
        resolverID = conf.get(conf.CATEGORY_ITEM, "Item ID for Pet Resolver", 24382).getInt();
        
        airPetID = conf.get(CATEGORY_MODID, "Air Pet ID", 300).getInt();
        earthPetID = conf.get(CATEGORY_MODID, "Earth Pet ID", 301).getInt();
        firePetID = conf.get(CATEGORY_MODID, "Fire Pet ID", 302).getInt();
        lightPetID = conf.get(CATEGORY_MODID, "Light Pet ID", 303).getInt();
        undeadPetID = conf.get(CATEGORY_MODID, "Undead Pet ID", 304).getInt();
        waterPetID = conf.get(CATEGORY_MODID, "Water Pet ID", 305).getInt();
        
        airBossID = conf.get(CATEGORY_MODID, "Air Boss ID", 350).getInt();
        earthBossID = conf.get(CATEGORY_MODID, "Earth Boss ID", 351).getInt();
        fireBossID = conf.get(CATEGORY_MODID, "Fire Boss ID", 352).getInt();
        lightBossID = conf.get(CATEGORY_MODID, "Light Boss ID", 353).getInt();
        undeadBossID = conf.get(CATEGORY_MODID, "Undead Boss ID", 354).getInt();
        waterBossID = conf.get(CATEGORY_MODID, "Water Boss ID", 355).getInt();
        
        fireSpawn = conf.get(conf.CATEGORY_GENERAL, "Spawnrate of Fire Boss", 3).getInt();
        waterSpawn = conf.get(conf.CATEGORY_GENERAL, "Spawnrate of Water Boss", 3).getInt();
        earthSpawn = conf.get(conf.CATEGORY_GENERAL, "Spawnrate of Eath Boss", 3).getInt();
		
		conf.save();
	}
}
