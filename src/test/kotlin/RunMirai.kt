package org.example.mirai.plugin

import ceneax.other.miraipluginmail.PluginMain
import net.mamoe.mirai.alsoLogin
import net.mamoe.mirai.console.MiraiConsole
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.enable
import net.mamoe.mirai.console.plugin.PluginManager.INSTANCE.load
import net.mamoe.mirai.console.terminal.MiraiConsoleTerminalLoader

suspend fun main() {
    MiraiConsoleTerminalLoader.startAsDaemon()

    PluginMain.load()
    PluginMain.enable()

//    val bot = MiraiConsole.addBot(1007632546, "") {
//        fileBasedDeviceInfo()
//    }.alsoLogin()

    MiraiConsole.job.join()
}