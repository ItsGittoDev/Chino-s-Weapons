
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chinosweaponidea.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.chinosweaponidea.ChKnklMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ChKnklModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ChKnklMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ChKnklModItems.IRON_KNUCKLES.get());
			tabData.accept(ChKnklModItems.GOLDEN_KNUCKLES.get());
			tabData.accept(ChKnklModItems.DIAMOND_KNUCKLES.get());
			tabData.accept(ChKnklModItems.LEATHER_SLIDES_BOOTS.get());
			tabData.accept(ChKnklModItems.NETHERITE_KNUCKLES.get());
			tabData.accept(ChKnklModItems.COPPER_KNUCKLES.get());
		}
	}
}
