package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zky extends zjm {
    private int c;

    public zky() {
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
            iA += this.a[i2].p().l().a(true);
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
        zkx zkxVarE = zjfVar.e();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            zjfVar.h(r());
            while (i < length) {
                zkxVarE.p(this.a[i].p());
                i++;
            }
            return;
        }
        zjh[] zjhVarArr = new zjh[length];
        int iA = 0;
        for (int i2 = 0; i2 < length; i2++) {
            zjh zjhVarL = this.a[i2].p().l();
            zjhVarArr[i2] = zjhVarL;
            iA += zjhVarL.a(true);
        }
        this.c = iA;
        zjfVar.h(iA);
        while (i < length) {
            zkxVarE.p(zjhVarArr[i]);
            i++;
        }
    }

    @Override // defpackage.zjm
    public final zic g() {
        return new zkt(zjy.q(o()));
    }

    @Override // defpackage.zjm
    public final zjd i() {
        return new zkn(zkb.h(q()));
    }

    @Override // defpackage.zjm
    public final zjo n() {
        return new zkz(this.a);
    }

    public zky(zih zihVar) {
        super(zihVar);
        this.c = -1;
    }

    public zky(zii ziiVar) {
        super(ziiVar);
        this.c = -1;
    }

    public zky(zih[] zihVarArr) {
        super(zihVarArr, null);
        this.c = -1;
    }

    @Override // defpackage.zjm, defpackage.zjh
    public final zjh l() {
        return this;
    }
}
