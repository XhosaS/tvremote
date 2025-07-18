package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aai implements bvu {
    public final aaj a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final yow f;
    public final clx g;
    public final long h;
    public final List i;
    public final int j;
    public final int k;
    public final int l;
    public final uv m;
    public final int n;
    public final int o;
    private final bvu p;
    private final boolean q;

    public aai(aaj aajVar, int i, boolean z, float f, bvu bvuVar, float f2, boolean z2, yow yowVar, clx clxVar, long j, List list, int i2, int i3, int i4, uv uvVar, int i5, int i6) {
        this.a = aajVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.p = bvuVar;
        this.e = f2;
        this.q = z2;
        this.f = yowVar;
        this.g = clxVar;
        this.h = j;
        this.i = list;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = uvVar;
        this.n = i5;
        this.o = i6;
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

    public final aai d(int i, boolean z) {
        aaj aajVar;
        int i2;
        aaj aajVar2;
        long jB;
        if (!this.q) {
            List list = this.i;
            if (!list.isEmpty() && (aajVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < aajVar.h) {
                aaj aajVar3 = (aaj) yfm.S(list);
                aaj aajVar4 = (aaj) yfm.W(list);
                if (!aajVar3.j && !aajVar4.j) {
                    if (i < 0) {
                        if (Math.min((aajVar3.f + aajVar3.h) - this.j, (aajVar4.f + aajVar4.h) - this.k) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(this.j - aajVar3.f, this.k - aajVar4.f) <= i) {
                        return null;
                    }
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        aaj aajVar5 = (aaj) list.get(i3);
                        if (!aajVar5.j) {
                            aajVar5.f += i;
                            int[] iArr = aajVar5.m;
                            int length = iArr.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                int i5 = i4 & 1;
                                boolean z2 = aajVar5.b;
                                if (z2) {
                                    if (i5 == 0) {
                                        i5 = 0;
                                        if (z2) {
                                        }
                                    }
                                    iArr[i4] = iArr[i4] + i;
                                } else if (z2 && i5 == 0) {
                                    iArr[i4] = iArr[i4] + i;
                                }
                            }
                            if (z) {
                                int iD = aajVar5.d();
                                int i6 = 0;
                                while (i6 < iD) {
                                    acp acpVarB = aajVar5.e.b(aajVar5.d, i6);
                                    if (acpVarB != null) {
                                        boolean z3 = aajVar5.b;
                                        long j = acpVarB.b;
                                        if (z3) {
                                            aajVar2 = aajVar;
                                            jB = (cmf.a(j) << 32) | (Integer.valueOf(cmf.b(j) + i).intValue() & 4294967295L);
                                        } else {
                                            aajVar2 = aajVar;
                                            jB = (cmf.b(j) & 4294967295L) | (Integer.valueOf(cmf.a(j) + i).intValue() << 32);
                                        }
                                        acpVarB.b = jB;
                                    } else {
                                        aajVar2 = aajVar;
                                    }
                                    i6++;
                                    aajVar = aajVar2;
                                }
                            }
                        }
                        i3++;
                        aajVar = aajVar;
                    }
                    return new aai(aajVar, i2, this.c || i > 0, i, this.p, this.e, false, this.f, this.g, this.h, list, this.j, this.k, this.l, this.m, this.n, this.o);
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
