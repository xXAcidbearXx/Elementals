package net.tds.elementals.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.tds.elementals.lib.Config;
import net.tds.elementals.lib.Reference;

public class CommonProxy {

	public void sendChatToPlayer(EntityPlayer Player, String message) {
		
		if (Config.playerMessage) {
			
			Reference.logger.info(message);
		}
	}
	
	public void registerRenders() {
		
	}
	
	public void registerCapes() {
		
	}

	public void openGui(int id, Object... objects) {
		
	}
}
