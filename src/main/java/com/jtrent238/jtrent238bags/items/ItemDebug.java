package com.jtrent238.jtrent238bags.items;

import com.jtrent238.jtrent238bags.inventory.InventoryBag;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDebug extends Item{

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player)
	{
		if (!world.isRemote)
		{
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++DEBUG+++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				System.out.println(player.inventoryContainer.inventorySlots.toString());
				System.out.println("Player DisplayName: " + player.getDisplayName().toString());
				//System.out.println("Player Bed Location: " + player.getBedLocation().posX + ", " + player.getBedLocation().posY  + ", " + player.getBedLocation().posZ);
				System.out.println("Player PersistentID: " + player.getPersistentID().toString());
				System.out.println("Player UniqueID: " + player.getUniqueID().toString());
				System.out.println("Minecraft Debug Information: " + Minecraft.getMinecraft().debug.toString());
				System.out.println("Amount of Entitys in World: " + Minecraft.getMinecraft().debugInfoEntities().toString());
				System.out.println("InfoRenders: " + Minecraft.getMinecraft().debugInfoRenders().toString());
				System.out.println("WorldProviderName: " + Minecraft.getMinecraft().getWorldProviderName().toString());
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
				
				
		}
		
		return itemstack;
	}
}
