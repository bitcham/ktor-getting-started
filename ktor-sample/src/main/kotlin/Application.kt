package com.example

import io.ktor.server.application.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    embeddedServer(
        Netty,
        port = 9292,
        host = "localhost",
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    configureRouting()
}
