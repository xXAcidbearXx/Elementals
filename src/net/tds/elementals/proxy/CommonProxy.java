package net.tds.elementals.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.tds.elementals.lib.Config;
import net.tds.elementals.lib.Reference;

public class CommonProxy {

	public static void sendChatToPlayer(EntityPlayer Player, String message) {
		
		if (Config.playerMessage) {
			
			Reference.logger.info(message);
		}
	}
	
	public void registerRenders() {
		
	}
	
	public void registerCapes() {
		
	}
	
	public static void openNameGui(ItemStack stack) {
		
	}
}
