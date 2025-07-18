package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.RecyclerView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaz {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/presentation/pages/hotandnew/HotAndNewPageKt");

    public static final wkx a(gag gagVar) {
        wkw wkwVarB;
        gagVar.getClass();
        Object obj = null;
        if (gagVar.d() == 0) {
            return null;
        }
        ygm ygmVar = new ygm(gagVar.f());
        while (true) {
            if (!ygmVar.hasNext()) {
                break;
            }
            Object next = ygmVar.next();
            wkx wkxVar = (wkx) next;
            if (wkxVar != null) {
                wkwVarB = wkw.b(wkxVar.d);
                if (wkwVarB == null) {
                    wkwVarB = wkw.TYPE_UNSPECIFIED;
                }
            } else {
                wkwVarB = null;
            }
            if (wkwVarB == wkw.EMPTY_STREAM_PAGE_RESULT) {
                obj = next;
                break;
            }
        }
        return (wkx) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, ysx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.kbc r22, defpackage.bkp r23, defpackage.ixm r24, defpackage.irc r25, defpackage.bao r26, int r27) {
        /*
            Method dump skipped, instructions count: 1167
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kaz.b(kbc, bkp, ixm, irc, bao, int):void");
    }

    public static final void c(kbc kbcVar, bkp bkpVar, final ixm ixmVar, final gag gagVar, yjv yjvVar, bao baoVar, int i) {
        int i2;
        bdy bdyVar;
        boolean z;
        int i3;
        bje bjeVar;
        abw abwVar;
        Boolean bool;
        bas basVar;
        Object obj;
        bdy bdyVar2;
        int i4;
        Integer num;
        bdy bdyVar3;
        int i5;
        bao baoVar2;
        kbc kbcVar2 = kbcVar;
        int i6 = i & 6;
        bao baoVarD = baoVar.d(585433166);
        if (i6 == 0) {
            i2 = (true != baoVarD.H(kbcVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? baoVarD.F(ixmVar) : baoVarD.H(ixmVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? baoVarD.F(gagVar) : baoVarD.H(gagVar)) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        int i7 = i2;
        if ((i7 & 1171) == 1170 && baoVarD.K()) {
            baoVarD.t();
            baoVar2 = baoVarD;
        } else {
            abw abwVarA = aby.a(baoVarD);
            baoVarD.x(1849434622);
            bas basVar2 = (bas) baoVarD;
            Object objT = basVar2.T();
            Object obj2 = ban.a;
            if (objT == obj2) {
                kal kalVar = new kal(abwVarA, 3);
                ivx ivxVar = bdt.a;
                bbh bbhVar = new bbh(kalVar, null);
                basVar2.ae(bbhVar);
                objT = bbhVar;
            }
            bdy bdyVar4 = (bdy) objT;
            basVar2.aa();
            Context context = (Context) baoVarD.f(AndroidCompositionLocals_androidKt.b);
            baoVarD.x(-1633490746);
            boolean zF = baoVarD.F(abwVarA) | baoVarD.H(context);
            Object objT2 = basVar2.T();
            if (zF || objT2 == obj2) {
                objT2 = new kbl(abwVarA, context, (yih) null, 1);
                basVar2.ae(objT2);
            }
            basVar2.aa();
            bbn.e(abwVarA, context, (yjz) objT2, baoVarD);
            final bdy bdyVarM = bdi.m(kbcVar2.f, baoVarD);
            bdy bdyVarM2 = bdi.m(kbcVar2.c, baoVarD);
            boolean z2 = e(bdyVarM2) == dvd.e || e(bdyVarM2) == dvd.d;
            bdy bdyVarI = dad.i(kbcVar2.g, baoVarD);
            baoVarD.x(1849434622);
            Object objT3 = basVar2.T();
            if (objT3 == obj2) {
                objT3 = new bje();
                basVar2.ae(objT3);
            }
            bje bjeVar2 = (bje) objT3;
            basVar2.aa();
            baoVarD.x(5004770);
            int i8 = i7 & 7168;
            if (i8 == 2048 || ((i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && baoVarD.H(gagVar))) {
                bdyVar = bdyVar4;
                z = true;
            } else {
                bdyVar = bdyVar4;
                z = false;
            }
            Object objT4 = basVar2.T();
            if (z || objT4 == obj2) {
                objT4 = new kah(gagVar, 2);
                basVar2.ae(objT4);
            }
            final yjv yjvVar2 = (yjv) objT4;
            basVar2.aa();
            List listI = a.i(bdyVar);
            Boolean boolValueOf = Boolean.valueOf(z2);
            Integer numValueOf = Integer.valueOf(gagVar.d());
            baoVarD.x(-1224400529);
            boolean zG = baoVarD.G(z2) | baoVarD.H(kbcVar2) | baoVarD.F(yjvVar2);
            Object objT5 = basVar2.T();
            if (zG || objT5 == obj2) {
                boolean z3 = z2;
                i3 = i8;
                bjeVar = bjeVar2;
                abwVar = abwVarA;
                bool = boolValueOf;
                basVar = basVar2;
                obj = obj2;
                bdyVar2 = bdyVar;
                i4 = i7;
                num = numValueOf;
                bdyVar3 = bdyVarI;
                i5 = -1224400529;
                kav kavVar = new kav(z3, kbcVar2, yjvVar2, bdyVar2, null);
                z2 = z3;
                kbcVar2 = kbcVar2;
                basVar.ae(kavVar);
                objT5 = kavVar;
            } else {
                i3 = i8;
                bjeVar = bjeVar2;
                basVar = basVar2;
                abwVar = abwVarA;
                bool = boolValueOf;
                obj = obj2;
                bdyVar2 = bdyVar;
                i4 = i7;
                num = numValueOf;
                bdyVar3 = bdyVarI;
                i5 = -1224400529;
            }
            yjz yjzVar = (yjz) objT5;
            basVar.aa();
            yil yilVar = basVar.v;
            boolean zF2 = baoVarD.F(bool) | baoVarD.F(listI) | baoVarD.F(num);
            Object objT6 = basVar.T();
            if (zF2 || objT6 == obj) {
                objT6 = new bbu(yilVar, yjzVar);
                basVar.ae(objT6);
            }
            baoVarD.x(1849434622);
            Object objT7 = basVar.T();
            if (objT7 == obj) {
                jzx jzxVar = new jzx(gagVar, bjeVar, 5);
                ivx ivxVar2 = bdt.a;
                bbh bbhVar2 = new bbh(jzxVar, null);
                basVar.ae(bbhVar2);
                objT7 = bbhVar2;
            }
            final bdy bdyVar5 = (bdy) objT7;
            basVar.aa();
            Configuration configuration = (Configuration) baoVarD.f(AndroidCompositionLocals_androidKt.a);
            WeakHashMap weakHashMap = zs.a;
            float fD = new yo(zy.j(baoVarD).d, (clx) baoVarD.f(ccq.d)).d();
            boolean z4 = kbcVar2.b;
            configuration.getClass();
            int i9 = configuration.orientation;
            float f = !z4 ? 16.0f : fD + 72.0f;
            float f2 = i9 == 1 ? 8.0f : 12.0f;
            za zaVar = new za(f2, f, f2, 140.0f);
            baoVarD.x(i5);
            final bdy bdyVar6 = bdyVar3;
            int i10 = i4;
            boolean zF3 = baoVarD.F(bdyVarM) | baoVarD.G(z2) | baoVarD.F(bdyVar6) | baoVarD.H(kbcVar2) | baoVarD.F(yjvVar2) | ((i10 & 896) == 256 || ((i10 & 512) != 0 && baoVarD.H(ixmVar))) | (i3 == 2048 || ((i10 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 && baoVarD.H(gagVar)));
            Object objT8 = basVar.T();
            if (zF3 || objT8 == obj) {
                final kbc kbcVar3 = kbcVar2;
                final bdy bdyVar7 = bdyVar2;
                final bje bjeVar3 = bjeVar;
                final boolean z5 = z2;
                yjv yjvVar3 = new yjv() { // from class: kau
                    @Override // defpackage.yjv
                    public final Object a(Object obj3) {
                        aaz aazVar = (aaz) obj3;
                        aazVar.getClass();
                        List listI2 = a.i(bdyVar5);
                        aazVar.a(listI2.size(), new bbs(new dsc(9), listI2, 4, null), new bil(listI2, 7), new bhq(-1942245546, true, new kay(listI2, kbcVar3, yjvVar2, ixmVar, z5, bdyVar7, bdyVarM, bdyVar6, bjeVar3)));
                        if (!gagVar.e().e) {
                            aazVar.a(2, null, abo.a, kat.a);
                        }
                        return ygi.a;
                    }
                };
                basVar.ae(yjvVar3);
                objT8 = yjvVar3;
            }
            basVar.aa();
            baoVar2 = baoVarD;
            jxl.A(bkpVar, abwVar, zaVar, 0.0f, 0.0f, 0.0f, (yjv) objT8, baoVar2, (i10 >> 3) & 14);
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new sx(kbcVar, bkpVar, ixmVar, gagVar, yjvVar, i, 7);
        }
    }

    public static final void d(bcb bcbVar, cb cbVar) {
        bcbVar.b(cbVar);
    }

    private static final dvd e(bdy bdyVar) {
        return (dvd) bdyVar.a();
    }
}
