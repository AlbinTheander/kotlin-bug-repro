package com.ant.bugrepro

@JsExport
open class BaseClass {

    @JsName("sayHello")
    open fun sayHello(name: String? = "NN") : String {
        println("In Base")
        return "Hello, $name from BaseClass"
    }
}
