package net.mrsterner.value.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrsterner.value.ValueMod;
import net.mrsterner.value.setup.ModItems;
import net.mrsterner.value.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, ValueMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {

        getOrCreateBuilder(ModTags.Items.COINS_COPPER).add(ModItems.COPPER_COIN.get());
        getOrCreateBuilder(ModTags.Items.COINS_SILVER).add(ModItems.SILVER_COIN.get());
        getOrCreateBuilder(ModTags.Items.COINS_GOLD).add(ModItems.GOLD_COIN.get());
        getOrCreateBuilder(ModTags.Items.COINS_PLATINUM).add(ModItems.PLATINUM_COIN.get());

        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.COINS_COPPER);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.COINS_SILVER);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.COINS_GOLD);
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.COINS_PLATINUM);


    }
}
