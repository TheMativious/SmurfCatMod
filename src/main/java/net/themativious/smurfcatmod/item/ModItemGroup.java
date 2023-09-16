package net.themativious.smurfcatmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.themativious.smurfcatmod.SmurfcatMod;

public class ModItemGroup {
    public static final ItemGroup SMURFCAT = FabricItemGroupBuilder.build(new Identifier(SmurfcatMod.MOD_ID, "smurfcat"),
            () -> new ItemStack(ModItems.SMURFCAT));
}
