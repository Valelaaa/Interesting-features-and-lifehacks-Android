package md.keeproblems.itcouldbeintresting.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

public inline val Int.px: Dp
    @Composable
    get() {
        with(LocalDensity.current) {
            return toDp()
        }
    }

public inline val Float.px: Dp
    @Composable
    get() {
        with(LocalDensity.current) {
            return toDp()
        }
    }

public inline val Dp.toPxFloat: Float
    @Composable
    get() {
        with(LocalDensity.current) {
            return (this@toPxFloat.value * this.density)
        }
    }

public inline val Int.pxSp: TextUnit
    @Composable
    get() {
        with(LocalDensity.current) {
            return toSp()
        }
    }

public inline val Float.pxSp: TextUnit
    @Composable
    get() {
        with(LocalDensity.current) {
            return toSp()
        }
    }