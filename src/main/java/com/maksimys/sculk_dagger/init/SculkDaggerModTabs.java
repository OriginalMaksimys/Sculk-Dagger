
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.sculk_dagger.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.maksimys.sculk_dagger.SculkDaggerMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SculkDaggerModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SculkDaggerMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(SculkDaggerModItems.SCULK_DAGGER.get());
			tabData.accept(SculkDaggerModItems.ANCIENT_HORN.get());

		}
	}
}
