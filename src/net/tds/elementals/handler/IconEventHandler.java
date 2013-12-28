package net.tds.elementals.handler;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.tds.elementals.enums.EnumElement;
import net.tds.elementals.item.ItemSpawningCrystal;

public class IconEventHandler {

    private String[] element_types = new String[] {"fire", "water", "earth", "air", "light", "undead", "empty"};
    public static Icon[] crystalIcons = new Icon[8]; // limit to 8 so we don't use too much memory

    @ForgeSubscribe
    public void textureStitch(TextureStitchEvent.Pre evt) {

        if(evt.map.textureType == 0) {

            // Blocks
        }
        if(evt.map.textureType == 1) {

            // Items
            for(int i = 0; i < element_types.length; i++) {

                crystalIcons[i] = evt.map.registerIcon("elementals:crystal_" + element_types[i]);
            }
        }
    }

    public static Icon getCrystalIconFromItem(ItemStack stack) {

        if(stack.getItem() instanceof ItemSpawningCrystal) {

            ItemSpawningCrystal crystal = (ItemSpawningCrystal)stack.getItem();
            EnumElement element = EnumElement.getType(crystal.getType(stack));

            if (element != null) {
            	
            	switch(element) {

                case FIRE: {

                    return crystalIcons[0];
                }

                case WATER: {

                    return crystalIcons[1];
                }

                case EARTH: {

                    return crystalIcons[2];
                }

                case AIR: {

                    return crystalIcons[3];
                }

                case LIGHT: {

                    return crystalIcons[4];
                }

                case UNDEAD: {

                    return crystalIcons[5];
                }

                default: {

                    return crystalIcons[6];
                }
            }
          }     
        }
        return crystalIcons[6];
    }
}
