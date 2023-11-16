package de.astatic.newvanilla.item;

import de.astatic.newvanilla.NewVanilla;
import de.astatic.newvanilla.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ASTANITE_GROUP;

    static {
        ASTANITE_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(NewVanilla.MOD_ID, "astanite_ingot"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astanite"))
                        .icon(() -> new ItemStack(ModItems.ASTANITE)).entries((displayContext, entries) -> {
                            entries.add(ModItems.RAW_ASTANITE);
                            entries.add(ModItems.ASTANITE);
                            entries.add(ModBlocks.ASTANITE_BLOCK);
                        }).build());
    }

    public static void registerItemGroups() {
        NewVanilla.LOGGER.info("Registering Item Groups for " + NewVanilla.MOD_ID);
    }
}
