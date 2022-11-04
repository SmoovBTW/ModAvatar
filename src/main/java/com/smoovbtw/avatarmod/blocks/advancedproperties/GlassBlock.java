package com.smoovbtw.avatarmod.blocks.advancedproperties;

import java.util.Random;

import com.smoovbtw.avatarmod.blocks.BlockBase;
import com.smoovbtw.avatarmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GlassBlock extends BlockBase
{

    public GlassBlock(String name, Material material)

    {
        super(name, material);
    }
    {
    ItemStack GlassBlock = new ItemStack(Blocks.GLASS);
    }
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) 
    {
        return ModItems.GLASS_SHARD;
    }
}