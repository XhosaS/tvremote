package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrb implements hln {
    private final hln a;
    private final Resources b;

    public hrb(Resources resources, hln hlnVar) {
        hju.p(resources);
        this.b = resources;
        hju.p(hlnVar);
        this.a = hlnVar;
    }

    @Override // defpackage.hln
    public final hnv a(Object obj, int i, int i2, hll hllVar) {
        return hsj.f(this.b, this.a.a(obj, i, i2, hllVar));
    }

    @Override // defpackage.hln
    public final boolean b(Object obj, hll hllVar) {
        return this.a.b(obj, hllVar);
    }
}
