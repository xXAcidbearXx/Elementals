package net.tds.elementals.packet;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.tds.elementals.item.ItemSpawningCrystal;
import cpw.mods.fml.common.network.Player;

public class PacketUpdatePetName extends PacketElementals {

	public PacketUpdatePetName(byte[] data) {
		
		super(data);
	}

	@Override
	public void execute(INetworkManager manager, Player player) {
		
		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));
		
		String name = null;
		try {
			
			name = dis.readUTF();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		EntityPlayer entPlayer = (EntityPlayer)player;
		ItemStack petItem = entPlayer.getCurrentEquippedItem();
		
		if(petItem != null && petItem.getItem() != null && petItem.getItem() instanceof ItemSpawningCrystal && (name != null || name != "")) {
			
			ItemSpawningCrystal crystal = (ItemSpawningCrystal)petItem.getItem();
			crystal.setName(petItem, name);
		}
	}
}
