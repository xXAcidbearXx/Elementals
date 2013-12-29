package net.tds.elementals.proxy;

import java.util.Arrays;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatMessageComponent;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.tds.elementals.client.gui.GuiPetName;
import net.tds.elementals.client.model.ModelBabyEarthPet;
import net.tds.elementals.client.model.ModelBabyFirePet;
import net.tds.elementals.client.model.ModelBabyWaterPet;
import net.tds.elementals.client.model.ModelEarthBoss;
import net.tds.elementals.client.model.ModelFireBoss;
import net.tds.elementals.client.model.ModelWaterBoss;
import net.tds.elementals.client.render.entity.RenderBabyEarthPet;
import net.tds.elementals.client.render.entity.RenderBabyFirePet;
import net.tds.elementals.client.render.entity.RenderBabyWaterPet;
import net.tds.elementals.client.render.entity.RenderEarthBoss;
import net.tds.elementals.client.render.entity.RenderFireBoss;
import net.tds.elementals.client.render.entity.RenderWaterBoss;
import net.tds.elementals.client.render.item.CrystalItemRenderer;
import net.tds.elementals.entity.boss.EntityEarthBoss;
import net.tds.elementals.entity.boss.EntityFireBoss;
import net.tds.elementals.entity.boss.EntityWaterBoss;
import net.tds.elementals.entity.passive.EntityBabyEarthPet;
import net.tds.elementals.entity.passive.EntityBabyFirePet;
import net.tds.elementals.entity.passive.EntityBabyWaterPet;
import net.tds.elementals.handler.CapeHandler;
import net.tds.elementals.handler.IconEventHandler;
import net.tds.elementals.item.Items;


public class ClientProxy extends CommonProxy {

	public static void sendChatToPlayer(EntityPlayer player, String message) {
		
		if (player.worldObj.isRemote) {
			
			player.sendChatToPlayer(ChatMessageComponent.createFromText(message));
		}
	}
	
	public void registerRenders() {
		
		RenderingRegistry.registerEntityRenderingHandler(EntityBabyFirePet.class, new RenderBabyFirePet(new ModelBabyFirePet(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBabyEarthPet.class, new RenderBabyEarthPet(new ModelBabyEarthPet(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBabyWaterPet.class, new RenderBabyWaterPet(new ModelBabyWaterPet(), 0.8F));
		
		RenderingRegistry.registerEntityRenderingHandler(EntityFireBoss.class, new RenderFireBoss(new ModelFireBoss(), 0.7f));
		RenderingRegistry.registerEntityRenderingHandler(EntityWaterBoss.class, new RenderWaterBoss(new ModelWaterBoss(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityEarthBoss.class, new RenderEarthBoss(new ModelEarthBoss(), 0.6f));
		
		MinecraftForgeClient.registerItemRenderer(Items.spawnCrystal.itemID, new CrystalItemRenderer());

        MinecraftForge.EVENT_BUS.register(new IconEventHandler());
	}
	
	public void registerCapes() {
		
		String[] team = {"darkhax", "viper283", "HoopaWolf", "thisguy1045"};
		
		CapeHandler.registerCapesFromList(team, "http://i.imgur.com/sZ6wSBh.png");
	}
	
	@SideOnly(Side.CLIENT)
	public static void openNameGui(ItemStack stack) {
		
		Minecraft.getMinecraft().displayGuiScreen(new GuiPetName(stack));
	}
}