package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class byz extends bwj implements bvv, bzj {
    public boolean i;
    public boolean j;
    public boolean k;
    public final bwi l;
    public ki m;
    public cbp n;

    public byz() {
        yjv yjvVar = bwk.a;
        this.l = new bvq(this);
    }

    protected static final void S(bzq bzqVar) {
        bxl bxlVar;
        bzq bzqVar2 = bzqVar.v;
        if (!yks.e(bzqVar2 != null ? bzqVar2.s : null, bzqVar.s)) {
            ((bzh) bzqVar.Z()).w.e();
            return;
        }
        bxm bxmVarI = bzqVar.Z().i();
        if (bxmVarI == null || (bxlVar = ((bzh) bxmVarI).w) == null) {
            return;
        }
        bxlVar.e();
    }

    public abstract long H();

    public abstract bvc I();

    public abstract bvu J();

    public abstract bys K();

    public abstract byz L();

    public abstract byz M();

    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(defpackage.bys r32, defpackage.bwp r33) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byz.N(bys, bwp):void");
    }

    public final void O(bvu bvuVar) {
        ki kiVar;
        int i;
        int i2;
        ki kiVar2;
        int i3;
        char c;
        long j;
        int i4;
        int i5;
        int i6;
        ki kiVar3 = this.m;
        if (this.k) {
            return;
        }
        bvuVar.g();
        if (kiVar3 != null) {
            Object[] objArr = kiVar3.c;
            long[] jArr = kiVar3.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i7 = 0;
                while (true) {
                    long j2 = jArr[i7];
                    char c2 = 7;
                    long j3 = -9187201950435737472L;
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = i7 - length;
                        int i9 = 0;
                        while (true) {
                            int i10 = 8;
                            i2 = 8 - ((~i8) >>> 31);
                            if (i9 >= i2) {
                                break;
                            }
                            if ((j2 & 255) < 128) {
                                kk kkVar = (kk) objArr[(i7 << 3) + i9];
                                c = c2;
                                Object[] objArr2 = kkVar.b;
                                long[] jArr2 = kkVar.a;
                                j = j3;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    i3 = i7;
                                    int i11 = 0;
                                    while (true) {
                                        long j4 = jArr2[i11];
                                        kiVar2 = kiVar3;
                                        if ((((~j4) << c) & j4 & j) != j) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j4 & 255) < 128) {
                                                    i6 = i10;
                                                    bys bysVar = (bys) ((cam) objArr2[(i11 << 3) + i13]).get();
                                                    if (bysVar != null) {
                                                        if (cA()) {
                                                            i5 = i13;
                                                            bysVar.R(false);
                                                        } else {
                                                            i5 = i13;
                                                            bysVar.S(false);
                                                        }
                                                        j4 >>= i6;
                                                        i13 = i5 + 1;
                                                        i10 = i6;
                                                    } else {
                                                        i5 = i13;
                                                    }
                                                } else {
                                                    i5 = i13;
                                                    i6 = i10;
                                                }
                                                j4 >>= i6;
                                                i13 = i5 + 1;
                                                i10 = i6;
                                            }
                                            i4 = i10;
                                            if (i12 == i4) {
                                                break;
                                            }
                                        } else {
                                            i4 = i10;
                                        }
                                        if (i11 != length2) {
                                            i11++;
                                            i10 = i4;
                                            kiVar3 = kiVar2;
                                        }
                                    }
                                    j2 >>= i4;
                                    i9++;
                                    c2 = c;
                                    j3 = j;
                                    i7 = i3;
                                    kiVar3 = kiVar2;
                                } else {
                                    kiVar2 = kiVar3;
                                    i3 = i7;
                                }
                            } else {
                                kiVar2 = kiVar3;
                                i3 = i7;
                                c = c2;
                                j = j3;
                            }
                            i4 = 8;
                            j2 >>= i4;
                            i9++;
                            c2 = c;
                            j3 = j;
                            i7 = i3;
                            kiVar3 = kiVar2;
                        }
                        kiVar = kiVar3;
                        int i14 = i7;
                        if (i2 != 8) {
                            break;
                        } else {
                            i = i14;
                        }
                    } else {
                        kiVar = kiVar3;
                        i = i7;
                    }
                    if (i == length) {
                        break;
                    }
                    i7 = i + 1;
                    kiVar3 = kiVar;
                }
            } else {
                kiVar = kiVar3;
            }
            kiVar.i();
        }
    }

    public abstract void P();

    @Override // defpackage.bzj
    public final void Q(boolean z) {
        byz byzVarM = M();
        bys bysVarK = byzVarM != null ? byzVarM.K() : null;
        if (yks.e(bysVarK, K())) {
            this.i = z;
        } else {
            if ((bysVarK == null || bysVarK.av() != 3) && (bysVarK == null || bysVarK.av() != 4)) {
                return;
            }
            this.i = z;
        }
    }

    public abstract boolean R();

    @Override // defpackage.buz
    public boolean cA() {
        return false;
    }

    @Override // defpackage.bvv
    public final bvu cB(int i, int i2, Map map, yjv yjvVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bty.c(a.cn(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new byy(i, i2, map, yjvVar, this);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.bvw
    public final int cs(bub bubVar) {
        int iQ;
        if (!R() || (iQ = q(bubVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = bubVar instanceof bxa;
        long j = this.e;
        return iQ + (z ? cmf.a(j) : cmf.b(j));
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    @Override // defpackage.bvv
    public final /* synthetic */ bvu cz(int i, int i2, Map map, yjv yjvVar) {
        return fh.U(this, i, i2, map, yjvVar);
    }

    public abstract int q(bub bubVar);
}
