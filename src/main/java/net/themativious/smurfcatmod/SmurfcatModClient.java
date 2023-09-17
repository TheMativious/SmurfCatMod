package net.themativious.smurfcatmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.themativious.smurfcatmod.entity.EntityReg;
import net.themativious.smurfcatmod.entity.client.SmurfCatRenderer;
import net.themativious.smurfcatmod.event.KeyInputHandler;

public class SmurfcatModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
        EntityRendererRegistry.register(EntityReg.SMURF_CAT_ENTITY, SmurfCatRenderer::new);
    }
}