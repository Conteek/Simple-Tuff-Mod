
package net.conteek.simpletuff.block;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class TuffslabBlock extends SlabBlock {
	public TuffslabBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.TERRACOTTA_GRAY)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_tuff:tuff_break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_tuff:tuff_step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_tuff:tuff_place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_tuff:tuff_step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("simple_tuff:tuff_step"))))
				.strength(2f, 30f).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}
}
