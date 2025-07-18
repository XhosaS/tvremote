package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.preference.ListPreference;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aud extends pq implements aue {
    final /* synthetic */ aug d;
    private final CharSequence[] e;
    private final CharSequence[] f;
    private CharSequence g;

    public aud(aug augVar, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, CharSequence charSequence) {
        this.d = augVar;
        this.e = charSequenceArr;
        this.f = charSequenceArr2;
        this.g = charSequence;
    }

    @Override // defpackage.pq
    public final int a() {
        return this.e.length;
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ qv d(ViewGroup viewGroup, int i) {
        return new auf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leanback_list_preference_item_single, viewGroup, false), this);
    }

    @Override // defpackage.pq
    public final /* bridge */ /* synthetic */ void f(qv qvVar, int i) {
        auf aufVar = (auf) qvVar;
        aufVar.s.setChecked(TextUtils.equals(this.f[i].toString(), this.g));
        aufVar.t.setText(this.e[i]);
    }

    @Override // defpackage.aue
    public final void m(auf aufVar) {
        int iCs = aufVar.cs();
        if (iCs == -1) {
            return;
        }
        CharSequence[] charSequenceArr = this.f;
        aug augVar = this.d;
        CharSequence charSequence = charSequenceArr[iCs];
        ListPreference listPreference = (ListPreference) augVar.l();
        if (iCs >= 0) {
            String string = charSequenceArr[iCs].toString();
            if (listPreference.M(string)) {
                listPreference.n(string);
                this.g = charSequence;
            }
        }
        augVar.C.G();
        this.a.a();
    }
}
