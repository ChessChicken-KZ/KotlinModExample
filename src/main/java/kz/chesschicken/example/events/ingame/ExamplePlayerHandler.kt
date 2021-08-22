package kz.chesschicken.example.events.ingame

import net.modificationstation.stationapi.api.entity.player.PlayerHandler


class ExamplePlayerHandler : PlayerHandler {
    override fun respawn(): Boolean {
        println("Oh noes")
        return false
    }
}