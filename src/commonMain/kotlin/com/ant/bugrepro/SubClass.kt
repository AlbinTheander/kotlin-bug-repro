package com.ant.bugrepro

@JsExport
class SubClass : BaseClass() {

    override fun sayHello(name: String?): String {
        println("In Sub")
        val base = super.sayHello()
        return "$base, and from SubClass"
    }
}