package dev.steelahhh.lib

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import javax.inject.Inject

/*
 * Steps:
 * 0. useIR=true
 * 1. Compile with `dummyChange` commented - build is successful
 * 2. Un/comment `dummyChange` or modify the code in any way and compile
 * 3. Be sad :(
 */

class SomeClass @Inject constructor() {
     // val dummyChange = ""
}

class SomeAssistedClass @AssistedInject constructor(
    private val someClass: SomeClass,
    @Assisted val type: String,
)

@AssistedFactory
interface SomeAssistedClassFactory {
    fun create(type: String): SomeAssistedClass
}
