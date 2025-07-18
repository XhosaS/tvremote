package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhz implements bil {
    public static bhz a;

    @Override // defpackage.bil
    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
    }
}
