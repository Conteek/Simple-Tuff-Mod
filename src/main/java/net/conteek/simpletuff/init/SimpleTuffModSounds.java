
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.conteek.simpletuff.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.conteek.simpletuff.SimpleTuffMod;

public class SimpleTuffModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SimpleTuffMod.MODID);
	public static final RegistryObject<SoundEvent> TUFF_BREAK = REGISTRY.register("tuff_break", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("simple_tuff", "tuff_break")));
	public static final RegistryObject<SoundEvent> TUFF_PLACE = REGISTRY.register("tuff_place", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("simple_tuff", "tuff_place")));
	public static final RegistryObject<SoundEvent> TUFF_STEP = REGISTRY.register("tuff_step", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("simple_tuff", "tuff_step")));
}
