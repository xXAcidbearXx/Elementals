package net.tds.elementals.packet;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.network.INetworkManager;
import net.minecraft.server.MinecraftServer;
import net.tds.elementals.item.ItemSpawningCrystal;
import cpw.mods.fml.common.network.Player;

public class PacketUpdatePetName extends PacketElementals {

	public PacketUpdatePetName(byte[] data) {

		super(data);
	}

	@Override
	public void execute(INetworkManager manager, Player player) {

		DataInputStream dis = new DataInputStream(new ByteArrayInputStream(data));

		String name;
		String username;
		int dimID;
		try {

			name = dis.readUTF();
			username = dis.readUTF();
			dimID = dis.readInt();

			EntityPlayer entPlayer = MinecraftServer.getServer().worldServers[dimID].getPlayerEntityByName(username);
			ItemStack petItem = entPlayer.getCurrentEquippedItem();

			if(petItem != null && petItem.getItem() != null && petItem.getItem() instanceof ItemSpawningCrystal && (name != null || name != "")) {

				ItemSpawningCrystal crystal = (ItemSpawningCrystal)petItem.getItem();
				crystal.setName(petItem, name);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
