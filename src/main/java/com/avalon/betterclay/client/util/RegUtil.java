package com.avalon.betterclay.client.util;

import java.util.Locale;

import javax.annotation.Nonnull;

import com.avalon.betterclay.BetterClay;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.structure.IStructurePieceType;
import net.minecraftforge.registries.GameData;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

public class RegUtil {
    /*
     * This class was taken from https://github.com/TelepathicGrunt/RepurposedStructures /blob/d98a50196b7317891b4c3ef73780cf8f2105f5e4/src/main/java/com/
     * telepathicgrunt/repurposedstructures/utils/RegUtil.java RepurposedStructures is licensed under the MIT license, the the README gives explicit permission
     * to "do whatever you want" All text other than this comment was written by TelepathicGrunt
     */

    /*
     * The following three methods are for the dimension registration stuff based off of The Midnight mod
     * https://github.com/Cryptic-Mushroom/The-Midnight/blob/1.14.4-dev/src/main/ java/com/mushroom/midnight/common/registry/ RegUtil.java
     */
    @Nonnull
    public static <T> T injected() {
        return null;
    }

    public static <T extends IForgeRegistryEntry<T>> Generic<T> generic(IForgeRegistry<T> registry) {
        return new Generic<>(registry);
    }

    public static class Generic<T extends IForgeRegistryEntry<T>> {
        private final IForgeRegistry<T> registry;

        private Generic(IForgeRegistry<T> registry) {
            this.registry = registry;
        }

        public Generic<T> add(String name, T entry) {
            ResourceLocation registryName = GameData.checkPrefix(name, false);
            entry.setRegistryName(registryName);

            this.registry.register(entry);

            return this;
        }
    }

    /**
     * Helper method to quickly register features, blocks, items, structures, biomes, anything that can be registered.
     */
    public static <T extends IForgeRegistryEntry<T>> T register(IForgeRegistry<T> registry, T entry, String registryKey) {
        entry.setRegistryName(new ResourceLocation(BetterClay.MOD_ID, registryKey));
        registry.register(entry);
        return entry;
    }

    /**
     * For registering structure pieces so Minecraft doesn't spam the logs saying the pieces aren't registered yet
     */
    public static IStructurePieceType register(IStructurePieceType pieceType, String key) {
        return Registry.register(Registry.STRUCTURE_PIECE, key.toLowerCase(Locale.ROOT), pieceType);
    }
}