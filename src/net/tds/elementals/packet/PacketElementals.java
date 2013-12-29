package net.tds.elementals.packet;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.Player;

public abstract class PacketElementals extends Packet250CustomPayload {

	public PacketElementals(byte[] data) {
		
		super("ELEMENTALS", data);
	}
	
	public abstract void execute(INetworkManager manager, Player player);
}
