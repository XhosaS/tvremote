package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rje extends rjl {
    private final riz a;
    private volatile Object b;

    public rje(String str, String str2, rkq rkqVar, riz rizVar) {
        super(str, str2, rkqVar);
        this.a = rizVar;
    }

    @Override // defpackage.rhz
    protected final Object b(Object obj) {
        return this.a.a((byte[]) obj);
    }

    @Override // defpackage.rhz
    protected final Object c(String str) {
        return this.a.a(Base64.decode(str, 3));
    }

    @Override // defpackage.riy
    public final Object e() {
        return this.b;
    }

    @Override // defpackage.riy
    public final void eS(Object obj) {
        this.b = obj;
    }
}
