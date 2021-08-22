package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.client.event.model.ModelRegisterEvent
import net.modificationstation.stationapi.impl.client.model.CustomModel
import net.modificationstation.stationapi.impl.client.model.CustomModelRenderer


class ModelListener {
    companion object {
        lateinit var CUSTOM_MODEL : CustomModel
    }

    @EventListener
    fun registerModels(event: ModelRegisterEvent) {
        CUSTOM_MODEL = CustomModelRenderer( "/assets/examplemod/stationapi/models/model.json", "examplemod").entityModelBase
    }
}