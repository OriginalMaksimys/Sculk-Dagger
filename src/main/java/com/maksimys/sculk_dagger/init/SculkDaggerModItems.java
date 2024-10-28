
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.sculk_dagger.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import com.maksimys.sculk_dagger.item.SculkDaggerItem;
import com.maksimys.sculk_dagger.item.SculkArrowItem;
import com.maksimys.sculk_dagger.item.AncientHornItem;
import com.maksimys.sculk_dagger.SculkDaggerMod;

public class SculkDaggerModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SculkDaggerMod.MODID);
	public static final DeferredItem<Item> SCULK_DAGGER = REGISTRY.register("sculk_dagger", SculkDaggerItem::new);
	public static final DeferredItem<Item> SCULK_ARROW = REGISTRY.register("sculk_arrow", SculkArrowItem::new);
	public static final DeferredItem<Item> ANCIENT_HORN = REGISTRY.register("ancient_horn", AncientHornItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
