package com.smoovbtw.avatarmod.items.armor;

import com.smoovbtw.avatarmod.Main;
import com.smoovbtw.avatarmod.init.ModItems;
import com.smoovbtw.avatarmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements IHasModel
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName (name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void registerModels() 

	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
