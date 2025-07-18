package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cbp {
    public cbp() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A(defpackage.cff r7, android.content.res.Resources r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbp.A(cff, android.content.res.Resources):java.lang.String");
    }

    public static boolean B(cff cffVar) {
        return !cffVar.f().f(cfi.i);
    }

    public static boolean C(cff cffVar) {
        cfc cfcVar = cffVar.c;
        cfs cfsVar = (cfs) ccf.t(cfcVar, cfi.I);
        cez cezVar = (cez) ccf.t(cfcVar, cfi.x);
        Boolean bool = (Boolean) ccf.t(cfcVar, cfi.H);
        boolean z = cfsVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (cezVar == null || !a.r(cezVar.a, 4)) {
                return true;
            }
        }
        return z;
    }

    public static boolean D(cff cffVar) {
        return cffVar.b.q == cmi.b;
    }

    public static boolean E(cff cffVar, Resources resources) {
        cfc cfcVar = cffVar.c;
        List list = (List) ccf.t(cfcVar, cfi.a);
        boolean z = ((list != null ? (String) yfm.U(list) : null) == null && z(cffVar) == null && A(cffVar, resources) == null && !C(cffVar)) ? false : true;
        if (cfg.a(cffVar)) {
            return false;
        }
        if (cfcVar.a) {
            return true;
        }
        return cffVar.k() && z;
    }

    public static boolean F() {
        try {
            if (cbc.a == null) {
                cbc.a = Class.forName("android.os.SystemProperties");
            }
            if (cbc.b == null) {
                Class cls = cbc.a;
                cbc.b = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = cbc.b;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", false) : null;
            return yks.e(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, true);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [bko] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static cak G(cak cakVar) {
        bzm bzmVar;
        if (!cakVar.E().A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = cakVar.E().t;
        bys bysVarI = fh.I(cakVar);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 262144) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 262144) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof cak) {
                                cak cakVar2 = (cak) bxwVarF;
                                if (yks.e(cakVar.ci(), cakVar2.ci()) && bcm.k(cakVar, cakVar2)) {
                                    return cakVar2;
                                }
                            } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 262144) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yjv] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [bko] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void H(cak cakVar, yjv yjvVar) {
        bzm bzmVar;
        if (!cakVar.E().A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = cakVar.E().t;
        bys bysVarI = fh.I(cakVar);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 262144) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 262144) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof cak) {
                                cak cakVar2 = (cak) bxwVarF;
                                if (yks.e(cakVar.ci(), cakVar2.ci()) && bcm.k(cakVar, cakVar2) && !((Boolean) yjvVar.a(cakVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 262144) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [yjv] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [bko] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static void I(bxv bxvVar, Object obj, yjv yjvVar) {
        bzm bzmVar;
        if (!bxvVar.E().A) {
            bty.c("visitAncestors called on an unattached node");
        }
        bko bkoVar = bxvVar.E().t;
        bys bysVarI = fh.I(bxvVar);
        while (bysVarI != null) {
            if ((bysVarI.t.f.s & 262144) != 0) {
                while (bkoVar != null) {
                    if ((bkoVar.r & 262144) != 0) {
                        bxw bxwVarF = bkoVar;
                        ?? bfzVar = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof cak) {
                                cak cakVar = (cak) bxwVarF;
                                if (yks.e(obj, cakVar.ci()) && !((Boolean) yjvVar.a(cakVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar2 = bxwVarF.C;
                                int i = 0;
                                bxwVarF = bxwVarF;
                                bfzVar = bfzVar;
                                while (bkoVar2 != null) {
                                    if ((bkoVar2.r & 262144) != 0) {
                                        i++;
                                        bfzVar = bfzVar;
                                        if (i == 1) {
                                            bxwVarF = bkoVar2;
                                        } else {
                                            if (bfzVar == 0) {
                                                bfzVar = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar.o(bxwVarF);
                                            }
                                            bfzVar.o(bkoVar2);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar2 = bkoVar2.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar = bfzVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar);
                        }
                    }
                    bkoVar = bkoVar.t;
                }
            }
            bysVarI = bysVarI.j();
            bkoVar = (bysVarI == null || (bzmVar = bysVarI.t) == null) ? null : bzmVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [yjv] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [bko] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bfz] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static void J(cak cakVar, yjv yjvVar) {
        if (!cakVar.E().A) {
            bty.c("visitSubtreeIf called on an unattached node");
        }
        bfz bfzVar = new bfz(new bko[16], 0);
        bko bkoVar = cakVar.E().u;
        if (bkoVar == null) {
            fh.O(bfzVar, cakVar.E());
        } else {
            bfzVar.o(bkoVar);
        }
        while (true) {
            int i = bfzVar.b;
            if (i == 0) {
                return;
            }
            bko bkoVar2 = (bko) bfzVar.d(i - 1);
            if ((bkoVar2.s & 262144) != 0) {
                for (bko bkoVar3 = bkoVar2; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                    if ((bkoVar3.r & 262144) != 0) {
                        bxw bxwVarF = bkoVar3;
                        ?? bfzVar2 = 0;
                        while (bxwVarF != 0) {
                            if (bxwVarF instanceof cak) {
                                cak cakVar2 = (cak) bxwVarF;
                                caj cajVar = (yks.e(cakVar.ci(), cakVar2.ci()) && bcm.k(cakVar, cakVar2)) ? (caj) yjvVar.a(cakVar2) : caj.a;
                                if (cajVar == caj.c) {
                                    return;
                                }
                                if (cajVar == caj.b) {
                                    break;
                                }
                            } else if ((bxwVarF.r & 262144) != 0 && (bxwVarF instanceof bxw)) {
                                bko bkoVar4 = bxwVarF.C;
                                int i2 = 0;
                                bxwVarF = bxwVarF;
                                bfzVar2 = bfzVar2;
                                while (bkoVar4 != null) {
                                    if ((bkoVar4.r & 262144) != 0) {
                                        i2++;
                                        bfzVar2 = bfzVar2;
                                        if (i2 == 1) {
                                            bxwVarF = bkoVar4;
                                        } else {
                                            if (bfzVar2 == 0) {
                                                bfzVar2 = new bfz(new bko[16], 0);
                                            }
                                            if (bxwVarF != 0) {
                                                bfzVar2.o(bxwVarF);
                                            }
                                            bfzVar2.o(bkoVar4);
                                            bxwVarF = 0;
                                        }
                                    }
                                    bkoVar4 = bkoVar4.u;
                                    bxwVarF = bxwVarF;
                                    bfzVar2 = bfzVar2;
                                }
                                if (i2 != 1) {
                                }
                            }
                            bxwVarF = fh.F(bfzVar2);
                        }
                    }
                }
            }
            fh.O(bfzVar, bkoVar2);
        }
    }

    public static int K(long j, int i) {
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static long L(int i, int i2, int i3, int i4) {
        return e(i2, 1) | e(i, 0) | e(i3, 2) | e(i4, 3) | Long.MIN_VALUE;
    }

    public static void M(cae caeVar) {
        fh.I(caeVar).H();
    }

    public static void N(cad cadVar) {
        cadVar.bV();
    }

    public static void O(cad cadVar) {
        cadVar.bV();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Q(bko bkoVar, yjk yjkVar) {
        bzu bzuVar = bkoVar.v;
        if (bzuVar == null) {
            bzuVar = new bzu((bzt) bkoVar);
            bkoVar.v = bzuVar;
        }
        ((cbc) fh.K(bkoVar)).w.d(bzuVar, bzu.a, yjkVar);
    }

    public static bko R(bxv bxvVar, int i) {
        bko bkoVar = bxvVar.E().u;
        if (bkoVar != null && (bkoVar.s & i) != 0) {
            while (bkoVar != null) {
                int i2 = bkoVar.r;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return bkoVar;
                }
                bkoVar = bkoVar.u;
            }
        }
        return null;
    }

    public static int S(bkn bknVar, bkn bknVar2) {
        if (yks.e(bknVar, bknVar2)) {
            return 2;
        }
        return !bcm.k(bknVar, bknVar2) ? 0 : 1;
    }

    public static void T(int i, int i2, int i3, int i4, boolean z, int[] iArr) {
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
        iArr[4] = z ? 1 : 0;
    }

    public static void U(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    public static boolean V(bys bysVar) {
        if (bysVar.h == null) {
            return false;
        }
        bys bysVarJ = bysVar.j();
        return (bysVarJ != null ? bysVarJ.h : null) == null || bysVar.u.b;
    }

    public static /* synthetic */ String W(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }

    public static void X(byl bylVar) {
        fh.J(bylVar, 2).af();
    }

    public static void Y(byl bylVar) {
        fh.I(bylVar).G();
    }

    public static void Z(byl bylVar) {
        fh.I(bylVar).S(false);
    }

    private static float a(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3] * fArr2[i2];
        float f2 = fArr[i3 + 1] * fArr2[i2 + 4];
        return f + f2 + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    public static void aa(byl bylVar) {
        fh.I(bylVar).B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.view.View b(android.view.View r4, android.view.View r5, defpackage.yjv r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = c(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbp.b(android.view.View, android.view.View, yjv):android.view.View");
    }

    private static View c(View view, yjv yjvVar, View view2) {
        View viewC;
        if (((Boolean) yjvVar.a(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != view2 && (viewC = c(childAt, yjvVar, view2)) != null) {
                return viewC;
            }
        }
        return null;
    }

    private static void d(View view, ArrayList arrayList, boolean z) {
        boolean z2;
        int i;
        boolean z3 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z3) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z4 = viewGroup.getDescendantFocusability() == 131072;
        if (z3) {
            if (z4) {
                arrayList.add(view);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i2 = 0; i2 < childCount; i2++) {
                viewArr[i2] = viewGroup.getChildAt(i2);
            }
            int i3 = ccz.a;
            int layoutDirection = viewGroup.getLayoutDirection();
            if (childCount < 2) {
                i = 0;
            } else {
                kc kcVar = ccz.e;
                int i4 = childCount - kcVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    kcVar.p(new Rect());
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View view2 = viewArr[i6];
                    int i7 = ccz.a;
                    ccz.a = i7 + 1;
                    Rect rect = (Rect) kcVar.c(i7);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    ccz.f.j(view2, rect);
                }
                i = 0;
                yfm.aE(viewArr, ccz.c);
                ki kiVar = ccz.f;
                Object objA = kiVar.a(viewArr[0]);
                objA.getClass();
                int iMax = ((Rect) objA).bottom;
                ccz.b = layoutDirection != 1 ? 1 : -1;
                int i8 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    Object objA2 = kiVar.a(viewArr[i9]);
                    objA2.getClass();
                    Rect rect2 = (Rect) objA2;
                    if (rect2.top >= iMax) {
                        if (i9 - i8 > 1) {
                            yfm.aF(viewArr, ccz.d, i8, i9);
                        }
                        iMax = rect2.bottom;
                        i8 = i9;
                    } else {
                        iMax = Math.max(iMax, rect2.bottom);
                    }
                }
                if (childCount - i8 > 1) {
                    yfm.aF(viewArr, ccz.d, i8, childCount);
                }
                ccz.a = 0;
                kiVar.i();
            }
            for (int i10 = i; i10 < childCount; i10++) {
                d(viewArr[i10], arrayList, z);
            }
        }
        if (z2 && !z4 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    private static long e(int i, int i2) {
        return (i & 32767) << (i2 * 15);
    }

    public static void f(float[] fArr, float[] fArr2) {
        float fA = a(fArr2, 0, fArr, 0);
        float fA2 = a(fArr2, 0, fArr, 1);
        float fA3 = a(fArr2, 0, fArr, 2);
        float fA4 = a(fArr2, 0, fArr, 3);
        float fA5 = a(fArr2, 1, fArr, 0);
        float fA6 = a(fArr2, 1, fArr, 1);
        float fA7 = a(fArr2, 1, fArr, 2);
        float fA8 = a(fArr2, 1, fArr, 3);
        float fA9 = a(fArr2, 2, fArr, 0);
        float fA10 = a(fArr2, 2, fArr, 1);
        float fA11 = a(fArr2, 2, fArr, 2);
        float fA12 = a(fArr2, 2, fArr, 3);
        float fA13 = a(fArr2, 3, fArr, 0);
        float fA14 = a(fArr2, 3, fArr, 1);
        float fA15 = a(fArr2, 3, fArr, 2);
        float fA16 = a(fArr2, 3, fArr, 3);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }

    public static void g(float[] fArr, float f, float f2, float[] fArr2) {
        boa.c(fArr2);
        boa.g(fArr2, f, f2);
        f(fArr, fArr2);
    }

    public static boolean l() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static yil m() {
        return (yil) cbz.a.a();
    }

    public static View n(View view, View view2, int i) {
        int nextFocusForwardId;
        if (i == 1) {
            if (view.getId() != -1) {
                return b(view2, view, new lz(view2, view, 14));
            }
            return null;
        }
        if (i == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return o(view2, view, nextFocusForwardId);
        }
        return null;
    }

    public static View o(View view, View view2, int i) {
        return b(view, view2, new cba(i, 2));
    }

    public static void p(View view, ArrayList arrayList, int i) {
        if (Build.VERSION.SDK_INT < 26) {
            d(view, arrayList, view.isInTouchMode());
        } else {
            view.addFocusables(arrayList, i, view.isInTouchMode() ? 1 : 0);
        }
    }

    public static ccy q() {
        Object obj = ccy.a.get();
        obj.getClass();
        return (ccy) obj;
    }

    public static boolean r(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = yhb.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int iQ = yfm.q(list);
            int i = 0;
            while (i < iQ) {
                i++;
                Object obj2 = list.get(i);
                cff cffVar = (cff) obj2;
                cff cffVar2 = (cff) obj;
                arrayList.add(new bmx((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cffVar2.c().d() >> 32)) - Float.intBitsToFloat((int) (cffVar.c().d() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (cffVar2.c().d() & 4294967295L)) - Float.intBitsToFloat((int) (cffVar.c().d() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((bmx) yfm.S(list2)).a;
        } else {
            if (list2.isEmpty()) {
                cmq.c("Empty collection can't be reduced.");
            }
            Object objS = yfm.S(list2);
            int iQ2 = yfm.q(list2);
            if (iQ2 > 0) {
                int i2 = 1;
                while (true) {
                    objS = new bmx(a.D(((bmx) objS).a, ((bmx) list2.get(i2)).a));
                    if (i2 == iQ2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((bmx) objS).a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static boolean s(cff cffVar) {
        return (ccf.t(cffVar.f(), cfi.f) == null && ccf.t(cffVar.f(), cfi.e) == null) ? false : true;
    }

    public static bcy t(View view) {
        yil yilVarM;
        ccb ccbVar;
        Map map = cec.a;
        yim yimVar = yim.a;
        yimVar.get(yii.k);
        yft yftVar = cbz.a;
        if (l()) {
            yilVarM = m();
        } else {
            yilVarM = (yil) cbz.b.get();
            if (yilVarM == null) {
                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
            }
        }
        yil yilVarPlus = yilVarM.plus(yimVar);
        bby bbyVar = (bby) yilVarPlus.get(bby.b);
        if (bbyVar != null) {
            ccb ccbVar2 = new ccb(bbyVar, 1);
            Object obj = ccbVar2.a;
            synchronized (((bbt) obj).a) {
                ((bbt) obj).d = false;
            }
            ccbVar = ccbVar2;
        } else {
            ccbVar = null;
        }
        ylf ylfVar = new ylf();
        yil cdgVar = (bkr) yilVarPlus.get(bkr.a);
        if (cdgVar == null) {
            cdgVar = new cdg();
            ylfVar.a = cdgVar;
        }
        yil yilVarPlus2 = yilVarPlus.plus(ccbVar != null ? ccbVar : yim.a).plus(cdgVar);
        bcy bcyVar = new bcy(yilVarPlus2);
        bcyVar.x();
        yow yowVarL = yoz.l(yilVarPlus2);
        dvk dvkVarE = dwf.e(view);
        dve lifecycle = dvkVarE != null ? dvkVarE.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new cdr(view, bcyVar, 2));
            lifecycle.c(new cdz(yowVarL, ccbVar, bcyVar, ylfVar, view));
            return bcyVar;
        }
        Objects.toString(view);
        bty.a("ViewTreeLifecycleOwner not found from ".concat(String.valueOf(view)));
        throw new yfs();
    }

    public static yjk u(can canVar, dve dveVar) {
        if (dveVar.a().compareTo(dvd.a) > 0) {
            fe feVar = new fe(canVar, 4);
            dveVar.c(feVar);
            return new bmq(dveVar, feVar, 10, null);
        }
        throw new IllegalStateException("Cannot configure " + canVar + " to disposeComposition at Lifecycle ON_DESTROY: " + dveVar + "is already destroyed");
    }

    public static String v(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append('@');
        String str = String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
        str.getClass();
        sb.append(str);
        return sb.toString();
    }

    public static boolean w(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f3 * f8) - (f4 * f7);
        float f18 = (f9 * f14) - (f10 * f13);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f9 * f15) - (f11 * f13);
        float f21 = (f2 * f7) - (f3 * f6);
        float f22 = (f9 * f16) - (f12 * f13);
        float f23 = (f * f8) - (f4 * f5);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f * f7) - (f3 * f5);
        float f26 = (f10 * f16) - (f12 * f14);
        float f27 = (f * f6) - (f2 * f5);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f27 * f28) - (f25 * f26)) + (f23 * f24)) + (f21 * f22)) - (f19 * f20)) + (f17 * f18);
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = (((f6 * f28) - (f7 * f26)) + (f8 * f24)) * f30;
            fArr2[1] = ((((-f2) * f28) + (f3 * f26)) - (f4 * f24)) * f30;
            fArr2[2] = (((f14 * f17) - (f15 * f19)) + (f16 * f21)) * f30;
            fArr2[3] = ((((-f10) * f17) + (f11 * f19)) - (f12 * f21)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f31 * f28) + (f7 * f22)) - (f8 * f20)) * f30;
            fArr2[5] = (((f28 * f) - (f3 * f22)) + (f4 * f20)) * f30;
            float f32 = -f13;
            fArr2[6] = (((f32 * f17) + (f15 * f23)) - (f16 * f25)) * f30;
            fArr2[7] = (((f17 * f9) - (f11 * f23)) + (f12 * f25)) * f30;
            fArr2[8] = (((f5 * f26) - (f6 * f22)) + (f8 * f18)) * f30;
            fArr2[9] = ((((-f) * f26) + (f22 * f2)) - (f4 * f18)) * f30;
            fArr2[10] = (((f13 * f19) - (f14 * f23)) + (f16 * f27)) * f30;
            fArr2[11] = ((((-f9) * f19) + (f23 * f10)) - (f12 * f27)) * f30;
            fArr2[12] = (((f31 * f24) + (f6 * f20)) - (f7 * f18)) * f30;
            fArr2[13] = (((f * f24) - (f2 * f20)) + (f3 * f18)) * f30;
            fArr2[14] = (((f32 * f21) + (f14 * f25)) - (f15 * f27)) * f30;
            fArr2[15] = (((f9 * f21) - (f10 * f25)) + (f11 * f27)) * f30;
        }
        return f29 != 0.0f;
    }

    public static cvw x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new cvw(view.getAutofillId());
        }
        return null;
    }

    public static bys y(bys bysVar, yjv yjvVar) {
        for (bys bysVarJ = bysVar.j(); bysVarJ != null; bysVarJ = bysVarJ.j()) {
            if (((Boolean) yjvVar.a(bysVarJ)).booleanValue()) {
                return bysVarJ;
            }
        }
        return null;
    }

    public static cfy z(cff cffVar) {
        cfc cfcVar = cffVar.c;
        cfy cfyVar = (cfy) ccf.t(cfcVar, cfi.E);
        List list = (List) ccf.t(cfcVar, cfi.A);
        return cfyVar == null ? list != null ? (cfy) yfm.U(list) : null : cfyVar;
    }

    public cbp(byte[] bArr, char[] cArr) {
    }
}
