package net.mrsterner.value.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrsterner.value.ValueMod;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ValueMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
    }
}
