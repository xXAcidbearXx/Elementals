package net.tds.elementals.proxy;

import net.minecraft.entity.player.EntityPlayer;
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
}
