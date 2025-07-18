package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zks extends zjr {
    public zks(int i, int i2, int i3, zih zihVar) {
        super(i, i2, i3, zihVar);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        zjh zjhVarK = this.d.p().k();
        boolean zN = n();
        int iA = zjhVarK.a(zN);
        if (zN) {
            iA += zjf.a(iA);
        }
        return iA + (z ? zjf.c(this.c) : 0);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjh zjhVarK = this.d.p().k();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || zjhVarK.e()) {
                i |= 32;
            }
            zjfVar.o(i, this.c);
        }
        if (zN) {
            zjfVar.h(zjhVarK.a(true));
        }
        zjhVarK.c(zjfVar.d(), zN);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return n() || this.d.p().k().e();
    }

    @Override // defpackage.zjr
    public final zjm i(zjh zjhVar) {
        return new zkq(zjhVar);
    }

    public zks(zih zihVar) {
        super(true, 0, zihVar);
    }

    public zks(boolean z, int i, zih zihVar) {
        super(z, i, zihVar);
    }

    @Override // defpackage.zjr, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjr, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
