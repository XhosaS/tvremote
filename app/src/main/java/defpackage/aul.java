package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aul extends bq implements bir, bis, biq {
    public final View.OnKeyListener a = new auk(this);

    public final void l(bq bqVar) {
        ab abVar = new ab(eg());
        if (eg().b.d("androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT") != null) {
            abVar.n(null);
            abVar.q(R.id.settings_preference_fragment_container, bqVar, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        } else {
            abVar.f(R.id.settings_preference_fragment_container, bqVar, "androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT", 1);
        }
        abVar.i();
    }

    @Override // defpackage.biq
    public final boolean m(bit bitVar, Preference preference) {
        if (preference instanceof ListPreference) {
            String str = ((ListPreference) preference).s;
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            aug augVar = new aug();
            augVar.ae(bundle);
            augVar.au(bitVar);
            l(augVar);
        } else if (preference instanceof MultiSelectListPreference) {
            String str2 = ((MultiSelectListPreference) preference).s;
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            aug augVar2 = new aug();
            augVar2.ae(bundle2);
            augVar2.au(bitVar);
            l(augVar2);
        } else {
            if (!(preference instanceof EditTextPreference)) {
                return false;
            }
            String str3 = preference.s;
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", str3);
            aub aubVar = new aub();
            aubVar.ae(bundle3);
            aubVar.au(bitVar);
            l(aubVar);
        }
        return true;
    }
}
