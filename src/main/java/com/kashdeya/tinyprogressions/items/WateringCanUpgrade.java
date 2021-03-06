package com.kashdeya.tinyprogressions.items;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFarmland;
import net.minecraft.block.IGrowable;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

import com.kashdeya.tinyprogressions.handlers.CanHandler;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

public class WateringCanUpgrade extends WateringCanBase {
	
	public WateringCanUpgrade(){
		super();
		this.setUnlocalizedName("WateringCanUpgrade");
		this.setWateringRange(2);
		this.setWateringChance(75);
	}

	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() instanceof WateringCanUpgrade) {
            tooltip.add("A better way to water things!");
            tooltip.add("Waters a 5x5 area!");
            tooltip.add("");
        }
    }
}