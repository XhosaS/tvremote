package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkf extends zjr {
    public zkf(int i, int i2, int i3, zih zihVar) {
        super(i, i2, i3, zihVar);
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        zjh zjhVarP = this.d.p();
        boolean zN = n();
        int iA = zjhVarP.a(zN);
        if (zN) {
            iA += 3;
        }
        return iA + (z ? zjf.c(this.c) : 0);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjh zjhVarP = this.d.p();
        boolean zN = n();
        if (z) {
            int i = this.b;
            if (zN || zjhVarP.e()) {
                i |= 32;
            }
            zjfVar.o(i, this.c);
        }
        if (!zN) {
            zjhVarP.c(zjfVar, false);
            return;
        }
        zjfVar.f(128);
        zjhVarP.c(zjfVar, true);
        zjfVar.f(0);
        zjfVar.f(0);
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return n() || this.d.p().e();
    }

    @Override // defpackage.zjr
    public final zjm i(zjh zjhVar) {
        return new zkc(zjhVar);
    }

    public zkf(zih zihVar) {
        super(true, 0, zihVar);
    }
}
