package com.example.managementorder

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform