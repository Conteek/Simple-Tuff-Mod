
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conteek.simpletuff.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.conteek.simpletuff.SimpleTuffMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimpleTuffModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimpleTuffMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SimpleTuffModBlocks.CHISELEDTUFF.get().asItem());
			tabData.accept(SimpleTuffModBlocks.POLISHEDTUFF.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFSTAIRS.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFSLAB.get().asItem());
			tabData.accept(SimpleTuffModBlocks.POLISHEDTUFFSLAB.get().asItem());
			tabData.accept(SimpleTuffModBlocks.POLISHEDTUFFSTAIRS.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFBRICK.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFBRICKSTAIRS.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFBRICKSLAB.get().asItem());
			tabData.accept(SimpleTuffModBlocks.CHISELEDTUFFBRICK.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFWALL.get().asItem());
			tabData.accept(SimpleTuffModBlocks.POLISHEDTUFFWALL.get().asItem());
			tabData.accept(SimpleTuffModBlocks.TUFFBRICKWALL.get().asItem());
		}
	}
}
