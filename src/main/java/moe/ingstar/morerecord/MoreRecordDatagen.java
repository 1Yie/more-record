package moe.ingstar.morerecord;


import moe.ingstar.morerecord.Data.ModItemTagProvider;
import moe.ingstar.morerecord.Data.ModLootTabGenerator;
import moe.ingstar.morerecord.Data.ModModelProvider;
import moe.ingstar.morerecord.Data.ModRecipeGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class MoreRecordDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModLootTabGenerator::new);
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeGenerator::new);
    }
}
