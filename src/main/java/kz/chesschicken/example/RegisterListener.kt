package kz.chesschicken.example

import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.client.event.texture.TextureRegister
import net.modificationstation.stationapi.api.client.texture.TextureFactory
import net.modificationstation.stationapi.api.client.texture.TextureRegistry
import net.modificationstation.stationapi.api.common.preset.block.BlockBase
import net.modificationstation.stationapi.api.common.block.BlockRegistry
import net.modificationstation.stationapi.api.common.event.block.BlockRegister
import net.modificationstation.stationapi.api.common.event.item.ItemRegister
import net.modificationstation.stationapi.api.common.item.ItemRegistry
import net.modificationstation.stationapi.api.common.preset.item.ItemBase
import net.modificationstation.stationapi.api.common.registry.Identifier
import net.modificationstation.stationapi.api.common.registry.ModID

class RegisterListener : BlockRegister, ItemRegister, TextureRegister {
    companion object{
        lateinit var exampleBlock: net.minecraft.block.BlockBase
        lateinit var exampleItem: net.minecraft.item.ItemBase
    }

    override fun registerBlocks(p0: BlockRegistry?, p1: ModID?) {
        exampleBlock = BlockBase(p1?.let { Identifier.of(it, "exampleBlock") }, Material.CLAY).setName("exampleBlock")
    }

    override fun registerItems(p0: ItemRegistry?, p1: ModID?) {
        exampleItem = ItemBase(p1?.let { Identifier.of(it, "exampleItem")}).setName("exampleItem")
    }

    override fun registerTextures() {
        exampleBlock.texture = TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("TERRAIN"), "/assets/modid/textures/arseny_kotlin.png")
        exampleItem.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/modid/textures/arseny_kotlin.png"))
    }
}