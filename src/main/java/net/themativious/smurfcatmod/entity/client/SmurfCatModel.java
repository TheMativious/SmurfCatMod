package net.themativious.smurfcatmod.entity.client;

import net.minecraft.util.Identifier;
import net.themativious.smurfcatmod.SmurfcatMod;
import net.themativious.smurfcatmod.entity.entities.SmurfCatEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SmurfCatModel extends AnimatedGeoModel<SmurfCatEntity> {
    @Override
    public Identifier getModelLocation(SmurfCatEntity object) {
        return new Identifier(SmurfcatMod.MOD_ID, "geo/smurfcat.geo.json");
    }

    @Override
    public Identifier getTextureLocation(SmurfCatEntity object) {
        return new Identifier(SmurfcatMod.MOD_ID, "textures/entity/smurfcat_texture.png");
    }

    @Override
    public Identifier getAnimationFileLocation(SmurfCatEntity animatable) {
        return new Identifier(SmurfcatMod.MOD_ID, "animations/smurfcat.animation.json");
    }
}
