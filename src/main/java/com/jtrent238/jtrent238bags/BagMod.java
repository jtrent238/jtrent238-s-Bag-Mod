package com.jtrent238.jtrent238bags;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.jtrent238.jtrent238bags.common.CommonProxy;
import com.jtrent238.jtrent238bags.inventory.InventoryBag;
import com.jtrent238.jtrent238bags.client.ClientProxy;
import com.jtrent238.jtrent238bags.ForgeSubscribe;
import com.jtrent238.jtrent238bags.bags.ItemBag;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.command.ICommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;

@Mod(modid = BagMod.MODID, name = BagMod.MODNAME, version = BagMod.MODVERSION)
public final class BagMod
{
	
	public static final String MODID = "jtrent238bags";

	@Instance(MODID)
    public static BagMod instance;
	public static final String MODVERSION = "1.0.0.1";
	public static final String MODNAME = "jtrent238's Bag Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";
	
	@SidedProxy(clientSide="com.jtrent238.jtrent238bags.client.ClientProxy", serverSide="com.jtrent238.jtrent238bags.common.CommonProxy")
	public static CommonProxy proxy;

	/** This is used to keep track of GUIs that we make*/
	private static int modGuiIndex = 0;

	/** Set our custom inventory Gui index to the next available Gui index */
	public static final int GUI_ITEM_INV = modGuiIndex++;

	// ITEMS ETC.
	public static Item ItemBag;

	public static CreativeTabs BagTab = new CreativeTabs("BagTab")

	{
		public Item getTabIconItem() {

			return new ItemStack(ItemLoader.ItemBag).getItem();
		}
		
		public boolean hasSearchBar(){
			return false;
		}
		/*
		@SideOnly(Side.CLIENT)
		public String getBackgroundImageName() 
		{
			return "EpicProportionsMod_Halloween.png";
		}
		
		@SideOnly(Side.CLIENT)
		public boolean drawInForegroundOfTab() 
		{
			return false;
		}
		*/
		
		};

	private List List;

	private Collection Colection;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModRegistry.registerMods();
		ItemLoader.LoadItems();
		//BlockLoader.loadBlocks();
		Recipes.registerRecpies();
		//EntityLoader.LoadEntitys();
		OreDict.addores();
		//Achievements.loadAchievements();
		//Stats.RegisterStats();
		//ChestGen.registerItems();
	}

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		// no renderers or entities to register, but whatever
		proxy.registerRenderers();
		// register CommonProxy as our GuiHandler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new CommonProxy());
	
		Recipes.registerRecpies();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		Recipes.registerRecpies();
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
	     MinecraftServer server = MinecraftServer.getServer();
	     // Get's the current server instance
	     
	     ICommandManager command = server.getCommandManager();
	     //ServerCommandManager manager = (ServerCommandManager) command;
	     
	     //manager.registerCommand(new CommandModInfo());
	     //manager.registerCommand(new CommandChangelog());
	}

						
}