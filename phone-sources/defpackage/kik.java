package defpackage;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.support.v7.widget.RecyclerView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kik {
    public static final kik a = new kik();

    private kik() {
    }

    public static final boolean h(bao baoVar) {
        baoVar.x(1333795976);
        boolean zA = a.bY(baoVar).a.a();
        ((bas) baoVar).aa();
        return zA;
    }

    public final void a(yjk yjkVar, kiq kiqVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(736029027);
        if (i3 == 0) {
            i2 = i | (true != baoVarD.H(yjkVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 16 : 32;
        }
        int i4 = 18;
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            boolean z = false;
            Object[] objArr = new Object[0];
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new jzm(14);
                basVar.ae(objT);
            }
            basVar.aa();
            bcb bcbVar = (bcb) bga.p(objArr, (yjk) objT, baoVarD);
            khk khkVar = khk.a;
            baoVarD.x(5004770);
            boolean zF = baoVarD.F(bcbVar);
            Object objT2 = basVar.T();
            if (zF || objT2 == obj) {
                objT2 = new kic(bcbVar, i4);
                basVar.ae(objT2);
            }
            basVar.aa();
            khkVar.g((yjk) objT2, null, baoVarD, 0);
            boolean zBooleanValue = ((Boolean) bcbVar.a()).booleanValue();
            baoVarD.x(5004770);
            boolean zF2 = baoVarD.F(bcbVar);
            Object objT3 = basVar.T();
            if (zF2 || objT3 == obj) {
                objT3 = new kic(bcbVar, 19);
                basVar.ae(objT3);
            }
            yjk yjkVar2 = (yjk) objT3;
            basVar.aa();
            baoVarD.x(-1746271574);
            boolean zF3 = ((i2 & 14) == 4) | baoVarD.F(bcbVar);
            if ((i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 32 || ((i2 & 64) != 0 && baoVarD.H(kiqVar))) {
                z = true;
            }
            boolean z2 = zF3 | z;
            Object objT4 = basVar.T();
            if (z2 || objT4 == obj) {
                objT4 = new kfy((Object) yjkVar, (dwt) kiqVar, (Object) bcbVar, 2);
                basVar.ae(objT4);
            }
            basVar.aa();
            kaf.f(zBooleanValue, yjkVar2, (yjk) objT4, null, baoVarD, 0);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, yjkVar, kiqVar, i, 4);
        }
    }

    public final void b(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1087944980);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.e(24.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarA = zi.a(bkp.g, 1.0f);
            bvt bvtVarA2 = zf.a(xk.f, bkb.n, baoVarD, 54);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            baoVarD.x(5004770);
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = new kic(kiqVar, 7);
                basVar.ae(objT);
            }
            basVar.aa();
            kgu.b((yjk) objT, null, baoVarD, 0);
            baoVarD.x(5004770);
            boolean z2 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT2 = basVar.T();
            int i5 = 8;
            if (z2 || objT2 == ban.a) {
                objT2 = new kic(kiqVar, i5);
                basVar.ae(objT2);
            }
            basVar.aa();
            kgu.c((yjk) objT2, null, baoVarD, 0);
            baoVarD.x(5004770);
            boolean z3 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT3 = basVar.T();
            if (z3 || objT3 == ban.a) {
                objT3 = new kic(kiqVar, 9);
                basVar.ae(objT3);
            }
            basVar.aa();
            jys.g((yjk) objT3, null, baoVarD, 0);
            baoVarD.o();
            boolean zBooleanValue = ((Boolean) dad.i(kiqVar.e, baoVarD).a()).booleanValue();
            baoVarD.x(5004770);
            boolean z4 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT4 = basVar.T();
            if (z4 || objT4 == ban.a) {
                objT4 = new kic(kiqVar, 10);
                basVar.ae(objT4);
            }
            yjk yjkVar2 = (yjk) objT4;
            basVar.aa();
            baoVarD.x(5004770);
            boolean z5 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT5 = basVar.T();
            if (z5 || objT5 == ban.a) {
                objT5 = new kic(kiqVar, 11);
                basVar.ae(objT5);
            }
            yjk yjkVar3 = (yjk) objT5;
            basVar.aa();
            baoVarD.x(5004770);
            boolean z6 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT6 = basVar.T();
            if (z6 || objT6 == ban.a) {
                objT6 = new kic(kiqVar, 12);
                basVar.ae(objT6);
            }
            basVar.aa();
            kff.j(yjkVar2, zBooleanValue, yjkVar3, (yjk) objT6, null, baoVarD, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, kiqVar, bkpVar, i, 6);
        }
    }

    public final void c(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1645235077);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bvt bvtVarA = xu.a(xk.e(24.0f), bkb.j, baoVarD, 6);
            int iK = a.k(zy.p(baoVarD));
            bas basVar = (bas) baoVarD;
            bhu bhuVarAi = basVar.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVar);
            yjk yjkVar = bxt.a;
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            yjz yjzVar = bxt.d;
            beb.a(baoVarD, bvtVarA, yjzVar);
            yjz yjzVar2 = bxt.c;
            beb.a(baoVarD, bhuVarAi, yjzVar2);
            yjz yjzVar3 = bxt.e;
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK))) {
                Integer numValueOf = Integer.valueOf(iK);
                basVar.ae(numValueOf);
                baoVarD.i(numValueOf, yjzVar3);
            }
            yjz yjzVar4 = bxt.b;
            beb.a(baoVarD, bkpVarC, yjzVar4);
            bkp bkpVarA = zi.a(bkp.g, 1.0f);
            bvt bvtVarA2 = zf.a(xk.f, bkb.n, baoVarD, 54);
            int iK2 = a.k(zy.p(baoVarD));
            bhu bhuVarAi2 = basVar.ai();
            bkp bkpVarC2 = bdi.C(baoVarD, bkpVarA);
            baoVarD.z();
            if (basVar.w) {
                baoVarD.k(yjkVar);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, bvtVarA2, yjzVar);
            beb.a(baoVarD, bhuVarAi2, yjzVar2);
            if (basVar.w || !yks.e(basVar.T(), Integer.valueOf(iK2))) {
                Integer numValueOf2 = Integer.valueOf(iK2);
                basVar.ae(numValueOf2);
                baoVarD.i(numValueOf2, yjzVar3);
            }
            beb.a(baoVarD, bkpVarC2, yjzVar4);
            baoVarD.x(1849434622);
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new jzm(11);
                basVar.ae(objT);
            }
            basVar.aa();
            kgu.d((yjk) objT, null, baoVarD, 6);
            baoVarD.x(1849434622);
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new jzm(12);
                basVar.ae(objT2);
            }
            basVar.aa();
            jys.d((yjk) objT2, null, baoVarD, 54);
            baoVarD.x(1849434622);
            Object objT3 = basVar.T();
            if (objT3 == obj) {
                objT3 = new jzm(13);
                basVar.ae(objT3);
            }
            basVar.aa();
            kfw.a((yjk) objT3, null, baoVarD, 6);
            baoVarD.o();
            boolean zBooleanValue = ((Boolean) dad.i(kiqVar.e, baoVarD).a()).booleanValue();
            baoVarD.x(5004770);
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT4 = basVar.T();
            if (z || objT4 == obj) {
                objT4 = new kic(kiqVar, 14);
                basVar.ae(objT4);
            }
            yjk yjkVar2 = (yjk) objT4;
            basVar.aa();
            baoVarD.x(5004770);
            boolean z2 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT5 = basVar.T();
            if (z2 || objT5 == obj) {
                objT5 = new kic(kiqVar, 15);
                basVar.ae(objT5);
            }
            yjk yjkVar3 = (yjk) objT5;
            basVar.aa();
            baoVarD.x(5004770);
            boolean z3 = i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(kiqVar));
            Object objT6 = basVar.T();
            if (z3 || objT6 == obj) {
                objT6 = new kic(kiqVar, 16);
                basVar.ae(objT6);
            }
            basVar.aa();
            kff.j(yjkVar2, zBooleanValue, yjkVar3, (yjk) objT6, null, baoVarD, 0);
            baoVarD.o();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, kiqVar, bkpVar, i, 7);
        }
    }

    public final void d(kgv kgvVar, String str, kiq kiqVar, boolean z, yjk yjkVar, yjk yjkVar2, yjz yjzVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVar2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1272547454);
        if (i3 == 0) {
            i2 = (true != baoVarD.D(kgvVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 4194304 : 8388608;
        }
        int i4 = i2;
        if ((4793491 & i4) == 4793490 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new jzm(10);
                basVar.ae(objT);
            }
            basVar.aa();
            bcb bcbVar = (bcb) bga.p(objArr, (yjk) objT, baoVarD);
            int i5 = i4 >> 12;
            baoVar2 = baoVarD;
            kdw.g(yjkVar, yjkVar2, bga.k(-1990046542, new awe((Object) str, (Object) kiqVar, (Object) context, (bdy) bcbVar, 4), baoVarD), bga.k(493353553, new kev(kgvVar, z, kiqVar, bcbVar, 3), baoVarD), yjzVar, wv.u(bkpVar, 12.0f, 0.0f, 2), baoVar2, (i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | (i5 & 14) | 3456 | ((i4 >> 6) & 57344));
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kif(this, kgvVar, str, kiqVar, z, yjkVar, yjkVar2, yjzVar, bkpVar, i, 0);
        }
    }

    public final void e(kgv kgvVar, String str, boolean z, yjk yjkVar, yjk yjkVar2, kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1049184955);
        if (i3 == 0) {
            i2 = (true != baoVarD.D(kgvVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            i2 |= true != baoVarD.H(yjkVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 524288 : 1048576;
        }
        int i4 = i2;
        if ((599187 & i4) == 599186 && baoVarD.K()) {
            baoVarD.t();
        } else {
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            baoVarD.x(1849434622);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (objT == ban.a) {
                objT = new jzm(9);
                basVar.ae(objT);
            }
            basVar.aa();
            bcb bcbVar = (bcb) bga.p(objArr, (yjk) objT, baoVarD);
            int i5 = i4 >> 9;
            kdw.h(yjkVar, yjkVar2, bga.k(-1017426383, new awe((Object) str, (Object) kiqVar, (Object) context, (bdy) bcbVar, 5), baoVarD), bga.k(-146604784, new kev(kgvVar, z, kiqVar, bcbVar, 4), baoVarD), wv.u(bkpVar, 12.0f, 0.0f, 2), baoVarD, (i5 & 14) | 3456 | (i5 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new ket(this, kgvVar, str, z, yjkVar, yjkVar2, kiqVar, bkpVar, i, 2);
        }
    }

    public final void i(kgv kgvVar, boolean z, kiq kiqVar, boolean z2, yjk yjkVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        yjk yjkVar2;
        bao baoVar2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-1171630285);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.D(kgvVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.G(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.G(z2) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i & 24576) == 0) {
            yjkVar2 = yjkVar;
            i2 |= true != baoVarD.H(yjkVar2) ? 8192 : 16384;
        } else {
            yjkVar2 = yjkVar;
        }
        int i3 = i2 | 196608;
        if ((74899 & i3) == 74898 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            bkm bkmVar = bkp.g;
            int i4 = i3 >> 9;
            baoVar2 = baoVarD;
            kaf.e(z2, yjkVar, bkmVar, bga.k(-743827532, new kii(kiqVar, (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b), z, yjkVar2, kgvVar), baoVarD), baoVar2, (i4 & 896) | (i4 & 14) | 3072 | (i4 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle));
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new asf(this, kgvVar, z, kiqVar, z2, yjkVar, bkpVar2, i, 2);
        }
    }

    public final void j(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-235100808);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            yva yvaVar = kiqVar.f;
            bkm bkmVar = bkp.g;
            if (((Boolean) dad.i(yvaVar, baoVarD).a()).booleanValue()) {
                baoVarD.x(5004770);
                if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.H(kiqVar))) {
                    z = false;
                }
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                if (z || objT == ban.a) {
                    objT = new kic(kiqVar, 6);
                    basVar.ae(objT);
                }
                basVar.aa();
                jyv.f((yjk) objT, null, baoVarD, 0);
            }
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, kiqVar, bkpVar2, i, 5);
        }
    }

    public final void k(String str, yjk yjkVar, boolean z, yjv yjvVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-1024390308);
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.F(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != baoVarD.H(yjvVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
        } else {
            bkm bkmVar = bkp.g;
            jys.h(bga.k(-1989621531, new khi(str, yjkVar, 2, null), baoVarD), bga.k(1747361702, new khm(yjvVar, z, 2), baoVarD), bkmVar, baoVarD, ((i3 >> 6) & 896) | 54);
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kig(this, str, yjkVar, z, yjvVar, bkpVar2, i, 0);
        }
    }

    public final void l(kiq kiqVar, bkp bkpVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(343230442);
        boolean z = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bkpVar = bkp.g;
            baoVarD.x(5004770);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !baoVarD.H(kiqVar))) {
                z = false;
            }
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = new kic(kiqVar, 17);
                basVar.ae(objT);
            }
            basVar.aa();
            jyv.e((yjk) objT, null, baoVarD, 0);
        }
        bkp bkpVar2 = bkpVar;
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kia(this, kiqVar, bkpVar2, i, 8);
        }
    }

    public final void m(kiq kiqVar, yjk yjkVar, boolean z, bkp bkpVar, bao baoVar, int i) {
        int i2;
        kik kikVar;
        ith ithVar;
        boolean z2;
        String strD;
        bkm bkmVar;
        bao baoVar2;
        bkp bkpVar2;
        bao baoVarD = baoVar.d(-240094033);
        boolean z3 = true;
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(kiqVar) : baoVarD.H(kiqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.G(z) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            kikVar = this;
            i3 |= true != baoVarD.F(kikVar) ? 8192 : 16384;
        } else {
            kikVar = this;
        }
        if ((i3 & 9363) == 9362 && baoVarD.K()) {
            baoVarD.t();
            bkpVar2 = bkpVar;
            baoVar2 = baoVarD;
        } else {
            int i4 = i3 << 9;
            int i5 = i3 << 6;
            yva yvaVar = kiqVar.d;
            bkm bkmVar2 = bkp.g;
            ith ithVar2 = (ith) dad.h(yvaVar, null, null, baoVarD, 48, 14).a();
            if (ithVar2 == null || !ithVar2.n()) {
                ithVar = ithVar2;
                z2 = false;
            } else {
                ithVar = ithVar2;
                z2 = true;
            }
            if (ithVar == null || (strD = ithVar.d()) == null) {
                strD = "";
            }
            kgv kgvVar = (kgv) dad.i(kiqVar.c, baoVarD).a();
            baoVarD.x(5004770);
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !baoVarD.H(kiqVar))) {
                z3 = false;
            }
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z3 || objT == ban.a) {
                objT = new kic(kiqVar, 13);
                basVar.ae(objT);
            }
            yjk yjkVar2 = (yjk) objT;
            basVar.aa();
            if (z) {
                baoVarD.x(-1520165448);
                bkmVar = bkmVar2;
                kikVar.e(kgvVar, strD, z2, yjkVar, yjkVar2, kiqVar, bkmVar, baoVarD, ((i3 << 15) & 458752) | (i5 & 7168) | 262144 | (3670016 & i4) | (29360128 & i4));
                baoVar2 = baoVarD;
                basVar.aa();
            } else {
                baoVarD.x(-1519803988);
                int i6 = i3 << 12;
                d(kgvVar, strD, kiqVar, z2, yjkVar, yjkVar2, bga.k(553052067, new khi(kgvVar, kiqVar, 3, null), baoVarD), bkmVar2, baoVarD, (i5 & 896) | 1573376 | (57344 & i4) | (i6 & 29360128) | (i6 & 234881024));
                bkmVar = bkmVar2;
                baoVar2 = baoVarD;
                basVar.aa();
            }
            bkpVar2 = bkmVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new kes(this, kiqVar, yjkVar, z, bkpVar2, i, 5);
        }
    }
}
