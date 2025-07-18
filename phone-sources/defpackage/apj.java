package defpackage;

import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apj {
    public static final bcp a = new bdz(new anu(6));

    public static final void a(final int i, final yjz yjzVar, yka ykaVar, yjz yjzVar2, yjz yjzVar3, zr zrVar, final yjz yjzVar4, bao baoVar, int i2) {
        int i3;
        yka ykaVar2;
        final yjz yjzVar5;
        yjz yjzVar6;
        zr zrVar2;
        bkp bkpVar;
        bao baoVarD = baoVar.d(675142332);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.G(false) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != baoVarD.D(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != baoVarD.H(yjzVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            ykaVar2 = ykaVar;
            i3 |= true != baoVarD.H(ykaVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            ykaVar2 = ykaVar;
        }
        if ((i2 & 24576) == 0) {
            yjzVar5 = yjzVar2;
            i3 |= true != baoVarD.H(yjzVar5) ? 8192 : 16384;
        } else {
            yjzVar5 = yjzVar2;
        }
        if ((196608 & i2) == 0) {
            yjzVar6 = yjzVar3;
            i3 |= true != baoVarD.H(yjzVar6) ? 65536 : 131072;
        } else {
            yjzVar6 = yjzVar3;
        }
        if ((1572864 & i2) == 0) {
            zrVar2 = zrVar;
            i3 |= true != baoVarD.F(zrVar2) ? 524288 : 1048576;
        } else {
            zrVar2 = zrVar;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != baoVarD.H(yjzVar4) ? 4194304 : 8388608;
        }
        if ((4793491 & i3) == 4793490 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new atu(1, null);
                basVar.ae(objT);
            }
            boolean z = (i3 & 896) == 256;
            boolean z2 = (57344 & i3) == 16384;
            boolean z3 = (3670016 & i3) == 1048576;
            boolean z4 = (458752 & i3) == 131072;
            boolean z5 = (i3 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32;
            boolean z6 = (i3 & 14) == 4;
            boolean z7 = (29360128 & i3) == 8388608;
            boolean z8 = (i3 & 7168) == 2048;
            final atu atuVar = (atu) objT;
            Object objT2 = basVar.T();
            if ((z8 || (z7 | z2 | z | z3 | z4 | z5 | z6)) || objT2 == obj) {
                final yka ykaVar3 = ykaVar2;
                final yjz yjzVar7 = yjzVar6;
                bkpVar = null;
                final zr zrVar3 = zrVar2;
                yjz yjzVar8 = new yjz() { // from class: ape
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
                    @Override // defpackage.yjz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r25, java.lang.Object r26) {
                        /*
                            Method dump skipped, instructions count: 925
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ape.a(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                basVar.ae(yjzVar8);
                objT2 = yjzVar8;
            } else {
                bkpVar = null;
            }
            bwu.a(bkpVar, (yjz) objT2, baoVarD, 0, 1);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new atr(i, yjzVar, ykaVar, yjzVar2, yjzVar3, zrVar, yjzVar4, i2, 1);
        }
    }

    public static final void b(final zr zrVar, bkp bkpVar, final cb cbVar, final yjz yjzVar, final yjz yjzVar2, final yka ykaVar, final yjz yjzVar3, final int i, final boolean z, final bol bolVar, final float f, final long j, final long j2, final long j3, final long j4, final long j5, final yka ykaVar2, bao baoVar, final int i2, final int i3) {
        int i4;
        yjz yjzVar4;
        int i5;
        yka ykaVar3;
        int i6;
        yjz yjzVar5;
        int i7;
        int i8;
        int i9;
        int i10;
        bao baoVar2;
        final bkp bkpVar2;
        int i11 = i2 & 6;
        bao baoVarD = baoVar.d(50073903);
        if (i11 == 0) {
            i4 = (true != baoVarD.F(zrVar) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != baoVarD.F(cbVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            yjzVar4 = yjzVar;
            i4 |= true != baoVarD.H(yjzVar4) ? 1024 : 2048;
        } else {
            yjzVar4 = yjzVar;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != baoVarD.H(yjzVar2) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i5 = 196608;
            ykaVar3 = ykaVar;
            i4 |= true != baoVarD.H(ykaVar3) ? 65536 : 131072;
        } else {
            i5 = 196608;
            ykaVar3 = ykaVar;
        }
        if ((i2 & 1572864) == 0) {
            i6 = 1572864;
            yjzVar5 = yjzVar3;
            i4 |= true != baoVarD.H(yjzVar5) ? 524288 : 1048576;
        } else {
            i6 = 1572864;
            yjzVar5 = yjzVar3;
        }
        if ((i2 & 12582912) == 0) {
            i7 = 12582912;
            i8 = i;
            i4 |= true != baoVarD.D(i8) ? 4194304 : 8388608;
        } else {
            i7 = 12582912;
            i8 = i;
        }
        if ((i2 & 100663296) == 0) {
            i9 = 100663296;
            i4 |= true != baoVarD.G(false) ? 33554432 : 67108864;
        } else {
            i9 = 100663296;
        }
        if ((805306368 & i2) == 0) {
            i4 |= true != baoVarD.H(null) ? 268435456 : 536870912;
        }
        int i12 = i4;
        if ((i3 & 6) == 0) {
            i10 = (true != baoVarD.G(z) ? 2 : 4) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= true != baoVarD.F(bolVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i10 |= true != baoVarD.C(f) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i10 |= true != baoVarD.E(j) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i10 |= true == baoVarD.E(j2) ? 16384 : 8192;
        }
        if ((i3 & i5) == 0) {
            i10 |= true == baoVarD.E(j3) ? 131072 : 65536;
        }
        if ((i3 & i6) == 0) {
            i10 |= true != baoVarD.E(j4) ? 524288 : 1048576;
        }
        if ((i3 & i7) == 0) {
            i10 |= true != baoVarD.E(j5) ? 4194304 : 8388608;
        }
        if ((i3 & i9) == 0) {
            i10 |= true != baoVarD.H(ykaVar2) ? 33554432 : 67108864;
        }
        if ((i12 & 306783379) == 306783378 && (38347923 & i10) == 38347922 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i2 & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            int i13 = i12 & 14;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (i13 == 4 || objT == ban.a) {
                objT = new aov(zrVar);
                basVar.ae(objT);
            }
            baoVar2 = baoVarD;
            bhq bhqVarK = bga.k(-1236753028, new api((aov) objT, zrVar, j4, j5, i8, yjzVar4, ykaVar2, yjzVar5, yjzVar2, ykaVar3, cbVar), baoVar2);
            baoVar2.x(1400751284);
            bkpVar2 = bkpVar;
            bhqVarK.a(bkpVar2, baoVar2, Integer.valueOf(((i12 >> 3) & 14) | 48));
            basVar.aa();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: apd
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    zr zrVar2 = zrVar;
                    bkp bkpVar3 = bkpVar2;
                    cb cbVar2 = cbVar;
                    yjz yjzVar6 = yjzVar;
                    yjz yjzVar7 = yjzVar2;
                    yka ykaVar4 = ykaVar;
                    yjz yjzVar8 = yjzVar3;
                    int i14 = i;
                    boolean z2 = z;
                    bol bolVar2 = bolVar;
                    float f2 = f;
                    long j6 = j;
                    long j7 = j2;
                    long j8 = j3;
                    long j9 = j4;
                    long j10 = j5;
                    int i15 = i2;
                    apj.b(zrVar2, bkpVar3, cbVar2, yjzVar6, yjzVar7, ykaVar4, yjzVar8, i14, z2, bolVar2, f2, j6, j7, j8, j9, j10, ykaVar2, (bao) obj, bdi.n(i15 | 1), bdi.n(i3));
                    return ygi.a;
                }
            };
        }
    }

    public static final void c(bkp bkpVar, cb cbVar, yjz yjzVar, yjz yjzVar2, yka ykaVar, final yjz yjzVar3, int i, boolean z, bol bolVar, float f, long j, long j2, long j3, long j4, long j5, final yka ykaVar2, bao baoVar, final int i2, final int i3) {
        yjz yjzVar4;
        bkp bkpVar2;
        yjz yjzVar5;
        yka ykaVar3;
        bol bolVar2;
        float f2;
        long jL;
        long jA;
        int i4;
        bao baoVar2;
        long j6;
        yjz yjzVar6;
        long j7;
        int i5;
        cb cbVar2;
        int i6;
        boolean z2;
        long j8;
        final bkp bkpVar3;
        final cb cbVar3;
        final yjz yjzVar7;
        final yjz yjzVar8;
        final yka ykaVar4;
        final int i7;
        final boolean z3;
        final bol bolVar3;
        final float f3;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        int i8 = i2 | 6;
        bao baoVarD = baoVar.d(1135600301);
        if ((i2 & 48) == 0) {
            i8 = i2 | 22;
        }
        int i9 = i8 | 28032;
        if ((i2 & 196608) == 0) {
            yjzVar4 = yjzVar3;
            i9 |= true != baoVarD.H(yjzVar4) ? 65536 : 131072;
        } else {
            yjzVar4 = yjzVar3;
        }
        int i10 = (i3 & 6) == 0 ? i3 | 2 : i3;
        int i11 = i10 | 48;
        if ((i3 & 384) == 0) {
            i11 = i10 | 176;
        }
        if ((i3 & 3072) == 0) {
            i11 |= 1024;
        }
        if ((i3 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((196608 & i3) == 0) {
            i11 |= 65536;
        }
        if ((1572864 & i3) == 0) {
            i11 |= 524288;
        }
        if ((12582912 & i3) == 0) {
            i11 |= true != baoVarD.H(ykaVar2) ? 4194304 : 8388608;
        }
        int i12 = i9 | 920125440;
        if ((306783379 & i12) == 306783378 && (4793491 & i11) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            yjzVar7 = yjzVar;
            yjzVar8 = yjzVar2;
            ykaVar4 = ykaVar;
            i7 = i;
            z3 = z;
            bolVar3 = bolVar;
            f3 = f;
            j9 = j;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            baoVar2 = baoVarD;
            cbVar3 = cbVar;
        } else {
            int i13 = (-4194191) & i11;
            int i14 = i12 & (-113);
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                bkpVar2 = bkp.g;
                aoi aoiVar = aoi.a;
                int i15 = aoh.a;
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                Object obj = ban.a;
                if (objT == obj) {
                    objT = new afh(15);
                    basVar.ae(objT);
                }
                yjv yjvVar = (yjv) objT;
                Object[] objArr = new Object[0];
                bij bijVar = new bij(new xb(6), new akh(yjvVar, 16));
                boolean zF = baoVarD.F(yjvVar);
                Object objT2 = basVar.T();
                if (zF || objT2 == obj) {
                    objT2 = new qm(aoiVar, yjvVar, 15);
                    basVar.ae(objT2);
                }
                Object objT3 = basVar.T();
                if (objT3 == obj) {
                    objT3 = new cb((byte[]) null, (byte[]) null);
                    basVar.ae(objT3);
                }
                cb cbVar4 = (cb) objT3;
                Object objT4 = basVar.T();
                if (objT4 == obj) {
                    objT4 = new cb(cbVar4, (byte[]) null);
                    basVar.ae(objT4);
                }
                yjz yjzVar9 = ans.a;
                yjzVar5 = ans.b;
                ykaVar3 = ans.c;
                bolVar2 = kv.C(baoVarD).b;
                float f4 = aog.a;
                f2 = aog.a;
                jL = kv.B(baoVarD).l();
                jA = anq.a(jL, baoVarD);
                long jG = kv.B(baoVarD).g();
                long jK = bny.k(bnq.d(jG), bnq.c(jG), bnq.b(jG), 0.32f, bnq.f(jG));
                long jA2 = kv.B(baoVarD).a();
                long jA3 = anq.a(jA2, baoVarD);
                i4 = 2;
                baoVar2 = baoVarD;
                j6 = jA3;
                yjzVar6 = yjzVar9;
                j7 = jA2;
                i5 = i14;
                cbVar2 = (cb) objT4;
                i6 = i12;
                z2 = true;
                j8 = jK;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                yjzVar6 = yjzVar;
                yjzVar5 = yjzVar2;
                ykaVar3 = ykaVar;
                z2 = z;
                bolVar2 = bolVar;
                f2 = f;
                jL = j;
                jA = j2;
                j8 = j3;
                j7 = j4;
                j6 = j5;
                i6 = i12;
                baoVar2 = baoVarD;
                i5 = i14;
                cbVar2 = cbVar;
                i4 = i;
            }
            baoVar2.m();
            int i16 = i13 << 3;
            int i17 = ((i6 >> 27) & 14) | (i16 & 896) | (234881024 & i16);
            bkp bkpVar4 = bkpVar2;
            yjz yjzVar10 = yjzVar5;
            yka ykaVar5 = ykaVar3;
            int i18 = i4;
            b(new yh(), bkpVar4, cbVar2, yjzVar6, yjzVar10, ykaVar5, yjzVar4, i18, z2, bolVar2, f2, jL, jA, j8, j7, j6, ykaVar2, baoVar2, (i5 << 3) & 2147482736, i17);
            bkpVar3 = bkpVar4;
            cbVar3 = cbVar2;
            yjzVar7 = yjzVar6;
            yjzVar8 = yjzVar10;
            ykaVar4 = ykaVar5;
            i7 = i18;
            z3 = z2;
            bolVar3 = bolVar2;
            f3 = f2;
            j9 = jL;
            j10 = jA;
            j11 = j8;
            j12 = j7;
            j13 = j6;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: apf
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    bkp bkpVar5 = bkpVar3;
                    cb cbVar5 = cbVar3;
                    yjz yjzVar11 = yjzVar7;
                    yjz yjzVar12 = yjzVar8;
                    yka ykaVar6 = ykaVar4;
                    yjz yjzVar13 = yjzVar3;
                    int i19 = i7;
                    boolean z4 = z3;
                    bol bolVar4 = bolVar3;
                    float f5 = f3;
                    long j14 = j9;
                    long j15 = j10;
                    long j16 = j11;
                    long j17 = j12;
                    long j18 = j13;
                    int i20 = i2;
                    apj.c(bkpVar5, cbVar5, yjzVar11, yjzVar12, ykaVar6, yjzVar13, i19, z4, bolVar4, f5, j14, j15, j16, j17, j18, ykaVar2, (bao) obj2, bdi.n(i20 | 1), bdi.n(i3));
                    return ygi.a;
                }
            };
        }
    }
}
