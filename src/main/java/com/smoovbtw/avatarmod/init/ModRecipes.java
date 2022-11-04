package com.smoovbtw.avatarmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
public static void init() {
	GameRegistry.addSmelting(ModItems.UNFIRED_TEAPOT, new ItemStack(ModItems.TEAPOT, 1),  1f);
	GameRegistry.addSmelting(ModItems.METEORITE_ROCK, new ItemStack(ModItems.METEORITE_INGOT, 4),  1f);
	}
}

