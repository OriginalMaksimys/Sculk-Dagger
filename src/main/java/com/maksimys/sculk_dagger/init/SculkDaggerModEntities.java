
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.maksimys.sculk_dagger.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import com.maksimys.sculk_dagger.entity.AncientHornProjectileEntity;
import com.maksimys.sculk_dagger.SculkDaggerMod;

public class SculkDaggerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, SculkDaggerMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<AncientHornProjectileEntity>> ANCIENT_HORN_PROJECTILE = register("ancient_horn_projectile",
			EntityType.Builder.<AncientHornProjectileEntity>of(AncientHornProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
