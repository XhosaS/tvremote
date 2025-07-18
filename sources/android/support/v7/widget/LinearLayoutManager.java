package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.AbstractC0001if;
import defpackage.b;
import defpackage.hk;
import defpackage.hr;
import defpackage.hs;
import defpackage.ht;
import defpackage.hu;
import defpackage.ig;
import defpackage.ii;
import defpackage.im;
import defpackage.in;
import defpackage.io;
import defpackage.ir;
import defpackage.iv;
import defpackage.iw;
import defpackage.ix;
import defpackage.sl;
import defpackage.sm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LinearLayoutManager extends in implements iv {
    private ht a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final boolean e;
    private final hs f;
    private final int g;
    private final int[] h;
    int k;
    AbstractC0001if l;
    boolean m;
    int n;
    int o;
    hu p;
    final hr q;

    public LinearLayoutManager() {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new hr();
        this.f = new hs();
        this.g = 2;
        this.h = new int[2];
        T(1);
        U(false);
    }

    private final View bA() {
        return L(0, al());
    }

    private final View bB() {
        return L(al() - 1, -1);
    }

    private final View bC() {
        return aB(this.m ? 0 : al() - 1);
    }

    private final View bD() {
        return aB(this.m ? al() - 1 : 0);
    }

    private final void bE(ir irVar, ht htVar) {
        if (!htVar.a || htVar.m) {
            return;
        }
        int i = htVar.g;
        int i2 = htVar.i;
        if (htVar.f == -1) {
            int iAl = al();
            if (i >= 0) {
                int iE = (this.l.e() - i) + i2;
                if (this.m) {
                    for (int i3 = 0; i3 < iAl; i3++) {
                        View viewAB = aB(i3);
                        if (this.l.d(viewAB) < iE || this.l.m(viewAB) < iE) {
                            bF(irVar, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = iAl - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View viewAB2 = aB(i5);
                    if (this.l.d(viewAB2) < iE || this.l.m(viewAB2) < iE) {
                        bF(irVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iAl2 = al();
            if (!this.m) {
                for (int i7 = 0; i7 < iAl2; i7++) {
                    View viewAB3 = aB(i7);
                    if (this.l.a(viewAB3) > i6 || this.l.l(viewAB3) > i6) {
                        bF(irVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iAl2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewAB4 = aB(i9);
                if (this.l.a(viewAB4) > i6 || this.l.l(viewAB4) > i6) {
                    bF(irVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final void bF(ir irVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aV(i, irVar);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    aV(i2, irVar);
                }
            }
        }
    }

    private final void bG() {
        this.m = (this.k == 1 || !Y()) ? this.c : !this.c;
    }

    private final void bH(int i, int i2, boolean z, ix ixVar) {
        int iJ;
        this.a.m = aa();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        iArr[1] = 0;
        O(ixVar, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        ht htVar = this.a;
        htVar.h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        htVar.i = iMax;
        if (i == 1) {
            htVar.h = i3 + this.l.g();
            View viewBC = bC();
            ht htVar2 = this.a;
            htVar2.e = true == this.m ? -1 : 1;
            int iBp = bp(viewBC);
            ht htVar3 = this.a;
            htVar2.d = iBp + htVar3.e;
            htVar3.b = this.l.a(viewBC);
            iJ = this.l.a(viewBC) - this.l.f();
        } else {
            View viewBD = bD();
            this.a.h += this.l.j();
            ht htVar4 = this.a;
            htVar4.e = true != this.m ? -1 : 1;
            int iBp2 = bp(viewBD);
            ht htVar5 = this.a;
            htVar4.d = iBp2 + htVar5.e;
            htVar5.b = this.l.d(viewBD);
            iJ = (-this.l.d(viewBD)) + this.l.j();
        }
        ht htVar6 = this.a;
        htVar6.c = i2;
        if (z) {
            htVar6.c = i2 - iJ;
        }
        htVar6.g = iJ;
    }

    private final void bI(hr hrVar) {
        bJ(hrVar.b, hrVar.c);
    }

    private final void bJ(int i, int i2) {
        this.a.c = this.l.f() - i2;
        ht htVar = this.a;
        htVar.e = true != this.m ? 1 : -1;
        htVar.d = i;
        htVar.f = 1;
        htVar.b = i2;
        htVar.g = Integer.MIN_VALUE;
    }

    private final void bK(hr hrVar) {
        bL(hrVar.b, hrVar.c);
    }

    private final void bL(int i, int i2) {
        this.a.c = i2 - this.l.j();
        ht htVar = this.a;
        htVar.d = i;
        htVar.e = true != this.m ? -1 : 1;
        htVar.f = -1;
        htVar.b = i2;
        htVar.g = Integer.MIN_VALUE;
    }

    private final int bw(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        P();
        AbstractC0001if abstractC0001if = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ii.t(ixVar, abstractC0001if, af(z2), ae(z2), this, z, this.m);
    }

    private final int bx(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        P();
        AbstractC0001if abstractC0001if = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ii.u(ixVar, abstractC0001if, af(z2), ae(z2), this, z);
    }

    private final int by(int i, ir irVar, ix ixVar, boolean z) {
        int iF;
        int iF2 = this.l.f() - i;
        if (iF2 <= 0) {
            return 0;
        }
        int i2 = -I(-iF2, irVar, ixVar);
        int i3 = i + i2;
        if (!z || (iF = this.l.f() - i3) <= 0) {
            return i2;
        }
        this.l.n(iF);
        return iF + i2;
    }

    private final int bz(int i, ir irVar, ix ixVar, boolean z) {
        int iJ;
        int iJ2 = i - this.l.j();
        if (iJ2 <= 0) {
            return 0;
        }
        int i2 = -I(iJ2, irVar, ixVar);
        int i3 = i + i2;
        if (!z || (iJ = i3 - this.l.j()) <= 0) {
            return i2;
        }
        this.l.n(-iJ);
        return i2 - iJ;
    }

    private final int c(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        P();
        AbstractC0001if abstractC0001if = this.l;
        boolean z = this.e;
        boolean z2 = !z;
        return ii.s(ixVar, abstractC0001if, af(z2), ae(z2), this, z);
    }

    @Override // defpackage.in
    public final int A(ix ixVar) {
        return c(ixVar);
    }

    @Override // defpackage.in
    public final int B(ix ixVar) {
        return bw(ixVar);
    }

    @Override // defpackage.in
    public final int C(ix ixVar) {
        return bx(ixVar);
    }

    @Override // defpackage.in
    public final int D(ix ixVar) {
        return c(ixVar);
    }

    @Override // defpackage.in
    public final int E(ix ixVar) {
        return bw(ixVar);
    }

    @Override // defpackage.in
    public final int F(ix ixVar) {
        return bx(ixVar);
    }

    final int G(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.k != 1 && Y()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.k != 1 && Y()) ? -1 : 1;
        }
        if (i == 17) {
            i3 = 0;
        } else if (i != 33) {
            if (i != 66) {
                return (i == 130 && this.k == 1) ? 1 : Integer.MIN_VALUE;
            }
            i2 = 1;
            i3 = 0;
        }
        if (this.k == i3) {
            return i2;
        }
        return Integer.MIN_VALUE;
    }

    final int H(ir irVar, ht htVar, ix ixVar, boolean z) {
        int i = htVar.c;
        int i2 = htVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                htVar.g = i2 + i;
            }
            bE(irVar, htVar);
        }
        int i3 = htVar.c + htVar.h;
        hs hsVar = this.f;
        while (true) {
            if ((!htVar.m && i3 <= 0) || !htVar.d(ixVar)) {
                break;
            }
            hsVar.a = 0;
            hsVar.b = false;
            hsVar.c = false;
            hsVar.d = false;
            k(irVar, ixVar, htVar, hsVar);
            if (!hsVar.b) {
                int i4 = htVar.b;
                int i5 = hsVar.a;
                htVar.b = i4 + (htVar.f * i5);
                if (!hsVar.c || htVar.l != null || !ixVar.g) {
                    htVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = htVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    htVar.g = i7;
                    int i8 = htVar.c;
                    if (i8 < 0) {
                        htVar.g = i7 + i8;
                    }
                    bE(irVar, htVar);
                }
                if (z && hsVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - htVar.c;
    }

    final int I(int i, ir irVar, ix ixVar) {
        if (al() != 0 && i != 0) {
            P();
            this.a.a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            bH(i2, iAbs, true, ixVar);
            ht htVar = this.a;
            int iH = htVar.g + H(irVar, htVar, ixVar, false);
            if (iH >= 0) {
                if (iAbs > iH) {
                    i = i2 * iH;
                }
                this.l.n(-i);
                this.a.k = i;
                return i;
            }
        }
        return 0;
    }

    @Override // defpackage.iv
    public final PointF J(int i) {
        if (al() == 0) {
            return null;
        }
        float f = (i < bp(aB(0))) != this.m ? -1 : 1;
        return this.k == 0 ? new PointF(f, 0.0f) : new PointF(0.0f, f);
    }

    @Override // defpackage.in
    public final Parcelable K() {
        hu huVar = this.p;
        if (huVar != null) {
            return new hu(huVar);
        }
        hu huVar2 = new hu();
        if (al() <= 0) {
            huVar2.a();
            return huVar2;
        }
        P();
        boolean z = this.b ^ this.m;
        huVar2.c = z;
        if (z) {
            View viewBC = bC();
            huVar2.b = this.l.f() - this.l.a(viewBC);
            huVar2.a = bp(viewBC);
            return huVar2;
        }
        View viewBD = bD();
        huVar2.a = bp(viewBD);
        huVar2.b = this.l.d(viewBD) - this.l.j();
        return huVar2;
    }

    final View L(int i, int i2) {
        P();
        if (i2 <= i && i2 >= i) {
            return aB(i);
        }
        int iD = this.l.d(aB(i));
        int iJ = this.l.j();
        int i3 = iD < iJ ? 16388 : 4097;
        int i4 = iD < iJ ? 16644 : 4161;
        return this.k == 0 ? this.E.u(i, i2, i4, i3) : this.F.u(i, i2, i4, i3);
    }

    @Override // defpackage.in
    public final View M(int i) {
        int iAl = al();
        if (iAl == 0) {
            return null;
        }
        int iBp = i - bp(aB(0));
        if (iBp >= 0 && iBp < iAl) {
            View viewAB = aB(iBp);
            if (bp(viewAB) == i) {
                return viewAB;
            }
        }
        return super.M(i);
    }

    @Override // defpackage.in
    public final void N(String str) {
        if (this.p == null) {
            super.N(str);
        }
    }

    protected final void O(ix ixVar, int[] iArr) {
        int iK = ixVar.a != -1 ? this.l.k() : 0;
        int i = this.a.f;
        int i2 = i == -1 ? 0 : iK;
        if (i != -1) {
            iK = 0;
        }
        iArr[0] = iK;
        iArr[1] = i2;
    }

    final void P() {
        if (this.a == null) {
            this.a = new ht();
        }
    }

    @Override // defpackage.in
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (al() > 0) {
            View viewAg = ag(0, al(), false);
            accessibilityEvent.setFromIndex(viewAg == null ? -1 : bp(viewAg));
            View viewAg2 = ag(al() - 1, -1, false);
            accessibilityEvent.setToIndex(viewAg2 != null ? bp(viewAg2) : -1);
        }
    }

    @Override // defpackage.in
    public final void R(Parcelable parcelable) {
        if (parcelable instanceof hu) {
            hu huVar = (hu) parcelable;
            this.p = huVar;
            if (this.n != -1) {
                huVar.a();
            }
            aX();
        }
    }

    @Override // defpackage.in
    public final void S(int i) {
        this.n = i;
        this.o = Integer.MIN_VALUE;
        hu huVar = this.p;
        if (huVar != null) {
            huVar.a();
        }
        aX();
    }

    public final void T(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(b.e(i, "invalid orientation:"));
        }
        N(null);
        if (i != this.k || this.l == null) {
            AbstractC0001if abstractC0001ifP = AbstractC0001if.p(this, i);
            this.l = abstractC0001ifP;
            this.q.a = abstractC0001ifP;
            this.k = i;
            aX();
        }
    }

    public final void U(boolean z) {
        N(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        aX();
    }

    @Override // defpackage.in
    public final boolean V() {
        return this.k == 0;
    }

    @Override // defpackage.in
    public final boolean W() {
        return this.k == 1;
    }

    @Override // defpackage.in
    public final boolean X() {
        return true;
    }

    protected final boolean Y() {
        return as() == 1;
    }

    @Override // defpackage.in
    public final boolean Z() {
        return this.c;
    }

    final boolean aa() {
        return this.l.h() == 0 && this.l.e() == 0;
    }

    @Override // defpackage.in
    public final boolean ab() {
        if (this.B != 1073741824 && this.A != 1073741824) {
            int iAl = al();
            for (int i = 0; i < iAl; i++) {
                ViewGroup.LayoutParams layoutParams = aB(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.in
    public final void ac(int i, int i2, ix ixVar, hk hkVar) {
        if (1 == this.k) {
            i = i2;
        }
        if (al() == 0 || i == 0) {
            return;
        }
        P();
        bH(i > 0 ? 1 : -1, Math.abs(i), true, ixVar);
        v(ixVar, this.a, hkVar);
    }

    @Override // defpackage.in
    public final void ad(int i, hk hkVar) {
        boolean z;
        int i2;
        hu huVar = this.p;
        if (huVar == null || !huVar.b()) {
            bG();
            z = this.m;
            i2 = this.n;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = huVar.c;
            i2 = huVar.a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            hkVar.a(i2, 0);
            i2 += i3;
        }
    }

    final View ae(boolean z) {
        return this.m ? ag(0, al(), z) : ag(al() - 1, -1, z);
    }

    final View af(boolean z) {
        return this.m ? ag(al() - 1, -1, z) : ag(0, al(), z);
    }

    final View ag(int i, int i2, boolean z) {
        P();
        int i3 = this.k;
        int i4 = true != z ? 320 : 24579;
        return i3 == 0 ? this.E.u(i, i2, i4, 320) : this.F.u(i, i2, i4, 320);
    }

    public final void ai(int i) {
        this.n = i;
        this.o = 0;
        hu huVar = this.p;
        if (huVar != null) {
            huVar.a();
        }
        aX();
    }

    @Override // defpackage.in
    public final void aj(RecyclerView recyclerView, int i) {
        iw iwVar = new iw(recyclerView.getContext());
        iwVar.a = i;
        bd(iwVar);
    }

    @Override // defpackage.in
    public int d(int i, ir irVar, ix ixVar) {
        if (this.k == 1) {
            return 0;
        }
        return I(i, irVar, ixVar);
    }

    @Override // defpackage.in
    public int e(int i, ir irVar, ix ixVar) {
        if (this.k == 0) {
            return 0;
        }
        return I(i, irVar, ixVar);
    }

    @Override // defpackage.in
    public io f() {
        return new io(-2, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View i(defpackage.ir r17, defpackage.ix r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.P()
            int r1 = r0.al()
            r2 = 1
            r3 = 0
            if (r20 == 0) goto L15
            int r1 = r0.al()
            r4 = -1
            int r1 = r1 + r4
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r5 = r2
            r1 = r3
        L18:
            int r6 = r18.a()
            if r7 = r0.l
            int r7 = r7.j()
            if r8 = r0.l
            int r8 = r8.f()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.aB(r1)
            int r13 = bp(r12)
            if r14 = r0.l
            int r14 = r14.d(r12)
            if r15 = r0.l
            int r15 = r15.a(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            io r13 = (defpackage.io) r13
            boolean r13 = r13.d()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r2
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r2
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.i(ir, ix, boolean, boolean):android.view.View");
    }

    @Override // defpackage.in
    public View j(View view, int i, ir irVar, ix ixVar) {
        int iG;
        View viewBA;
        bG();
        if (al() == 0 || (iG = G(i)) == Integer.MIN_VALUE) {
            return null;
        }
        P();
        bH(iG, (int) (this.l.k() * 0.33333334f), false, ixVar);
        ht htVar = this.a;
        htVar.g = Integer.MIN_VALUE;
        htVar.a = false;
        H(irVar, htVar, ixVar, true);
        if (iG == -1) {
            viewBA = this.m ? bB() : bA();
            iG = -1;
        } else {
            viewBA = this.m ? bA() : bB();
        }
        View viewBD = iG == -1 ? bD() : bC();
        if (!viewBD.hasFocusable()) {
            return viewBA;
        }
        if (viewBA == null) {
            return null;
        }
        return viewBD;
    }

    public void k(ir irVar, ix ixVar, ht htVar, hs hsVar) {
        int iAw;
        int i;
        int i2;
        int iC;
        View viewA = htVar.a(irVar);
        if (viewA == null) {
            hsVar.b = true;
            return;
        }
        io ioVar = (io) viewA.getLayoutParams();
        if (htVar.l == null) {
            if (this.m == (htVar.f == -1)) {
                aG(viewA);
            } else {
                aH(viewA, 0);
            }
        } else {
            if (this.m == (htVar.f == -1)) {
                aE(viewA);
            } else {
                aF(viewA, 0);
            }
        }
        io ioVar2 = (io) viewA.getLayoutParams();
        Rect rectC = this.s.c(viewA);
        int i3 = rectC.left + rectC.right;
        int i4 = rectC.top + rectC.bottom;
        int iAm = in.am(this.C, this.A, aw() + ax() + ioVar2.leftMargin + ioVar2.rightMargin + i3, ioVar2.width, V());
        int iAm2 = in.am(this.D, this.B, ay() + av() + ioVar2.topMargin + ioVar2.bottomMargin + i4, ioVar2.height, W());
        if (bl(viewA, iAm, iAm2, ioVar2)) {
            viewA.measure(iAm, iAm2);
        }
        hsVar.a = this.l.b(viewA);
        if (this.k == 1) {
            if (Y()) {
                iC = this.C - ax();
                iAw = iC - this.l.c(viewA);
            } else {
                iAw = aw();
                iC = this.l.c(viewA) + iAw;
            }
            if (htVar.f == -1) {
                i = htVar.b;
                i2 = i - hsVar.a;
            } else {
                i2 = htVar.b;
                i = hsVar.a + i2;
            }
        } else {
            int iAy = ay();
            int iC2 = this.l.c(viewA) + iAy;
            if (htVar.f == -1) {
                int i5 = htVar.b;
                int i6 = i5 - hsVar.a;
                iC = i5;
                i = iC2;
                iAw = i6;
                i2 = iAy;
            } else {
                int i7 = htVar.b;
                int i8 = hsVar.a + i7;
                iAw = i7;
                i = iC2;
                i2 = iAy;
                iC = i8;
            }
        }
        br(viewA, iAw, i2, iC, i);
        if (ioVar.d() || ioVar.c()) {
            hsVar.c = true;
        }
        hsVar.d = viewA.hasFocusable();
    }

    @Override // defpackage.in
    public void m(ir irVar, ix ixVar, sm smVar) {
        super.m(irVar, ixVar, smVar);
        ig igVar = this.s.l;
        if (igVar == null || igVar.a() <= 0) {
            return;
        }
        smVar.e(sl.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(defpackage.ir r17, defpackage.ix r18) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutManager.o(ir, ix):void");
    }

    @Override // defpackage.in
    public void p(ix ixVar) {
        this.p = null;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.q.d();
    }

    public void r(boolean z) {
        N(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        aX();
    }

    @Override // defpackage.in
    public boolean t(int i, Bundle bundle) {
        int iMin;
        if (super.t(i, bundle)) {
            return true;
        }
        if (i == 16908343 && bundle != null) {
            if (this.k == 1) {
                int i2 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i2 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.s;
                iMin = Math.min(i2, b(recyclerView.f, recyclerView.K) - 1);
            } else {
                int i3 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i3 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.s;
                iMin = Math.min(i3, a(recyclerView2.f, recyclerView2.K) - 1);
            }
            if (iMin >= 0) {
                ai(iMin);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.in
    public boolean u() {
        return this.p == null && this.b == this.d;
    }

    public void v(ix ixVar, ht htVar, hk hkVar) {
        int i = htVar.d;
        if (i < 0 || i >= ixVar.a()) {
            return;
        }
        hkVar.a(i, Math.max(0, htVar.g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.k = 1;
        this.c = false;
        this.m = false;
        this.d = false;
        this.e = true;
        this.n = -1;
        this.o = Integer.MIN_VALUE;
        this.p = null;
        this.q = new hr();
        this.f = new hs();
        this.g = 2;
        this.h = new int[2];
        im imVarAz = az(context, attributeSet, i, i2);
        T(imVarAz.a);
        U(imVarAz.c);
        r(imVarAz.d);
    }

    @Override // defpackage.in
    public final void ah(RecyclerView recyclerView) {
    }

    public void l(ir irVar, ix ixVar, hr hrVar, int i) {
    }
}
