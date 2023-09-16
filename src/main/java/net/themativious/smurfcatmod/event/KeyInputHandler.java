package net.themativious.smurfcatmod.event;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.util.InputUtil;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_TUTORIAL = "key.category.smurfcatmod.smurfcat";
    public static final String KEY_DRINK_WATER = "key.tutorialmod.welive";

    public static KeyBinding drinkingKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (drinkingKey.wasPressed()) {
                // This happens when our custom key is pressed
                MinecraftClient minecraftClient = MinecraftClient.getInstance();
                minecraftClient.player.sendChatMessage("We live We love We LIE!");

                // Reproduce el sonido personalizado
                playCustomSound("smurfcatmod:smurfcatsong");

                // Muestra un título personalizado en el centro de la pantalla
                showCustomTitle(minecraftClient, "WE LIVE WE LOVE WE LIE");
            }
        });
    }

    private static void playCustomSound(String soundId) {
        SoundEvent customSound = new SoundEvent(new Identifier(soundId));
        MinecraftClient.getInstance().getSoundManager().play(
                PositionedSoundInstance.master(customSound, 1.0f, 1.0f)
        );
    }

    private static void showCustomTitle(MinecraftClient client, String title) {
        client.inGameHud.setOverlayMessage(Text.of(title), false);
    }

    public static void register() {
        drinkingKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DRINK_WATER,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_TUTORIAL
        ));

        registerKeyInputs();
    }
}