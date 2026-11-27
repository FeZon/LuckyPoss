package com.luckyposs;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {

		public class ModItemIds {
			public static ResourceKey<Item> create(String lp) {
				return ResourceKey.create(Registries.ITEM, ExampleMod.id(lp));
				// lp - lucky potion
			}
		}





	}
}