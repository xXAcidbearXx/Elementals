package net.tds.elementals.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.tds.elementals.entity.boss.EntityAirBoss;
import net.tds.elementals.entity.boss.EntityEarthBoss;
import net.tds.elementals.entity.boss.EntityFireBoss;
import net.tds.elementals.entity.boss.EntityLightBoss;
import net.tds.elementals.entity.boss.EntityUndeadBoss;
import net.tds.elementals.entity.boss.EntityWaterBoss;
import net.tds.elementals.entity.passive.EntityBabyAirPet;
import net.tds.elementals.entity.passive.EntityBabyEarthPet;
import net.tds.elementals.entity.passive.EntityBabyFirePet;
import net.tds.elementals.entity.passive.EntityBabyLightPet;
import net.tds.elementals.entity.passive.EntityBabyUndeadPet;
import net.tds.elementals.entity.passive.EntityBabyWaterPet;
import net.tds.elementals.lib.Config;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityManager {
	
	final Object mod;
	
	public EntityManager(Object mod) {
		
		this.mod = mod;

		//pets
		registerEntity(EntityBabyAirPet.class, "baby.airPet", Config.airPetID, 0x66CCFF, false);
		registerEntity(EntityBabyEarthPet.class, "baby.earthPet", Config.earthPetID, 0x336600, false);
		registerEntity(EntityBabyFirePet.class, "baby.firePet", Config.firePetID, 0x680000, false);
		registerEntity(EntityBabyLightPet.class, "baby.lightPet", Config.lightPetID, 0xFFFF33, false);
		registerEntity(EntityBabyUndeadPet.class, "baby.undeadPet", Config.undeadPetID, 0x606060, false);
		registerEntity(EntityBabyWaterPet.class, "baby.waterPet", Config.waterPetID, 0x0066FF, false);
		
		//elementals
		registerEntity(EntityAirBoss.class, "boss.airBoss", Config.airBossID, 0x66CCFF, true);
		registerEntity(EntityEarthBoss.class, "boss.earthBoss", Config.earthBossID, 0x336600, true);
		registerEntity(EntityFireBoss.class, "boss.fireBoss", Config.fireBossID, 0x680000, true);
		registerEntity(EntityLightBoss.class, "boss.lightBoss", Config.lightBossID, 0xFFFF33, true);
		registerEntity(EntityUndeadBoss.class, "boss.undeadBoss", Config.undeadBossID, 0x606060, true);
		registerEntity(EntityWaterBoss.class, "boss.waterBoss", Config.waterBossID, 0x0066FF, true);
		EntityRegistry.addSpawn(EntityEarthBoss.class, Config.earthSpawn, 1, 1, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills);
		EntityRegistry.addSpawn(EntityFireBoss.class, Config.fireSpawn, 1, 1, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.taiga, BiomeGenBase.taigaHills, BiomeGenBase.hell);
		EntityRegistry.addSpawn(EntityWaterBoss.class, Config.waterSpawn, 1, 1, EnumCreatureType.monster, BiomeGenBase.ocean, BiomeGenBase.beach, BiomeGenBase.river);
	}
	
	public void registerEntity(Class<? extends Entity> entity, String name, int id, int color, boolean boss) {
		
		EntityRegistry.registerModEntity(entity, name, id, this.mod, 30, 5, true);
		EntityList.IDtoClassMapping.put(id, entity);
		
		if(boss) {
			
			EntityList.entityEggs.put(id, new EntityEggInfo(id, 0xCBD0D1, color));
		}
		
		else {
			
			EntityList.entityEggs.put(id, new EntityEggInfo(id, 0x947216, color));
		}
	}
}