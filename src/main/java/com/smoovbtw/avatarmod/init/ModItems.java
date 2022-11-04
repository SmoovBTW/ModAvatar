package com.smoovbtw.avatarmod.init;

import java.util.ArrayList;
import java.util.List;

import com.smoovbtw.avatarmod.items.ItemBase;
import com.smoovbtw.avatarmod.items.armor.ArmorBase;
import com.smoovbtw.avatarmod.items.tools.ToolAxe;
import com.smoovbtw.avatarmod.items.tools.ToolHoe;
import com.smoovbtw.avatarmod.items.tools.ToolPickaxe;
import com.smoovbtw.avatarmod.items.tools.ToolSpade;
import com.smoovbtw.avatarmod.items.tools.ToolSword;
import com.smoovbtw.avatarmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_METEORITE = EnumHelper.addToolMaterial("material_meteorite", 3, 4196, 15.0F, 10.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_METEORITE = EnumHelper.addArmorMaterial("armor_material_meteorite", Reference.MOD_ID + ":meteorite", 25, 
			new int[] {4, 9, 11, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	
	//Items
	public static final Item TEAPOT = new ItemBase ("teapot");
	public static final Item CABBAGE = new ItemBase ("cabbage");
	public static final Item FIREBENDING_SCROLL = new ItemBase ("firebending_scroll");
	public static final Item GLASS_SHARD = new ItemBase ("glass_shard");
	public static final Item METEORITE_ROCK = new ItemBase ("meteorite_rock");
	public static final Item PORCELAIN_BALL = new ItemBase ("porcelain_ball");
	public static final Item UNFIRED_TEAPOT = new ItemBase ("unfired_teapot");
	public static final Item METEORITE_INGOT = new ItemBase ("meteorite_ingot");
	
	//Tools
	public static final ItemSword METEORITE_SWORD = new ToolSword("meteorite_sword", MATERIAL_METEORITE);
	public static final ItemSpade METEORITE_SHOVEL = new ToolSpade("meteorite_shovel", MATERIAL_METEORITE);
	public static final ItemPickaxe METEORITE_PICKAXE = new ToolPickaxe("meteorite_pickaxe", MATERIAL_METEORITE);
	public static final ItemAxe METEORITE_AXE = new ToolAxe("meteorite_axe", MATERIAL_METEORITE);
	public static final ItemHoe METEORITE_HOE = new ToolHoe("meteorite_hoe", MATERIAL_METEORITE);
	
	//Armor
	public static final Item METEORITE_HELMET = new ArmorBase("meteorite_helmet", ARMOR_MATERIAL_METEORITE, 1, EntityEquipmentSlot.HEAD);
	public static final Item Meteorite_CHESTPLATE = new ArmorBase("meteorite_chestplate", ARMOR_MATERIAL_METEORITE, 1, EntityEquipmentSlot.CHEST);
	public static final Item METEORITE_LEGGINGS = new ArmorBase("meteorite_leggings", ARMOR_MATERIAL_METEORITE, 2, EntityEquipmentSlot.LEGS);
	public static final Item METEORITE_BOOTS = new ArmorBase("meteorite_boots", ARMOR_MATERIAL_METEORITE, 1, EntityEquipmentSlot.FEET);
					
					
}
