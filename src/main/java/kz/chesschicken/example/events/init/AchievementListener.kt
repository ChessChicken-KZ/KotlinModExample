package kz.chesschicken.example.events.init

import kz.chesschicken.example.custom.ExampleAchievementPage
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.achievement.Achievement
import net.minecraft.item.ItemBase
import net.modificationstation.stationapi.api.client.gui.screen.menu.AchievementPage
import net.modificationstation.stationapi.api.event.achievement.AchievementRegisterEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.ModID
import net.modificationstation.stationapi.api.util.Null

class AchievementListener {
    companion object {
        lateinit var achievement : Achievement
        lateinit var achievement2 : Achievement

        @Entrypoint.ModID
        var modID: ModID? = Null.get()
    }

    @EventListener
    fun registerAchievements(event: AchievementRegisterEvent) {
        val list = event.achievements
        val achievementPage: AchievementPage = ExampleAchievementPage(modID!!, "examplemod")
        achievement = Achievement(69696969, "examplemod.boned", -1, 0, ItemBase.bone, null)
        achievement2 = Achievement(69696970, "examplemod.apple", 0, 10, ItemBase.apple, achievement)
        achievement2.setUnusual()
        list.add(achievement)
        list.add(achievement2)
        achievementPage.addAchievements(achievement, achievement2)
    }
}