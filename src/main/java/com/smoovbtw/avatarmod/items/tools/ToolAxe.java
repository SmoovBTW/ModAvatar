package com.smoovbtw.avatarmod.items.tools;

import com.smoovbtw.avatarmod.Main;
import com.smoovbtw.avatarmod.init.ModItems;
import com.smoovbtw.avatarmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material)
	{
		super(material, 15.0F, -3.2F);
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

