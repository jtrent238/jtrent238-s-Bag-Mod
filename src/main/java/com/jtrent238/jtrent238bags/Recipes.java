package com.jtrent238.jtrent238bags;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	
	/**
	 * Register Recipes with Game Registry.
	 */
	public static void registerRecpies(){
		addShaplessRecpies();
		addShapedRecpies();
		addsmeltigrecipies();
	}

	/**
	 * Add Shaped Recipes.
	 */
	private static void addShapedRecpies(){
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 0), "SXS", "XBX", "XXX", 'X', Items.leather, 'S', Items.string);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 1), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 1), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 2), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 2), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 3), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 4), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 4), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 5), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 5), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 6), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 6), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 9), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 7), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 10), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 8), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 11), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 9), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 12), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 10), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 13), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 11), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 14), 'B', ItemLoader.ItemBag);
		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 12), "XXX", "XBX", "XXX", 'X', new ItemStack(Items.dye, 1, 15), 'B', ItemLoader.ItemBag);

		if(ModRegistry.isjtrent238youtubersLoaded == true){
			GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 16), "XXX", "XBX", "XXX", 'X', new ItemStack(com.jtrent238.youtubers.ItemLoader.Itemjtrent238Ingot), 'B', ItemLoader.ItemBag);
			GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 15), "XXX", "XBX", "XXX", 'X', new ItemStack(com.jtrent238.youtubers.ItemLoader.Item_MrGregor_Ingot), 'B', ItemLoader.ItemBag);
			GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.ItemBag, 1, 14), "XXX", "XBX", "XXX", 'X', new ItemStack(com.jtrent238.youtubers.ItemLoader.ItemxJSQIngot), 'B', ItemLoader.ItemBag);
			}
	}
	
	/**
	 * Add Shapeless Recipes.
	 */
	private static void addShaplessRecpies(){
		
		}
	/**
	 * Add Smelting Recipes
	 */
	private static void addsmeltigrecipies(){
		
		}
	
	}

	
	
	
