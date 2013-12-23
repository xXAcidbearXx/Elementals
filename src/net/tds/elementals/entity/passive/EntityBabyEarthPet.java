package net.tds.elementals.entity.passive;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBabyEarthPet extends EntityMagicalPet {

	public EntityBabyEarthPet(World world) {
		
		super(world);
		this.setSize(1.0F, 0.5F);
		this.noClip = false;
		this.healthModifier = (int) 1.5;
		this.damageModifier = (int) 1;
		this.SpeedModifier = (int) 0.001;
	}
	
	protected void applyEntityAttributes() {
		
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10 + (getPetLevel() * this.healthModifier));
	}
	
    public boolean attackEntityAsMob(Entity entity) {
    	
    	if (this.getPetLevel() >= 5) {
    		
    		double rand = Math.random();
    		
    		if(entity instanceof EntityLiving) {
    			
    			EntityLiving living = (EntityLiving) entity;
    			
        		if(rand < 0.25D) {
        			
        			living.addPotionEffect(new PotionEffect(Potion.weakness.id, getPetLevel() * 20, 1));
        		}
    		}
    	}
    	
    	return entity.attackEntityFrom(DamageSource.causeMobDamage(this), 2.0F + (getPetLevel() * this.damageModifier));
    }
}