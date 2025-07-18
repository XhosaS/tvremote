package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class bj extends ca {
    final /* synthetic */ bq a;

    public bj(bq bqVar) {
        this.a = bqVar;
    }

    @Override // defpackage.ca
    public final View a(int i) {
        bq bqVar = this.a;
        View view = bqVar.R;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.c(bqVar, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.ca
    public final boolean b() {
        return this.a.R != null;
    }
}
