package kz.chesschicken.example

import net.modificationstation.stationapi.api.client.event.texture.TextureRegister
import net.modificationstation.stationapi.api.common.event.block.BlockRegister
import net.modificationstation.stationapi.api.common.event.item.ItemRegister
import net.modificationstation.stationapi.api.common.mod.StationMod
import net.modificationstation.stationapi.api.common.registry.ModID

/**
 * A simple basic StationAPI mod.
 */
class KotlinRunner : StationMod {
    override fun init(p0: ModID?) {
        //Variable
        val registerVariable = RegisterListener()

        //Registering
        BlockRegister.EVENT.register(registerVariable, p0)

        ItemRegister.EVENT.register(registerVariable, p0)

        TextureRegister.EVENT.register(registerVariable)
    }
}