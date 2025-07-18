package defpackage;

import defpackage.acq;
import defpackage.act;
import defpackage.bko;
import defpackage.yks;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class act {
    public final List a;
    public byc b;
    public final bkp c;
    private int d;
    private final List e;
    private final List f;
    private final List g;
    private final List h;
    private final ki i;
    private final kk j;
    private eph k;

    public act() {
        long[] jArr = kj.a;
        this.i = new ki((byte[]) null);
        int i = kl.a;
        this.j = new kk((byte[]) null);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.a = new ArrayList();
        this.c = new bzi<acq>(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement
            private final act a;

            {
                this.a = this;
            }

            @Override // defpackage.bzi
            public final /* bridge */ /* synthetic */ bko d() {
                return new acq(this.a);
            }

            @Override // defpackage.bzi
            public final /* bridge */ /* synthetic */ void e(bko bkoVar) {
                acq acqVar = (acq) bkoVar;
                act actVar = acqVar.a;
                act actVar2 = this.a;
                if (yks.e(actVar, actVar2) || !acqVar.q.A) {
                    return;
                }
                acqVar.a.c();
                actVar2.b = acqVar;
                acqVar.a = actVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && yks.e(this.a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.a + ')';
            }
        };
    }

    static /* synthetic */ void d(act actVar, add addVar, int i) {
        Object objA = actVar.i.a(addVar.h());
        objA.getClass();
        j(addVar, i, (acr) objA);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void f() {
        /*
            r17 = this;
            r0 = r17
            ki r1 = r0.i
            boolean r2 = r1.d()
            if (r2 == 0) goto L5f
            java.lang.Object[] r2 = r1.c
            long[] r3 = r1.a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L5c
            r5 = 0
            r6 = r5
        L15:
            r7 = r3[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L57
            int r9 = r6 - r4
            r10 = r5
        L28:
            int r11 = ~r9
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L55
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L51
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r2[r11]
            acr r11 = (defpackage.acr) r11
            acp[] r11 = r11.a
            int r13 = r11.length
            r14 = r5
        L45:
            if (r14 >= r13) goto L51
            r15 = r11[r14]
            if (r15 == 0) goto L4e
            r15.d()
        L4e:
            int r14 = r14 + 1
            goto L45
        L51:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L28
        L55:
            if (r11 != r12) goto L5c
        L57:
            if (r6 == r4) goto L5c
            int r6 = r6 + 1
            goto L15
        L5c:
            r1.i()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.act.f():void");
    }

    private final void g(Object obj) {
        acp[] acpVarArr;
        acr acrVar = (acr) this.i.g(obj);
        if (acrVar == null || (acpVarArr = acrVar.a) == null) {
            return;
        }
        for (acp acpVar : acpVarArr) {
            if (acpVar != null) {
                acpVar.d();
            }
        }
    }

    private static final boolean h(add addVar) {
        int iD = addVar.d();
        for (int i = 0; i < iD; i++) {
            if (acu.a(addVar.i(i)) != null) {
                return true;
            }
        }
        return false;
    }

    private static final int i(add addVar) {
        long jG = addVar.g(0);
        return addVar.m() ? cmf.b(jG) : cmf.a(jG);
    }

    private static final void j(add addVar, int i, acr acrVar) {
        int i2 = 0;
        long jG = addVar.g(0);
        long jF = addVar.m() ? cmf.f(jG, 0, i, 1) : cmf.f(jG, i, 0, 2);
        acp[] acpVarArr = acrVar.a;
        int length = acpVarArr.length;
        int i3 = 0;
        while (i2 < length) {
            acp acpVar = acpVarArr[i2];
            int i4 = i3 + 1;
            if (acpVar != null) {
                acpVar.b = cmf.d(jF, cmf.c(addVar.g(i3), jG));
            }
            i2++;
            i3 = i4;
        }
    }

    private final void k(add addVar) {
        Object objA = this.i.a(addVar.h());
        objA.getClass();
        acp[] acpVarArr = ((acr) objA).a;
        int length = acpVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            acp acpVar = acpVarArr[i];
            int i3 = i2 + 1;
            if (acpVar != null) {
                acpVar.b = addVar.g(i2);
            }
            i++;
            i2 = i3;
        }
    }

    private static final int l(int[] iArr, add addVar) {
        int iB = addVar.b();
        int iE = addVar.e() + iB;
        int iMax = 0;
        while (iB < iE) {
            int iC = iArr[iB] + addVar.c();
            iArr[iB] = iC;
            iMax = Math.max(iMax, iC);
            iB++;
        }
        return iMax;
    }

    public final long a() {
        List list = this.a;
        int size = list.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            acp acpVar = (acp) list.get(i);
            bpu bpuVar = acpVar.d;
            if (bpuVar != null) {
                jMax = (Math.max((int) (jMax & 4294967295L), cmf.b(acpVar.b) + ((int) (bpuVar.l & 4294967295L))) & 4294967295L) | (Math.max((int) (jMax >> 32), cmf.a(acpVar.b) + ((int) (bpuVar.l >> 32))) << 32);
            }
        }
        return jMax;
    }

    public final acp b(Object obj, int i) {
        acp[] acpVarArr;
        acr acrVar = (acr) this.i.a(obj);
        if (acrVar == null || (acpVarArr = acrVar.a) == null) {
            return null;
        }
        return acpVarArr[i];
    }

    public final void c() {
        f();
        this.k = null;
        this.d = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r38, int r39, int r40, java.util.List r41, defpackage.eph r42, defpackage.adg r43, boolean r44, boolean r45, int r46, boolean r47, int r48, int r49, defpackage.yow r50, defpackage.bnf r51) {
        /*
            Method dump skipped, instructions count: 1255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.act.e(int, int, int, java.util.List, eph, adg, boolean, boolean, int, boolean, int, int, yow, bnf):void");
    }
}
