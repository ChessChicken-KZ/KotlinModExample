package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.registry.ModID
import net.modificationstation.stationapi.api.template.item.TemplateItemBase
import net.modificationstation.stationapi.api.util.Null


class ItemListener {
    companion object {
        lateinit var coolItem : TemplateItemBase

        @Entrypoint.ModID var MOD_ID: ModID? = Null.get()
    }

    @EventListener
    fun registerItems(event: ItemRegistryEvent) {
        coolItem = TemplateItemBase(Identifier.of(MOD_ID!!, "coolitem")).setTranslationKey(MOD_ID, "coolitem")
    }

}