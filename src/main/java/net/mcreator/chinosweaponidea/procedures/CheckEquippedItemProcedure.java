package net.mcreator.chinosweaponidea.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.chinosweaponidea.init.ChKnklModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class CheckEquippedItemProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double totalSpeed = 0;
		double armorToughness = 0;
		totalSpeed = 0.1;
		armorToughness = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(ResourceLocation.parse("chinomod:knuckles")))
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			totalSpeed = totalSpeed + 0.005;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ChKnklModItems.LEATHER_SLIDES_BOOTS.get()) {
			totalSpeed = totalSpeed + 0.02;
			armorToughness = armorToughness - 1;
		}
		if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
			_livingEntity7.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(totalSpeed);
		if (entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ARMOR))
			_livingEntity8.getAttribute(Attributes.ARMOR).setBaseValue(armorToughness);
	}
}
