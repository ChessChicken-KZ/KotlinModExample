package kz.chesschicken.example.events.init


import kz.chesschicken.example.wrappers.ExampleBlockWithModel
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.registry.ModID
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase
import net.modificationstation.stationapi.api.util.Null


class BlockListener {
    companion object {
        lateinit var exampleBlock : net.minecraft.block.BlockBase
        lateinit var exampleBlock2 : net.minecraft.block.BlockBase

        @Entrypoint.ModID var MOD_ID: ModID? = Null.get()
    }

    @EventListener
    fun registerBlocks(event: BlockRegistryEvent) {
        println(MOD_ID)
        exampleBlock = TemplateBlockBase(Identifier.of(MOD_ID!!, "test"), Material.DIRT).setTranslationKey(MOD_ID, "test")
        exampleBlock2 = ExampleBlockWithModel(Identifier.of(MOD_ID!!, "test2"), Material.DIRT).setTranslationKey(MOD_ID, "test2")
    }



}