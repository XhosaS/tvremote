package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkq extends zjm {
    private int c;

    public zkq() {
        this.c = -1;
    }

    private final int r() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int length = this.a.length;
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            iA += this.a[i2].p().k().a(true);
        }
        this.c = iA;
        return iA;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, r());
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 48);
        zkp zkpVarD = zjfVar.d();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            zjfVar.h(r());
            while (i < length) {
                this.a[i].p().k().c(zkpVarD, true);
                i++;
            }
            return;
        }
        zjh[] zjhVarArr = new zjh[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            zjh zjhVarK = this.a[i2].p().k();
            zjhVarArr[i2] = zjhVarK;
            iA += zjhVarK.a(true);
        }
        this.c = iA;
        zjfVar.h(iA);
        while (i < length) {
            zjhVarArr[i].c(zkpVarD, true);
            i++;
        }
    }

    @Override // defpackage.zjm
    public final zic g() {
        return new zkj(zjy.q(o()), (byte[]) null);
    }

    @Override // defpackage.zjm
    public final zjd i() {
        return new zkn(zkb.h(q()));
    }

    @Override // defpackage.zjm
    public final zjo n() {
        return new zkz(this.a);
    }

    public zkq(zih zihVar) {
        super(zihVar);
        this.c = -1;
    }

    public zkq(zii ziiVar) {
        super(ziiVar);
        this.c = -1;
    }

    public zkq(zih[] zihVarArr) {
        super(zihVarArr);
        this.c = -1;
    }

    public zkq(zih[] zihVarArr, byte[] bArr) {
        super(zihVarArr, null);
        this.c = -1;
    }

    @Override // defpackage.zjm, defpackage.zjh
    public final zjh k() {
        return this;
    }

    @Override // defpackage.zjm, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
