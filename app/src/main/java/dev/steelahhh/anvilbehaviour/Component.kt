package dev.steelahhh.anvilbehaviour

import com.squareup.anvil.annotations.MergeComponent
import dev.steelahhh.lib.AppScope
import dev.steelahhh.lib.SomeAssistedClassFactory
import dev.steelahhh.lib.SomeClass

@MergeComponent(AppScope::class)
interface AppComponent {
    val factory: SomeAssistedClassFactory

    val basic: SomeClass
}
