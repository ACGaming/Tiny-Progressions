package com.kashdeya.tinyprogressions.inits;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.tinyprogressions.blocks.BlazeCobblegen;
import com.kashdeya.tinyprogressions.blocks.BlockGrowth;
import com.kashdeya.tinyprogressions.blocks.BlockGrowthUpgrade;
import com.kashdeya.tinyprogressions.blocks.CharcoalBlock;
import com.kashdeya.tinyprogressions.blocks.Cobblegen;
import com.kashdeya.tinyprogressions.blocks.DiamondCobblegen;
import com.kashdeya.tinyprogressions.blocks.EmeraldCobblegen;
import com.kashdeya.tinyprogressions.blocks.FleshBlock;
import com.kashdeya.tinyprogressions.blocks.IronCobblegen;
import com.kashdeya.tinyprogressions.blocks.ReinforcedGlass;
import com.kashdeya.tinyprogressions.blocks.ReinforcedObsidian;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.Reference;

public class TechBlocks {
	
	// Tech Blocks
	public static Block growth_block;
	public static Block growth_upgrade;
	public static Block cobblegen_block;
	public static Block iron_cobblegen_block;
	public static Block diamond_cobblegen_block;
	public static Block emerald_cobblegen_block;
	public static Block blaze_cobblegen_block;
	// Deco Blocks
	public static Block CharcoalBlock;
	public static Block FleshBlock;
	public static Block ReinforcedGlass;
	public static Block ReinforcedObsidian;
	
	public static void init(){
		
		// Tech Blocks
		if (ConfigHandler.BlockGrowth){
		growth_block = new BlockGrowth();
		registerBlock(growth_block, "growth_block", true);
		}
		if (ConfigHandler.BlockGrowthUpgrade){
		growth_upgrade = new BlockGrowthUpgrade();
		registerBlock(growth_upgrade, "growth_upgrade", true);
		}
		if (ConfigHandler.Cobblegen){
		cobblegen_block = new Cobblegen();
		registerBlock(cobblegen_block, "cobblegen_block", true);
		}
		if (ConfigHandler.IronCobblegen){
		iron_cobblegen_block = new IronCobblegen();
		registerBlock(iron_cobblegen_block, "iron_cobblegen_block", true);
		}
		if (ConfigHandler.DiamondCobblegen){
		diamond_cobblegen_block = new DiamondCobblegen();
		registerBlock(diamond_cobblegen_block, "diamond_cobblegen_block", true);
		}
		if (ConfigHandler.BlazeCobblegen){
		emerald_cobblegen_block = new EmeraldCobblegen();
		registerBlock(emerald_cobblegen_block, "emerald_cobblegen_block", true);
		}
		if (ConfigHandler.EmeraldCobblegen){
		blaze_cobblegen_block = new BlazeCobblegen();
		registerBlock(blaze_cobblegen_block, "blaze_cobblegen_block", true);
		}
		
		// Deco Blocks
		if (ConfigHandler.CharcoalBlock){
		CharcoalBlock = new CharcoalBlock();
		registerBlock(CharcoalBlock, "CharcoalBlock", true);
		}
		if (ConfigHandler.FleshBlock){
			FleshBlock = new FleshBlock();
			registerBlock(FleshBlock, "FleshBlock", true);
		}
		if (ConfigHandler.ReinforcedGlass){
			ReinforcedGlass = new ReinforcedGlass();
			registerBlock(ReinforcedGlass, "ReinforcedGlass", true);
		}
		if (ConfigHandler.ReinforcedObsidian){
			ReinforcedObsidian = new ReinforcedObsidian();
			registerBlock(ReinforcedObsidian, "ReinforcedObsidian", true);
		}
		
	}
	
	public static void registerBlock(Block block, String name, boolean itemblock){
		GameRegistry.register(block, new ResourceLocation(Reference.MOD_ID + ":" + name));
		if (itemblock){
			GameRegistry.register(new ItemBlock(block), new ResourceLocation(Reference.MOD_ID + ":" + name));
		}
	}

}
