package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhu implements bil {
    public static bhu a;

    @Override // defpackage.bil
    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
    }
}
