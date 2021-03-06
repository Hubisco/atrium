@file:Suppress("DEPRECATION" /* will be removed with 0.10.0 */)
package ch.tutteli.atrium.api.cc.en_GB.creating.charsequence.contains.builders.impl

import ch.tutteli.atrium.api.cc.en_GB.containsNot
import ch.tutteli.atrium.creating.AssertionPlant
import kotlin.reflect.KFunction3

internal fun nameContainsNotValuesFun(): String {
    val f: KFunction3<AssertionPlant<CharSequence>, Any, Array<out Any>, AssertionPlant<CharSequence>> = AssertionPlant<CharSequence>::containsNot
    return f.name
}
