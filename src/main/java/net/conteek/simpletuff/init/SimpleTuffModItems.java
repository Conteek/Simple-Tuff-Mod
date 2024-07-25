
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conteek.simpletuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.conteek.simpletuff.SimpleTuffMod;

public class SimpleTuffModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SimpleTuffMod.MODID);
	public static final RegistryObject<Item> POLISHEDTUFF = block(SimpleTuffModBlocks.POLISHEDTUFF);
	public static final RegistryObject<Item> CHISELEDTUFF = block(SimpleTuffModBlocks.CHISELEDTUFF);
	public static final RegistryObject<Item> TUFFSTAIRS = block(SimpleTuffModBlocks.TUFFSTAIRS);
	public static final RegistryObject<Item> TUFFSLAB = block(SimpleTuffModBlocks.TUFFSLAB);
	public static final RegistryObject<Item> POLISHEDTUFFSLAB = block(SimpleTuffModBlocks.POLISHEDTUFFSLAB);
	public static final RegistryObject<Item> POLISHEDTUFFSTAIRS = block(SimpleTuffModBlocks.POLISHEDTUFFSTAIRS);
	public static final RegistryObject<Item> TUFFBRICK = block(SimpleTuffModBlocks.TUFFBRICK);
	public static final RegistryObject<Item> TUFFBRICKSTAIRS = block(SimpleTuffModBlocks.TUFFBRICKSTAIRS);
	public static final RegistryObject<Item> TUFFBRICKSLAB = block(SimpleTuffModBlocks.TUFFBRICKSLAB);
	public static final RegistryObject<Item> CHISELEDTUFFBRICK = block(SimpleTuffModBlocks.CHISELEDTUFFBRICK);
	public static final RegistryObject<Item> TUFFWALL = block(SimpleTuffModBlocks.TUFFWALL);
	public static final RegistryObject<Item> POLISHEDTUFFWALL = block(SimpleTuffModBlocks.POLISHEDTUFFWALL);
	public static final RegistryObject<Item> TUFFBRICKWALL = block(SimpleTuffModBlocks.TUFFBRICKWALL);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
