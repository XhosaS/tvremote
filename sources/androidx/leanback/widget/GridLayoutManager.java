package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.AbstractC0001if;
import defpackage.ael;
import defpackage.asv;
import defpackage.b;
import defpackage.bqk;
import defpackage.byj;
import defpackage.hk;
import defpackage.id;
import defpackage.ig;
import defpackage.in;
import defpackage.io;
import defpackage.ir;
import defpackage.iw;
import defpackage.ix;
import defpackage.ja;
import defpackage.ki;
import defpackage.qn;
import defpackage.qp;
import defpackage.qv;
import defpackage.sl;
import defpackage.sm;
import defpackage.vp;
import defpackage.vr;
import defpackage.vs;
import defpackage.vt;
import defpackage.vu;
import defpackage.vv;
import defpackage.vw;
import defpackage.wa;
import defpackage.wn;
import defpackage.wo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GridLayoutManager extends in {
    private static final Rect Q = new Rect();
    public static final int[] a = new int[2];
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public vr N;
    public final wo O;
    public final qp P;
    private AbstractC0001if R;
    private int S;
    private int T;
    private int U;
    private int V;
    private int[] W;
    private int X;
    private int Y;
    private int Z;
    private final int[] aa;
    private final Runnable ab;
    private final ael ac;
    private final byj ad;
    public float b;
    int c;
    public vp d;
    public int e;
    public ix f;
    public int g;
    int h;
    final SparseIntArray i;
    int[] j;
    AudioManager k;
    public ir l;
    public int m;
    public ArrayList n;
    public int o;
    public vt p;
    public vv q;

    public GridLayoutManager() {
        this(null);
    }

    public static final int bF(View view) {
        vu vuVar = (vu) view.getLayoutParams();
        return bn(view) + vuVar.topMargin + vuVar.bottomMargin;
    }

    public static final int bG(View view) {
        vu vuVar = (vu) view.getLayoutParams();
        return bo(view) + vuVar.leftMargin + vuVar.rightMargin;
    }

    public static final void bH(View view, View view2) {
        if (view == null || view2 == null) {
            return;
        }
        qn qnVar = ((vu) view.getLayoutParams()).l;
    }

    private final int bI(int i) {
        return cc(aB(i));
    }

    private final int bJ(int i) {
        int i2 = 3;
        int i3 = 2;
        if (this.e == 0) {
            if (i == 17) {
                return (this.m & 262144) == 0 ? 0 : 1;
            }
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 3 : (this.m & 262144) == 0 ? 1 : 0;
            }
            return 2;
        }
        if (i != 17) {
            if (i == 33) {
                return 0;
            }
            if (i != 66) {
                return i != 130 ? 17 : 1;
            }
            i3 = 3;
            i2 = 2;
        }
        return (this.m & 524288) == 0 ? i3 : i2;
    }

    private final int bK(int i) {
        int i2 = this.V;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.W;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    private final int bL() {
        int i = (this.m & 524288) != 0 ? 0 : this.M - 1;
        return c(i) + bK(i);
    }

    private final int bM(View view) {
        return this.e == 0 ? cd(view) : ce(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r0
  0x001d: PHI (r0v8 int) = (r0v7 int), (r0v11 int) binds: [B:16:0x002f, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int bN(int r7) {
        /*
            r6 = this;
            int r0 = r6.m
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L32
            r0 = r0 & 3
            if (r0 == r2) goto L32
            if (r7 <= 0) goto L1f
            wo r0 = r6.O
            wn r1 = r0.d
            boolean r1 = r1.f()
            if (r1 != 0) goto L32
            wn r0 = r0.d
            int r0 = r0.c
            if (r7 <= r0) goto L32
        L1d:
            r7 = r0
            goto L32
        L1f:
            if (r7 >= 0) goto L32
            wo r0 = r6.O
            wn r1 = r0.d
            boolean r1 = r1.g()
            if (r1 != 0) goto L32
            wn r0 = r0.d
            int r0 = r0.d
            if (r7 >= r0) goto L32
            goto L1d
        L32:
            r0 = 0
            if (r7 != 0) goto L36
            return r0
        L36:
            int r1 = -r7
            int r3 = r6.al()
            int r4 = r6.e
            if (r4 != r2) goto L4c
            r4 = r0
        L40:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.aB(r4)
            r5.offsetTopAndBottom(r1)
            int r4 = r4 + 1
            goto L40
        L4c:
            r4 = r0
        L4d:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.aB(r4)
            r5.offsetLeftAndRight(r1)
            int r4 = r4 + 1
            goto L4d
        L59:
            int r1 = r6.m
            r1 = r1 & 3
            if (r1 != r2) goto L63
            r6.af()
            return r7
        L63:
            int r1 = r6.al()
            int r3 = r6.m
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L71
            if (r7 <= 0) goto L77
            goto L73
        L71:
            if (r7 >= 0) goto L77
        L73:
            r6.bT()
            goto L7a
        L77:
            r6.bP()
        L7a:
            int r3 = r6.al()
            if (r3 <= r1) goto L82
            r1 = r2
            goto L83
        L82:
            r1 = r0
        L83:
            int r3 = r6.al()
            int r5 = r6.m
            r4 = r4 & r5
            if (r4 == 0) goto L8f
            if (r7 <= 0) goto L95
            goto L91
        L8f:
            if (r7 >= 0) goto L95
        L91:
            r6.bU()
            goto L98
        L95:
            r6.bV()
        L98:
            int r4 = r6.al()
            if (r4 >= r3) goto L9f
            goto La0
        L9f:
            r2 = r0
        La0:
            r0 = r1 | r2
            if (r0 == 0) goto La7
            r6.bZ()
        La7:
            vp r0 = r6.d
            r0.invalidate()
            r6.af()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bN(int):int");
    }

    private final int bO(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int iAl = al();
        if (this.e == 0) {
            while (i2 < iAl) {
                aB(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < iAl) {
                aB(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.H += i;
        ca();
        this.d.invalidate();
        return i;
    }

    private final void bP() {
        this.N.l((this.m & 262144) != 0 ? -this.h : this.Z + this.h, false);
    }

    private final void bQ() {
        this.N = null;
        this.W = null;
        this.m &= -1025;
    }

    private final void bR() {
        vp vpVar = this.d;
        int[] iArr = qv.a;
        vpVar.postOnAnimation(this.ab);
    }

    private final void bS() {
        int i = this.S - 1;
        this.S = i;
        if (i == 0) {
            this.l = null;
            this.f = null;
            this.g = 0;
            this.h = 0;
        }
    }

    private final void bT() {
        this.N.q((this.m & 262144) != 0 ? this.Z + this.h : -this.h);
    }

    private final void bU() {
        int i = this.m;
        if ((65600 & i) == 65536) {
            vr vrVar = this.N;
            int i2 = this.o;
            int i3 = (i & 262144) != 0 ? 0 : this.Z;
            while (true) {
                int i4 = vrVar.f;
                if (i4 < vrVar.e || i4 <= i2) {
                    break;
                }
                if (!vrVar.b) {
                    if (vrVar.i.m(i4) < i3) {
                        break;
                    }
                    vrVar.i.p(vrVar.f);
                    vrVar.f--;
                } else {
                    if (vrVar.i.m(i4) > i3) {
                        break;
                    }
                    vrVar.i.p(vrVar.f);
                    vrVar.f--;
                }
            }
            vrVar.i();
        }
    }

    private final void bV() {
        int i = this.m;
        if ((65600 & i) == 65536) {
            vr vrVar = this.N;
            int i2 = this.o;
            int i3 = (i & 262144) != 0 ? this.Z : 0;
            while (true) {
                int i4 = vrVar.f;
                int i5 = vrVar.e;
                if (i4 < i5 || i5 >= i2) {
                    break;
                }
                int iO = vrVar.i.o(i5);
                if (!vrVar.b) {
                    if (vrVar.i.m(vrVar.e) + iO > i3) {
                        break;
                    }
                    vrVar.i.p(vrVar.e);
                    vrVar.e++;
                } else {
                    if (vrVar.i.m(vrVar.e) - iO < i3) {
                        break;
                    }
                    vrVar.i.p(vrVar.e);
                    vrVar.e++;
                }
            }
            vrVar.i();
        }
    }

    private final void bW(ir irVar, ix ixVar) {
        int i = this.S;
        if (i == 0) {
            this.l = irVar;
            this.f = ixVar;
            i = 0;
            this.g = 0;
            this.h = 0;
        }
        this.S = i + 1;
    }

    private final void bX(View view, View view2, boolean z) {
        bY(view, view2, z, 0, 0);
    }

    private final void bY(View view, View view2, boolean z, int i, int i2) {
        if ((this.m & 64) != 0) {
            return;
        }
        int iCc = cc(view);
        bH(view, view2);
        if (iCc != this.o) {
            this.o = iCc;
            this.T = 0;
            if ((this.m & 3) != 1) {
                G();
            }
            if (this.d.ap()) {
                this.d.invalidate();
            }
        }
        if (view != null) {
            if (!view.hasFocus() && this.d.hasFocus()) {
                view.requestFocus();
            }
            if ((this.m & 131072) == 0) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            int[] iArr = a;
            if (!ai(view, view2, iArr) && i == 0) {
                if (i2 == 0) {
                    return;
                } else {
                    i = 0;
                }
            }
            int i3 = iArr[0] + i;
            int i4 = iArr[1] + i2;
            if ((this.m & 3) == 1) {
                bN(i3);
                bO(i4);
                return;
            }
            int i5 = this.e;
            int i6 = 1 != i5 ? i4 : i3;
            if (1 == i5) {
                i3 = i4;
            }
            if (z) {
                this.d.ak(i3, i6);
            } else {
                this.d.scrollBy(i3, i6);
                H();
            }
        }
    }

    private final void bZ() {
        int i = (this.m & (-1025)) | (true == cb(false) ? 1024 : 0);
        this.m = i;
        if ((i & 1024) != 0) {
            bR();
        }
    }

    private final void ca() {
        wn wnVar = this.O.e;
        int i = wnVar.g - this.H;
        int iBL = bL() + i;
        wnVar.e(i, iBL, i, iBL);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean cb(boolean r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.cb(boolean):boolean");
    }

    private static final int cc(View view) {
        vu vuVar;
        if (view == null || (vuVar = (vu) view.getLayoutParams()) == null || vuVar.d()) {
            return -1;
        }
        return vuVar.a();
    }

    private static final int cd(View view) {
        vu vuVar = (vu) view.getLayoutParams();
        return view.getLeft() + vuVar.a + vuVar.i;
    }

    private static final int ce(View view) {
        vu vuVar = (vu) view.getLayoutParams();
        return view.getTop() + vuVar.b + vuVar.j;
    }

    public final void G() {
        if (bz()) {
            int i = this.o;
            View viewM = i == -1 ? null : M(i);
            if (viewM != null) {
                bE(this.d, this.d.e(viewM), this.o);
            } else {
                bE(this.d, null, -1);
            }
            if ((this.m & 3) == 1 || this.d.isLayoutRequested()) {
                return;
            }
            int iAl = al();
            for (int i2 = 0; i2 < iAl; i2++) {
                if (aB(i2).isLayoutRequested()) {
                    bR();
                    return;
                }
            }
        }
    }

    public final void H() {
        if (bz()) {
            int i = this.o;
            View viewM = i == -1 ? null : M(i);
            if (viewM == null) {
                bB();
            } else {
                this.d.e(viewM);
                bB();
            }
        }
    }

    public final void I(int i, View view, int i2, int i3, int i4) {
        int iBK;
        int iBF = this.e == 0 ? bF(view) : bG(view);
        int i5 = this.V;
        if (i5 > 0) {
            iBF = Math.min(iBF, i5);
        }
        int i6 = this.L;
        int i7 = i6 & 112;
        int absoluteGravity = (this.m & 786432) != 0 ? Gravity.getAbsoluteGravity(i6 & 8388615, 1) : i6 & 7;
        int i8 = this.e;
        if ((i8 != 0 || i7 != 48) && (i8 != 1 || absoluteGravity != 3)) {
            if ((i8 == 0 && i7 == 80) || (i8 == 1 && absoluteGravity == 5)) {
                iBK = bK(i) - iBF;
            } else if ((i8 == 0 && i7 == 16) || (i8 == 1 && absoluteGravity == 1)) {
                iBK = (bK(i) - iBF) / 2;
            }
            i4 += iBK;
        }
        int i9 = iBF + i4;
        int i10 = this.e;
        int i11 = 1 != i10 ? i9 : i3;
        if (1 == i10) {
            i3 = i9;
        }
        int i12 = 1 != i10 ? i4 : i2;
        if (1 == i10) {
            i2 = i4;
        }
        vu vuVar = (vu) view.getLayoutParams();
        br(view, i2, i12, i3, i11);
        Rect rect = Q;
        RecyclerView.D(view, rect);
        int i13 = i2 - rect.left;
        int i14 = i12 - rect.top;
        int i15 = rect.right - i3;
        int i16 = rect.bottom - i11;
        vuVar.a = i13;
        vuVar.b = i14;
        vuVar.g = i15;
        vuVar.h = i16;
        vu vuVar2 = (vu) view.getLayoutParams();
        qn qnVar = vuVar2.l;
        ael aelVar = this.ac;
        vuVar2.i = ((bqk) aelVar.b).a(view);
        vuVar2.j = ((bqk) aelVar.c).a(view);
    }

    public final void J(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        vu vuVar = (vu) view.getLayoutParams();
        Rect rect = Q;
        aI(view, rect);
        int i = vuVar.leftMargin + vuVar.rightMargin + rect.left + rect.right;
        int i2 = vuVar.topMargin + vuVar.bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.U == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.V, 1073741824);
        if (this.e == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i, vuVar.width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, vuVar.height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, vuVar.height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i, vuVar.width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // defpackage.in
    public final Parcelable K() {
        vw vwVar = new vw();
        vwVar.a = this.o;
        int iAl = al();
        for (int i = 0; i < iAl; i++) {
            cc(aB(i));
        }
        vwVar.b = null;
        return vwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r2 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void L(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L9
            boolean r0 = r5.bx()
            if (r0 != 0) goto Lf
            goto L10
        L9:
            boolean r0 = r5.bw()
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            vv r0 = r5.q
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L2d
            if (r2 == r6) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            vv r0 = new vv
            int r3 = r5.M
            r4 = 0
            if (r3 <= r2) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r4
        L24:
            r0.<init>(r5, r1, r3)
            r5.T = r4
            r5.bd(r0)
            goto L47
        L2d:
            if (r6 == 0) goto L3b
            int r1 = r0.p
            androidx.leanback.widget.GridLayoutManager r3 = r0.q
            int r3 = r3.c
            if (r1 >= r3) goto L47
            int r1 = r1 + r2
            r0.p = r1
            goto L47
        L3b:
            int r3 = r0.p
            androidx.leanback.widget.GridLayoutManager r4 = r0.q
            int r4 = r4.c
            int r4 = -r4
            if (r3 <= r4) goto L47
            int r3 = r3 + r1
            r0.p = r3
        L47:
            int r0 = r5.e
            if (r0 != 0) goto L5c
            int r0 = r5.as()
            r1 = 3
            r3 = 4
            if (r0 != r2) goto L56
            if (r2 == r6) goto L58
            goto L5a
        L56:
            if (r2 == r6) goto L5a
        L58:
            r2 = r1
            goto L60
        L5a:
            r2 = r3
            goto L60
        L5c:
            if (r2 == r6) goto L5f
            goto L60
        L5f:
            r2 = 2
        L60:
            android.media.AudioManager r6 = r5.k
            if (r6 != 0) goto L74
            vp r6 = r5.d
            android.content.Context r6 = r6.getContext()
            java.lang.String r0 = "audio"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            r5.k = r6
        L74:
            android.media.AudioManager r6 = r5.k
            r6.playSoundEffect(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.L(boolean):void");
    }

    public final void O(View view, boolean z) {
        bX(view, view.findFocus(), z);
    }

    public final void P(vp vpVar) {
        this.d = vpVar;
        this.N = null;
    }

    @Override // defpackage.in
    public final void R(Parcelable parcelable) {
        if (parcelable instanceof vw) {
            this.o = ((vw) parcelable).a;
            this.T = 0;
            this.m |= 256;
            aX();
        }
    }

    @Override // defpackage.in
    public final void S(int i) {
        bD(i, false);
    }

    final void T(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.Y = i;
    }

    public final void U(int i) {
        wn wnVar;
        if (i != 0) {
            i = 1;
        }
        this.e = i;
        this.R = AbstractC0001if.p(this, i);
        wo woVar = this.O;
        woVar.a = i;
        if (i == 0) {
            woVar.d = woVar.c;
            wnVar = woVar.b;
        } else {
            woVar.d = woVar.b;
            wnVar = woVar.c;
        }
        woVar.e = wnVar;
        this.ac.a = i;
        this.m |= 256;
    }

    @Override // defpackage.in
    public final boolean V() {
        return this.e == 0 || this.M > 1;
    }

    @Override // defpackage.in
    public final boolean W() {
        return this.e == 1 || this.M > 1;
    }

    final void Y(int i) {
        if (i < 0 && i != -2) {
            throw new IllegalArgumentException(b.e(i, "Invalid row height: "));
        }
        this.U = i;
    }

    @Override // defpackage.in
    public final int a(ir irVar, ix ixVar) {
        vr vrVar;
        return (this.e != 1 || (vrVar = this.N) == null) ? super.a(irVar, ixVar) : vrVar.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View aD(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.aD(android.view.View, int):android.view.View");
    }

    @Override // defpackage.in
    public final void aM(View view, Rect rect) {
        RecyclerView.D(view, rect);
        vu vuVar = (vu) view.getLayoutParams();
        rect.left += vuVar.a;
        rect.top += vuVar.b;
        rect.right -= vuVar.g;
        rect.bottom -= vuVar.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aQ(defpackage.ir r7, defpackage.ix r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.aQ(ir, ix, int, int):void");
    }

    @Override // defpackage.in
    public final void aS(ir irVar) {
        int iAl = al();
        while (true) {
            iAl--;
            if (iAl < 0) {
                return;
            } else {
                aV(iAl, irVar);
            }
        }
    }

    final void aa() {
        vt vtVar = this.p;
        if (vtVar != null) {
            vtVar.n = true;
        }
    }

    @Override // defpackage.in
    public final void ac(int i, int i2, ix ixVar, hk hkVar) {
        try {
            bW(null, ixVar);
            if (1 == this.e) {
                i = i2;
            }
            if (al() != 0 && i != 0) {
                this.N.p(i < 0 ? 0 : this.Z, i, hkVar);
            }
        } finally {
            bS();
        }
    }

    @Override // defpackage.in
    public final void ad(int i, hk hkVar) {
        int i2 = this.d.ac;
        if (i == 0 || i2 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.o - ((i2 - 1) >> 1), i - i2));
        for (int i3 = iMax; i3 < i && i3 < iMax + i2; i3++) {
            hkVar.a(i3, 0);
        }
    }

    final void ae() {
        if (al() <= 0) {
            this.g = 0;
        } else {
            this.g = this.N.e - ((vu) aB(0).getLayoutParams()).b();
        }
    }

    public final void af() {
        int iA;
        int i;
        int i2;
        int i3;
        int iA2;
        int iBM;
        int iC;
        int iBM2;
        if (this.f.a() == 0) {
            return;
        }
        if ((this.m & 262144) == 0) {
            i = this.N.f;
            int iA3 = this.f.a() - 1;
            i2 = this.N.e;
            i3 = iA3;
            iA = 0;
        } else {
            vr vrVar = this.N;
            int i4 = vrVar.e;
            int i5 = vrVar.f;
            iA = this.f.a() - 1;
            i = i4;
            i2 = i5;
            i3 = 0;
        }
        if (i < 0 || i2 < 0) {
            return;
        }
        boolean z = i == i3;
        boolean z2 = i2 == iA;
        if (!z) {
            wo woVar = this.O;
            if (woVar.d.f() && !z2 && woVar.d.g()) {
                return;
            }
        }
        if (z) {
            vr vrVar2 = this.N;
            int[] iArr = a;
            iA2 = vrVar2.a(true, iArr);
            View viewM = M(iArr[1]);
            iBM = bM(viewM);
            int[] iArr2 = ((vu) viewM.getLayoutParams()).k;
        } else {
            iA2 = Integer.MAX_VALUE;
            iBM = Integer.MAX_VALUE;
        }
        if (z2) {
            vr vrVar3 = this.N;
            int[] iArr3 = a;
            iC = vrVar3.c(false, iArr3);
            iBM2 = bM(M(iArr3[1]));
        } else {
            iC = Integer.MIN_VALUE;
            iBM2 = Integer.MIN_VALUE;
        }
        this.O.d.e(iC, iA2, iBM2, iBM);
    }

    public final boolean ag(View view) {
        if (view.getVisibility() == 0) {
            return !be() || view.hasFocusable();
        }
        return false;
    }

    public final boolean ai(View view, View view2, int[] iArr) {
        wo woVar = this.O;
        int iB = woVar.d.b(bM(view));
        if (view2 != null) {
            bH(view, view2);
        }
        int iB2 = woVar.e.b(this.e == 0 ? ce(view) : cd(view));
        if (iB == 0) {
            if (iB2 == 0) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
            iB = 0;
        }
        iArr[0] = iB;
        iArr[1] = iB2;
        return true;
    }

    @Override // defpackage.in
    public final void aj(RecyclerView recyclerView, int i) {
        bD(i, true);
    }

    @Override // defpackage.in
    public final int an(View view) {
        return super.an(view) - ((vu) view.getLayoutParams()).h;
    }

    @Override // defpackage.in
    public final int ao(View view) {
        return super.ao(view) + ((vu) view.getLayoutParams()).a;
    }

    @Override // defpackage.in
    public final int ap(View view) {
        return super.ap(view) - ((vu) view.getLayoutParams()).g;
    }

    @Override // defpackage.in
    public final int aq(View view) {
        return super.aq(view) + ((vu) view.getLayoutParams()).b;
    }

    @Override // defpackage.in
    public final int b(ir irVar, ix ixVar) {
        vr vrVar;
        return (this.e != 0 || (vrVar = this.N) == null) ? super.b(irVar, ixVar) : vrVar.d;
    }

    final boolean bA(int i) {
        ja jaVarD = this.d.d(i);
        if (jaVarD == null) {
            return false;
        }
        View view = jaVarD.b;
        return view.getLeft() >= 0 && view.getRight() <= this.d.getWidth() && view.getTop() >= 0 && view.getBottom() <= this.d.getHeight();
    }

    final void bB() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
        }
    }

    public final void bC(int i, boolean z) {
        View viewM = M(i);
        boolean zBg = bg();
        if (!zBg && !this.d.isLayoutRequested() && viewM != null && cc(viewM) == i) {
            this.m |= 32;
            O(viewM, z);
            this.m &= -33;
            return;
        }
        int i2 = this.m;
        if ((i2 & 512) == 0 || (i2 & 64) != 0) {
            this.o = i;
            this.T = Integer.MIN_VALUE;
            return;
        }
        if (!z || this.d.isLayoutRequested()) {
            if (zBg) {
                aa();
                this.d.W();
            }
            if (!this.d.isLayoutRequested() && viewM != null && cc(viewM) == i) {
                this.m |= 32;
                O(viewM, z);
                this.m &= -33;
                return;
            } else {
                this.o = i;
                this.T = Integer.MIN_VALUE;
                this.m |= 256;
                aX();
                return;
            }
        }
        this.o = i;
        this.T = Integer.MIN_VALUE;
        if (!by()) {
            Log.w("GridLayoutManager:" + this.d.getId(), "setSelectionSmooth should not be called before first layout pass");
            return;
        }
        vs vsVar = new vs(this);
        vsVar.a = i;
        bd(vsVar);
        int i3 = vsVar.a;
        if (i3 != this.o) {
            this.o = i3;
        }
    }

    public final void bD(int i, boolean z) {
        if (this.o == i || i == -1) {
            return;
        }
        bC(i, z);
    }

    final void bE(RecyclerView recyclerView, ja jaVar, int i) {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wa) this.n.get(size)).a(recyclerView, jaVar, i);
            }
        }
    }

    @Override // defpackage.in
    public final void bd(iw iwVar) {
        aa();
        super.bd(iwVar);
        if (!iwVar.e) {
            this.p = null;
            this.q = null;
            return;
        }
        vt vtVar = (vt) iwVar;
        this.p = vtVar;
        if (vtVar instanceof vv) {
            this.q = (vv) vtVar;
        } else {
            this.q = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a A[PHI: r4
  0x006a: PHI (r4v6 int) = (r4v5 int), (r4v10 int) binds: [B:34:0x0065, B:36:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Type inference failed for: r16v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v7 */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bh(android.support.v7.widget.RecyclerView r18, java.util.ArrayList r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bh(android.support.v7.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bi(defpackage.ir r6, defpackage.ix r7, int r8, android.os.Bundle r9) {
        /*
            r5 = this;
            int r9 = r5.m
            r0 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 & r0
            r0 = 1
            if (r9 == 0) goto L87
            r5.bW(r6, r7)
            int r6 = r5.m
            r9 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r9
            int r9 = r5.e
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L2e
            sl r9 = defpackage.sl.h
            int r9 = r9.a()
            if (r8 != r9) goto L23
            if (r6 == 0) goto L36
            goto L40
        L23:
            sl r9 = defpackage.sl.j
            int r9 = r9.a()
            if (r8 != r9) goto L41
            if (r6 == 0) goto L40
            goto L36
        L2e:
            sl r6 = defpackage.sl.g
            int r6 = r6.a()
            if (r8 != r6) goto L38
        L36:
            r8 = r1
            goto L41
        L38:
            sl r6 = defpackage.sl.i
            int r6 = r6.a()
            if (r8 != r6) goto L41
        L40:
            r8 = r2
        L41:
            int r6 = r5.o
            r9 = 0
            if (r6 != 0) goto L4f
            if (r8 != r1) goto L4c
            r6 = r9
            r3 = r0
            r8 = r1
            goto L50
        L4c:
            r6 = r9
            r3 = r6
            goto L50
        L4f:
            r3 = r9
        L50:
            int r7 = r7.a()
            r4 = -1
            int r7 = r7 + r4
            if (r6 != r7) goto L5d
            if (r8 != r2) goto L5d
            r6 = r0
            r8 = r2
            goto L5e
        L5d:
            r6 = r9
        L5e:
            if (r3 != 0) goto L76
            if (r6 == 0) goto L63
            goto L76
        L63:
            if (r8 == r2) goto L6f
            if (r8 == r1) goto L68
            goto L84
        L68:
            r5.L(r9)
            r5.r(r9, r4)
            goto L84
        L6f:
            r5.L(r0)
            r5.r(r9, r0)
            goto L84
        L76:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            vp r7 = r5.d
            r7.onInitializeAccessibilityEvent(r6)
            vp r7 = r5.d
            r7.requestSendAccessibilityEvent(r7, r6)
        L84:
            r5.bS()
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bi(ir, ix, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.in
    public final boolean bj(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    @Override // defpackage.in
    public final void bs(ig igVar) {
        if (igVar != null) {
            bQ();
            this.o = -1;
            this.T = 0;
        }
    }

    @Override // defpackage.in
    public final boolean bt(RecyclerView recyclerView, View view, View view2) {
        if ((this.m & 32768) == 0 && cc(view) != -1 && (this.m & 35) == 0) {
            bX(view, view2, true);
        }
        return true;
    }

    public final boolean bw() {
        return ar() == 0 || this.d.d(0) != null;
    }

    public final boolean bx() {
        int iAr = ar();
        return iAr == 0 || this.d.d(iAr + (-1)) != null;
    }

    final boolean by() {
        return this.N != null;
    }

    final boolean bz() {
        ArrayList arrayList = this.n;
        return arrayList != null && arrayList.size() > 0;
    }

    public final int c(int i) {
        int iBK = 0;
        if ((this.m & 524288) == 0) {
            int iBK2 = 0;
            while (iBK < i) {
                iBK2 += bK(iBK) + this.K;
                iBK++;
            }
            return iBK2;
        }
        int i2 = this.M;
        while (true) {
            i2--;
            if (i2 <= i) {
                return iBK;
            }
            iBK += bK(i2) + this.K;
        }
    }

    @Override // defpackage.in
    public final int d(int i, ir irVar, ix ixVar) {
        if ((this.m & 512) == 0 || !by()) {
            return 0;
        }
        bW(irVar, ixVar);
        this.m = (this.m & (-4)) | 2;
        int iBN = this.e == 0 ? bN(i) : bO(i);
        bS();
        this.m &= -4;
        return iBN;
    }

    @Override // defpackage.in
    public final int e(int i, ir irVar, ix ixVar) {
        int i2 = this.m;
        if ((i2 & 512) == 0 || !by()) {
            return 0;
        }
        this.m = (i2 & (-4)) | 2;
        bW(irVar, ixVar);
        int iBN = this.e == 1 ? bN(i) : bO(i);
        bS();
        this.m &= -4;
        return iBN;
    }

    @Override // defpackage.in
    public final io f() {
        return new vu();
    }

    @Override // defpackage.in
    public final io g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vu ? new vu((vu) layoutParams) : layoutParams instanceof io ? new vu((io) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new vu((ViewGroup.MarginLayoutParams) layoutParams) : new vu(layoutParams);
    }

    @Override // defpackage.in
    public final io h(Context context, AttributeSet attributeSet) {
        return new vu(context, attributeSet);
    }

    public final int i(View view) {
        return this.R.a(view);
    }

    public final int k(View view) {
        return this.R.d(view);
    }

    public final int l(View view) {
        Rect rect = Q;
        aM(view, rect);
        return this.e == 0 ? rect.width() : rect.height();
    }

    @Override // defpackage.in
    public final void m(ir irVar, ix ixVar, sm smVar) {
        bW(irVar, ixVar);
        int iA = ixVar.a();
        int i = this.m;
        int i2 = 262144 & i;
        if ((i & 2048) == 0 || (iA > 1 && !bA(0))) {
            if (this.e == 0) {
                smVar.e(i2 != 0 ? sl.j : sl.h);
            } else {
                smVar.e(sl.g);
            }
            smVar.n();
        }
        if ((this.m & 4096) == 0 || (iA > 1 && !bA(iA - 1))) {
            if (this.e == 0) {
                smVar.e(i2 != 0 ? sl.h : sl.j);
            } else {
                smVar.e(sl.i);
            }
            smVar.n();
        }
        smVar.i(asv.ab(b(irVar, ixVar), a(irVar, ixVar)));
        smVar.h(GridView.class.getName());
        bS();
    }

    @Override // defpackage.in
    public final void n(ir irVar, ix ixVar, View view, sm smVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.N == null || !(layoutParams instanceof vu)) {
            return;
        }
        int iA = ((vu) layoutParams).a();
        int iE = iA >= 0 ? this.N.e(iA) : -1;
        if (iE >= 0) {
            int i = iA / this.N.d;
            if (this.e == 0) {
                smVar.j(asv.aa(iE, 1, i, 1));
            } else {
                smVar.j(asv.aa(i, 1, iE, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0265 A[LOOP:3: B:115:0x0263->B:116:0x0265, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x027d A[LOOP:4: B:119:0x027d->B:332:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0366 A[LOOP:13: B:164:0x0366->B:357:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0541 A[PHI: r1
  0x0541: PHI (r1v28 int) = (r1v27 int), (r1v45 int) binds: [B:281:0x052b, B:287:0x053b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x056c A[PHI: r1 r2
  0x056c: PHI (r1v39 int) = (r1v35 int), (r1v42 int) binds: [B:311:0x0599, B:299:0x056a] A[DONT_GENERATE, DONT_INLINE]
  0x056c: PHI (r2v44 int) = (r2v40 int), (r2v47 int) binds: [B:311:0x0599, B:299:0x056a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05a9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.in
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.ir r25, defpackage.ix r26) {
        /*
            Method dump skipped, instructions count: 1454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.o(ir, ix):void");
    }

    public final int r(boolean z, int i) {
        vr vrVar = this.N;
        if (vrVar == null) {
            return i;
        }
        int i2 = this.o;
        int iE = i2 != -1 ? vrVar.e(i2) : -1;
        int iAl = al();
        View view = null;
        for (int i3 = 0; i3 < iAl && i != 0; i3++) {
            int i4 = i > 0 ? i3 : (iAl - 1) - i3;
            View viewAB = aB(i4);
            if (ag(viewAB)) {
                int iBI = bI(i4);
                int iE2 = this.N.e(iBI);
                if (iE == -1) {
                    i2 = iBI;
                    view = viewAB;
                    iE = iE2;
                } else if (iE2 == iE && ((i > 0 && iBI > i2) || (i < 0 && iBI < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = iBI;
                    view = viewAB;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (be()) {
                    this.m |= 32;
                    view.requestFocus();
                    this.m &= -33;
                }
                this.o = i2;
                return i;
            }
            O(view, true);
        }
        return i;
    }

    @Override // defpackage.in
    public final boolean s(io ioVar) {
        return ioVar instanceof vu;
    }

    @Override // defpackage.in
    public final boolean u() {
        return true;
    }

    public final View v(int i) {
        View viewB = this.l.b(i);
        vu vuVar = (vu) viewB.getLayoutParams();
        this.d.e(viewB);
        vuVar.l = null;
        return viewB;
    }

    @Override // defpackage.in
    public final void w(int i, int i2) {
        vr vrVar;
        int i3;
        int i4 = this.o;
        if (i4 == -1 || (vrVar = this.N) == null || vrVar.e < 0 || (i3 = this.T) == Integer.MIN_VALUE || i > i4 + i3) {
            return;
        }
        this.T = i3 + i2;
    }

    @Override // defpackage.in
    public final void x() {
        this.T = 0;
    }

    @Override // defpackage.in
    public final void y(int i, int i2) {
        vr vrVar;
        int i3;
        int i4;
        int i5 = this.o;
        if (i5 == -1 || (vrVar = this.N) == null || vrVar.e < 0 || (i3 = this.T) == Integer.MIN_VALUE || i > (i4 = i5 + i3)) {
            return;
        }
        if (i + i2 <= i4) {
            this.T = i3 - i2;
        } else {
            this.o = i5 + i3 + (i - i4);
            this.T = Integer.MIN_VALUE;
        }
    }

    public GridLayoutManager(vp vpVar) {
        this.b = 1.0f;
        this.c = 10;
        this.e = 0;
        this.R = new id(this);
        this.i = new SparseIntArray();
        this.m = 221696;
        this.n = null;
        this.o = -1;
        this.T = 0;
        this.L = 8388659;
        this.Y = 1;
        this.O = new wo();
        this.ac = new ael();
        this.aa = new int[2];
        this.P = new qp(null);
        this.ab = new ki(this, 7, null);
        this.ad = new byj(this, null);
        this.d = vpVar;
        this.G = -1;
        if (this.x) {
            this.x = false;
            this.y = 0;
            RecyclerView recyclerView = this.s;
            if (recyclerView != null) {
                recyclerView.f.m();
            }
        }
    }

    @Override // defpackage.in
    public final void p(ix ixVar) {
    }
}
