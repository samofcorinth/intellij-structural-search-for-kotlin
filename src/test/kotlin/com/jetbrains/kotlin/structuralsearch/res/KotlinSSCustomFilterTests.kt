package com.jetbrains.kotlin.structuralsearch.res

import com.jetbrains.kotlin.structuralsearch.KotlinSSResourceInspectionTest

class KotlinSSCustomFilterTests: KotlinSSResourceInspectionTest() {
    override fun getBasePath(): String = "customFilter"

    fun testValVarFilter() { doTest("") }

}