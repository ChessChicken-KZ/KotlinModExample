package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.client.options.KeyBinding
import net.modificationstation.stationapi.api.client.event.option.KeyBindingRegisterEvent


class KeyBindingListener {
    companion object {
        lateinit var keyBinding: KeyBinding
        lateinit var keyBinding2: KeyBinding
        lateinit var keyBinding3: KeyBinding
    }


    @EventListener
    fun registerKeyBindings(event: KeyBindingRegisterEvent) {
        val list = event.keyBindings
        keyBinding = KeyBinding("key.examplemod.test", 21)
        keyBinding2 = KeyBinding("key.examplemod.test2", 22)
        keyBinding3 = KeyBinding("key.examplemod.hurtme", 23)
        list.add(keyBinding)
        list.add(keyBinding2)
        list.add(keyBinding3)
    }
}