package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.BlockBase
import net.minecraft.item.ItemBase
import net.minecraft.item.ItemInstance
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent
import net.modificationstation.stationapi.api.recipe.CraftingRegistry
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry
import net.modificationstation.stationapi.api.registry.Identifier


class RecipeListener {

    @EventListener
    fun registerRecipes(event: RecipeRegisterEvent) {
        val type: Identifier = event.recipeId
        if (type === RecipeRegisterEvent.Vanilla.CRAFTING_SHAPED.type()) {
            CraftingRegistry.addShapedRecipe(
                ItemInstance(ItemListener.coolItem, 1),
                "XXX",
                "X X",
                "X X",
                'X',
                BlockBase.DIRT
            )
        }
        if (type === RecipeRegisterEvent.Vanilla.SMELTING.type()) {
            SmeltingRegistry.addSmeltingRecipe(ItemInstance(ItemBase.apple, 1), ItemInstance(BlockBase.WOOL))
        }
        if (type === RecipeRegisterEvent.Vanilla.CRAFTING_SHAPELESS.type()) {
            CraftingRegistry.addShapelessRecipe(
                ItemInstance(BlockListener.exampleBlock, 1),
                ItemInstance(BlockBase.DIRT)
            )
            CraftingRegistry.addShapelessRecipe(
                ItemInstance(BlockListener.exampleBlock2, 1),
                ItemInstance(BlockBase.DIRT),
                ItemInstance(BlockBase.DIRT)
            )
        }
    }

}