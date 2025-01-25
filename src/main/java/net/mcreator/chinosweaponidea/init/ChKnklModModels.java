
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.chinosweaponidea.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.chinosweaponidea.client.model.Modelslides3;
import net.mcreator.chinosweaponidea.client.model.Modelslides2R;
import net.mcreator.chinosweaponidea.client.model.Modelslides2L;
import net.mcreator.chinosweaponidea.client.model.Modelslides2;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ChKnklModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelslides3.LAYER_LOCATION, Modelslides3::createBodyLayer);
		event.registerLayerDefinition(Modelslides2.LAYER_LOCATION, Modelslides2::createBodyLayer);
		event.registerLayerDefinition(Modelslides2L.LAYER_LOCATION, Modelslides2L::createBodyLayer);
		event.registerLayerDefinition(Modelslides2R.LAYER_LOCATION, Modelslides2R::createBodyLayer);
	}
}
