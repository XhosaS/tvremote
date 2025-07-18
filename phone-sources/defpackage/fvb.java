package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvb {
    public final int a;
    final boolean b;
    public final boolean c;
    final boolean d;
    final boolean e;
    public final Bundle f;

    public fvb(fva fvaVar) {
        this.a = fvaVar.a;
        this.b = fvaVar.b;
        this.c = fvaVar.c;
        this.d = fvaVar.d;
        this.e = fvaVar.e;
        Bundle bundle = fvaVar.f;
        this.f = bundle == null ? Bundle.EMPTY : new Bundle(bundle);
    }
}
