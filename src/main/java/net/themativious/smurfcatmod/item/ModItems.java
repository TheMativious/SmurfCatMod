package net.themativious.smurfcatmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.themativious.smurfcatmod.SmurfcatMod;
import net.themativious.smurfcatmod.item.custom.ModAxeItem;
import net.themativious.smurfcatmod.item.custom.ModHoeItem;
import net.themativious.smurfcatmod.item.custom.ModPickaxeItem;

public class ModItems {
    public static final Item SMURFCAT = registerItem("smurfcat", new Item(new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_INGOT = registerItem("smurfcat_ingot", new Item(new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_SWORD = registerItem("smurfcat_sword", new SwordItem(ModToolMaterials.SMURFCAT, 1, 2f, new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_AXE = registerItem("smurfcat_axe", new ModAxeItem(ModToolMaterials.SMURFCAT, 3, 1f, new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_HOE = registerItem("smurfcat_hoe", new ModHoeItem(ModToolMaterials.SMURFCAT, 1, 2f, new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_SHOVEL = registerItem("smurfcat_shovel", new ShovelItem(ModToolMaterials.SMURFCAT, 0, 1f, new FabricItemSettings().group(ModItemGroup.SMURFCAT)));
    public static final Item SMURFCAT_PICKAXE = registerItem("smurfcat_pickaxe", new ModPickaxeItem(ModToolMaterials.SMURFCAT, 1, 0f, new FabricItemSettings().group(ModItemGroup.SMURFCAT)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(SmurfcatMod.MOD_ID, name), item);
    }

    public static void registerModiItems(){
        SmurfcatMod.LOGGER.info("Registrando los items del " + SmurfcatMod.MOD_ID);
    }
}
