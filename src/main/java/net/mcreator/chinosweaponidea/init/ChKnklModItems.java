
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chinosweaponidea.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.chinosweaponidea.item.NetheriteKnucklesItem;
import net.mcreator.chinosweaponidea.item.LeatherSlidesItem;
import net.mcreator.chinosweaponidea.item.IronKnucklesItem;
import net.mcreator.chinosweaponidea.item.GoldenKnucklesItem;
import net.mcreator.chinosweaponidea.item.DiamondKnucklesItem;
import net.mcreator.chinosweaponidea.item.CopperKnucklesItem;
import net.mcreator.chinosweaponidea.ChKnklMod;

public class ChKnklModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(ChKnklMod.MODID);
	public static final DeferredItem<Item> IRON_KNUCKLES = REGISTRY.register("iron_knuckles", IronKnucklesItem::new);
	public static final DeferredItem<Item> GOLDEN_KNUCKLES = REGISTRY.register("golden_knuckles", GoldenKnucklesItem::new);
	public static final DeferredItem<Item> DIAMOND_KNUCKLES = REGISTRY.register("diamond_knuckles", DiamondKnucklesItem::new);
	public static final DeferredItem<Item> LEATHER_SLIDES_BOOTS = REGISTRY.register("leather_slides_boots", LeatherSlidesItem.Boots::new);
	public static final DeferredItem<Item> NETHERITE_KNUCKLES = REGISTRY.register("netherite_knuckles", NetheriteKnucklesItem::new);
	public static final DeferredItem<Item> COPPER_KNUCKLES = REGISTRY.register("copper_knuckles", CopperKnucklesItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
