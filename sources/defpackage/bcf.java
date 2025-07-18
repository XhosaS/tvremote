package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
class bcf extends bci {
    private final bcb d;
    private volatile Object e;

    public bcf(String str, String str2, bco bcoVar, bcb bcbVar) {
        super(str, str2, bcoVar);
        this.d = bcbVar;
    }

    @Override // defpackage.bbw
    protected final Object b(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.bbw
    protected final Object c(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.bca
    public final Object d() {
        return this.e;
    }

    @Override // defpackage.bca
    public final void g(Object obj) {
        this.e = obj;
    }
}
