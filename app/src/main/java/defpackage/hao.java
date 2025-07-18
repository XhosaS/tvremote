package defpackage;

import androidx.preference.Preference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hao extends aul {
    @Override // defpackage.bir
    public final void a(bit bitVar, Preference preference) {
        bq bqVarEd = bq.ed(s(), preference.u, preference.p());
        bqVarEd.au(bitVar);
        if ((bqVarEd instanceof bit) || (bqVarEd instanceof bim)) {
            l(bqVarEd);
            return;
        }
        ab abVar = new ab(eg());
        bq bqVarD = eg().b.d("androidx.leanback.preference.LeanbackSettingsFragment.PREFERENCE_FRAGMENT");
        if (bqVarD != null && !bqVarD.ap()) {
            abVar.k(bqVarD);
        }
        abVar.f(R.id.settings_dialog_container, bqVarEd, null, 1);
        abVar.n(null);
        abVar.i();
    }

    @Override // defpackage.bis
    public final void cq() {
    }
}
