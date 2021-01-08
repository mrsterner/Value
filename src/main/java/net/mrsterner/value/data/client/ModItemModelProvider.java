package net.mrsterner.value.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mrsterner.value.ValueMod;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ValueMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "copper_coin");
        builder(itemGenerated, "silver_coin");
        builder(itemGenerated, "gold_coin");
        builder(itemGenerated, "platinum_coin");

        builder(itemGenerated, "green_ticket");
        builder(itemGenerated, "red_ticket");
        builder(itemGenerated, "lime_ticket");
        builder(itemGenerated, "cyan_ticket");
        builder(itemGenerated, "golden_ticket");
        builder(itemGenerated, "blue_ticket");
        builder(itemGenerated, "pink_ticket");
        builder(itemGenerated, "purple_ticket");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
