package net.tds.elementals.event;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.tds.elementals.entity.boss.EntityEarthBoss;
import net.tds.elementals.entity.boss.EntityFireBoss;
import net.tds.elementals.entity.boss.EntityMagicalBoss;
import net.tds.elementals.entity.boss.EntityWaterBoss;
import net.tds.elementals.item.Items;

public class ItemDropEvent {
	
	@ForgeSubscribe()
	public void dropItems(LivingDropsEvent event){
		
		if (event.entity instanceof EntityMagicalBoss) {
			
			EntityMagicalBoss boss = (EntityMagicalBoss) event.entity;
			
			ItemStack stack = new ItemStack(Items.spawnCrystal);
			
			if (boss instanceof EntityWaterBoss) {
				
				stack.setTagCompound(new NBTTagCompound());
				stack.stackTagCompound.setString("Name", "Land Shark");
				stack.stackTagCompound.setString("Type", "Water");
				stack.stackTagCompound.setInteger("Level", 1);
				stack.stackTagCompound.setInteger("Experience", 0);
			}
			
			if (boss instanceof EntityFireBoss) {
				
				stack.setTagCompound(new NBTTagCompound());
				stack.stackTagCompound.setString("Name", "Fire Elemental");
				stack.stackTagCompound.setString("Type", "Fire");
				stack.stackTagCompound.setInteger("Level", 1);
				stack.stackTagCompound.setInteger("Experience", 0);
			}
			
			if (boss instanceof EntityEarthBoss) {
				
				stack.setTagCompound(new NBTTagCompound());
				stack.stackTagCompound.setString("Name", "Earth Turtle");
				stack.stackTagCompound.setString("Type", "Earth");
				stack.stackTagCompound.setInteger("Level", 1);
				stack.stackTagCompound.setInteger("Experience", 0);
			}
			
			EntityItem item = new EntityItem(boss.worldObj, boss.posX, boss.posY, boss.posZ, stack);
			
			event.drops.add(item);
			boss.dropItem(Item.emerald.itemID, 5);
		}
	}
}
