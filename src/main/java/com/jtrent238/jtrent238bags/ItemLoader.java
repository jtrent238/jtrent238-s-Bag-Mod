package com.jtrent238.jtrent238bags;

import com.jtrent238.jtrent238bags.bags.ItemBag;
import com.jtrent238.jtrent238bags.items.ItemDebug;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemLoader {

	public static Item ItemBag;
	public static Item ItemDebug;

	
	public static void LoadItems() {

		ItemBag  = new ItemBag(0, 0, ItemBag, null, null, null).setUnlocalizedName("ItemBag").setTextureName(BagMod.MODID + ":" + "ItemBag").setCreativeTab(BagMod.BagTab);
		ItemDebug  = new ItemDebug().setUnlocalizedName("ItemDebug").setTextureName(BagMod.MODID + ":" + "ItemDebug");
		
		registerItems();
	}

	private static void registerItems() {

		GameRegistry.registerItem(ItemBag, ItemBag.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ItemDebug, ItemDebug.getUnlocalizedName().substring(5));
		
		
	}

	

	

	
}
