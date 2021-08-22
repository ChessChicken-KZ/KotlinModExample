package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.ingame.ExamplePlayerHandler
import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.event.entity.player.PlayerEvent

class PlayerHandlerListener {

    @EventListener
    fun registerPlayerHandlers(event: PlayerEvent.HandlerRegister) {
        event.playerHandlers.add(ExamplePlayerHandler())
    }

}