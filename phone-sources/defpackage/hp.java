package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.support.v7.appcompat.R;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.RecyclerView;
import androidx.compose.foundation.selection.ToggleableElement;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hp {
    private static final bii A(anh anhVar) {
        return new bij(new xa(anhVar, 6), new afh(0));
    }

    private static final bkp B(bkp bkpVar, cfy cfyVar, chc chcVar, yjv yjvVar, int i, boolean z, int i2, int i3, esn esnVar, List list, yjv yjvVar2, alo aloVar, bns bnsVar, yjv yjvVar3) {
        if (aloVar == null) {
            return bkpVar.a(bkp.g).a(new TextAnnotatedStringElement(cfyVar, chcVar, esnVar, yjvVar, i, z, i2, i3, list, yjvVar2, bnsVar, yjvVar3));
        }
        return bkpVar.a(aloVar.e).a(new SelectableTextAnnotatedStringElement(cfyVar, chcVar, esnVar, yjvVar, i, z, i2, i3, list, yjvVar2, aloVar, bnsVar));
    }

    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return abh$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(fr$$ExternalSyntheticApiModelOutline0.m414m()));
    }

    public static Method c() {
        try {
            return fr$$ExternalSyntheticApiModelOutline0.m414m().getMethod("canAuthenticate", eo$$ExternalSyntheticApiModelOutline0.m359m());
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Intent d(String[] strArr) {
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        intentPutExtra.getClass();
        return intentPutExtra;
    }

    public static final void e(boolean z, yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-642000585);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjzVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bdy bdyVarBR = a.bR(yjzVar, baoVarD);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                bbd bbdVar = new bbd(bbn.a(yim.a, baoVarD));
                basVar.ae(bbdVar);
                objT = bbdVar;
            }
            yow yowVar = ((bbd) objT).a;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                objT2 = new gj(z, yowVar, z(bdyVarBR));
                basVar.ae(objT2);
            }
            gj gjVar = (gj) objT2;
            boolean zF = baoVarD.F(z(bdyVarBR)) | baoVarD.F(yowVar);
            Object objT3 = basVar.T();
            if (zF || objT3 == obj) {
                gjVar.d = z(bdyVarBR);
                gjVar.a = yowVar;
                basVar.ae(ygi.a);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = 0;
            boolean zH = ((i2 & 14) == 4) | baoVarD.H(gjVar);
            Object objT4 = basVar.T();
            if (zH || objT4 == obj) {
                objT4 = new atz(gjVar, z, (yih) null, 1);
                basVar.ae(objT4);
            }
            bbn.f(boolValueOf, (yjz) objT4, baoVarD);
            fz fzVarA = gh.a(baoVarD);
            if (fzVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            fx onBackPressedDispatcher = fzVarA.getOnBackPressedDispatcher();
            dvk dvkVar = (dvk) baoVarD.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = baoVarD.H(onBackPressedDispatcher) | baoVarD.H(dvkVar) | baoVarD.H(gjVar);
            Object objT5 = basVar.T();
            if (zH2 || objT5 == obj) {
                objT5 = new gk(onBackPressedDispatcher, dvkVar, gjVar, i5);
                basVar.ae(objT5);
            }
            bbn.b(dvkVar, onBackPressedDispatcher, (yjv) objT5, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new fyo(z, yjzVar, i, i4);
        }
    }

    public static final void f(yjk yjkVar, bao baoVar, int i) {
        int i2;
        bao baoVarD = baoVar.d(-361453782);
        int i3 = 4;
        int i4 = 1;
        if ((i & 6) == 0) {
            i2 = (true != baoVarD.G(true) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.H(yjkVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            bdy bdyVarBR = a.bR(yjkVar, baoVarD);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new gc(bdyVarBR);
                basVar.ae(objT);
            }
            gc gcVar = (gc) objT;
            boolean zH = ((i2 & 14) == 4) | baoVarD.H(gcVar);
            Object objT2 = basVar.T();
            if (zH || objT2 == obj) {
                objT2 = new fg(gcVar, i3);
                basVar.ae(objT2);
            }
            bbn.g((yjk) objT2, baoVarD);
            fz fzVarA = gh.a(baoVarD);
            if (fzVarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            fx onBackPressedDispatcher = fzVarA.getOnBackPressedDispatcher();
            dvk dvkVar = (dvk) baoVarD.f(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zH2 = baoVarD.H(onBackPressedDispatcher) | baoVarD.H(dvkVar) | baoVarD.H(gcVar);
            Object objT3 = basVar.T();
            if (zH2 || objT3 == obj) {
                objT3 = new gk(onBackPressedDispatcher, dvkVar, gcVar, i4);
                basVar.ae(objT3);
            }
            bbn.b(dvkVar, onBackPressedDispatcher, (yjv) objT3, baoVarD);
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(yjkVar, i, i4);
        }
    }

    public static final Object g(yjv yjvVar, yih yihVar) {
        cdd cddVar = (cdd) yihVar.getContext().get(cdd.a);
        if (cddVar == null) {
            return bcm.e(yjvVar, yihVar);
        }
        new afm(yjvVar, (yih) null, 1);
        return cddVar.a();
    }

    public static final ne i(ne neVar) {
        ne neVarC = neVar.c();
        int iB = neVarC.b();
        for (int i = 0; i < iB; i++) {
            neVarC.e(i, neVar.a(i));
        }
        return neVarC;
    }

    public static /* synthetic */ mz j(mz mzVar, float f) {
        float f2 = ((na) mzVar.a).a;
        long j = mzVar.b;
        long j2 = mzVar.c;
        boolean z = mzVar.d;
        return new mz(mzVar.e, Float.valueOf(f), new na(f2), j, j2, z);
    }

    public static /* synthetic */ mz k(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new mz(pm.a, Float.valueOf(0.0f), new na(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @yfp
    public static final void l(final cfy cfyVar, bkp bkpVar, final chc chcVar, boolean z, int i, int i2, yjv yjvVar, final yjv yjvVar2, bao baoVar, final int i3) {
        cfy cfyVar2;
        int i4;
        chc chcVar2;
        bao baoVar2;
        final bkp bkpVar2;
        final boolean z2;
        final int i5;
        final int i6;
        final yjv yjvVar3;
        bao baoVarD = baoVar.d(-246609449);
        int i7 = 2;
        if ((i3 & 6) == 0) {
            cfyVar2 = cfyVar;
            i4 = (true != baoVarD.F(cfyVar2) ? 2 : 4) | i3;
        } else {
            cfyVar2 = cfyVar;
            i4 = i3;
        }
        int i8 = i4 | 48;
        if ((i3 & 384) == 0) {
            chcVar2 = chcVar;
            i8 |= true != baoVarD.F(chcVar2) ? 128 : 256;
        } else {
            chcVar2 = chcVar;
        }
        int i9 = i8 | 1797120;
        if ((12582912 & i3) == 0) {
            i9 |= true != baoVarD.H(yjvVar2) ? 4194304 : 8388608;
        }
        int i10 = 0;
        if (baoVarD.L((4793491 & i9) != 4793490, i9 & 1)) {
            bkm bkmVar = bkp.g;
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            Object obj = ban.a;
            if (objT == obj) {
                objT = new afh(i7);
                basVar.ae(objT);
            }
            yjv yjvVar4 = (yjv) objT;
            Object objT2 = basVar.T();
            if (objT2 == obj) {
                Object bciVar = new bci(null, bcz.c);
                basVar.ae(bciVar);
                objT2 = bciVar;
            }
            int i11 = 29360128 & i9;
            bcb bcbVar = (bcb) objT2;
            Object objT3 = basVar.T();
            if (i11 == 8388608 || objT3 == obj) {
                objT3 = new amy(bcbVar, yjvVar2, 1);
                basVar.ae(objT3);
            }
            bkp bkpVarA = btm.a(bkmVar, yjvVar2, (PointerInputEventHandler) objT3);
            int i12 = i9 & 3670016;
            Object objT4 = basVar.T();
            if (i12 == 1048576 || objT4 == obj) {
                objT4 = new afk(bcbVar, yjvVar4, i10);
                basVar.ae(objT4);
            }
            baoVar2 = baoVarD;
            n(cfyVar2, bkpVarA, chcVar2, (yjv) objT4, 1, true, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, null, baoVar2, (i9 & 58254) | ((i9 << 6) & 458752) | ((i9 << 3) & 3670016), 0, 1920);
            i6 = Integer.MAX_VALUE;
            yjvVar3 = yjvVar4;
            bkpVar2 = bkmVar;
            z2 = true;
            i5 = 1;
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
            bkpVar2 = bkpVar;
            z2 = z;
            i5 = i;
            i6 = i2;
            yjvVar3 = yjvVar;
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: afl
                @Override // defpackage.yjz
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cfy cfyVar3 = cfyVar;
                    bkp bkpVar3 = bkpVar2;
                    chc chcVar3 = chcVar;
                    boolean z3 = z2;
                    int i13 = i5;
                    int i14 = i6;
                    yjv yjvVar5 = yjvVar3;
                    hp.l(cfyVar3, bkpVar3, chcVar3, z3, i13, i14, yjvVar5, yjvVar2, (bao) obj2, bdi.n(i3 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final List m(List list, yjk yjkVar) {
        int iB;
        int iA;
        Object afiVar;
        if (!((Boolean) yjkVar.a()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bvs bvsVar = (bvs) list.get(i);
            Object objG = bvsVar.g();
            objG.getClass();
            atx atxVar = ((agi) objG).a;
            cgz cgzVarK = ((ajs) atxVar.b).k();
            if (cgzVarK == null) {
                afiVar = new gf(14);
            } else {
                cfx cfxVarN = ajs.n((cfx) atxVar.a, cgzVarK);
                if (cfxVarN == null) {
                    afiVar = new gf(15);
                } else {
                    cmg cmgVarA = clw.A(cgzVarK.t(cfxVarN.b, cfxVarN.c).b());
                    iB = cmgVarA.b();
                    iA = cmgVarA.a();
                    afiVar = new afi(cmgVarA, 2);
                    arrayList.add(new yfw(bvsVar.u(clw.n(iB, iB, iA, iA)), afiVar));
                }
            }
            iB = 0;
            iA = 0;
            arrayList.add(new yfw(bvsVar.u(clw.n(iB, iB, iA, iA)), afiVar));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(defpackage.cfy r33, defpackage.bkp r34, defpackage.chc r35, defpackage.yjv r36, int r37, boolean r38, int r39, int r40, java.util.Map r41, defpackage.bao r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1053
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.n(cfy, bkp, chc, yjv, int, boolean, int, int, java.util.Map, bao, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void o(final java.lang.String r36, defpackage.bkp r37, defpackage.chc r38, defpackage.yjv r39, int r40, boolean r41, int r42, int r43, defpackage.bns r44, defpackage.bao r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.o(java.lang.String, bkp, chc, yjv, int, boolean, int, int, bns, bao, int, int):void");
    }

    @yfp
    public static final /* synthetic */ void p(final String str, final bkp bkpVar, final chc chcVar, final yjv yjvVar, final int i, final boolean z, final int i2, final int i3, final bns bnsVar, bao baoVar, final int i4) {
        String str2;
        int i5;
        bao baoVar2;
        int i6 = i4 & 6;
        bao baoVarD = baoVar.d(-1186827822);
        if (i6 == 0) {
            str2 = str;
            i5 = (true != baoVarD.F(str2) ? 2 : 4) | i4;
        } else {
            str2 = str;
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i5 |= true != baoVarD.F(chcVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i5 |= true != baoVarD.H(yjvVar) ? 1024 : RecyclerView.ItemAnimator.FLAG_MOVED;
        }
        if ((i4 & 24576) == 0) {
            i5 |= true != baoVarD.D(i) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i5 |= true != baoVarD.G(z) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i5 |= true != baoVarD.D(i2) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i5 |= true != baoVarD.D(i3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i5 |= true != baoVarD.H(bnsVar) ? 33554432 : 67108864;
        }
        if (baoVarD.L((38347923 & i5) != 38347922, i5 & 1)) {
            baoVar2 = baoVarD;
            o(str2, bkpVar, chcVar, yjvVar, i, z, i2, i3, bnsVar, baoVar2, i5 & 268435454, 512);
        } else {
            baoVar2 = baoVarD;
            baoVar2.t();
        }
        bcr bcrVarM = baoVar2.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: afg
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str3 = str;
                    bkp bkpVar2 = bkpVar;
                    chc chcVar2 = chcVar;
                    yjv yjvVar2 = yjvVar;
                    int i7 = i;
                    boolean z2 = z;
                    int i8 = i2;
                    int i9 = i3;
                    hp.p(str3, bkpVar2, chcVar2, yjvVar2, i7, z2, i8, i9, bnsVar, (bao) obj, bdi.n(i4 | 1));
                    return ygi.a;
                }
            };
        }
    }

    public static final void q(final bkp bkpVar, bao baoVar, final int i, final int i2) {
        int i3;
        bao baoVarD = baoVar.d(694251107);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (baoVarD.L((i3 & 3) != 2, 1 & i3)) {
            if (i2 != 0) {
                bkpVar = bkp.g;
            }
            zy.k(bdi.E(zi.f(bkpVar, 20.710678f, 25.0f), zu.b), baoVarD);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: aeq
                @Override // defpackage.yjz
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    hp.q(bkpVar, (bao) obj, bdi.n(i4 | 1), i2);
                    return ygi.a;
                }
            };
        }
    }

    public static final void r(amg amgVar, bkp bkpVar, long j, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1776202187);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? baoVarD.F(amgVar) : baoVarD.H(amgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(bkpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != baoVarD.E(j) ? 128 : 256;
        }
        boolean z = false;
        if (baoVarD.L((i2 & 147) != 146, i2 & 1)) {
            baoVarD.u();
            if ((i & 1) != 0 && !baoVarD.I()) {
                baoVarD.t();
            }
            baoVarD.m();
            int i4 = i2 & 14;
            if (i4 == 4 || ((i2 & 8) != 0 && baoVarD.H(amgVar))) {
                z = true;
            }
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (z || objT == ban.a) {
                objT = new zn(amgVar, 12);
                basVar.ae(objT);
            }
            hw.w(amgVar, bkb.b, bga.k(-1653527038, new aor(j, cfd.b(bkpVar, false, (yjv) objT), 1), baoVarD), baoVarD, i4 | 432);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new azd(amgVar, bkpVar, j, i, 1);
        }
    }

    public static final void t(yka ykaVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-709502251);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != baoVarD.H(ykaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            bcp bcpVar = big.a;
            bie bieVar = (bie) baoVarD.f(bcpVar);
            bib bibVarL = bga.l(baoVarD);
            Object[] objArr = {bieVar};
            bij bijVar = new bij(new xb(5), new ox(bieVar, bibVarL, 20));
            boolean zH = baoVarD.H(bieVar) | baoVarD.H(bibVarL);
            bas basVar = (bas) baoVarD;
            Object objT = basVar.T();
            if (zH || objT == ban.a) {
                objT = new qm(bieVar, bibVarL, i4, null);
                basVar.ae(objT);
            }
            adq adqVar = (adq) bga.m(objArr, bijVar, (yjk) objT, baoVarD, 0);
            bcm.i(bcpVar.c(adqVar), bga.k(-412824043, new acv(ykaVar, adqVar, 2), baoVarD), baoVarD, 56);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(ykaVar, i, 3);
        }
    }

    public static final int u(add addVar) {
        long jG = addVar.g(0);
        return addVar.m() ? cmf.b(jG) : cmf.a(jG);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final bkp v(bkp bkpVar, boolean z, kw kwVar, rn rnVar, boolean z2, cez cezVar, yjv yjvVar) {
        return bkpVar.a(rnVar instanceof rs ? new ToggleableElement(z, kwVar, rnVar, z2, cezVar, yjvVar) : rnVar == 0 ? new ToggleableElement(z, kwVar, null, z2, cezVar, yjvVar) : kwVar != null ? rp.a(bkp.g, kwVar, rnVar).a(new ToggleableElement(z, kwVar, null, z2, cezVar, yjvVar)) : bdi.E(bkp.g, new aef(rnVar, z, z2, cezVar, yjvVar, 0)));
    }

    public static final void w(final bkp bkpVar, final cfy cfyVar, final yjv yjvVar, final boolean z, final Map map, final chc chcVar, final int i, final boolean z2, final int i2, final int i3, final esn esnVar, final alo aloVar, final yjv yjvVar2, bao baoVar, final int i4, final int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean z4;
        int i9;
        ajs ajsVar;
        yjk yjkVar;
        List list;
        List list2;
        yjv yjvVar3;
        Object obj;
        yjv yjvVar4;
        Object aggVar;
        int i10 = i4 & 6;
        bao baoVarD = baoVar.d(-2118572703);
        if (i10 == 0) {
            i6 = (true != baoVarD.F(bkpVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != baoVarD.F(cfyVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != baoVarD.H(yjvVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != baoVarD.G(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != baoVarD.H(map) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != baoVarD.F(chcVar) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != baoVarD.D(i) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            z3 = z2;
            i6 |= true != baoVarD.G(z3) ? 4194304 : 8388608;
        } else {
            z3 = z2;
        }
        if ((100663296 & i4) == 0) {
            i7 = i2;
            i6 |= true != baoVarD.D(i7) ? 33554432 : 67108864;
        } else {
            i7 = i2;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != baoVarD.D(i3) ? 268435456 : 536870912;
        }
        int i11 = i6;
        if ((i5 & 6) == 0) {
            i8 = (true != baoVarD.H(esnVar) ? 2 : 4) | i5;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 |= true != baoVarD.H(aloVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            z4 = true;
            i8 |= true != baoVarD.H(null) ? 128 : 256;
        } else {
            z4 = true;
        }
        if ((i5 & 3072) == 0) {
            i8 |= z4 == baoVarD.H(yjvVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= true == ((32768 & i5) == 0 ? baoVarD.F(null) : baoVarD.H(null)) ? 16384 : 8192;
        }
        if (baoVarD.L(((306783379 & i11) == 306783378 && (i8 & 9363) == 9362) ? false : true, i11 & 1)) {
            int i12 = i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            if (hw.A(cfyVar)) {
                baoVarD.x(145661411);
                bas basVar = (bas) baoVarD;
                Object objT = basVar.T();
                i9 = i8;
                if (i12 == 32 || objT == ban.a) {
                    objT = new ajs(cfyVar);
                    basVar.ae(objT);
                }
                basVar.aa();
                ajsVar = (ajs) objT;
            } else {
                i9 = i8;
                baoVarD.x(145727068);
                ((bas) baoVarD).aa();
                ajsVar = null;
            }
            if (hw.A(cfyVar)) {
                baoVarD.x(145925283);
                boolean zF = (i12 == 32) | baoVarD.F(ajsVar);
                bas basVar2 = (bas) baoVarD;
                Object objT2 = basVar2.T();
                if (zF || objT2 == ban.a) {
                    objT2 = new qm(ajsVar, cfyVar, 5);
                    basVar2.ae(objT2);
                }
                yjkVar = (yjk) objT2;
                basVar2.aa();
            } else {
                baoVarD.x(146022561);
                bas basVar3 = (bas) baoVarD;
                Object objT3 = basVar3.T();
                if (i12 == 32 || objT3 == ban.a) {
                    objT3 = new sw(cfyVar, 17);
                    basVar3.ae(objT3);
                }
                yjkVar = (yjk) objT3;
                basVar3.aa();
            }
            yfw yfwVar = z ? aes.a : new yfw(null, null);
            Object obj2 = yfwVar.b;
            List list3 = (List) yfwVar.a;
            List list4 = (List) obj2;
            if (z) {
                baoVarD.x(146338668);
                bas basVar4 = (bas) baoVarD;
                Object objT4 = basVar4.T();
                list = list4;
                if (objT4 == ban.a) {
                    list2 = list3;
                    yjvVar3 = null;
                    Object bciVar = new bci(null, bcz.c);
                    basVar4.ae(bciVar);
                    objT4 = bciVar;
                } else {
                    list2 = list3;
                    yjvVar3 = null;
                }
                obj = (bcb) objT4;
                basVar4.aa();
            } else {
                list = list4;
                list2 = list3;
                yjvVar3 = null;
                baoVarD.x(146426428);
                ((bas) baoVarD).aa();
                obj = null;
            }
            if (z) {
                baoVarD.x(146519677);
                boolean zF2 = baoVarD.F(obj);
                bas basVar5 = (bas) baoVarD;
                Object objT5 = basVar5.T();
                if (zF2 || objT5 == ban.a) {
                    objT5 = new zn(obj, 16);
                    basVar5.ae(objT5);
                }
                basVar5.aa();
                yjvVar4 = (yjv) objT5;
            } else {
                baoVarD.x(146591100);
                ((bas) baoVarD).aa();
                yjvVar4 = yjvVar3;
            }
            int i13 = (i11 >> 3) & 14;
            int i14 = ((i11 >> 12) & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | i13 | ((i9 << 6) & 896);
            Object obj3 = obj;
            yjk yjkVar2 = yjkVar;
            List list5 = list;
            afj.c(cfyVar, chcVar, esnVar, list2, baoVarD, i14);
            cfy cfyVar2 = (cfy) yjkVar2.a();
            boolean zH = baoVarD.H(ajsVar) | ((i11 & 896) == 256);
            bas basVar6 = (bas) baoVarD;
            Object objT6 = basVar6.T();
            if (zH || objT6 == ban.a) {
                objT6 = new afk(ajsVar, yjvVar, 1);
                basVar6.ae(objT6);
            }
            bkp bkpVarB = B(bkpVar, cfyVar2, chcVar, (yjv) objT6, i, z3, i7, i3, esnVar, list2, yjvVar4, aloVar, null, yjvVar2);
            if (z) {
                baoVarD.x(147947537);
                boolean zH2 = baoVarD.H(ajsVar);
                Object objT7 = basVar6.T();
                if (zH2 || objT7 == ban.a) {
                    objT7 = new sw(ajsVar, 19);
                    basVar6.ae(objT7);
                }
                yjk yjkVar3 = (yjk) objT7;
                boolean zF3 = baoVarD.F(obj3);
                Object objT8 = basVar6.T();
                if (zF3 || objT8 == ban.a) {
                    objT8 = new sw(obj3, 20);
                    basVar6.ae(objT8);
                }
                aggVar = new agg(yjkVar3, (yjk) objT8);
                basVar6.aa();
            } else {
                baoVarD.x(147770775);
                boolean zH3 = baoVarD.H(ajsVar);
                Object objT9 = basVar6.T();
                if (zH3 || objT9 == ban.a) {
                    objT9 = new sw(ajsVar, 18);
                    basVar6.ae(objT9);
                }
                aggVar = new afx((yjk) objT9);
                basVar6.aa();
            }
            int iK = a.k(zy.p(baoVarD));
            bhu bhuVarAi = basVar6.ai();
            bkp bkpVarC = bdi.C(baoVarD, bkpVarB);
            yjk yjkVar4 = bxt.a;
            baoVarD.z();
            if (basVar6.w) {
                baoVarD.k(yjkVar4);
            } else {
                baoVarD.B();
            }
            beb.a(baoVarD, aggVar, bxt.d);
            beb.a(baoVarD, bhuVarAi, bxt.c);
            yjz yjzVar = bxt.e;
            if (basVar6.w || !yks.e(basVar6.T(), Integer.valueOf(iK))) {
                Object objValueOf = Integer.valueOf(iK);
                basVar6.ae(objValueOf);
                baoVarD.i(objValueOf, yjzVar);
            }
            beb.a(baoVarD, bkpVarC, bxt.b);
            if (ajsVar == null) {
                baoVarD.x(-433557001);
            } else {
                baoVarD.x(-291080374);
                ajsVar.l(baoVarD, 0);
            }
            basVar6.aa();
            if (list5 == null) {
                baoVarD.x(-433506223);
            } else {
                baoVarD.x(-433506222);
                aes.a(cfyVar, list5, baoVarD, i13);
            }
            basVar6.aa();
            baoVarD.o();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new yjz() { // from class: afe
                @Override // defpackage.yjz
                public final Object a(Object obj4, Object obj5) {
                    ((Integer) obj5).intValue();
                    bkp bkpVar2 = bkpVar;
                    cfy cfyVar3 = cfyVar;
                    yjv yjvVar5 = yjvVar;
                    boolean z5 = z;
                    Map map2 = map;
                    chc chcVar2 = chcVar;
                    int i15 = i;
                    boolean z6 = z2;
                    int i16 = i2;
                    int i17 = i3;
                    esn esnVar2 = esnVar;
                    alo aloVar2 = aloVar;
                    int i18 = i4;
                    hp.w(bkpVar2, cfyVar3, yjvVar5, z5, map2, chcVar2, i15, z6, i16, i17, esnVar2, aloVar2, yjvVar2, (bao) obj4, bdi.n(i18 | 1), bdi.n(i5));
                    return ygi.a;
                }
            };
        }
    }

    public static final List x(hp hpVar, List list, ja jaVar, int i, int i2, int i3, yjv yjvVar) {
        ja jaVarA;
        Object obj;
        int i4;
        int iA;
        if (hpVar == null || list.isEmpty() || jaVar.b == 0) {
            return yhb.a;
        }
        int iA2 = ((add) yfm.S(list)).a();
        int i5 = -1;
        int i6 = 0;
        if (((add) yfm.W(list)).a() - iA2 < 0 || (i4 = jaVar.b) == 0) {
            jaVarA = jb.a;
        } else {
            ymd ymdVarR = ykn.r(0, i4);
            int i7 = ymdVarR.a;
            int i8 = ymdVarR.b;
            if (i7 <= i8) {
                iA = -1;
                while (jaVar.a(i7) <= iA2) {
                    iA = jaVar.a(i7);
                    if (i7 == i8) {
                        break;
                    }
                    i7++;
                }
            } else {
                iA = -1;
            }
            jaVarA = iA == -1 ? jb.a : jb.a(iA);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj2 = list.get(i9);
            int iA3 = ((add) obj2).a();
            int[] iArr = jaVar.a;
            int i10 = jaVar.b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    break;
                }
                if (iArr[i11] == iA3) {
                    arrayList2.add(obj2);
                    break;
                }
                i11++;
            }
        }
        int[] iArr2 = jaVarA.a;
        int i12 = jaVarA.b;
        int i13 = 0;
        while (i13 < i12) {
            int i14 = iArr2[i13];
            Iterator it = list.iterator();
            int i15 = i6;
            while (true) {
                if (!it.hasNext()) {
                    i15 = i5;
                    break;
                }
                if (((add) it.next()).a() == i14) {
                    break;
                }
                i15++;
            }
            add addVar = i15 == i5 ? (add) yjvVar.a(Integer.valueOf(i14)) : (add) list.remove(i15);
            int iC = addVar.c();
            int iU = i15 == i5 ? Integer.MIN_VALUE : u(addVar);
            int iMin = -i;
            int size2 = arrayList2.size();
            while (true) {
                if (i6 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList2.get(i6);
                if (((add) obj).a() != i14) {
                    break;
                }
                i6++;
            }
            add addVar2 = (add) obj;
            int iU2 = addVar2 != null ? u(addVar2) : Integer.MIN_VALUE;
            if (iU != Integer.MIN_VALUE) {
                iMin = Math.max(iMin, iU);
            }
            if (iU2 != Integer.MIN_VALUE) {
                iMin = Math.min(iMin, iU2 - iC);
            }
            addVar.n();
            addVar.l(iMin, 0, i2, i3);
            arrayList.add(addVar);
            i13++;
            i6 = 0;
            i5 = -1;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, yjv] */
    public static final ne y(bhi bhiVar, Object obj) {
        ne neVar = (ne) bhiVar.a.a(obj);
        neVar.d();
        return neVar;
    }

    private static final yjz z(bdy bdyVar) {
        return (yjz) bdyVar.a();
    }
}
