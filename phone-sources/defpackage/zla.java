package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zla extends zjr {
    public zla(int i, int i2, int i3, zih zihVar) {
        super(i, i2, i3, zihVar);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        zjh zjhVarL = this.d.p().l();
        boolean zN = n();
        int iA = zjhVarL.a(zN);
        if (zN) {
            iA += zjf.a(iA);
        }
        return iA + (z ? zjf.c(this.c) : 0);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjh zjhVarL = this.d.p().l();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || zjhVarL.e()) {
                i |= 32;
            }
            zjfVar.o(i, this.c);
        }
        if (zN) {
            zjfVar.h(zjhVarL.a(true));
        }
        zjhVarL.c(zjfVar.e(), zN);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return n() || this.d.p().l().e();
    }

    @Override // defpackage.zjr
    public final zjm i(zjh zjhVar) {
        return new zky(zjhVar);
    }

    public zla(boolean z, int i, zih zihVar) {
        super(z, i, zihVar);
    }

    @Override // defpackage.zjr, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
