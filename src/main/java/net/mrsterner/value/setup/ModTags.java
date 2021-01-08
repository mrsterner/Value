package net.mrsterner.value.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.mrsterner.value.ValueMod;

public class ModTags {
    public static final class Blocks {

    }

    public static final class Items {

        public static final ITag.INamedTag<Item> COINS_COPPER = forge("coins/copper");
        public static final ITag.INamedTag<Item> COINS_SILVER = forge("coins/silver");
        public static final ITag.INamedTag<Item> COINS_GOLD = forge("coins/gold");
        public static final ITag.INamedTag<Item> COINS_PLATINUM = forge("coins/platinum");

        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(ValueMod.MOD_ID, path).toString());
        }
    }
}
