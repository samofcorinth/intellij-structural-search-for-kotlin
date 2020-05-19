package com.jetbrains.kotlin.structuralsearch

class KotlinSSAnotationTest : KotlinSSTest() {
    override fun getBasePath(): String = "annotation"

    fun testClassAnnotation() { doTest("@A class '_") }

    fun testFunAnnotation() { doTest("@A fun '_() { println(0) }") }

    fun testClassAnnotationArgs() { doTest("@A(0) class '_()") }
}