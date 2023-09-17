package net.themativious.smurfcatmod.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.themativious.smurfcatmod.SmurfcatMod;
import net.themativious.smurfcatmod.entity.entities.SmurfCatEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SmurfCatRenderer extends GeoEntityRenderer<SmurfCatEntity> {
    public SmurfCatRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new SmurfCatModel());
    }

    @Override
    public Identifier getTextureLocation(SmurfCatEntity animatable) {
        return new Identifier(SmurfcatMod.MOD_ID, "textures/entity/smurfcat_texture.png");
    }
}
