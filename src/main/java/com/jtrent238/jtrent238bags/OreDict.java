package com.jtrent238.jtrent238bags;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import com.jtrent238.jtrent238bags.bags.ItemBag;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.oredict.OreDictionary;

public class OreDict {

	public static void addores() {

		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[0].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 0));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[1].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 1));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[2].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 2));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[3].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 3));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[4].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 4));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[5].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 5));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[6].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 6));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[7].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 7));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[8].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 8));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[9].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 9));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[10].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 10));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[11].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 11));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[12].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 12));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[13].toUpperCase(), new ItemStack(ItemLoader.ItemBag));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[14].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 14));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[15].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 15));
		OreDictionary.registerOre("bag" + ItemBag.field_150923_a[16].toUpperCase(), new ItemStack(ItemLoader.ItemBag, 16));
		//OreDictionary.registerOre("bag" + ItemBag.field_150923_a[17],     ItemLoader.ItemBag.getItemById(17));

	}

}
