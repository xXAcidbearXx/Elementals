package net.tds.elementals.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.tds.elementals.Elementals;
import net.tds.elementals.entity.passive.EntityMagicalPet;
import net.tds.elementals.lib.Format;
import net.tds.elementals.proxy.ClientProxy;

public class MobHurtEvent {

	@ForgeSubscribe
	public void onMobHurt(LivingHurtEvent event) {

		if (event.entity instanceof EntityMagicalPet) {
			

			EntityMagicalPet pet = (EntityMagicalPet) event.entity;
			

			if (event.source.getEntity() instanceof EntityPlayer) {
				
				EntityPlayer player = (EntityPlayer)event.source.getEntity();
				
				System.out.println(pet.getPetOwner());
				if (pet.getPetOwner().equalsIgnoreCase(player.username)) {

					event.ammount = 0.0f;
				}
			}
		}
	}
}
