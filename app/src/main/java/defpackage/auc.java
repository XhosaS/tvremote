package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.MultiSelectListPreference;
import com.google.android.katniss.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auc extends pq implements aue {
    final /* synthetic */ aug d;
    private final CharSequence[] e;
    private final CharSequence[] f;
    private final Set g;

    public auc(aug augVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, Set set) {
        this.d = augVar;
        this.e = charSequenceArr;
        this.f = charSequenceArr2;
        this.g = new HashSet(set);
    }

    @Override // defpackage.pq
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ qv d(ViewGroup viewGroup, int i) {
        return new auf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leanback_list_preference_item_multi, viewGroup, false), this);
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ void f(qv qvVar, int i) {
        auf aufVar = (auf) qvVar;
        aufVar.s.setChecked(this.g.contains(this.f[i].toString()));
        aufVar.t.setText(this.e[i]);
    }

    @Override // defpackage.aue
    public final void m(auf aufVar) {
        int iCs = aufVar.cs();
        if (iCs == -1) {
            return;
        }
        String string = this.f[iCs].toString();
        Set set = this.g;
        if (set.contains(string)) {
            set.remove(string);
        } else {
            set.add(string);
        }
        aug augVar = this.d;
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) augVar.l();
        if (multiSelectListPreference.M(new HashSet(set))) {
            multiSelectListPreference.k(new HashSet(set));
            augVar.a = set;
        } else if (set.contains(string)) {
            set.remove(string);
        } else {
            set.add(string);
        }
        this.a.a();
    }
}
