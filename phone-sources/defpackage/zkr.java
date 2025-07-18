package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkr extends zjo {
    private int d;

    public zkr() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (zih zihVar : this.a) {
            iA += zihVar.p().k().a(true);
        }
        this.d = iA;
        return iA;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, i());
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.m(z, 49);
        zkp zkpVarD = zjfVar.d();
        zih[] zihVarArr = this.a;
        int length = zihVarArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            zjfVar.h(i());
            while (i < length) {
                zihVarArr[i].p().k().c(zkpVarD, true);
                i++;
            }
            return;
        }
        zjh[] zjhVarArr = new zjh[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            zjh zjhVarK = zihVarArr[i2].p().k();
            zjhVarArr[i2] = zjhVarK;
            iA += zjhVarK.a(true);
        }
        this.d = iA;
        zjfVar.h(iA);
        while (i < length) {
            zjhVarArr[i].c(zkpVarD, true);
            i++;
        }
    }

    @Override // defpackage.zjo, defpackage.zjh
    public final zjh k() {
        return this.b != null ? this : super.k();
    }

    public zkr(zih zihVar) {
        super(zihVar);
        this.d = -1;
    }

    public zkr(zii ziiVar) {
        super(ziiVar, true);
        this.d = -1;
    }

    public zkr(zih[] zihVarArr, byte[] bArr) {
        super(true, zihVarArr);
        this.d = -1;
    }

    public zkr(zih[] zihVarArr) {
        super(zihVarArr);
        this.d = -1;
    }

    @Override // defpackage.zjo, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
