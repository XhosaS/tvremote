package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rye extends ryl {
    private final rxz d;
    private volatile Object e;

    public rye(String str, String str2, ryq ryqVar, rxz rxzVar) {
        super(str, str2, ryqVar);
        this.d = rxzVar;
    }

    @Override // defpackage.rxu
    protected final Object a(Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.rxu
    protected final Object b(String str) {
        return this.d.a(Base64.decode(str, 3));
    }

    @Override // defpackage.rxy
    public final Object f() {
        return this.e;
    }

    @Override // defpackage.rxy
    public final void h(Object obj) {
        this.e = obj;
    }
}
