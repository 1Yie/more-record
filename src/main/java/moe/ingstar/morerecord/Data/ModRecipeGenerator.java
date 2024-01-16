package moe.ingstar.morerecord.Data;

import moe.ingstar.morerecord.Items.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.XIAOBAIMA_MUSIC_DISC, 1)
                .pattern("SXS")
                .pattern("XTX")
                .pattern("SXS")
                .input('S', Items.CHICKEN)
                .input('X', Items.FEATHER)
                .input('T', Items.SKELETON_SKULL)
                .criterion("has_music_disc", conditionsFromItem(Items.SKELETON_SKULL))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CHIPI_MUSIC_DISC, 1)
                .pattern("STS")
                .input('S', Items.DIAMOND)
                .input('T', Items.STRING)
                .criterion("has_music_disc", conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);
    }

}
