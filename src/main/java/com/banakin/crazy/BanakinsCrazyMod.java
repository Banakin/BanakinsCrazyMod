package com.banakin.crazy;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BanakinsCrazyMod implements ModInitializer {
	// Add banana
	public static final Item BANANA_ITEM = new Item(
		new Item.Settings()
		.group(ItemGroup.FOOD)
		.food(new FoodComponent.Builder().hunger(4).saturationModifier(3).build())
	);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		// Init items
		Registry.register(Registry.ITEM, new Identifier("banakinscrazymod", "banana"), BANANA_ITEM);

		System.out.println("Hello Fabric world!");
	}
}
