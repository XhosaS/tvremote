package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.appcompat.R;
import android.support.v7.recyclerview.extensions.AsyncDifferConfig;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AvatarView;
import com.google.common.collect.ImmutableList;
import j$.time.Instant;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class rdd {
    public rdd() {
    }

    public static void A(boolean z, yjv yjvVar, bkp bkpVar, boolean z2, ash ashVar, bol bolVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        boolean z3;
        bao baoVar2;
        boolean z4;
        yjvVar.getClass();
        yjzVar.getClass();
        bao baoVarD = baoVar.d(-2114089353);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(ashVar) ? 8192 : 16384;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= true != baoVarD.F(bolVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != baoVarD.H(yjzVar) ? 4194304 : 8388608;
        }
        if ((4793491 & i4) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            z4 = z2;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                z3 = true;
            } else {
                baoVarD.t();
                z3 = z2;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            og.r(z, yjvVar, bkpVar, z3, ashVar, bolVar, yjzVar, baoVar2, i4 & 33554430);
            z4 = z3;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new asf(z, yjvVar, bkpVar, z4, ashVar, bolVar, yjzVar, i, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void B(defpackage.yjk r36, defpackage.bkp r37, boolean r38, defpackage.bol r39, defpackage.ase r40, defpackage.kw r41, defpackage.yjz r42, defpackage.bao r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.B(yjk, bkp, boolean, bol, ase, kw, yjz, bao, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C(defpackage.yjk r19, defpackage.bkp r20, boolean r21, defpackage.ase r22, defpackage.kw r23, defpackage.bol r24, defpackage.yjz r25, defpackage.bao r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.C(yjk, bkp, boolean, ase, kw, bol, yjz, bao, int, int):void");
    }

    public static bol D(bao baoVar) {
        baoVar.x(-209786089);
        bol bolVarB = pot.b(7, baoVar);
        ((bas) baoVar).aa();
        return bolVarB;
    }

    public static bol E(bao baoVar) {
        baoVar.x(-1274289205);
        bol bolVarB = pot.b(2, baoVar);
        ((bas) baoVar).aa();
        return bolVarB;
    }

    public static bol F(bao baoVar) {
        baoVar.x(-1129505105);
        bol bolVarB = pot.b(7, baoVar);
        ((bas) baoVar).aa();
        return bolVarB;
    }

    public static ase G(long j, long j2, bao baoVar, int i) {
        baoVar.x(518957819);
        if ((i & 1) != 0) {
            j = bnq.f;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = ((bnq) baoVar.f(arr.a)).h;
        }
        long j4 = j2;
        ase aseVarC = og.t(wv.K(baoVar), ((bnq) baoVar.f(arr.a)).h).c(j3, j4, bnq.f, bny.k(bnq.d(j4), bnq.c(j4), bnq.b(j4), 0.38f, bnq.f(j4)));
        ((bas) baoVar).aa();
        return aseVarC;
    }

    public static long H(int i) {
        return a.j((a.r(i, 0) ? 8.0f : a.r(i, 1) ? 16.0f : a.r(i, 2) ? 28.0f : 0.0f) + 24.0f, 40.0f);
    }

    public static long I() {
        return a.j((a.r(2, 0) ? 32.0f : a.r(2, 1) ? 64.0f : a.r(2, 2) ? 96.0f : 0.0f) + 32.0f, 96.0f);
    }

    public static /* synthetic */ axg K() {
        chc chcVar = ppt.a;
        long j = pps.a;
        ciy ciyVarB = ppz.b(pps.ad, pps.ac);
        cji cjiVar = pps.ae;
        chc chcVarV = chc.v(chcVar, 0L, pps.k, cjiVar, ciyVarB, null, pps.l, pps.j, null, null, 16645977);
        ciy ciyVarB2 = ppz.b(pps.ag, pps.af);
        cji cjiVar2 = pps.ah;
        chc chcVarV2 = chc.v(chcVar, 0L, pps.n, cjiVar2, ciyVarB2, null, pps.o, pps.m, null, null, 16645977);
        ciy ciyVarB3 = ppz.b(pps.aj, pps.ai);
        cji cjiVar3 = pps.ak;
        chc chcVarV3 = chc.v(chcVar, 0L, pps.q, cjiVar3, ciyVarB3, null, pps.r, pps.p, null, null, 16645977);
        ciy ciyVarB4 = ppz.b(pps.am, pps.al);
        cji cjiVar4 = pps.an;
        chc chcVarV4 = chc.v(chcVar, 0L, pps.t, cjiVar4, ciyVarB4, null, pps.u, pps.s, null, null, 16645977);
        ciy ciyVarB5 = ppz.b(pps.ap, pps.ao);
        cji cjiVar5 = pps.aq;
        chc chcVarV5 = chc.v(chcVar, 0L, pps.w, cjiVar5, ciyVarB5, null, pps.x, pps.v, null, null, 16645977);
        ciy ciyVarB6 = ppz.b(pps.as, pps.ar);
        cji cjiVar6 = pps.at;
        chc chcVarV6 = chc.v(chcVar, 0L, pps.z, cjiVar6, ciyVarB6, null, pps.A, pps.y, null, null, 16645977);
        ciy ciyVarB7 = ppz.b(pps.aE, pps.aD);
        cji cjiVar7 = pps.aF;
        chc chcVarV7 = chc.v(chcVar, 0L, pps.L, cjiVar7, ciyVarB7, null, pps.M, pps.K, null, null, 16645977);
        ciy ciyVarB8 = ppz.b(pps.aH, pps.aG);
        cji cjiVar8 = pps.aI;
        chc chcVarV8 = chc.v(chcVar, 0L, pps.O, cjiVar8, ciyVarB8, null, pps.P, pps.N, null, null, 16645977);
        ciy ciyVarB9 = ppz.b(pps.aK, pps.aJ);
        cji cjiVar9 = pps.aL;
        chc chcVarV9 = chc.v(chcVar, 0L, pps.R, cjiVar9, ciyVarB9, null, pps.S, pps.Q, null, null, 16645977);
        ciy ciyVarB10 = ppz.b(pps.U, pps.T);
        cji cjiVar10 = pps.V;
        chc chcVarV10 = chc.v(chcVar, 0L, pps.b, cjiVar10, ciyVarB10, null, pps.c, pps.a, null, null, 16645977);
        ciy ciyVarB11 = ppz.b(pps.X, pps.W);
        cji cjiVar11 = pps.Y;
        chc chcVarV11 = chc.v(chcVar, 0L, pps.e, cjiVar11, ciyVarB11, null, pps.f, pps.d, null, null, 16645977);
        ciy ciyVarB12 = ppz.b(pps.aa, pps.Z);
        cji cjiVar12 = pps.ab;
        chc chcVarV12 = chc.v(chcVar, 0L, pps.h, cjiVar12, ciyVarB12, null, pps.i, pps.g, null, null, 16645977);
        ciy ciyVarB13 = ppz.b(pps.av, pps.au);
        cji cjiVar13 = pps.aw;
        chc chcVarV13 = chc.v(chcVar, 0L, pps.C, cjiVar13, ciyVarB13, null, pps.D, pps.B, null, null, 16645977);
        ciy ciyVarB14 = ppz.b(pps.ay, pps.ax);
        cji cjiVar14 = pps.az;
        chc chcVarV14 = chc.v(chcVar, 0L, pps.F, cjiVar14, ciyVarB14, null, pps.G, pps.E, null, null, 16645977);
        ciy ciyVarB15 = ppz.b(pps.aB, pps.aA);
        cji cjiVar15 = pps.aC;
        chc chcVarV15 = chc.v(chcVar, 0L, pps.I, cjiVar15, ciyVarB15, null, pps.J, pps.H, null, null, 16645977);
        long j2 = ppr.a;
        ciy ciyVarB16 = ppz.b(ppr.ad, ppr.ac);
        cji cjiVar16 = ppr.ae;
        chc chcVarV16 = chc.v(chcVar, 0L, ppr.k, cjiVar16, ciyVarB16, null, ppr.l, ppr.j, null, null, 16645977);
        ciy ciyVarB17 = ppz.b(ppr.ag, ppr.af);
        cji cjiVar17 = ppr.ah;
        chc chcVarV17 = chc.v(chcVar, 0L, ppr.n, cjiVar17, ciyVarB17, null, ppr.o, ppr.m, null, null, 16645977);
        ciy ciyVarB18 = ppz.b(ppr.aj, ppr.ai);
        cji cjiVar18 = ppr.ak;
        chc chcVarV18 = chc.v(chcVar, 0L, ppr.q, cjiVar18, ciyVarB18, null, ppr.r, ppr.p, null, null, 16645977);
        ciy ciyVarB19 = ppz.b(ppr.am, ppr.al);
        cji cjiVar19 = ppr.an;
        chc chcVarV19 = chc.v(chcVar, 0L, ppr.t, cjiVar19, ciyVarB19, null, ppr.u, ppr.s, null, null, 16645977);
        ciy ciyVarB20 = ppz.b(ppr.ap, ppr.ao);
        cji cjiVar20 = ppr.aq;
        chc chcVarV20 = chc.v(chcVar, 0L, ppr.w, cjiVar20, ciyVarB20, null, ppr.x, ppr.v, null, null, 16645977);
        ciy ciyVarB21 = ppz.b(ppr.as, ppr.ar);
        cji cjiVar21 = ppr.at;
        chc chcVarV21 = chc.v(chcVar, 0L, ppr.z, cjiVar21, ciyVarB21, null, ppr.A, ppr.y, null, null, 16645977);
        ciy ciyVarB22 = ppz.b(ppr.aE, ppr.aD);
        cji cjiVar22 = ppr.aF;
        chc chcVarV22 = chc.v(chcVar, 0L, ppr.L, cjiVar22, ciyVarB22, null, ppr.M, ppr.K, null, null, 16645977);
        ciy ciyVarB23 = ppz.b(ppr.aH, ppr.aG);
        cji cjiVar23 = ppr.aI;
        chc chcVarV23 = chc.v(chcVar, 0L, ppr.O, cjiVar23, ciyVarB23, null, ppr.P, ppr.N, null, null, 16645977);
        ciy ciyVarB24 = ppz.b(ppr.aK, ppr.aJ);
        cji cjiVar24 = ppr.aL;
        chc chcVarV24 = chc.v(chcVar, 0L, ppr.R, cjiVar24, ciyVarB24, null, ppr.S, ppr.Q, null, null, 16645977);
        ciy ciyVarB25 = ppz.b(ppr.U, ppr.T);
        cji cjiVar25 = ppr.V;
        chc chcVarV25 = chc.v(chcVar, 0L, ppr.b, cjiVar25, ciyVarB25, null, ppr.c, ppr.a, null, null, 16645977);
        ciy ciyVarB26 = ppz.b(ppr.X, ppr.W);
        cji cjiVar26 = ppr.Y;
        chc chcVarV26 = chc.v(chcVar, 0L, ppr.e, cjiVar26, ciyVarB26, null, ppr.f, ppr.d, null, null, 16645977);
        ciy ciyVarB27 = ppz.b(ppr.aa, ppr.Z);
        cji cjiVar27 = ppr.ab;
        chc chcVarV27 = chc.v(chcVar, 0L, ppr.h, cjiVar27, ciyVarB27, null, ppr.i, ppr.g, null, null, 16645977);
        ciy ciyVarB28 = ppz.b(ppr.av, ppr.au);
        cji cjiVar28 = ppr.aw;
        chc chcVarV28 = chc.v(chcVar, 0L, ppr.C, cjiVar28, ciyVarB28, null, ppr.D, ppr.B, null, null, 16645977);
        ciy ciyVarB29 = ppz.b(ppr.ay, ppr.ax);
        cji cjiVar29 = ppr.az;
        chc chcVarV29 = chc.v(chcVar, 0L, ppr.F, cjiVar29, ciyVarB29, null, ppr.G, ppr.E, null, null, 16645977);
        ciy ciyVarB30 = ppz.b(ppr.aB, ppr.aA);
        cji cjiVar30 = ppr.aC;
        return new axg(chcVarV, chcVarV2, chcVarV3, chcVarV4, chcVarV5, chcVarV6, chcVarV7, chcVarV8, chcVarV9, chcVarV10, chcVarV11, chcVarV12, chcVarV13, chcVarV14, chcVarV15, chcVarV16, chcVarV17, chcVarV18, chcVarV19, chcVarV20, chcVarV21, chcVarV22, chcVarV23, chcVarV24, chcVarV25, chcVarV26, chcVarV27, chcVarV28, chcVarV29, chc.v(chcVar, 0L, ppr.I, cjiVar30, ciyVarB30, null, ppr.J, ppr.H, null, null, 16645977));
    }

    public static void L(arl arlVar, ath athVar, auq auqVar, axg axgVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        axg axgVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(2124579738);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(arlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(athVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(auqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            axgVar2 = axgVar;
            i2 |= true != baoVarD.F(axgVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            axgVar2 = axgVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            axg axgVar3 = axgVar2;
            asm.b(arlVar, athVar, auqVar, axgVar3, bga.k(1798917965, new khi(M(arlVar, baoVarD), yjzVar, 13, null), baoVarD), baoVarD, (i2 & 7168) | (i2 & 14) | 24576 | (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i2 & 896));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(arlVar, athVar, auqVar, axgVar, yjzVar, i, 14);
        }
    }

    public static ank M(arl arlVar, bao baoVar) {
        arlVar.getClass();
        baoVar.x(-816036754);
        baoVar.x(5004770);
        long j = arlVar.a;
        boolean zE = baoVar.E(j);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zE || objT == ban.a) {
            objT = new ank(j, bny.k(bnq.d(j), bnq.c(j), bnq.b(j), 0.4f, bnq.f(j)));
            basVar.ae(objT);
        }
        ank ankVar = (ank) objT;
        basVar.aa();
        basVar.aa();
        return ankVar;
    }

    public static void N(arl arlVar, auq auqVar, axg axgVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        auq auqVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(648134875);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(arlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(axgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            auqVar2 = auqVar;
        } else {
            int i4 = i2 & (-113);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                auqVar = pot.a;
            } else {
                baoVarD.t();
            }
            auq auqVar3 = auqVar;
            baoVarD.m();
            int i5 = i2 & 14;
            int i6 = i4 << 3;
            L(arlVar, new poo(0), auqVar3, axgVar, yjzVar, baoVarD, i5 | (i6 & 7168) | (i6 & 57344));
            auqVar2 = auqVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ahm(arlVar, auqVar2, axgVar, yjzVar, i, 20, (char[]) null);
        }
    }

    public static void O(arl arlVar, ath athVar, auq auqVar, axg axgVar, yjz yjzVar, bao baoVar, int i) {
        int i2;
        axg axgVar2;
        ath pooVar;
        auq auqVar2;
        auq auqVar3;
        ath athVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(295511914);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(arlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            axgVar2 = axgVar;
            i2 |= true != baoVarD.F(axgVar2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            axgVar2 = axgVar;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            athVar2 = athVar;
            auqVar3 = auqVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                pooVar = new poo(1);
                auqVar2 = pot.a;
            } else {
                baoVarD.t();
                pooVar = athVar;
                auqVar2 = auqVar;
            }
            baoVarD.m();
            int i4 = (i2 & 14) | 24576 | (i2 & 7168);
            ath athVar3 = pooVar;
            asm.a(arlVar, athVar3, auqVar2, axgVar2, bga.k(-1166625323, new khi(M(arlVar, baoVarD), yjzVar, 12, null), baoVarD), baoVarD, i4);
            auqVar3 = auqVar2;
            athVar2 = athVar3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(arlVar, athVar2, auqVar3, axgVar, yjzVar, i, 13);
        }
    }

    public static void P(bkp bkpVar, float f, long j, bao baoVar, final int i) {
        int i2;
        float f2;
        final bkp bkpVar2;
        final long j2;
        final float f3;
        bao baoVarD = baoVar.d(964649005);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != baoVarD.E(j) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && baoVarD.K()) {
            baoVarD.t();
            j2 = j;
            f3 = f;
            bkpVar2 = bkpVar;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                f2 = 1.0f;
            } else {
                baoVarD.t();
                f2 = f;
            }
            baoVarD.m();
            og.v(bkpVar, f2, j, baoVarD, i3 & 1022, 0);
            bkpVar2 = bkpVar;
            j2 = j;
            f3 = f2;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: pok
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar3 = bkpVar2;
                    float f4 = f3;
                    rdd.P(bkpVar3, f4, j2, (bao) obj, bdi.n(i | 1));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long Q(long r5, defpackage.bao r7) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.Q(long, bao):long");
    }

    public static long R(int i, bao baoVar) {
        int i2 = i - 1;
        arl arlVarK = wv.K(baoVar);
        switch (i2) {
            case 1:
                return arlVarK.w;
            case 2:
                return arlVarK.y;
            case 3:
                return arlVarK.v;
            case 4:
                return arlVarK.e;
            case 5:
                return arlVarK.u;
            case 6:
                return arlVarK.o;
            case 7:
                return arlVarK.x;
            case 8:
                return arlVarK.z;
            case 9:
                return arlVarK.b;
            case 10:
                return arlVarK.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            default:
                return bnq.g;
            case 13:
                return arlVarK.g;
            case 14:
                return arlVarK.i;
            case 17:
                return arlVarK.q;
            case 18:
                return arlVarK.s;
            case 19:
                return arlVarK.k;
            case 20:
                return arlVarK.m;
            case 23:
                return arlVarK.A;
            case 24:
                return arlVarK.B;
            case 25:
                return arlVarK.a;
            case 26:
                return arlVarK.c;
            case 29:
                return arlVarK.C;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return arlVarK.f;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                return arlVarK.h;
            case 34:
                return arlVarK.p;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return arlVarK.D;
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return arlVarK.F;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return arlVarK.G;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return arlVarK.H;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return arlVarK.I;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                return arlVarK.J;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                return arlVarK.E;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                return arlVarK.r;
        }
    }

    public static void S(bkp bkpVar, bol bolVar, arh arhVar, arj arjVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        bol bolVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1536405658);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bolVar2 = bolVar;
            i2 |= true != baoVarD.F(bolVar2) ? 16 : 32;
        } else {
            bolVar2 = bolVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(arhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.F(arjVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.F(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 65536 : 131072;
        }
        if ((74899 & i2) == 74898 && baoVarD.K()) {
            baoVarD.t();
        } else {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            og.w(bkpVar, bolVar2, arhVar, arjVar, ykaVar, baoVarD, i2 & 524286, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(bkpVar, bolVar, arhVar, arjVar, ykaVar, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void T(defpackage.yjk r26, defpackage.bkp r27, boolean r28, defpackage.bol r29, defpackage.arh r30, defpackage.arj r31, defpackage.yka r32, defpackage.bao r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.T(yjk, bkp, boolean, bol, arh, arj, yka, bao, int, int):void");
    }

    public static void U(bkp bkpVar, bol bolVar, arh arhVar, arj arjVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        arj arjVarW;
        bol bolVar2;
        arj arjVar2;
        ykaVar.getClass();
        bao baoVarD = baoVar.d(1850789346);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(arhVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(ykaVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bolVar2 = bolVar;
            arjVar2 = arjVar;
        } else {
            int i3 = i2 & (-7281);
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                baoVarD.x(-36947119);
                bolVar = pot.b(13, baoVarD);
                ((bas) baoVarD).aa();
                arjVarW = W(baoVarD);
            } else {
                baoVarD.t();
                arjVarW = arjVar;
            }
            bol bolVar3 = bolVar;
            baoVarD.m();
            S(bkpVar, bolVar3, arhVar, arjVarW, ykaVar, baoVarD, (i2 & 14) | 24576 | (i2 & 896) | (458752 & (i3 << 3)));
            bolVar2 = bolVar3;
            arjVar2 = arjVarW;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(bkpVar, bolVar2, arhVar, arjVar2, ykaVar, i, 11);
        }
    }

    public static void V(yjk yjkVar, bkp bkpVar, boolean z, bol bolVar, arh arhVar, arj arjVar, yka ykaVar, bao baoVar, int i) {
        int i2;
        boolean z2;
        arj arjVarW;
        bao baoVar2;
        boolean z3;
        arj arjVar2;
        yjkVar.getClass();
        ykaVar.getClass();
        bao baoVarD = baoVar.d(-1603540317);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != baoVarD.F(bolVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i3 |= true != baoVarD.F(arhVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i4 = i3 | 1572864;
        if ((12582912 & i) == 0) {
            i4 |= true != baoVarD.H(ykaVar) ? 4194304 : 8388608;
        }
        if ((4793491 & i4) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            z3 = z;
            arjVar2 = arjVar;
            baoVar2 = baoVarD;
        } else {
            int i5 = (-458753) & i4;
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                z2 = true;
                arjVarW = W(baoVarD);
            } else {
                baoVarD.t();
                z2 = z;
                arjVarW = arjVar;
            }
            baoVarD.m();
            int i6 = i5 << 3;
            baoVar2 = baoVarD;
            T(yjkVar, bkpVar, z2, bolVar, arhVar, arjVarW, ykaVar, baoVar2, (i4 & 57344) | (i4 & 14) | 1572864 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i4 & 896) | (i4 & 7168) | (29360128 & i6) | (234881024 & i6), 0);
            z3 = z2;
            arjVar2 = arjVarW;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new arf(yjkVar, bkpVar, z3, bolVar, arhVar, arjVar2, ykaVar, i, 6);
        }
    }

    public static arj W(bao baoVar) {
        baoVar.x(595727557);
        arj arjVarY = og.y(1.0f, 1.0f, 1.0f, 3.0f, 8.0f, 1.0f, 0);
        ((bas) baoVar).aa();
        return arjVarY;
    }

    public static arh X(long j, long j2, bao baoVar, int i) {
        long jM;
        baoVar.x(-860673981);
        if ((i & 1) != 0) {
            j = R(39, baoVar);
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = Q(j3, baoVar);
        }
        long j4 = j2;
        long jR = R(43, baoVar);
        long jK = bny.k(bnq.d(jR), bnq.c(jR), bnq.b(jR), 0.38f, bnq.f(jR));
        arl arlVarK = wv.K(baoVar);
        arlVarK.getClass();
        if (cma.b(0.0f, 0.0f)) {
            jM = arlVarK.p;
        } else {
            float fLog = (float) Math.log(1.0d);
            long j5 = arlVarK.t;
            jM = bny.m(bny.k(bnq.d(j5), bnq.c(j5), bnq.b(j5), ((fLog * 4.5f) + 2.0f) / 100.0f, bnq.f(j5)), arlVarK.p);
        }
        long jM2 = bny.m(jK, jM);
        long jQ = Q(j3, baoVar);
        arh arhVarC = og.C(j3, j4, jM2, bny.k(bnq.d(jQ), bnq.c(jQ), bnq.b(jQ), 0.38f, bnq.f(jQ)), baoVar, 0);
        ((bas) baoVar).aa();
        return arhVarC;
    }

    public static pjt Y() {
        vvd vvdVar = pkj.a;
        vtw vtwVarM = pki.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        pki pkiVar = (pki) vtwVarM.b;
        pkiVar.d = 2;
        pkiVar.b = 2 | pkiVar.b;
        return new pjt(vvdVar, (pki) vtwVarM.r());
    }

    public static pjt Z(String str) {
        vvd vvdVar = pkj.a;
        vtw vtwVarM = pki.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        pki pkiVar = (pki) vucVar;
        pkiVar.d = 1;
        pkiVar.b |= 2;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        pki pkiVar2 = (pki) vtwVarM.b;
        pkiVar2.b |= 1;
        pkiVar2.c = str;
        return new pjt(vvdVar, (pki) vtwVarM.r());
    }

    public static pjt aa() {
        vvd vvdVar = pkj.a;
        vtw vtwVarM = pki.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        pki pkiVar = (pki) vtwVarM.b;
        pkiVar.d = 4;
        pkiVar.b |= 2;
        return new pjt(vvdVar, (pki) vtwVarM.r());
    }

    public static pjt ab() {
        vvd vvdVar = pkj.a;
        vtw vtwVarM = pki.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        pki pkiVar = (pki) vtwVarM.b;
        pkiVar.d = 3;
        pkiVar.b |= 2;
        return new pjt(vvdVar, (pki) vtwVarM.r());
    }

    public static pjs ac(int i) {
        a.H(i >= 0);
        vvd vvdVar = ple.a;
        vtw vtwVarM = plg.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        plg plgVar = (plg) vtwVarM.b;
        plgVar.b = 1 | plgVar.b;
        plgVar.c = i;
        return new pjs(vvdVar, (plg) vtwVarM.r());
    }

    public static long ad() {
        return Instant.now().toEpochMilli();
    }

    @Deprecated
    public static uhp ae(String str) {
        return sfy.C(new pkg(str, new pig(), (char[]) null));
    }

    public static pie af(oyd oydVar) {
        pie pieVar = new pie();
        Bundle bundle = new Bundle();
        bundle.putParcelable("promo_context", oydVar);
        pieVar.setArguments(bundle);
        return pieVar;
    }

    public static pfw ag(uyw uywVar) {
        uywVar.getClass();
        uxq uxqVar = uywVar.d;
        if (uxqVar == null) {
            uxqVar = uxq.a;
        }
        wes wesVar = uxqVar.e;
        if (wesVar == null) {
            wesVar = wes.a;
        }
        wesVar.getClass();
        uxq uxqVar2 = uywVar.d;
        wes wesVar2 = (uxqVar2 == null ? uxq.a : uxqVar2).c;
        if (wesVar2 == null) {
            wesVar2 = wes.a;
        }
        wesVar2.getClass();
        if (uxqVar2 == null) {
            uxqVar2 = uxq.a;
        }
        wes wesVar3 = uxqVar2.d;
        if (wesVar3 == null) {
            wesVar3 = wes.a;
        }
        wesVar3.getClass();
        return new pfw(wesVar, wesVar2, wesVar3);
    }

    public static synchronized uyv ah(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            return uyv.LIGHT;
        }
        if (i != 32) {
            return uyv.UNSPECIFIED;
        }
        return uyv.DARK;
    }

    public static uyv ai(uyv uyvVar, uyc uycVar) throws pgf {
        if (ak(uyvVar, uycVar.l)) {
            return uyv.UNSPECIFIED;
        }
        aj(uyvVar, uycVar.l);
        Iterator<E> it = uycVar.i.iterator();
        while (it.hasNext()) {
            aj(uyvVar, ((uxw) it.next()).i);
        }
        return uyvVar;
    }

    public static uyw aj(uyv uyvVar, List list) throws pgf {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uyw uywVar = (uyw) it.next();
            uyv uyvVarB = uyv.b(uywVar.c);
            if (uyvVarB == null) {
                uyvVarB = uyv.UNSPECIFIED;
            }
            if (uyvVarB.equals(uyvVar)) {
                return uywVar;
            }
        }
        throw new pgf();
    }

    public static boolean ak(uyv uyvVar, List list) {
        if (uyvVar == uyv.UNSPECIFIED) {
            return true;
        }
        return list.isEmpty();
    }

    public static pfy al(Context context, uyv uyvVar, boolean z) {
        if (!z) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.videos.R.attr.colorPrimary, com.google.android.videos.R.attr.colorOnPrimary, com.google.android.videos.R.attr.colorSecondary, com.google.android.videos.R.attr.colorSurface, com.google.android.videos.R.attr.colorOnSurface, com.google.android.videos.R.attr.colorOnSurfaceVariant, android.R.attr.colorBackground, com.google.android.videos.R.attr.colorOutline});
        int color = typedArrayObtainStyledAttributes.getColor(0, ap(com.google.android.videos.R.color.gm3_default_color_primary, com.google.android.videos.R.color.gm3_dark_default_color_primary, context, uyvVar));
        int color2 = typedArrayObtainStyledAttributes.getColor(1, ap(com.google.android.videos.R.color.gm3_default_color_on_primary, com.google.android.videos.R.color.gm3_dark_default_color_on_primary, context, uyvVar));
        int color3 = typedArrayObtainStyledAttributes.getColor(2, ap(com.google.android.videos.R.color.gm3_default_color_secondary, com.google.android.videos.R.color.gm3_dark_default_color_secondary, context, uyvVar));
        int color4 = typedArrayObtainStyledAttributes.getColor(3, ap(com.google.android.videos.R.color.gm3_default_color_surface, com.google.android.videos.R.color.gm3_dark_default_color_surface, context, uyvVar));
        int color5 = typedArrayObtainStyledAttributes.getColor(4, ap(com.google.android.videos.R.color.gm3_default_color_on_surface, com.google.android.videos.R.color.gm3_dark_default_color_on_surface, context, uyvVar));
        int color6 = typedArrayObtainStyledAttributes.getColor(5, ap(com.google.android.videos.R.color.gm3_default_color_on_surface_variant, com.google.android.videos.R.color.gm3_dark_default_color_on_surface_variant, context, uyvVar));
        int color7 = typedArrayObtainStyledAttributes.getColor(6, ap(com.google.android.videos.R.color.gm3_default_color_background, com.google.android.videos.R.color.gm3_dark_default_color_background, context, uyvVar));
        int color8 = typedArrayObtainStyledAttributes.getColor(7, ap(com.google.android.videos.R.color.gm3_default_color_outline, com.google.android.videos.R.color.gm3_dark_default_color_outline, context, uyvVar));
        typedArrayObtainStyledAttributes.recycle();
        return new pfy(color, color2, color3, color4, qtl.ac(com.google.android.videos.R.dimen.gm3_sys_elevation_level1, context), qtl.ac(com.google.android.videos.R.dimen.gm3_sys_elevation_level2, context), qtl.ac(com.google.android.videos.R.dimen.gm3_sys_elevation_level3, context), qtl.ac(com.google.android.videos.R.dimen.gm3_sys_elevation_level4, context), qtl.ac(com.google.android.videos.R.dimen.gm3_sys_elevation_level5, context), color5, color6, color7, color8);
    }

    public static /* synthetic */ vww am(vtw vtwVar) {
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(DesugarCollections.unmodifiableMap(((pev) vtwVar.b).b));
        mapUnmodifiableMap.getClass();
        return new vww(mapUnmodifiableMap);
    }

    public static rzy an(String str) {
        rzy rzyVar = new rzy((char[]) null);
        rzyVar.A("CREATE TABLE ");
        rzyVar.A(str);
        rzyVar.A(" (");
        rzyVar.A("account TEXT NOT NULL, ");
        rzyVar.A("key TEXT NOT NULL, ");
        rzyVar.A("message BLOB NOT NULL, ");
        rzyVar.A("windowStartTimestamp INTEGER NOT NULL, ");
        rzyVar.A("windowEndTimestamp INTEGER NOT NULL, ");
        rzyVar.A("PRIMARY KEY (account, key))");
        return rzyVar.H();
    }

    private static qxj ao(Object obj, qth qthVar) {
        String strF = qthVar.f(obj);
        String strH = qthVar.h(obj);
        String strG = qthVar.g(obj);
        vtw vtwVarM = vrn.a.m();
        vtwVarM.getClass();
        String strC = qthVar.c(obj);
        strC.getClass();
        vxr.ag(strC, vtwVarM);
        vrn vrnVarAf = vxr.af(vtwVarM);
        qthVar.j(obj);
        String strD = qthVar.d(obj);
        strD.getClass();
        vou vouVar = new vou(vrnVarAf, strF, strD, strH, strG, qthVar.b(obj).a);
        boolean zI = qthVar.i(obj);
        String strE = qthVar.e(obj);
        pjd pjdVarA = qthVar.a(obj);
        int i = qthVar.b(obj).b;
        if (i == 0) {
            i = 3;
        }
        return new qxj(vouVar, zI, strE, pjdVarA, i);
    }

    private static int ap(int i, int i2, Context context, uyv uyvVar) {
        if (true == uyvVar.equals(uyv.DARK)) {
            i = i2;
        }
        return context.getColor(i);
    }

    public static rbu d(ViewGroup viewGroup) throws Resources.NotFoundException {
        Context context = viewGroup.getContext();
        context.getClass();
        raz razVar = new raz(context);
        viewGroup.addView(razVar, new ViewGroup.LayoutParams(-2, -2));
        int dimensionPixelSize = razVar.getContext().getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.og_bento_card_default_button_vertical_margin);
        return new rbu(razVar, dimensionPixelSize, dimensionPixelSize);
    }

    public static AsyncDifferConfig e(ExecutorService executorService) {
        AsyncDifferConfig.Builder builder = new AsyncDifferConfig.Builder(new ran());
        builder.setBackgroundThreadExecutor(executorService);
        return builder.build();
    }

    public static boolean f(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static qyf g(qwn qwnVar) {
        qxj qxjVarAo;
        qwo qwoVar = qwnVar.b;
        Object objA = qwoVar.a();
        Object objA2 = qwoVar.a();
        if (objA2 != null) {
            qth qthVar = qwnVar.c;
            qthVar.getClass();
            qxjVarAo = ao(objA2, qthVar);
        } else {
            qxjVarAo = null;
        }
        ImmutableList immutableListE = qwoVar.e();
        immutableListE.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : immutableListE) {
            if (!yks.e(obj, objA)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yfm.z(arrayList, 10));
        for (Object obj2 : arrayList) {
            obj2.getClass();
            qth qthVar2 = qwnVar.c;
            qthVar2.getClass();
            arrayList2.add(ao(obj2, qthVar2));
        }
        return new qxk(qxjVarAo, arrayList2);
    }

    public static Object h(qwn qwnVar, vrn vrnVar) {
        ImmutableList immutableListE = qwnVar.b.e();
        immutableListE.getClass();
        boolean z = false;
        Object obj = null;
        for (Object obj2 : immutableListE) {
            if (yks.e(qwnVar.c.c(obj2), vrnVar.c)) {
                if (z) {
                    return null;
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            return obj;
        }
        return null;
    }

    public static pjt i(qyf qyfVar) {
        if (!(qyfVar instanceof qxk)) {
            return aa();
        }
        qxj qxjVar = ((qxk) qyfVar).a;
        return qxjVar != null ? Z(qxjVar.a.c) : Y();
    }

    public static boolean j(qyf qyfVar) {
        return (qyfVar.b() == null && qyfVar.c().isEmpty()) ? false : true;
    }

    public static quz k(dvk dvkVar, tst tstVar, tst tstVar2) {
        return new quz(dvkVar, tstVar, tstVar2);
    }

    public static Integer l(int i) {
        switch (i - 1) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
            case 5:
                return 1;
            case 4:
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    public static String m(Object obj, qth qthVar) {
        boolean z = qtl.a(obj, qthVar).a;
        String strE = sij.E(qthVar.f(obj));
        String strE2 = z ? "" : sij.E(qthVar.d(obj));
        return (strE.isEmpty() && strE2.isEmpty()) ? qthVar.c(obj) : strE.isEmpty() ? strE2 : (strE2.isEmpty() || strE.equals(strE2)) ? strE : a.cq(strE2, strE, " ");
    }

    public static unx o(ViewGroup viewGroup) {
        AvatarView avatarView = new AvatarView(viewGroup.getContext());
        avatarView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        avatarView.g(true);
        avatarView.h(ric.d(avatarView.getContext()));
        avatarView.i();
        avatarView.d();
        avatarView.g = false;
        avatarView.l();
        avatarView.k(avatarView.getResources().getDimensionPixelSize(com.google.android.videos.R.dimen.bento_selected_account_avatar_size));
        viewGroup.addView(avatarView);
        return new unx(avatarView);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void p(java.lang.String r38, defpackage.bkp r39, long r40, long r42, defpackage.cji r44, long r45, defpackage.clk r47, long r48, int r50, boolean r51, int r52, int r53, defpackage.yjv r54, defpackage.chc r55, defpackage.bao r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.p(java.lang.String, bkp, long, long, cji, long, clk, long, int, boolean, int, int, yjv, chc, bao, int, int, int):void");
    }

    public static void q(yjz yjzVar, yjz yjzVar2, bkp bkpVar, float f, bao baoVar, int i) {
        int i2;
        float f2;
        bao baoVarD = baoVar.d(-1359053646);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i2 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            f2 = f;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                baoVarD.x(-1678763736);
                aei aeiVar = ppi.a;
                ((bas) baoVarD).aa();
                f = 2.0f;
            } else {
                baoVarD.t();
            }
            float f3 = f;
            baoVarD.m();
            a.bZ(yjzVar, yjzVar2, bkpVar, f3, baoVarD, i2 & 1022);
            f2 = f3;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kho(yjzVar, yjzVar2, bkpVar, f2, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(defpackage.bkp r28, defpackage.yjz r29, defpackage.bol r30, final long r31, final long r33, long r35, long r37, final defpackage.yjz r39, defpackage.bao r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.r(bkp, yjz, bol, long, long, long, long, yjz, bao, int, int):void");
    }

    public static void s(final avq avqVar, bkp bkpVar, bol bolVar, long j, long j2, long j3, long j4, long j5, bao baoVar, final int i) {
        avq avqVar2;
        int i2;
        long j6;
        long j7;
        long jT;
        long jU;
        bkp bkpVar2;
        bol bolVar2;
        long j8;
        bao baoVar2;
        final bkp bkpVar3;
        final bol bolVar3;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final long j13;
        bao baoVarD = baoVar.d(-526317713);
        if ((i & 6) == 0) {
            avqVar2 = avqVar;
            i2 = (true != baoVarD.F(avqVar2) ? 2 : 4) | i;
        } else {
            avqVar2 = avqVar;
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((38347923 & i3) == 38347922 && baoVarD.K()) {
            baoVarD.t();
            bkpVar3 = bkpVar;
            bolVar3 = bolVar;
            j9 = j;
            j10 = j2;
            j11 = j3;
            j12 = j4;
            j13 = j5;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                bkm bkmVar = bkp.g;
                bol bolVarV = v(baoVarD);
                baoVarD.x(-1289501951);
                long jR = R(6, baoVarD);
                bas basVar = (bas) baoVarD;
                basVar.aa();
                baoVarD.x(1310514983);
                long jR2 = R(4, baoVarD);
                basVar.aa();
                baoVarD.x(1587870613);
                long jR3 = R(5, baoVarD);
                basVar.aa();
                j6 = jR2;
                j7 = jR3;
                jT = t(baoVarD);
                jU = u(baoVarD);
                bkpVar2 = bkmVar;
                bolVar2 = bolVarV;
                j8 = jR;
            } else {
                baoVarD.t();
                bkpVar2 = bkpVar;
                bolVar2 = bolVar;
                j8 = j;
                j6 = j2;
                j7 = j3;
                jT = j4;
                jU = j5;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            wv.y(avqVar2, bkpVar2, bolVar2, j8, j6, j7, jT, jU, baoVar2, i3 & 1022, 0);
            bkpVar3 = bkpVar2;
            bolVar3 = bolVar2;
            j9 = j8;
            j10 = j6;
            j11 = j7;
            j12 = jT;
            j13 = jU;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: poz
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    avq avqVar3 = avqVar;
                    bkp bkpVar4 = bkpVar3;
                    bol bolVar4 = bolVar3;
                    long j14 = j9;
                    long j15 = j10;
                    long j16 = j11;
                    long j17 = j12;
                    int i4 = i;
                    rdd.s(avqVar3, bkpVar4, bolVar4, j14, j15, j16, j17, j13, (bao) obj, bdi.n(i4 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static long t(bao baoVar) {
        baoVar.x(-328384025);
        long jR = R(5, baoVar);
        ((bas) baoVar).aa();
        return jR;
    }

    public static long u(bao baoVar) {
        baoVar.x(-2074874289);
        long jR = R(4, baoVar);
        ((bas) baoVar).aa();
        return jR;
    }

    public static bol v(bao baoVar) {
        baoVar.x(-93382597);
        bol bolVarB = pot.b(5, baoVar);
        ((bas) baoVar).aa();
        return bolVarB;
    }

    public static void w(final bkp bkpVar, yjz yjzVar, yjz yjzVar2, final yjz yjzVar3, yjz yjzVar4, int i, long j, long j2, zr zrVar, final yka ykaVar, bao baoVar, final int i2) {
        int i3;
        yjz yjzVar5;
        yjz yjzVar6;
        int i4;
        yjz yjzVar7;
        yjz yjzVar8;
        long j3;
        long j4;
        zr zrVar2;
        bao baoVar2;
        final yjz yjzVar9;
        final yjz yjzVar10;
        final yjz yjzVar11;
        final int i5;
        final long j5;
        final long j6;
        final zr zrVar3;
        ykaVar.getClass();
        bao baoVarD = baoVar.d(303642276);
        if ((i2 & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 432;
        if ((i2 & 3072) == 0) {
            yjzVar5 = yjzVar3;
            i6 |= true != baoVarD.H(yjzVar5) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        } else {
            yjzVar5 = yjzVar3;
        }
        int i7 = i6 | 24576;
        if ((196608 & i2) == 0) {
            i7 = i6 | 90112;
        }
        if ((1572864 & i2) == 0) {
            i7 |= 524288;
        }
        if ((12582912 & i2) == 0) {
            i7 |= 4194304;
        }
        if ((100663296 & i2) == 0) {
            i7 |= 33554432;
        }
        if ((805306368 & i2) == 0) {
            i7 |= true != baoVarD.H(ykaVar) ? 268435456 : 536870912;
        }
        if ((306783379 & i7) == 306783378 && baoVarD.K()) {
            baoVarD.t();
            yjzVar9 = yjzVar;
            yjzVar10 = yjzVar2;
            yjzVar11 = yjzVar4;
            i5 = i;
            j5 = j;
            j6 = j2;
            zrVar3 = zrVar;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i2 & 1) == 0 || baoVarD.I()) {
                yjz yjzVar12 = poj.a;
                yjz yjzVar13 = poj.b;
                yjz yjzVar14 = poj.c;
                long j7 = wv.K(baoVarD).n;
                long jQ = Q(j7, baoVarD);
                baoVarD.x(-1449575040);
                zr zrVarV = zy.v(baoVarD);
                ((bas) baoVarD).aa();
                yjzVar6 = yjzVar12;
                i4 = 2;
                yjzVar7 = yjzVar13;
                yjzVar8 = yjzVar14;
                j3 = j7;
                j4 = jQ;
                zrVar2 = zrVarV;
            } else {
                baoVarD.t();
                yjzVar6 = yjzVar;
                yjzVar7 = yjzVar2;
                yjzVar8 = yjzVar4;
                i4 = i;
                j3 = j;
                j4 = j2;
                zrVar2 = zrVar;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            wv.C(bkpVar, yjzVar6, yjzVar7, yjzVar5, yjzVar8, i4, j3, j4, zrVar2, ykaVar, baoVar2, i7 & 1879113726, 0);
            yjzVar9 = yjzVar6;
            yjzVar10 = yjzVar7;
            yjzVar11 = yjzVar8;
            i5 = i4;
            j5 = j3;
            j6 = j4;
            zrVar3 = zrVar2;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: pop
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    bkp bkpVar2 = bkpVar;
                    yjz yjzVar15 = yjzVar9;
                    yjz yjzVar16 = yjzVar10;
                    yjz yjzVar17 = yjzVar3;
                    yjz yjzVar18 = yjzVar11;
                    int i8 = i5;
                    long j8 = j5;
                    long j9 = j6;
                    zr zrVar4 = zrVar3;
                    rdd.w(bkpVar2, yjzVar15, yjzVar16, yjzVar17, yjzVar18, i8, j8, j9, zrVar4, ykaVar, (bao) obj, bdi.n(i2 | 1));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void x(defpackage.yjz r25, defpackage.yjk r26, defpackage.bkp r27, defpackage.yjz r28, defpackage.yjz r29, boolean r30, defpackage.aso r31, defpackage.yy r32, defpackage.bao r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.x(yjz, yjk, bkp, yjz, yjz, boolean, aso, yy, bao, int, int):void");
    }

    public static void y(final boolean z, final yjk yjkVar, final bkp bkpVar, long j, sj sjVar, cob cobVar, bol bolVar, long j2, float f, final yka ykaVar, bao baoVar, final int i, final int i2) {
        int i3;
        bkp bkpVar2;
        float f2;
        sj sjVar2;
        cob cobVar2;
        bol bolVar2;
        long j3;
        long j4;
        bao baoVar2;
        final long j5;
        final sj sjVar3;
        final cob cobVar3;
        final bol bolVar3;
        final long j6;
        final float f3;
        ykaVar.getClass();
        bao baoVarD = baoVar.d(165254009);
        if ((i & 6) == 0) {
            i3 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            bkpVar2 = bkpVar;
            i3 |= true != baoVarD.F(bkpVar2) ? 128 : 256;
        } else {
            bkpVar2 = bkpVar;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 = i3 | 11264;
        }
        int i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            i5 = i4 | 720896;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        int i6 = i2 | 6;
        if ((i2 & 48) == 0) {
            i6 |= true == baoVarD.H(ykaVar) ? 32 : 16;
        }
        int i7 = 905969664 | i5;
        if ((306783379 & i7) == 306783378 && (i6 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
            j5 = j;
            sjVar3 = sjVar;
            cobVar3 = cobVar;
            bolVar3 = bolVar;
            j6 = j2;
            f3 = f;
            baoVar2 = baoVarD;
        } else {
            baoVarD.u();
            if ((i & 1) == 0 || baoVarD.I()) {
                long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                long j7 = jFloatToRawIntBits << 32;
                sj sjVarI = hw.i(baoVarD);
                cob cobVar4 = new cob();
                int i8 = pom.a;
                baoVarD.x(-882626297);
                bol bolVarB = pot.b(5, baoVarD);
                bas basVar = (bas) baoVarD;
                basVar.aa();
                baoVarD.x(1739591795);
                long jR = R(37, baoVarD);
                basVar.aa();
                f2 = 3.0f;
                sjVar2 = sjVarI;
                cobVar2 = cobVar4;
                bolVar2 = bolVarB;
                j3 = jR;
                j4 = j7 | (jFloatToRawIntBits2 & 4294967295L);
            } else {
                baoVarD.t();
                j4 = j;
                sjVar2 = sjVar;
                cobVar2 = cobVar;
                bolVar2 = bolVar;
                j3 = j2;
                f2 = f;
            }
            baoVarD.m();
            baoVar2 = baoVarD;
            aqs.b(z, yjkVar, bkpVar2, j4, sjVar2, cobVar2, bolVar2, j3, f2, ykaVar, baoVar2, i7 & 2114396158, i6 & R.styleable.AppCompatTheme_windowNoTitle, 0);
            j5 = j4;
            sjVar3 = sjVar2;
            cobVar3 = cobVar2;
            bolVar3 = bolVar2;
            j6 = j3;
            f3 = f2;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: pon
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z2 = z;
                    yjk yjkVar2 = yjkVar;
                    bkp bkpVar3 = bkpVar;
                    long j8 = j5;
                    sj sjVar4 = sjVar3;
                    cob cobVar5 = cobVar3;
                    bol bolVar4 = bolVar3;
                    long j9 = j6;
                    float f4 = f3;
                    int i9 = i;
                    rdd.y(z2, yjkVar2, bkpVar3, j8, sjVar4, cobVar5, bolVar4, j9, f4, ykaVar, (bao) obj, bdi.n(i9 | 1), bdi.n(i2));
                    return ygi.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(defpackage.bqh r15, java.lang.String r16, defpackage.bkp r17, long r18, defpackage.bao r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdd.z(bqh, java.lang.String, bkp, long, bao, int, int):void");
    }

    public final goe n(ViewGroup viewGroup) {
        return new goe(viewGroup, sij.l(new qoi(viewGroup, 12)), sij.l(new qoi(viewGroup, 13)), sij.l(new evk(viewGroup, this, 14, null)));
    }

    public rdd(byte[] bArr, byte[] bArr2, byte[] bArr3) {
    }

    public void a() {
    }

    public void b(Object obj) {
    }

    public void c(ImmutableList immutableList) {
    }
}
