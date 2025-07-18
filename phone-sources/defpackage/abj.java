package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abj implements bvu {
    public final abm a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final yow f;
    public final clx g;
    public final yjv h;
    public final List i;
    public final int j;
    public final int k;
    public final int l;
    public final uv m;
    public final int n;
    public final int o;
    private final bvu p;
    private final boolean q;
    private final int r;

    public abj(abm abmVar, int i, boolean z, float f, bvu bvuVar, float f2, boolean z2, yow yowVar, clx clxVar, int i2, yjv yjvVar, List list, int i3, int i4, int i5, uv uvVar, int i6, int i7) {
        this.a = abmVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.p = bvuVar;
        this.e = f2;
        this.q = z2;
        this.f = yowVar;
        this.g = clxVar;
        this.r = i2;
        this.h = yjvVar;
        this.i = list;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = uvVar;
        this.n = i6;
        this.o = i7;
    }

    @Override // defpackage.bvu
    public final int a() {
        return this.p.a();
    }

    @Override // defpackage.bvu
    public final int b() {
        return this.p.b();
    }

    public final long c() {
        return (b() << 32) | (a() & 4294967295L);
    }

    public final abj d(int i, boolean z) {
        abm abmVar;
        int i2;
        char c;
        long j;
        if (!this.q) {
            List list = this.i;
            if (!list.isEmpty() && (abmVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < abmVar.d) {
                abk abkVar = (abk) yfm.S(list);
                abk abkVar2 = (abk) yfm.W(list);
                if (!abkVar.n && !abkVar2.n) {
                    if (i < 0) {
                        uv uvVar = this.m;
                        if (Math.min((og.m(abkVar, uvVar) + abkVar.g) - this.j, (og.m(abkVar2, uvVar) + abkVar2.g) - this.k) <= (-i)) {
                            return null;
                        }
                    } else {
                        int i3 = this.j;
                        uv uvVar2 = this.m;
                        if (Math.min(i3 - og.m(abkVar, uvVar2), this.k - og.m(abkVar2, uvVar2)) <= i) {
                            return null;
                        }
                    }
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        abk abkVar3 = (abk) list.get(i4);
                        if (!abkVar3.n) {
                            long j2 = abkVar3.k;
                            boolean z2 = abkVar3.c;
                            int iA = cmf.a(j2);
                            long jB = cmf.b(j2) + i;
                            char c2 = ' ';
                            long j3 = 4294967295L;
                            abkVar3.k = (iA << 32) | (jB & 4294967295L);
                            if (z) {
                                int iD = abkVar3.d();
                                int i5 = 0;
                                while (i5 < iD) {
                                    acp acpVarB = abkVar3.e.b(abkVar3.b, i5);
                                    abm abmVar2 = abmVar;
                                    if (acpVarB != null) {
                                        long j4 = acpVarB.b;
                                        c = c2;
                                        j = j3;
                                        acpVarB.b = (Integer.valueOf(cmf.b(j4) + i).intValue() & j) | (cmf.a(j4) << c);
                                    } else {
                                        c = c2;
                                        j = j3;
                                    }
                                    i5++;
                                    abmVar = abmVar2;
                                    c2 = c;
                                    j3 = j;
                                }
                            }
                        }
                        i4++;
                        abmVar = abmVar;
                    }
                    return new abj(abmVar, i2, this.c || i > 0, i, this.p, this.e, false, this.f, this.g, this.r, this.h, list, this.j, this.k, this.l, this.m, this.n, this.o);
                }
            }
        }
        return null;
    }

    @Override // defpackage.bvu
    public final Map e() {
        return this.p.e();
    }

    @Override // defpackage.bvu
    public final void f() {
        this.p.f();
    }

    @Override // defpackage.bvu
    public final void g() {
        this.p.g();
    }
}
