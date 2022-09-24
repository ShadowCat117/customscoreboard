package de.royzer.customscoreboard.settings

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import com.terraformersmc.modmenu.gui.ModsScreen

class ModMenuApiImpl : ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<*> {
        return ConfigScreenFactory {
            ScoreboardSettings.createGui(it)
        }
    }
}