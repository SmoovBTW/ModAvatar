package com.smoovbtw.avatarmod.items.tools;

import com.smoovbtw.avatarmod.Main;
import com.smoovbtw.avatarmod.init.ModItems;
import com.smoovbtw.avatarmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel

{
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName (name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 

	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
