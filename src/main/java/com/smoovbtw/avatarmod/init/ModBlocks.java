package com.smoovbtw.avatarmod.init;

import java.util.ArrayList;
import java.util.List;

import com.smoovbtw.avatarmod.blocks.BlockBase;
import com.smoovbtw.avatarmod.blocks.advancedproperties.MeteoriteBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks 
{
public static final List<Block> BLOCKS = new ArrayList<Block>();

public static final Block METEORITE_BLOCK = new MeteoriteBlock("meteorite_block", Material.IRON);
	
	
}
