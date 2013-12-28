package net.tds.elementals.entity.passive;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityBabyFirePet extends EntityMagicalPet {
	
	public EntityBabyFirePet(World world) {

		super(world);
		this.setSize(1.0f, 1.0f);
		this.noClip = false;
		this.healthModifier = 1;
		this.damageModifier = (int) 1.5;
	}
	
	protected void applyEntityAttributes() {
		
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10 + (getPetLevel() * this.healthModifier));
	}
	
    public boolean attackEntityAsMob(Entity entity) {
    	
    	if (this.getPetLevel() >= 5) {
    		
    		entity.setFire(getPetLevel()/5);
    	}
    	
    	return entity.attackEntityFrom(DamageSource.causeMobDamage(this), 2.0F + (getPetLevel() * this.damageModifier));
    }
}