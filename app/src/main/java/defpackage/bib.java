package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bib extends bim {
    int ah;
    private CharSequence[] ai;
    private CharSequence[] aj;

    @Override // defpackage.bim
    public final void aC(boolean z) {
        int i;
        if (!z || (i = this.ah) < 0) {
            return;
        }
        String string = this.aj[i].toString();
        ListPreference listPreference = (ListPreference) aG();
        if (listPreference.M(string)) {
            listPreference.n(string);
        }
    }

    @Override // defpackage.bim
    protected final void cx(gb gbVar) {
        CharSequence[] charSequenceArr = this.ai;
        int i = this.ah;
        bia biaVar = new bia(this);
        fx fxVar = gbVar.a;
        fxVar.l = charSequenceArr;
        fxVar.n = biaVar;
        fxVar.s = i;
        fxVar.r = true;
        gbVar.a(null, null);
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void ey(Bundle bundle) {
        super.ey(bundle);
        if (bundle != null) {
            this.ah = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.ai = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.aj = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) aG();
        if (listPreference.g == null || listPreference.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.ah = listPreference.k(listPreference.i);
        this.ai = listPreference.g;
        this.aj = listPreference.h;
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.ah);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.ai);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.aj);
    }
}
