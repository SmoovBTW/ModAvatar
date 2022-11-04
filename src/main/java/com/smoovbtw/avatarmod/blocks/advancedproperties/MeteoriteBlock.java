package com.smoovbtw.avatarmod.blocks.advancedproperties;

import java.util.Random;

import com.smoovbtw.avatarmod.blocks.BlockBase;
import com.smoovbtw.avatarmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class MeteoriteBlock extends BlockBase
{

	public MeteoriteBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(50F);
		setResistance(6000F);
		setHarvestLevel("pickaxe", 3);
		//setLightLevel(0);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.METEORITE_ROCK;
	}

}
