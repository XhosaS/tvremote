package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hol extends hpu implements hoq {
    private hop f;

    public hol(gtu gtuVar, gnj gnjVar) {
        super(gtuVar, gnjVar);
    }

    @Override // defpackage.hoq
    public final int l() {
        return this.f.a;
    }

    @Override // defpackage.hoq
    public final int m() {
        return this.f.b;
    }

    public final void n(Context context, hop hopVar, adyn adynVar) {
        this.f = hopVar;
        super.o(context, adynVar);
    }
}
