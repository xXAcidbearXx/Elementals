package net.tds.elementals.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.world.World;
import net.tds.elementals.Elementals;
import net.tds.elementals.data.PlayerPetProperties;
import net.tds.elementals.entity.passive.EntityMagicalPet;
import net.tds.elementals.enums.EnumElement;
import net.tds.elementals.lib.Format;

import java.lang.reflect.Constructor;
import java.util.List;
import java.util.UUID;

public class ItemPetResolver extends ItemModjamBase {
	
	public ItemPetResolver(int id) {
		
		super(id);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("resolver");
	}
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		
    	if(PlayerPetProperties.get(player).isPetOut()) {
    		
    		PlayerPetProperties.get(player).setPetOut(false);
    		
    		if(!world.isRemote) {
    			
    			player.sendChatToPlayer(ChatMessageComponent.createFromText(Format.DARK_YELLOW + "Your pet data has been reset."));
    		}
    		
    		System.out.println(player.username + "'s pet data has been reset");
    	}
    	
		return stack;	
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean smt) {
		list.add(Format.DARK_PURPPLE + "This item can be used to resolve issues");
		list.add(Format.DARK_PURPPLE + "with your player data. Only use this item");
		list.add(Format.DARK_PURPPLE + "if you know what you're doing or you have");
		list.add(Format.DARK_PURPPLE + "instructed to do so.");
	}
}