package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bie extends bim {
    final Set ah = new HashSet();
    boolean ai;
    CharSequence[] aj;
    CharSequence[] ak;

    @Override // defpackage.bim
    public final void aC(boolean z) {
        if (z && this.ai) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) aG();
            Set set = this.ah;
            if (multiSelectListPreference.M(set)) {
                multiSelectListPreference.k(set);
            }
        }
        this.ai = false;
    }

    @Override // defpackage.bim
    protected final void cx(gb gbVar) {
        int length = this.ak.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.ah.contains(this.ak[i].toString());
        }
        CharSequence[] charSequenceArr = this.aj;
        bid bidVar = new bid(this);
        fx fxVar = gbVar.a;
        fxVar.l = charSequenceArr;
        fxVar.t = bidVar;
        fxVar.p = zArr;
        fxVar.q = true;
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void ey(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.ey(bundle);
        if (bundle != null) {
            Set set = this.ah;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.ai = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.aj = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.ak = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) aG();
        CharSequence[] charSequenceArr2 = multiSelectListPreference.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreference.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.ah;
        set2.clear();
        set2.addAll(multiSelectListPreference.i);
        this.ai = false;
        this.aj = charSequenceArr2;
        this.ak = charSequenceArr;
    }

    @Override // defpackage.bim, defpackage.bf, defpackage.bq
    public final void g(Bundle bundle) {
        super.g(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.ah));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.ai);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.aj);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.ak);
    }
}
