package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class k {
    private static int h = 1000;
    public h[] c;
    public final i g;
    int a = 0;
    public final j b = new j();
    private int i = 32;
    private int j = 32;
    public boolean[] d = new boolean[32];
    public int e = 1;
    public int f = 0;
    private int k = 32;
    private m[] l = new m[h];
    private int m = 0;
    private h[] n = new h[32];

    public k() {
        this.c = null;
        this.c = new h[32];
        q();
        this.g = new i();
    }

    public static h c(k kVar, m mVar, m mVar2, int i, float f, m mVar3, m mVar4, int i2, boolean z) {
        h hVarB = kVar.b();
        hVarB.c(mVar, mVar2, i, f, mVar3, mVar4, i2);
        if (z) {
            m mVarE = kVar.e();
            m mVarE2 = kVar.e();
            mVarE.c = 4;
            mVarE2.c = 4;
            hVarB.b(mVarE, mVarE2);
        }
        return hVarB;
    }

    public static h d(k kVar, m mVar, m mVar2, int i, boolean z) {
        h hVarB = kVar.b();
        hVarB.g(mVar, mVar2, i);
        if (z) {
            hVarB.d.f(kVar.e(), 1.0f);
        }
        return hVarB;
    }

    private final void p() {
        int i = this.i;
        int i2 = i + i;
        this.i = i2;
        this.c = (h[]) Arrays.copyOf(this.c, i2);
        i iVar = this.g;
        iVar.a = (m[]) Arrays.copyOf(iVar.a, this.i);
        int i3 = this.i;
        this.d = new boolean[i3];
        this.j = i3;
        this.k = i3;
        this.b.a.clear();
    }

    private final void q() {
        int i = 0;
        while (true) {
            h[] hVarArr = this.c;
            if (i >= hVarArr.length) {
                return;
            }
            h hVar = hVarArr[i];
            if (hVar != null) {
                this.g.b.b(hVar);
            }
            this.c[i] = null;
            i++;
        }
    }

    private final m r(int i) {
        m mVar = (m) this.g.c.a();
        if (mVar == null) {
            mVar = new m(i);
        } else {
            mVar.b();
            mVar.h = i;
        }
        int i2 = this.m;
        int i3 = h;
        if (i2 >= i3) {
            int i4 = i3 + i3;
            h = i4;
            this.l = (m[]) Arrays.copyOf(this.l, i4);
        }
        m[] mVarArr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        mVarArr[i5] = mVar;
        return mVar;
    }

    public final int a(Object obj) {
        m mVar = ((o) obj).f;
        if (mVar != null) {
            return (int) (mVar.d + 0.5f);
        }
        return 0;
    }

    public final h b() {
        i iVar = this.g;
        h hVar = (h) iVar.b.a();
        if (hVar == null) {
            return new h(iVar);
        }
        hVar.a = null;
        g gVar = hVar.d;
        gVar.f = -1;
        gVar.g = -1;
        gVar.h = false;
        gVar.a = 0;
        hVar.b = 0.0f;
        hVar.e = false;
        return hVar;
    }

    public final m e() {
        if (this.e + 1 >= this.j) {
            p();
        }
        m mVarR = r(4);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        mVarR.a = i;
        this.g.a[i] = mVarR;
        return mVarR;
    }

    public final m f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.e + 1 >= this.j) {
            p();
        }
        o oVar = (o) obj;
        m mVar = oVar.f;
        if (mVar == null) {
            oVar.e();
            mVar = oVar.f;
        }
        int i = mVar.a;
        if (i != -1) {
            if (i <= this.a && this.g.a[i] != null) {
                return mVar;
            }
            if (i != -1) {
                mVar.b();
            }
        }
        int i2 = this.a + 1;
        this.a = i2;
        this.e++;
        mVar.a = i2;
        mVar.h = 1;
        this.g.a[i2] = mVar;
        return mVar;
    }

    public final m g() {
        if (this.e + 1 >= this.j) {
            p();
        }
        m mVarR = r(3);
        int i = this.a + 1;
        this.a = i;
        this.e++;
        mVarR.a = i;
        this.g.a[i] = mVarR;
        return mVarR;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(defpackage.h r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k.h(h):void");
    }

    public final void i(m mVar, int i) {
        int i2 = mVar.b;
        if (i2 != -1) {
            h hVar = this.c[i2];
            if (hVar.e) {
                hVar.b = i;
                return;
            }
            h hVarB = b();
            hVarB.f(mVar, i);
            h(hVarB);
            return;
        }
        float f = i;
        h hVarB2 = b();
        hVarB2.a = mVar;
        mVar.d = f;
        hVarB2.b = f;
        hVarB2.e = true;
        h(hVarB2);
    }

    public final void j(m mVar, m mVar2, int i, int i2) {
        h hVarB = b();
        m mVarG = g();
        mVarG.c = i2;
        hVarB.h(mVar, mVar2, mVarG, i);
        h(hVarB);
    }

    public final void k(m mVar, m mVar2, int i, int i2) {
        h hVarB = b();
        m mVarG = g();
        mVarG.c = i2;
        hVarB.i(mVar, mVar2, mVarG, i);
        h(hVarB);
    }

    public final void l() {
        i iVar;
        int i = 0;
        while (true) {
            iVar = this.g;
            m[] mVarArr = iVar.a;
            if (i >= mVarArr.length) {
                break;
            }
            m mVar = mVarArr[i];
            if (mVar != null) {
                mVar.b();
            }
            i++;
        }
        l lVar = iVar.c;
        m[] mVarArr2 = this.l;
        int i2 = this.m;
        int length = mVarArr2.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            m mVar2 = mVarArr2[i3];
            int i4 = lVar.b;
            if (i4 < 256) {
                lVar.a[i4] = mVar2;
                lVar.b = i4 + 1;
            }
        }
        this.m = 0;
        Arrays.fill(iVar.a, (Object) null);
        this.a = 0;
        this.b.a.clear();
        this.e = 1;
        for (int i5 = 0; i5 < this.f; i5++) {
            this.c[i5].c = false;
        }
        q();
        this.f = 0;
    }

    public final void m(m mVar, m mVar2, int i, float f, m mVar3, m mVar4, int i2) {
        h hVarB = b();
        hVarB.c(mVar, mVar2, i, f, mVar3, mVar4, i2);
        m mVarE = e();
        m mVarE2 = e();
        mVarE.c = 4;
        mVarE2.c = 4;
        hVarB.b(mVarE, mVarE2);
        h(hVarB);
    }

    public final void n(m mVar, m mVar2, int i, int i2) {
        h hVarB = b();
        hVarB.g(mVar, mVar2, i);
        m mVarE = e();
        m mVarE2 = e();
        mVarE.c = i2;
        mVarE2.c = i2;
        hVarB.b(mVarE, mVarE2);
        h(hVarB);
    }

    public final void o(j jVar) {
        int i = 0;
        while (true) {
            if (i >= this.f) {
                break;
            }
            h hVar = this.c[i];
            if (hVar.a.h != 1 && hVar.b < 0.0f) {
                while (true) {
                    float f = Float.MAX_VALUE;
                    int i2 = -1;
                    int i3 = -1;
                    int i4 = 0;
                    for (int i5 = 0; i5 < this.f; i5++) {
                        h hVar2 = this.c[i5];
                        if (hVar2.a.h != 1 && hVar2.b < 0.0f) {
                            for (int i6 = 1; i6 < this.e; i6++) {
                                m mVar = this.g.a[i6];
                                float fA = hVar2.d.a(mVar);
                                if (fA > 0.0f) {
                                    for (int i7 = 0; i7 < 6; i7++) {
                                        float f2 = mVar.e[i7] / fA;
                                        if ((f2 < f && i7 == i4) || i7 > i4) {
                                            f = f2;
                                            i2 = i5;
                                            i3 = i6;
                                            i4 = i7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i2 == -1) {
                        break;
                    }
                    h hVar3 = this.c[i2];
                    hVar3.a.b = -1;
                    hVar3.a(this.g.a[i3]);
                    hVar3.a.b = i2;
                    for (int i8 = 0; i8 < this.f; i8++) {
                        h hVar4 = this.c[i8];
                        hVar4.d.h(hVar4, hVar3);
                    }
                    jVar.a(this);
                }
            } else {
                i++;
            }
        }
        for (int i9 = 0; i9 < this.f; i9++) {
            h hVar5 = this.c[i9];
            if (hVar5.a.h != 1 && hVar5.b < 0.0f) {
                return;
            }
        }
    }
}
