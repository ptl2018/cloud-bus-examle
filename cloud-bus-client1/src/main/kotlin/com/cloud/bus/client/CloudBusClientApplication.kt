package com.cloud.bus.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CloudBusClientApplication

fun main(args: Array<String>) {
	runApplication<CloudBusClientApplication>(*args)
}
