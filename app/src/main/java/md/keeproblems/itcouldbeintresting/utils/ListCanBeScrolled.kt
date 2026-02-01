package md.keeproblems.itcouldbeintresting.utils

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState
/***
 * The function determines whether a lazy list can be scrolled
 * @param extraPaddings - additional padding if needed on start/end to prevent touch indicators glow cut
 * ***/
public fun LazyListState.listCanBeScrolled(extraPaddings:Int = 0):Boolean {
    if (extraPaddings == 0) return this.canScrollBackward || this.canScrollBackward

    val viewportSize = layoutInfo.viewportEndOffset - layoutInfo.viewportStartOffset
    val items = layoutInfo.visibleItemsInfo
    val totalSpacing = layoutInfo.mainAxisItemSpacing * (items.size - 1)
    val itemsSize = items.sumOf { it.size }

    return items.size < layoutInfo.totalItemsCount || itemsSize + totalSpacing + extraPaddings > viewportSize
}

/***
 * The function determines whether a scrollable nor lazy list can be scrolled
 */
public fun ScrollState.listCanBeScrolled():Boolean = maxValue > 0