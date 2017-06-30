package sample.qiitaclient

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by suzuki on 2017/06/30.
 */
fun <T : View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}