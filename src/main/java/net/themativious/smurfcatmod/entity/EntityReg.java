package net.themativious.smurfcatmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.themativious.smurfcatmod.SmurfcatMod;
import net.themativious.smurfcatmod.entity.entities.SmurfCatEntity;

public class EntityReg {
    public static final EntityType<SmurfCatEntity> SMURF_CAT_ENTITY = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(SmurfcatMod.MOD_ID, "smurfcat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SmurfCatEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 2f)).build());
}
