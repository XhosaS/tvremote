package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rig extends rin {
    private final riz a;

    public rig(String str, rkq rkqVar, riz rizVar) {
        super(str, rkqVar);
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

    @Override // defpackage.rin
    protected final riy l() {
        return new rik();
    }
}
