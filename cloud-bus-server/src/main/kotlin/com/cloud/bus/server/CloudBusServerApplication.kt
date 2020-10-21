package com.cloud.bus.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@EnableConfigServer
@SpringBootApplication
class CloudBusServerApplication

fun main(args: Array<String>) {
	runApplication<CloudBusServerApplication>(*args)
}
