package net.themativious.smurfcatmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.themativious.smurfcatmod.block.ModBlocks;
import net.themativious.smurfcatmod.entity.EntityReg;
import net.themativious.smurfcatmod.entity.entities.SmurfCatEntity;
import net.themativious.smurfcatmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class SmurfcatMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "smurfcatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModiItems();
		ModBlocks.registerModBlocks();
		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(EntityReg.SMURF_CAT_ENTITY, SmurfCatEntity.setAttributes());
	}
}
