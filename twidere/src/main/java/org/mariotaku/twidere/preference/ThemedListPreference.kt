package org.mariotaku.twidere.preference

import android.content.Context
import android.support.v7.preference.ListPreference
import android.support.v7.preference.PreferenceFragmentCompat
import android.util.AttributeSet

import org.mariotaku.twidere.fragment.ThemedListPreferenceDialogFragmentCompat
import org.mariotaku.twidere.preference.iface.IDialogPreference

/**
 * Created by mariotaku on 16/3/15.
 */
open class ThemedListPreference @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int, defStyleRes: Int) : ListPreference(context, attrs, defStyleAttr, defStyleRes), IDialogPreference {

    override fun displayDialog(fragment: PreferenceFragmentCompat) {
        val df = ThemedListPreferenceDialogFragmentCompat.newInstance(key)
        df.setTargetFragment(fragment, 0)
        df.show(fragment.fragmentManager, key)
    }
}
