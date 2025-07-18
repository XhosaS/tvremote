package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svb implements cvq {
    final /* synthetic */ svd a;
    final /* synthetic */ sve b;

    public svb(svd svdVar, sve sveVar) {
        this.a = svdVar;
        this.b = sveVar;
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        this.a.a(view, cyhVar, new sve(this.b));
        return cyhVar;
    }
}
