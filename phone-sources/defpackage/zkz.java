package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zkz extends zjo {
    private int d;

    public zkz() {
        this.d = -1;
    }

    private final int i() {
        int i = this.d;
        if (i >= 0) {
            return i;
        }
        int iA = 0;
        for (zih zihVar : this.a) {
            iA += zihVar.p().l().a(true);
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
        zih[] zihVarArr = this.a;
        zkx zkxVarE = zjfVar.e();
        int length = zihVarArr.length;
        int i = 0;
        if (this.d >= 0 || length > 16) {
            zjfVar.h(i());
            while (i < length) {
                zkxVarE.p(zihVarArr[i].p());
                i++;
            }
            return;
        }
        zjh[] zjhVarArr = new zjh[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            zjh zjhVarL = zihVarArr[i2].p().l();
            zjhVarArr[i2] = zjhVarL;
            iA += zjhVarL.a(true);
        }
        this.d = iA;
        zjfVar.h(iA);
        while (i < length) {
            zkxVarE.p(zjhVarArr[i]);
            i++;
        }
    }

    public zkz(zii ziiVar) {
        super(ziiVar, false);
        this.d = -1;
    }

    public zkz(zih[] zihVarArr) {
        super(false, zihVarArr);
        this.d = -1;
    }

    public zkz(zih[] zihVarArr, zih[] zihVarArr2) {
        super(zihVarArr, zihVarArr2);
        this.d = -1;
    }

    @Override // defpackage.zjo, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
