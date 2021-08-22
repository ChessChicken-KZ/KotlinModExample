package kz.chesschicken.example.wrappers

import kz.chesschicken.example.events.init.ModelListener
import net.minecraft.block.material.Material
import net.minecraft.level.Level
import net.modificationstation.stationapi.api.client.model.BlockModelProvider
import net.modificationstation.stationapi.api.client.model.CustomModel
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase

class ExampleBlockWithModel(id: Identifier?, m: Material) : TemplateBlockBase(id, m) , BlockModelProvider {

    override fun isFullOpaque(): Boolean = false

    override fun getCustomWorldModel(p0: Level?, p1: Int, p2: Int, p3: Int, p4: Int): CustomModel = ModelListener.CUSTOM_MODEL

    override fun getCustomInventoryModel(p0: Int): CustomModel = ModelListener.CUSTOM_MODEL


}