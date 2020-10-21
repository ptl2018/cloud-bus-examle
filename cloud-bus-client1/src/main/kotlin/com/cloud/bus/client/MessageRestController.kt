package com.cloud.bus.client

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RefreshScope
@RestController
internal class MessageRestController {
    @get:RequestMapping("/message")
    @Value("\${message:Hello default}")
    val message: String? = null
}
