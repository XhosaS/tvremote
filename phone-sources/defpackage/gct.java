package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gct implements gdd {
    public static gct a;
    public static gct b;
    private final /* synthetic */ int c;

    public gct(int i) {
        this.c = i;
    }

    @Override // defpackage.gdd
    public final /* synthetic */ CharSequence a(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
    }
}
