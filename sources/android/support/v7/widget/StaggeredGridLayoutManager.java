package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import defpackage.AbstractC0001if;
import defpackage.ac;
import defpackage.afz;
import defpackage.asv;
import defpackage.ho;
import defpackage.ig;
import defpackage.ii;
import defpackage.im;
import defpackage.in;
import defpackage.io;
import defpackage.ir;
import defpackage.iv;
import defpackage.iw;
import defpackage.ix;
import defpackage.jg;
import defpackage.jh;
import defpackage.jj;
import defpackage.jk;
import defpackage.sm;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends in implements iv {
    private int[] J;
    jk[] a;
    public AbstractC0001if b;
    AbstractC0001if c;
    private int i;
    private int j;
    private int k;
    private final ho l;
    private BitSet m;
    private boolean o;
    private boolean p;
    private jj q;
    public boolean d = false;
    boolean e = false;
    int f = -1;
    int g = Integer.MIN_VALUE;
    afz h = new afz();
    private int n = 2;
    private final Rect G = new Rect();
    private final jg H = new jg(this);
    private boolean I = true;
    private final Runnable K = new ac(this, 15, null);

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.i = -1;
        im imVarAz = az(context, attributeSet, i, i2);
        int i3 = imVarAz.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        N(null);
        if (i3 != this.j) {
            this.j = i3;
            AbstractC0001if abstractC0001if = this.b;
            this.b = this.c;
            this.c = abstractC0001if;
            aX();
        }
        int i4 = imVarAz.b;
        N(null);
        if (i4 != this.i) {
            this.h.c();
            aX();
            this.i = i4;
            this.m = new BitSet(i4);
            this.a = new jk[this.i];
            for (int i5 = 0; i5 < this.i; i5++) {
                this.a[i5] = new jk(this, i5);
            }
            aX();
        }
        H(imVarAz.c);
        this.l = new ho();
        this.b = AbstractC0001if.p(this, this.j);
        this.c = AbstractC0001if.p(this, 1 - this.j);
    }

    private final int P(int i) {
        if (al() == 0) {
            return this.e ? 1 : -1;
        }
        return (i < c()) != this.e ? -1 : 1;
    }

    private final int T(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        return ii.s(ixVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    private final int U(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        return ii.t(ixVar, this.b, r(!this.I), l(!this.I), this, this.I, this.e);
    }

    private final int Y(ix ixVar) {
        if (al() == 0) {
            return 0;
        }
        return ii.u(ixVar, this.b, r(!this.I), l(!this.I), this, this.I);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int aa(defpackage.ir r22, defpackage.ho r23, defpackage.ix r24) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.aa(ir, ho, ix):int");
    }

    private final int ae(int i) {
        int iD = this.a[0].d(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iD2 = this.a[i2].d(i);
            if (iD2 > iD) {
                iD = iD2;
            }
        }
        return iD;
    }

    private final int af(int i) {
        int iF = this.a[0].f(i);
        for (int i2 = 1; i2 < this.i; i2++) {
            int iF2 = this.a[i2].f(i);
            if (iF2 < iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    private final void ag(ir irVar, ix ixVar, boolean z) {
        int iF;
        int i;
        int iAe = ae(Integer.MIN_VALUE);
        if (iAe != Integer.MIN_VALUE && (iF = this.b.f() - iAe) > 0) {
            int i2 = -k(-iF, irVar, ixVar);
            if (!z || (i = iF - i2) <= 0) {
                return;
            }
            this.b.n(i);
        }
    }

    private final void ai(ir irVar, ix ixVar, boolean z) {
        int iJ;
        int iAf = af(Integer.MAX_VALUE);
        if (iAf != Integer.MAX_VALUE && (iJ = iAf - this.b.j()) > 0) {
            int iK = iJ - k(iJ, irVar, ixVar);
            if (!z || iK <= 0) {
                return;
            }
            this.b.n(-iK);
        }
    }

    private final void bA(ir irVar, int i) {
        while (al() > 0) {
            View viewAB = aB(0);
            if (this.b.a(viewAB) > i || this.b.l(viewAB) > i) {
                return;
            }
            jh jhVar = (jh) viewAB.getLayoutParams();
            boolean z = jhVar.b;
            if (jhVar.a.a.size() == 1) {
                return;
            }
            jk jkVar = jhVar.a;
            ArrayList arrayList = jkVar.a;
            View view = (View) arrayList.remove(0);
            jh jhVarN = jk.n(view);
            jhVarN.a = null;
            if (arrayList.size() == 0) {
                jkVar.c = Integer.MIN_VALUE;
            }
            if (jhVarN.d() || jhVarN.c()) {
                jkVar.d -= jkVar.f.b.b(view);
            }
            jkVar.b = Integer.MIN_VALUE;
            aU(viewAB, irVar);
        }
    }

    private final void bB() {
        this.e = (this.j == 1 || !O()) ? this.d : !this.d;
    }

    private final void bC(int i) {
        ho hoVar = this.l;
        hoVar.e = i;
        hoVar.d = this.e != (i == -1) ? -1 : 1;
    }

    private final void bD(int i, ix ixVar) {
        int iK;
        int iK2;
        int i2;
        ho hoVar = this.l;
        boolean z = false;
        hoVar.b = 0;
        hoVar.c = i;
        if (!bg() || (i2 = ixVar.a) == -1) {
            iK = 0;
            iK2 = 0;
        } else {
            if (this.e == (i2 < i)) {
                iK = this.b.k();
                iK2 = 0;
            } else {
                iK2 = this.b.k();
                iK = 0;
            }
        }
        RecyclerView recyclerView = this.s;
        if (recyclerView == null || !recyclerView.i) {
            hoVar.g = this.b.e() + iK;
            hoVar.f = -iK2;
        } else {
            hoVar.f = this.b.j() - iK2;
            hoVar.g = this.b.f() + iK;
        }
        hoVar.h = false;
        hoVar.a = true;
        if (this.b.h() == 0 && this.b.e() == 0) {
            z = true;
        }
        hoVar.i = z;
    }

    private final void bE(jk jkVar, int i, int i2) {
        int i3 = jkVar.d;
        if (i == -1) {
            if (jkVar.e() + i3 <= i2) {
                this.m.set(jkVar.e, false);
            }
        } else if (jkVar.c() - i3 >= i2) {
            this.m.set(jkVar.e, false);
        }
    }

    private final boolean bF(int i) {
        int i2 = this.j;
        boolean z = i == -1;
        if (i2 == 0) {
            return z != this.e;
        }
        return (z == this.e) == O();
    }

    private final void bG(View view, int i, int i2) {
        Rect rect = this.G;
        aI(view, rect);
        jh jhVar = (jh) view.getLayoutParams();
        int iBH = bH(i, jhVar.leftMargin + rect.left, jhVar.rightMargin + rect.right);
        int iBH2 = bH(i2, jhVar.topMargin + rect.top, jhVar.bottomMargin + rect.bottom);
        if (bl(view, iBH, iBH2, jhVar)) {
            view.measure(iBH, iBH2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int bH(int r3, int r4, int r5) {
        /*
            r0 = 0
            if (r4 != 0) goto L6
            if (r5 == 0) goto L14
            r4 = r0
        L6:
            int r1 = android.view.View.MeasureSpec.getMode(r3)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L15
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L14
            r1 = r2
            goto L15
        L14:
            return r3
        L15:
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = r3 - r4
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bH(int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bw(int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bw(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void bx(defpackage.ir r12, defpackage.ix r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.bx(ir, ix, boolean):void");
    }

    private final void by(ir irVar, ho hoVar) {
        if (!hoVar.a || hoVar.i) {
            return;
        }
        if (hoVar.b == 0) {
            if (hoVar.e == -1) {
                bz(irVar, hoVar.g);
                return;
            } else {
                bA(irVar, hoVar.f);
                return;
            }
        }
        int i = 1;
        if (hoVar.e == -1) {
            int i2 = hoVar.f;
            int iF = this.a[0].f(i2);
            while (i < this.i) {
                int iF2 = this.a[i].f(i2);
                if (iF2 > iF) {
                    iF = iF2;
                }
                i++;
            }
            int i3 = i2 - iF;
            bz(irVar, i3 < 0 ? hoVar.g : hoVar.g - Math.min(i3, hoVar.b));
            return;
        }
        int i4 = hoVar.g;
        int iD = this.a[0].d(i4);
        while (i < this.i) {
            int iD2 = this.a[i].d(i4);
            if (iD2 < iD) {
                iD = iD2;
            }
            i++;
        }
        int i5 = iD - hoVar.g;
        bA(irVar, i5 < 0 ? hoVar.f : Math.min(i5, hoVar.b) + hoVar.f);
    }

    private final void bz(ir irVar, int i) {
        int iAl = al();
        while (true) {
            iAl--;
            if (iAl < 0) {
                return;
            }
            View viewAB = aB(iAl);
            if (this.b.d(viewAB) < i || this.b.m(viewAB) < i) {
                return;
            }
            jh jhVar = (jh) viewAB.getLayoutParams();
            boolean z = jhVar.b;
            if (jhVar.a.a.size() == 1) {
                return;
            }
            jk jkVar = jhVar.a;
            ArrayList arrayList = jkVar.a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            jh jhVarN = jk.n(view);
            jhVarN.a = null;
            if (jhVarN.d() || jhVarN.c()) {
                jkVar.d -= jkVar.f.b.b(view);
            }
            if (size == 1) {
                jkVar.b = Integer.MIN_VALUE;
            }
            jkVar.c = Integer.MIN_VALUE;
            aU(viewAB, irVar);
        }
    }

    @Override // defpackage.in
    public final int A(ix ixVar) {
        return T(ixVar);
    }

    @Override // defpackage.in
    public final int B(ix ixVar) {
        return U(ixVar);
    }

    @Override // defpackage.in
    public final int C(ix ixVar) {
        return Y(ixVar);
    }

    @Override // defpackage.in
    public final int D(ix ixVar) {
        return T(ixVar);
    }

    @Override // defpackage.in
    public final int E(ix ixVar) {
        return U(ixVar);
    }

    @Override // defpackage.in
    public final int F(ix ixVar) {
        return Y(ixVar);
    }

    final void G(int i, ix ixVar) {
        int iC;
        int i2;
        if (i > 0) {
            iC = i();
            i2 = 1;
        } else {
            iC = c();
            i2 = -1;
        }
        ho hoVar = this.l;
        hoVar.a = true;
        bD(iC, ixVar);
        bC(i2);
        hoVar.c = iC + hoVar.d;
        hoVar.b = Math.abs(i);
    }

    public final void H(boolean z) {
        N(null);
        jj jjVar = this.q;
        if (jjVar != null && jjVar.h != z) {
            jjVar.h = z;
        }
        this.d = z;
        aX();
    }

    final void I(int i) {
        this.k = i / this.i;
        View.MeasureSpec.makeMeasureSpec(i, this.c.h());
    }

    @Override // defpackage.iv
    public final PointF J(int i) {
        int iP = P(i);
        PointF pointF = new PointF();
        if (iP == 0) {
            return null;
        }
        float f = iP;
        if (this.j == 0) {
            pointF.x = f;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = f;
        return pointF;
    }

    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.in
    public final Parcelable K() {
        int iF;
        int iJ;
        Object obj;
        jj jjVar = this.q;
        if (jjVar != null) {
            return new jj(jjVar);
        }
        jj jjVar2 = new jj();
        jjVar2.h = this.d;
        jjVar2.i = this.o;
        jjVar2.j = this.p;
        afz afzVar = this.h;
        if (afzVar == null || (obj = afzVar.a) == null) {
            jjVar2.e = 0;
        } else {
            jjVar2.f = (int[]) obj;
            jjVar2.e = jjVar2.f.length;
            jjVar2.g = afzVar.b;
        }
        if (al() <= 0) {
            jjVar2.a = -1;
            jjVar2.b = -1;
            jjVar2.c = 0;
            return jjVar2;
        }
        jjVar2.a = this.o ? i() : c();
        View viewL = this.e ? l(true) : r(true);
        jjVar2.b = viewL != null ? bp(viewL) : -1;
        int i = this.i;
        jjVar2.c = i;
        jjVar2.d = new int[i];
        for (int i2 = 0; i2 < this.i; i2++) {
            if (this.o) {
                iF = this.a[i2].d(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.f();
                    iF -= iJ;
                }
            } else {
                iF = this.a[i2].f(Integer.MIN_VALUE);
                if (iF != Integer.MIN_VALUE) {
                    iJ = this.b.j();
                    iF -= iJ;
                }
            }
            jjVar2.d[i2] = iF;
        }
        return jjVar2;
    }

    public final boolean L() {
        int iC;
        if (al() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.e) {
            iC = i();
            c();
        } else {
            iC = c();
            i();
        }
        if (iC != 0 || v() == null) {
            return false;
        }
        this.h.c();
        this.u = true;
        aX();
        return true;
    }

    @Override // defpackage.in
    public final void N(String str) {
        if (this.q == null) {
            super.N(str);
        }
    }

    final boolean O() {
        return as() == 1;
    }

    @Override // defpackage.in
    public final void Q(AccessibilityEvent accessibilityEvent) {
        super.Q(accessibilityEvent);
        if (al() > 0) {
            View viewR = r(false);
            View viewL = l(false);
            if (viewR == null || viewL == null) {
                return;
            }
            int iBp = bp(viewR);
            int iBp2 = bp(viewL);
            if (iBp < iBp2) {
                accessibilityEvent.setFromIndex(iBp);
                accessibilityEvent.setToIndex(iBp2);
            } else {
                accessibilityEvent.setFromIndex(iBp2);
                accessibilityEvent.setToIndex(iBp);
            }
        }
    }

    @Override // defpackage.in
    public final void R(Parcelable parcelable) {
        if (parcelable instanceof jj) {
            jj jjVar = (jj) parcelable;
            this.q = jjVar;
            if (this.f != -1) {
                jjVar.a();
                this.q.b();
            }
            aX();
        }
    }

    @Override // defpackage.in
    public final void S(int i) {
        jj jjVar = this.q;
        if (jjVar != null && jjVar.a != i) {
            jjVar.a();
        }
        this.f = i;
        this.g = Integer.MIN_VALUE;
        aX();
    }

    @Override // defpackage.in
    public final boolean V() {
        return this.j == 0;
    }

    @Override // defpackage.in
    public final boolean W() {
        return this.j == 1;
    }

    @Override // defpackage.in
    public final boolean X() {
        return this.n != 0;
    }

    @Override // defpackage.in
    public final boolean Z() {
        return this.d;
    }

    @Override // defpackage.in
    public final int a(ir irVar, ix ixVar) {
        if (this.j == 1) {
            return Math.min(this.i, ixVar.a());
        }
        return -1;
    }

    @Override // defpackage.in
    public final void aN(int i) {
        super.aN(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.in
    public final void aO(int i) {
        super.aO(i);
        for (int i2 = 0; i2 < this.i; i2++) {
            this.a[i2].k(i);
        }
    }

    @Override // defpackage.in
    public final void aR(int i) {
        if (i == 0) {
            L();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ac(int r5, int r6, defpackage.ix r7, defpackage.hk r8) {
        /*
            r4 = this;
            r0 = 1
            int r1 = r4.j
            if (r0 != r1) goto L6
            r5 = r6
        L6:
            int r6 = r4.al()
            if (r6 == 0) goto L76
            if (r5 != 0) goto Lf
            goto L76
        Lf:
            r4.G(r5, r7)
            int[] r5 = r4.J
            r6 = 0
            if (r5 == 0) goto L1c
            int r0 = r4.i
            int r5 = r5.length
            if (r5 >= r0) goto L22
        L1c:
            int r5 = r4.i
            int[] r5 = new int[r5]
            r4.J = r5
        L22:
            r5 = r6
            r0 = r5
        L24:
            int r1 = r4.i
            if (r5 >= r1) goto L54
            ho r1 = r4.l
            int r2 = r1.d
            r3 = -1
            if (r2 != r3) goto L3b
            int r1 = r1.f
            jk[] r2 = r4.a
            r2 = r2[r5]
            int r2 = r2.f(r1)
            int r1 = r1 - r2
            goto L49
        L3b:
            jk[] r2 = r4.a
            r2 = r2[r5]
            int r3 = r1.g
            int r2 = r2.d(r3)
            int r1 = r1.g
            int r1 = r2 - r1
        L49:
            if (r1 < 0) goto L51
            int[] r2 = r4.J
            r2[r0] = r1
            int r0 = r0 + 1
        L51:
            int r5 = r5 + 1
            goto L24
        L54:
            int[] r5 = r4.J
            java.util.Arrays.sort(r5, r6, r0)
        L59:
            if (r6 >= r0) goto L76
            ho r5 = r4.l
            boolean r1 = r5.a(r7)
            if (r1 == 0) goto L76
            int r1 = r5.c
            int[] r2 = r4.J
            r2 = r2[r6]
            r8.a(r1, r2)
            int r1 = r5.c
            int r2 = r5.d
            int r1 = r1 + r2
            r5.c = r1
            int r6 = r6 + 1
            goto L59
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.ac(int, int, ix, hk):void");
    }

    @Override // defpackage.in
    public final void ah(RecyclerView recyclerView) {
        bu(this.K);
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.in
    public final void aj(RecyclerView recyclerView, int i) {
        iw iwVar = new iw(recyclerView.getContext());
        iwVar.a = i;
        bd(iwVar);
    }

    @Override // defpackage.in
    public final int b(ir irVar, ix ixVar) {
        if (this.j == 0) {
            return Math.min(this.i, ixVar.a());
        }
        return -1;
    }

    @Override // defpackage.in
    public final void bs(ig igVar) {
        this.h.c();
        for (int i = 0; i < this.i; i++) {
            this.a[i].j();
        }
    }

    final int c() {
        if (al() == 0) {
            return 0;
        }
        return bp(aB(0));
    }

    @Override // defpackage.in
    public final int d(int i, ir irVar, ix ixVar) {
        return k(i, irVar, ixVar);
    }

    @Override // defpackage.in
    public final int e(int i, ir irVar, ix ixVar) {
        return k(i, irVar, ixVar);
    }

    @Override // defpackage.in
    public final io f() {
        return this.j == 0 ? new jh(-2, -1) : new jh(-1, -2);
    }

    @Override // defpackage.in
    public final io g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new jh((ViewGroup.MarginLayoutParams) layoutParams) : new jh(layoutParams);
    }

    @Override // defpackage.in
    public final io h(Context context, AttributeSet attributeSet) {
        return new jh(context, attributeSet);
    }

    final int i() {
        int iAl = al();
        if (iAl == 0) {
            return 0;
        }
        return bp(aB(iAl - 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r9, int r10, defpackage.ir r11, defpackage.ix r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.j(android.view.View, int, ir, ix):android.view.View");
    }

    final int k(int i, ir irVar, ix ixVar) {
        if (al() == 0 || i == 0) {
            return 0;
        }
        G(i, ixVar);
        ho hoVar = this.l;
        int iAa = aa(irVar, hoVar, ixVar);
        if (hoVar.b >= iAa) {
            i = i < 0 ? -iAa : iAa;
        }
        this.b.n(-i);
        this.o = this.e;
        hoVar.b = 0;
        by(irVar, hoVar);
        return i;
    }

    final View l(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        View view = null;
        for (int iAl = al() - 1; iAl >= 0; iAl--) {
            View viewAB = aB(iAl);
            int iD = this.b.d(viewAB);
            int iA = this.b.a(viewAB);
            if (iA > iJ && iD < iF) {
                if (iA <= iF || !z) {
                    return viewAB;
                }
                if (view == null) {
                    view = viewAB;
                }
            }
        }
        return view;
    }

    @Override // defpackage.in
    public final void m(ir irVar, ix ixVar, sm smVar) {
        super.m(irVar, ixVar, smVar);
        smVar.h("android.support.v7.widget.StaggeredGridLayoutManager");
    }

    @Override // defpackage.in
    public final void n(ir irVar, ix ixVar, View view, sm smVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof jh)) {
            super.aP(view, smVar);
            return;
        }
        jh jhVar = (jh) layoutParams;
        if (this.j == 0) {
            int iE = jhVar.e();
            boolean z = jhVar.b;
            smVar.j(asv.aa(iE, 1, -1, -1));
        } else {
            int iE2 = jhVar.e();
            boolean z2 = jhVar.b;
            smVar.j(asv.aa(-1, -1, iE2, 1));
        }
    }

    @Override // defpackage.in
    public final void o(ir irVar, ix ixVar) {
        bx(irVar, ixVar, true);
    }

    @Override // defpackage.in
    public final void p(ix ixVar) {
        this.f = -1;
        this.g = Integer.MIN_VALUE;
        this.q = null;
        this.H.a();
    }

    @Override // defpackage.in
    public final void q(Rect rect, int i, int i2) {
        int iAk;
        int iAk2;
        int iAw = aw() + ax();
        int iAy = ay() + av();
        if (this.j == 1) {
            iAk2 = ak(i2, rect.height() + iAy, at());
            iAk = ak(i, (this.k * this.i) + iAw, au());
        } else {
            iAk = ak(i, rect.width() + iAw, au());
            iAk2 = ak(i2, (this.k * this.i) + iAy, at());
        }
        ba(iAk, iAk2);
    }

    final View r(boolean z) {
        int iJ = this.b.j();
        int iF = this.b.f();
        int iAl = al();
        View view = null;
        for (int i = 0; i < iAl; i++) {
            View viewAB = aB(i);
            int iD = this.b.d(viewAB);
            if (this.b.a(viewAB) > iJ && iD < iF) {
                if (iD >= iJ || !z) {
                    return viewAB;
                }
                if (view == null) {
                    view = viewAB;
                }
            }
        }
        return view;
    }

    @Override // defpackage.in
    public final boolean s(io ioVar) {
        return ioVar instanceof jh;
    }

    @Override // defpackage.in
    public final boolean u() {
        return this.q == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final android.view.View v() {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.StaggeredGridLayoutManager.v():android.view.View");
    }

    @Override // defpackage.in
    public final void w(int i, int i2) {
        bw(i, i2, 1);
    }

    @Override // defpackage.in
    public final void x() {
        this.h.c();
        aX();
    }

    @Override // defpackage.in
    public final void y(int i, int i2) {
        bw(i, i2, 2);
    }

    @Override // defpackage.in
    public final void z(int i, int i2) {
        bw(i, i2, 4);
    }
}
