package com.example.chaibin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HttpFirewallTestController {

    @GetMapping("/firewall/test1/{test1}/{test2}")
    fun test1(
        @PathVariable test1: String,
        @PathVariable test2: String
    ): String {
        return "success - (test1 : $test1) (test2 : $test2)"
    }

    @GetMapping("/firewall/test2/{test1}")
    fun test2(
        @PathVariable test1: String,
    ): String {
        return "success - (test1 : $test1)"
    }

    @GetMapping("/firewall/test3")
    fun test3(
        @RequestParam test: String,
    ): String {
        return "success - (test : $test)"
    }
}