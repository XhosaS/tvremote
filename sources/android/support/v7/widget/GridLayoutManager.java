package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.asv;
import defpackage.awy;
import defpackage.b;
import defpackage.hk;
import defpackage.hn;
import defpackage.hr;
import defpackage.hs;
import defpackage.ht;
import defpackage.ig;
import defpackage.in;
import defpackage.io;
import defpackage.ir;
import defpackage.ix;
import defpackage.sl;
import defpackage.sm;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final Set G = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    private int H;
    boolean a;
    int b;
    int[] c;
    View[] d;
    final SparseIntArray e;
    final SparseIntArray f;
    final Rect g;
    int h;
    int i;
    final awy j;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        this.b = -1;
        this.e = new SparseIntArray();
        this.f = new SparseIntArray();
        awy awyVar = new awy((byte[]) null, (byte[]) null, (byte[]) null);
        this.j = awyVar;
        this.g = new Rect();
        this.H = -1;
        this.h = -1;
        this.i = -1;
        int i3 = az(context, attributeSet, i, i2).b;
        if (i3 == this.b) {
            return;
        }
        this.a = true;
        if (i3 <= 0) {
            throw new IllegalArgumentException(b.e(i3, "Span count should be at least 1. Provided "));
        }
        this.b = i3;
        awyVar.A();
        aX();
    }

    private final int bA(ir irVar, ix ixVar, int i) {
        if (!ixVar.g) {
            return 1;
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (irVar.a(i) == -1) {
            Log.w("GridLayoutManager", b.e(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        }
        return 1;
    }

    private final Set bB(int i) {
        return bD(bw(i), i);
    }

    private final Set bC(int i) {
        return bD(bx(i), i);
    }

    private final Set bD(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.s;
        int iBA = bA(recyclerView.f, recyclerView.K, i2);
        for (int i3 = i; i3 < i + iBA; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    private final void bE(int i) {
        int i2;
        int length;
        int[] iArr = this.c;
        int i3 = this.b;
        int i4 = i3 + 1;
        if (iArr == null || (length = iArr.length) != i4 || iArr[length - 1] != i) {
            iArr = new int[i4];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i / i3;
        int i7 = i % i3;
        int i8 = 0;
        for (int i9 = 1; i9 <= i3; i9++) {
            i5 += i7;
            if (i5 <= 0 || i3 - i5 >= i7) {
                i2 = i6;
            } else {
                i2 = i6 + 1;
                i5 -= i3;
            }
            i8 += i2;
            iArr[i9] = i8;
        }
        this.c = iArr;
    }

    private final void bF() {
        View[] viewArr = this.d;
        if (viewArr != null) {
            if (viewArr.length == this.b) {
                return;
            }
        }
        this.d = new View[this.b];
    }

    private final void bG(View view, int i, boolean z) {
        int iAm;
        int iAm2;
        hn hnVar = (hn) view.getLayoutParams();
        Rect rect = hnVar.d;
        int i2 = rect.top + rect.bottom + hnVar.topMargin + hnVar.bottomMargin;
        int i3 = rect.left + rect.right + hnVar.leftMargin + hnVar.rightMargin;
        int iC = c(hnVar.a, hnVar.b);
        if (this.k == 1) {
            iAm2 = am(iC, i, i3, hnVar.width, false);
            iAm = am(this.l.k(), this.B, i2, hnVar.height, true);
        } else {
            int iAm3 = am(iC, i, i2, hnVar.height, false);
            int iAm4 = am(this.l.k(), this.A, i3, hnVar.width, true);
            iAm = iAm3;
            iAm2 = iAm4;
        }
        bH(view, iAm2, iAm, z);
    }

    private final void bH(View view, int i, int i2, boolean z) {
        boolean zBl;
        io ioVar = (io) view.getLayoutParams();
        if (z) {
            zBl = true;
            if (this.w && in.bf(view.getMeasuredWidth(), i, ioVar.width) && in.bf(view.getMeasuredHeight(), i2, ioVar.height)) {
                zBl = false;
            }
        } else {
            zBl = bl(view, i, i2, ioVar);
        }
        if (zBl) {
            view.measure(i, i2);
        }
    }

    private final void bI() {
        int iAv;
        int iAy;
        if (this.k == 1) {
            iAv = this.C - ax();
            iAy = aw();
        } else {
            iAv = this.D - av();
            iAy = ay();
        }
        bE(iAv - iAy);
    }

    private final int bw(int i) {
        if (this.k == 0) {
            RecyclerView recyclerView = this.s;
            return by(recyclerView.f, recyclerView.K, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bz(recyclerView2.f, recyclerView2.K, i);
    }

    private final int bx(int i) {
        if (this.k == 1) {
            RecyclerView recyclerView = this.s;
            return by(recyclerView.f, recyclerView.K, i);
        }
        RecyclerView recyclerView2 = this.s;
        return bz(recyclerView2.f, recyclerView2.K, i);
    }

    private final int by(ir irVar, ix ixVar, int i) {
        if (ixVar.g) {
            int iA = irVar.a(i);
            if (iA == -1) {
                Log.w("GridLayoutManager", b.e(i, "Cannot find span size for pre layout position. "));
                return 0;
            }
            i = iA;
        }
        int i2 = this.b;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i3++;
            if (i4 >= i) {
                break;
            }
            if (i3 == i2) {
                i5++;
                i3 = 0;
            } else if (i3 > i2) {
                i5++;
                i3 = 1;
            }
            i4++;
        }
        return i3 > i2 ? i5 + 1 : i5;
    }

    private final int bz(ir irVar, ix ixVar, int i) {
        if (!ixVar.g) {
            return i % this.b;
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iA = irVar.a(i);
        if (iA != -1) {
            return iA % this.b;
        }
        Log.w("GridLayoutManager", b.e(i, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:"));
        return 0;
    }

    @Override // defpackage.in
    public final int a(ir irVar, ix ixVar) {
        if (this.k == 1) {
            return Math.min(this.b, ar());
        }
        if (ixVar.a() <= 0) {
            return 0;
        }
        return by(irVar, ixVar, ixVar.a() - 1) + 1;
    }

    @Override // defpackage.in
    public final int b(ir irVar, ix ixVar) {
        if (this.k == 0) {
            return Math.min(this.b, ar());
        }
        if (ixVar.a() <= 0) {
            return 0;
        }
        return by(irVar, ixVar, ixVar.a() - 1) + 1;
    }

    final int c(int i, int i2) {
        if (this.k != 1 || !Y()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final int d(int i, ir irVar, ix ixVar) {
        bI();
        bF();
        return super.d(i, irVar, ixVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final int e(int i, ir irVar, ix ixVar) {
        bI();
        bF();
        return super.e(i, irVar, ixVar);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final io f() {
        return this.k == 0 ? new hn(-2, -1) : new hn(-1, -2);
    }

    @Override // defpackage.in
    public final io g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new hn((ViewGroup.MarginLayoutParams) layoutParams) : new hn(layoutParams);
    }

    @Override // defpackage.in
    public final io h(Context context, AttributeSet attributeSet) {
        return new hn(context, attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final View i(ir irVar, ix ixVar, boolean z, boolean z2) {
        int i;
        int iAl;
        int i2;
        int iAl2 = al();
        if (z2) {
            i = -1;
            iAl = al() - 1;
            i2 = -1;
        } else {
            i = iAl2;
            iAl = 0;
            i2 = 1;
        }
        int iA = ixVar.a();
        P();
        int iJ = this.l.j();
        int iF = this.l.f();
        View view = null;
        View view2 = null;
        while (iAl != i) {
            View viewAB = aB(iAl);
            int iBp = bp(viewAB);
            if (iBp >= 0 && iBp < iA && bz(irVar, ixVar, iBp) == 0) {
                if (((io) viewAB.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = viewAB;
                    }
                } else {
                    if (this.l.d(viewAB) < iF && this.l.a(viewAB) >= iJ) {
                        return viewAB;
                    }
                    if (view == null) {
                        view = viewAB;
                    }
                }
            }
            iAl += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cd, code lost:
    
        if (r13 == (r2 > r11)) goto L51;
     */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View j(android.view.View r23, int r24, defpackage.ir r25, defpackage.ix r26) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.j(android.view.View, int, ir, ix):android.view.View");
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void k(ir irVar, ix ixVar, ht htVar, hs hsVar) {
        int i;
        int i2;
        int i3;
        int iC;
        int iC2;
        int iAw;
        int i4;
        int iAm;
        int iAm2;
        boolean z;
        View viewA;
        int i5 = this.l.i();
        int i6 = al() > 0 ? this.c[this.b] : 0;
        boolean z2 = i5 != 1073741824;
        if (z2) {
            bI();
        }
        int i7 = htVar.e;
        int iBz = this.b;
        if (i7 != 1) {
            iBz = bz(irVar, ixVar, htVar.d) + bA(irVar, ixVar, htVar.d);
        }
        int i8 = 0;
        while (i8 < this.b && htVar.d(ixVar) && iBz > 0) {
            int i9 = htVar.d;
            int iBA = bA(irVar, ixVar, i9);
            if (iBA > this.b) {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + iBA + " spans but GridLayoutManager has only " + this.b + " spans.");
            }
            iBz -= iBA;
            if (iBz < 0 || (viewA = htVar.a(irVar)) == null) {
                break;
            }
            this.d[i8] = viewA;
            i8++;
        }
        if (i8 == 0) {
            hsVar.b = true;
            return;
        }
        if (i7 == 1) {
            i3 = 1;
            i2 = i8;
            i = 0;
        } else {
            i = i8 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i10 = 0;
        while (i != i2) {
            View view = this.d[i];
            hn hnVar = (hn) view.getLayoutParams();
            int iBA2 = bA(irVar, ixVar, bp(view));
            hnVar.b = iBA2;
            hnVar.a = i10;
            i10 += iBA2;
            i += i3;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i8; i12++) {
            View view2 = this.d[i12];
            if (htVar.l != null) {
                z = false;
                if (i7 == 1) {
                    aE(view2);
                } else {
                    aF(view2, 0);
                }
            } else if (i7 == 1) {
                aG(view2);
                z = false;
            } else {
                z = false;
                aH(view2, 0);
            }
            aI(view2, this.g);
            bG(view2, i5, z);
            int iB = this.l.b(view2);
            if (iB > i11) {
                i11 = iB;
            }
            float fC = this.l.c(view2) / ((hn) view2.getLayoutParams()).b;
            if (fC > f) {
                f = fC;
            }
        }
        if (z2) {
            bE(Math.max(Math.round(f * this.b), i6));
            i11 = 0;
            for (int i13 = 0; i13 < i8; i13++) {
                View view3 = this.d[i13];
                bG(view3, 1073741824, true);
                int iB2 = this.l.b(view3);
                if (iB2 > i11) {
                    i11 = iB2;
                }
            }
        }
        for (int i14 = 0; i14 < i8; i14++) {
            View view4 = this.d[i14];
            if (this.l.b(view4) != i11) {
                hn hnVar2 = (hn) view4.getLayoutParams();
                Rect rect = hnVar2.d;
                int i15 = rect.top + rect.bottom + hnVar2.topMargin + hnVar2.bottomMargin;
                int i16 = rect.left + rect.right + hnVar2.leftMargin + hnVar2.rightMargin;
                int iC3 = c(hnVar2.a, hnVar2.b);
                if (this.k == 1) {
                    iAm2 = am(iC3, 1073741824, i16, hnVar2.width, false);
                    iAm = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iAm = am(iC3, 1073741824, i15, hnVar2.height, false);
                    iAm2 = iMakeMeasureSpec;
                }
                bH(view4, iAm2, iAm, true);
            }
        }
        hsVar.a = i11;
        if (this.k == 1) {
            if (htVar.f == -1) {
                int i17 = htVar.b;
                i4 = i17 - i11;
                iC2 = i17;
            } else {
                i4 = htVar.b;
                iC2 = i4 + i11;
            }
            iAw = 0;
            iC = 0;
        } else {
            if (htVar.f == -1) {
                int i18 = htVar.b;
                iAw = i18 - i11;
                iC2 = 0;
                iC = i18;
            } else {
                int i19 = htVar.b;
                iC = i19 + i11;
                iC2 = 0;
                iAw = i19;
            }
            i4 = iC2;
        }
        for (int i20 = 0; i20 < i8; i20++) {
            View view5 = this.d[i20];
            hn hnVar3 = (hn) view5.getLayoutParams();
            if (this.k != 1) {
                int iAy = ay() + this.c[hnVar3.a];
                i4 = iAy;
                iC2 = this.l.c(view5) + iAy;
            } else if (Y()) {
                int iAw2 = aw() + this.c[this.b - hnVar3.a];
                iC = iAw2;
                iAw = iAw2 - this.l.c(view5);
            } else {
                iAw = aw() + this.c[hnVar3.a];
                iC = this.l.c(view5) + iAw;
            }
            br(view5, iAw, i4, iC, iC2);
            if (hnVar3.d() || hnVar3.c()) {
                hsVar.c = true;
            }
            hsVar.d = view5.hasFocusable() | hsVar.d;
        }
        Arrays.fill(this.d, (Object) null);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void l(ir irVar, ix ixVar, hr hrVar, int i) {
        bI();
        if (ixVar.a() > 0 && !ixVar.g) {
            int iBz = bz(irVar, ixVar, hrVar.b);
            if (i == 1) {
                while (iBz > 0) {
                    int i2 = hrVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    hrVar.b = i3;
                    iBz = bz(irVar, ixVar, i3);
                }
            } else {
                int iA = ixVar.a() - 1;
                int i4 = hrVar.b;
                while (i4 < iA) {
                    int i5 = i4 + 1;
                    int iBz2 = bz(irVar, ixVar, i5);
                    if (iBz2 <= iBz) {
                        break;
                    }
                    i4 = i5;
                    iBz = iBz2;
                }
                hrVar.b = i4;
            }
        }
        bF();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final void m(ir irVar, ix ixVar, sm smVar) {
        super.m(irVar, ixVar, smVar);
        smVar.h(GridView.class.getName());
        ig igVar = this.s.l;
        if (igVar == null || igVar.a() <= 1) {
            return;
        }
        smVar.e(sl.k);
    }

    @Override // defpackage.in
    public final void n(ir irVar, ix ixVar, View view, sm smVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof hn)) {
            super.aP(view, smVar);
            return;
        }
        hn hnVar = (hn) layoutParams;
        int iBy = by(irVar, ixVar, hnVar.b());
        if (this.k == 0) {
            smVar.j(asv.aa(hnVar.a, hnVar.b, iBy, 1));
        } else {
            smVar.j(asv.aa(iBy, 1, hnVar.a, hnVar.b));
        }
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final void o(ir irVar, ix ixVar) {
        if (ixVar.g) {
            int iAl = al();
            for (int i = 0; i < iAl; i++) {
                hn hnVar = (hn) aB(i).getLayoutParams();
                int iB = hnVar.b();
                this.e.put(iB, hnVar.b);
                this.f.put(iB, hnVar.a);
            }
        }
        super.o(irVar, ixVar);
        this.e.clear();
        this.f.clear();
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final void p(ix ixVar) {
        View viewM;
        super.p(ixVar);
        this.a = false;
        int i = this.H;
        if (i == -1 || (viewM = M(i)) == null) {
            return;
        }
        viewM.sendAccessibilityEvent(67108864);
        this.H = -1;
    }

    @Override // defpackage.in
    public final void q(Rect rect, int i, int i2) {
        int iAk;
        int iAk2;
        if (this.c == null) {
            super.q(rect, i, i2);
        }
        int iAw = aw() + ax();
        int iAy = ay() + av();
        if (this.k == 1) {
            iAk2 = ak(i2, rect.height() + iAy, at());
            iAk = ak(i, this.c[r7.length - 1] + iAw, au());
        } else {
            iAk = ak(i, rect.width() + iAw, au());
            iAk2 = ak(i2, this.c[r5.length - 1] + iAy, at());
        }
        ba(iAk, iAk2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void r(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.r(false);
    }

    @Override // defpackage.in
    public final boolean s(io ioVar) {
        return ioVar instanceof hn;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0259 A[EDGE_INSN: B:195:0x0259->B:153:0x0259 BREAK  A[LOOP:2: B:117:0x019c->B:126:0x01c6, LOOP_LABEL: LOOP:2: B:117:0x019c->B:126:0x01c6], EDGE_INSN: B:201:0x0259->B:153:0x0259 BREAK  A[LOOP:5: B:135:0x01fe->B:146:0x022d, LOOP_LABEL: LOOP:5: B:135:0x01fe->B:146:0x022d]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0268  */
    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(int r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.GridLayoutManager.t(int, android.os.Bundle):boolean");
    }

    @Override // android.support.v7.widget.LinearLayoutManager, defpackage.in
    public final boolean u() {
        return this.p == null && !this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    public final void v(ix ixVar, ht htVar, hk hkVar) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && htVar.d(ixVar) && i > 0; i2++) {
            hkVar.a(htVar.d, Math.max(0, htVar.g));
            i--;
            htVar.d += htVar.e;
        }
    }

    @Override // defpackage.in
    public final void w(int i, int i2) {
        awy awyVar = this.j;
        awyVar.A();
        awyVar.z();
    }

    @Override // defpackage.in
    public final void x() {
        awy awyVar = this.j;
        awyVar.A();
        awyVar.z();
    }

    @Override // defpackage.in
    public final void y(int i, int i2) {
        awy awyVar = this.j;
        awyVar.A();
        awyVar.z();
    }

    @Override // defpackage.in
    public final void z(int i, int i2) {
        awy awyVar = this.j;
        awyVar.A();
        awyVar.z();
    }
}
