package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atc {
    public static final long a = brx.E(0.5f, 0.0f);

    public static final void a(long j, yjk yjkVar, boolean z, bao baoVar, int i) {
        int i2;
        bkp bkpVarB;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(951870469);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != baoVarD.E(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if (!baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            baoVarD.t();
        } else if (j != 16) {
            baoVarD.x(1799274261);
            bdy bdyVarB = mu.b(true != z ? 0.0f : 1.0f, wv.F(4, baoVarD), baoVarD, 28);
            String strW = zy.w(R.string.close_sheet, baoVarD);
            if (z) {
                baoVarD.x(1799566281);
                int i5 = i2 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                bkm bkmVar = bkp.g;
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (i5 == 32 || objT == ban.a) {
                    objT = new qi(yjkVar, 9);
                    basVar.ae(objT);
                }
                bkp bkpVarA = btm.a(bkmVar, yjkVar, (PointerInputEventHandler) objT);
                boolean zF = (i5 == 32) | baoVarD.F(strW);
                Object objT2 = basVar.T();
                if (zF || objT2 == ban.a) {
                    objT2 = new afk(strW, yjkVar, 15);
                    basVar.ae(objT2);
                }
                bkpVarB = cfd.b(bkpVarA, true, (yjv) objT2);
                basVar.aa();
            } else {
                baoVarD.x(1799992469);
                ((bas) baoVarD).aa();
                bkpVarB = bkp.g;
            }
            bkp bkpVarA2 = bkp.g.a(zi.c).a(bkpVarB);
            boolean zF2 = ((i2 & 14) == 4) | baoVarD.F(bdyVarB);
            bas basVar2 = (bas) baoVarD;
            Object objT3 = basVar2.T();
            if (zF2 || objT3 == ban.a) {
                objT3 = new ikb(j, bdyVarB, i4);
                basVar2.ae(objT3);
            }
            ht.i(bkpVarA2, (yjv) objT3, baoVarD, 0);
            basVar2.aa();
        } else {
            baoVarD.x(1800173757);
            ((bas) baoVarD).aa();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwr(j, yjkVar, z, i, 1);
        }
    }

    public static final float b(boi boiVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (boiVar.n >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (cmq.f(0.0f, Math.min(cme.j(boiVar, 48.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float c(boi boiVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (boiVar.n & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (cmq.f(0.0f, Math.min(cme.j(boiVar, 24.0f), fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final void d(final yjk yjkVar, final bkp bkpVar, final auv auvVar, float f, boolean z, bol bolVar, final long j, long j2, long j3, final yjz yjzVar, yjz yjzVar2, atd atdVar, final yka ykaVar, bao baoVar, final int i, final int i2) {
        int i3;
        int i4;
        bao baoVar2;
        final float f2;
        final boolean z2;
        final bol bolVar2;
        final long j4;
        final long j5;
        final yjz yjzVar3;
        final atd atdVar2;
        yjz yjzVar4;
        int i5;
        float f3;
        atd atdVar3;
        long j6;
        long j7;
        boolean z3;
        bol bolVar3;
        int i6;
        int i7;
        int i8;
        boolean z4;
        auv auvVar2;
        yow yowVar;
        Object obj;
        mr mrVar;
        bas basVar;
        bao baoVarD = baoVar.d(1904798512);
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.F(auvVar) ? 128 : 256;
        }
        int i9 = i3 | 27648;
        if ((196608 & i) == 0) {
            i9 = i3 | 93184;
        }
        if ((1572864 & i) == 0) {
            i9 |= true != baoVarD.E(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i9 |= 4194304;
        }
        int i10 = 100663296 | i9;
        if ((805306368 & i) == 0) {
            i10 = i9 | 369098752;
        }
        int i11 = i10;
        if ((i2 & 6) == 0) {
            i4 = (true == baoVarD.H(yjzVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i12 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i12 |= true != baoVarD.H(ykaVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if (baoVarD.L(((306783379 & i11) == 306783378 && (i12 & 1171) == 1170) ? false : true, i11 & 1)) {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bol bolVarB = aur.b(4, baoVarD);
                long jB = arm.b(j, baoVarD);
                long jF = arm.f(30, baoVarD);
                long jK = bny.k(bnq.d(jF), bnq.c(jF), bnq.b(jF), 0.32f, bnq.f(jF));
                yjzVar4 = anr.i;
                i5 = i12;
                f3 = 640.0f;
                atdVar3 = new atd(null);
                j6 = jB;
                j7 = jK;
                z3 = true;
                bolVar3 = bolVarB;
            } else {
                baoVarD.t();
                f3 = f;
                z3 = z;
                bolVar3 = bolVar;
                j7 = j3;
                yjzVar4 = yjzVar2;
                atdVar3 = atdVar;
                i5 = i12;
                j6 = j2;
            }
            baoVarD.m();
            np npVarF = wv.F(1, baoVarD);
            np npVarF2 = wv.F(1, baoVarD);
            np npVarF3 = wv.F(5, baoVarD);
            int i13 = (i11 & 896) ^ 384;
            boolean zH = ((i13 > 256 && baoVarD.F(auvVar)) || (i11 & 384) == 256) | baoVarD.H(npVarF2) | baoVarD.H(npVarF3) | baoVarD.H(npVarF);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            if (zH || objT == ban.a) {
                i6 = i13;
                i7 = i5;
                i8 = i11;
                z4 = true;
                auvVar2 = auvVar;
                objT = new nz(auvVar2, npVarF2, npVarF3, npVarF, 3);
                basVar2.ae(objT);
            } else {
                auvVar2 = auvVar;
                i6 = i13;
                i7 = i5;
                i8 = i11;
                z4 = true;
            }
            bbn.g((yjk) objT, baoVarD);
            Object objT2 = basVar2.T();
            Object obj2 = ban.a;
            if (objT2 == obj2) {
                objT2 = bbn.a(yim.a, baoVarD);
                basVar2.ae(objT2);
            }
            yow yowVar2 = (yow) objT2;
            boolean zH2 = (((i6 <= 256 || !baoVarD.F(auvVar2)) && (i8 & 384) != 256) ? false : z4) | baoVarD.H(yowVar2);
            boolean z5 = (i8 & 14) == 4 ? z4 : false;
            Object objT3 = basVar2.T();
            if ((zH2 || z5) || objT3 == obj2) {
                yowVar = yowVar2;
                obj = obj2;
                bg bgVar = new bg(auvVar2, yowVar, yjkVar, 9, (byte[]) null);
                basVar2.ae(bgVar);
                objT3 = bgVar;
            } else {
                obj = obj2;
                yowVar = yowVar2;
            }
            yjk yjkVar2 = (yjk) objT3;
            boolean zH3 = baoVarD.H(yowVar) | (((i6 <= 256 || !baoVarD.F(auvVar2)) && (i8 & 384) != 256) ? false : z4);
            Object objT4 = basVar2.T();
            if ((zH3 | z5) || objT4 == obj) {
                yow yowVar3 = yowVar;
                auv auvVar3 = auvVar2;
                gk gkVar = new gk((Object) yowVar3, (Object) auvVar3, (Object) yjkVar, 9, (char[]) null);
                yowVar = yowVar3;
                auvVar2 = auvVar3;
                basVar2.ae(gkVar);
                objT4 = gkVar;
            }
            yjv yjvVar = (yjv) objT4;
            Object objT5 = basVar2.T();
            if (objT5 == obj) {
                objT5 = ms.a(0.0f);
                basVar2.ae(objT5);
            }
            mr mrVar2 = (mr) objT5;
            boolean zH4 = (((i6 <= 256 || !baoVarD.F(auvVar2)) && (i8 & 384) != 256) ? false : z4) | baoVarD.H(yowVar) | baoVarD.H(mrVar2);
            Object objT6 = basVar2.T();
            if ((zH4 || z5) || objT6 == obj) {
                mrVar = mrVar2;
                nz nzVar = new nz(auvVar2, yowVar, mrVar, yjkVar, 2);
                basVar2.ae(nzVar);
                objT6 = nzVar;
            } else {
                mrVar = mrVar2;
            }
            mr mrVar3 = mrVar;
            int i14 = i8;
            int i15 = i6;
            Object obj3 = obj;
            boolean z6 = z3;
            bol bolVar4 = bolVar3;
            float f4 = f3;
            long j8 = j7;
            yjz yjzVar5 = yjzVar4;
            baoVar2 = baoVarD;
            atd atdVar4 = atdVar3;
            wv.G((yjk) objT6, j6, atdVar4, mrVar3, bga.k(1010026864, new asy(j8, yjkVar2, auvVar, mrVar3, yowVar, yjvVar, bkpVar, f4, z6, bolVar4, j, j6, yjzVar, yjzVar5, ykaVar), baoVar2), baoVar2, (i7 & 896) | 28672);
            if (auvVar.b.n().e(auw.b)) {
                baoVar2.x(748387346);
                if ((i15 <= 256 || !baoVar2.F(auvVar)) && (i14 & 384) != 256) {
                    z4 = false;
                }
                Object objT7 = basVar2.T();
                if (z4 || objT7 == obj3) {
                    objT7 = new ajn(auvVar, (yih) null, 11, (char[]) null);
                    basVar = basVar2;
                    basVar.ae(objT7);
                } else {
                    basVar = basVar2;
                }
                bbn.f(auvVar, (yjz) objT7, baoVar2);
                basVar.aa();
            } else {
                baoVar2.x(748448850);
                basVar2.aa();
            }
            z2 = z6;
            bolVar2 = bolVar4;
            j5 = j8;
            atdVar2 = atdVar4;
            f2 = f4;
            j4 = j6;
            yjzVar3 = yjzVar5;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            f2 = f;
            z2 = z;
            bolVar2 = bolVar;
            j4 = j2;
            j5 = j3;
            yjzVar3 = yjzVar2;
            atdVar2 = atdVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: asw
                @Override // defpackage.yjz
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    yjk yjkVar3 = yjkVar;
                    bkp bkpVar2 = bkpVar;
                    auv auvVar4 = auvVar;
                    float f5 = f2;
                    boolean z7 = z2;
                    bol bolVar5 = bolVar2;
                    long j9 = j;
                    long j10 = j4;
                    long j11 = j5;
                    yjz yjzVar6 = yjzVar;
                    yjz yjzVar7 = yjzVar3;
                    int i16 = i;
                    atd atdVar5 = atdVar2;
                    int iN = bdi.n(i16 | 1);
                    int iN2 = bdi.n(i2);
                    atc.d(yjkVar3, bkpVar2, auvVar4, f5, z7, bolVar5, j9, j10, j11, yjzVar6, yjzVar7, atdVar5, ykaVar, (bao) obj4, iN, iN2);
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final defpackage.xr r38, final defpackage.mr r39, final defpackage.yow r40, final defpackage.yjk r41, final defpackage.yjv r42, final defpackage.bkp r43, final defpackage.auv r44, final float r45, final boolean r46, final defpackage.bol r47, final long r48, final long r50, final defpackage.yjz r52, final defpackage.yjz r53, final defpackage.yka r54, defpackage.bao r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atc.e(xr, mr, yow, yjk, yjv, bkp, auv, float, boolean, bol, long, long, yjz, yjz, yka, bao, int, int):void");
    }
}
