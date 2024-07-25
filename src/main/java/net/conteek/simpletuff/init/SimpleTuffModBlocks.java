
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conteek.simpletuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.conteek.simpletuff.block.TuffwallBlock;
import net.conteek.simpletuff.block.TuffstairsBlock;
import net.conteek.simpletuff.block.TuffslabBlock;
import net.conteek.simpletuff.block.TuffbrickwallBlock;
import net.conteek.simpletuff.block.TuffbrickstairsBlock;
import net.conteek.simpletuff.block.TuffbrickslabBlock;
import net.conteek.simpletuff.block.TuffbrickBlock;
import net.conteek.simpletuff.block.PolishedtuffwallBlock;
import net.conteek.simpletuff.block.PolishedtuffstairsBlock;
import net.conteek.simpletuff.block.PolishedtuffslabBlock;
import net.conteek.simpletuff.block.PolishedtuffBlock;
import net.conteek.simpletuff.block.ChiseledtuffbrickBlock;
import net.conteek.simpletuff.block.ChiseledtuffBlock;
import net.conteek.simpletuff.SimpleTuffMod;

public class SimpleTuffModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SimpleTuffMod.MODID);
	public static final RegistryObject<Block> POLISHEDTUFF = REGISTRY.register("polishedtuff", () -> new PolishedtuffBlock());
	public static final RegistryObject<Block> CHISELEDTUFF = REGISTRY.register("chiseledtuff", () -> new ChiseledtuffBlock());
	public static final RegistryObject<Block> TUFFSTAIRS = REGISTRY.register("tuffstairs", () -> new TuffstairsBlock());
	public static final RegistryObject<Block> TUFFSLAB = REGISTRY.register("tuffslab", () -> new TuffslabBlock());
	public static final RegistryObject<Block> POLISHEDTUFFSLAB = REGISTRY.register("polishedtuffslab", () -> new PolishedtuffslabBlock());
	public static final RegistryObject<Block> POLISHEDTUFFSTAIRS = REGISTRY.register("polishedtuffstairs", () -> new PolishedtuffstairsBlock());
	public static final RegistryObject<Block> TUFFBRICK = REGISTRY.register("tuffbrick", () -> new TuffbrickBlock());
	public static final RegistryObject<Block> TUFFBRICKSTAIRS = REGISTRY.register("tuffbrickstairs", () -> new TuffbrickstairsBlock());
	public static final RegistryObject<Block> TUFFBRICKSLAB = REGISTRY.register("tuffbrickslab", () -> new TuffbrickslabBlock());
	public static final RegistryObject<Block> CHISELEDTUFFBRICK = REGISTRY.register("chiseledtuffbrick", () -> new ChiseledtuffbrickBlock());
	public static final RegistryObject<Block> TUFFWALL = REGISTRY.register("tuffwall", () -> new TuffwallBlock());
	public static final RegistryObject<Block> POLISHEDTUFFWALL = REGISTRY.register("polishedtuffwall", () -> new PolishedtuffwallBlock());
	public static final RegistryObject<Block> TUFFBRICKWALL = REGISTRY.register("tuffbrickwall", () -> new TuffbrickwallBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
