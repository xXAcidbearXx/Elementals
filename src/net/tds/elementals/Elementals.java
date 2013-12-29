package net.tds.elementals;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.tds.elementals.entity.EntityManager;
import net.tds.elementals.entity.passive.EntityBabyEarthPet;
import net.tds.elementals.entity.passive.EntityBabyFirePet;
import net.tds.elementals.handler.EntityConstructionHandler;
import net.tds.elementals.handler.EntityLootHandler;
import net.tds.elementals.handler.EntityDeathHandler;
import net.tds.elementals.handler.GuiHandler;
import net.tds.elementals.handler.MobDamageHandler;
import net.tds.elementals.item.Items;
import net.tds.elementals.lib.Config;
import net.tds.elementals.lib.Reference;
import net.tds.elementals.proxy.CommonProxy;

import java.util.Arrays;


//Pet needs a way to check if its player is online. this will be used to check on update if their 
//player is logged in. If not the pet should despawn to prevent any issues with the pet while its
//owner is offline. This obviously won't have an effect in single player.

//Pet needs a way to check if its player has its spawn item in its inv. This will be used on update 
//to make sure that the player did not just stuff the item away in a chest somewhere. If the owner does
//not have the correct item the pet should despawn. 

//pets currently don't have a cooldown. Pets need a cooldown to become less overpowered.

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class Elementals {
	
	@SidedProxy(serverSide = Reference.PROXY_SERVER, clientSide = Reference.PROXY_CLIENT)
	public static CommonProxy proxy;

	@Instance(Reference.MOD_ID)
	public static Elementals instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		getModInfo(event.getModMetadata());
		new Config(event.getSuggestedConfigurationFile());
		new Items();
		new EntityManager(this);
		MinecraftForge.EVENT_BUS.register(new EntityConstructionHandler());	
		MinecraftForge.EVENT_BUS.register(new EntityDeathHandler());
		MinecraftForge.EVENT_BUS.register(new EntityLootHandler());
		MinecraftForge.EVENT_BUS.register(new MobDamageHandler());
		proxy.registerRenders();
		proxy.registerCapes();
		NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
	}
	
	@EventHandler
	public void init(FMLPreInitializationEvent event) {

	}
	
	public void getModInfo(ModMetadata meta) {
		
		meta.authorList = Arrays.asList("ThisGuy1045", "Darkhax", "ShadowChild", "HoopAWolf");
		meta.logoFile = "/assets/magicpets/logo.png";
		meta.autogenerated = false;
		meta.description = "This mod adds new elemental creatures and companions into your world!";
		meta.url = "www.darkhax.net/modjam.html";
	}
}