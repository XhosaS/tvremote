package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a;
import defpackage.ahj;
import defpackage.ajo;
import defpackage.ajp;
import defpackage.ajq;
import defpackage.ajr;
import defpackage.awg;
import defpackage.awj;
import defpackage.awq;
import defpackage.awr;
import defpackage.awu;
import defpackage.awv;
import defpackage.aww;
import defpackage.awx;
import defpackage.awy;
import defpackage.awz;
import defpackage.axa;
import defpackage.axb;
import defpackage.axc;
import defpackage.ayh;
import defpackage.ayi;
import defpackage.ayj;
import defpackage.ayt;
import defpackage.aze;
import defpackage.bbe;
import defpackage.bbf;
import defpackage.bbg;
import defpackage.oe;
import defpackage.pe;
import defpackage.pg;
import defpackage.pq;
import defpackage.qd;
import defpackage.qe;
import defpackage.ql;
import defpackage.qr;
import defpackage.qs;
import defpackage.qv;
import defpackage.wt;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GridLayoutManager extends qd {
    private static final Rect Y = new Rect();
    public static final int[] a = new int[2];
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public awv R;
    public int S;
    public final bbg T;
    public final ayh U;
    public int V;
    public final bbe W;
    public ayt X;
    private int Z;
    private ArrayList aa;
    private int ab;
    private int ac;
    private int ad;
    private int[] ae;
    private int af;
    private int ag;
    private int ah;
    private final int[] ai;
    private awr aj;
    private final Runnable ak;
    private final awu al;
    public float b;
    public int c;
    public awj d;
    public int e;
    public pg f;
    public qs g;
    public int h;
    int i;
    final SparseIntArray j;
    int[] k;
    AudioManager l;
    public ql m;
    public int n;
    ArrayList o;
    public int p;
    public int q;
    public awz r;
    public axb s;

    /* compiled from: PG */
    public final class SavedState implements Parcelable {
        public static final Parcelable.Creator CREATOR = new axc();
        int a;
        Bundle b;

        public SavedState() {
            this.b = Bundle.EMPTY;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeBundle(this.b);
        }

        public SavedState(Parcel parcel) {
            this.b = Bundle.EMPTY;
            this.a = parcel.readInt();
            this.b = parcel.readBundle(GridLayoutManager.class.getClassLoader());
        }
    }

    public GridLayoutManager() {
        this(null);
    }

    private final int bQ(View view) {
        axa axaVar;
        if (view == null || (axaVar = (axa) view.getLayoutParams()) == null || axaVar.c.s()) {
            return -1;
        }
        return axaVar.c.cs();
    }

    private final int bR(int i) {
        int i2 = 3;
        int i3 = 2;
        if (this.e == 0) {
            if (i == 17) {
                return (this.n & 262144) == 0 ? 0 : 1;
            }
            if (i != 33) {
                return i != 66 ? i != 130 ? 17 : 3 : (this.n & 262144) == 0 ? 1 : 0;
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
        return (this.n & 524288) == 0 ? i3 : i2;
    }

    private final int bS(int i) {
        int i2 = this.ad;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.ae;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    private final int bT() {
        int i = (this.n & 524288) != 0 ? 0 : this.Q - 1;
        return l(i) + bS(i);
    }

    private final int bU(View view) {
        return this.e == 0 ? bV(view) : bW(view);
    }

    private final int bV(View view) {
        axa axaVar = (axa) view.getLayoutParams();
        return view.getLeft() + axaVar.a + axaVar.i;
    }

    private final int bW(View view) {
        axa axaVar = (axa) view.getLayoutParams();
        return view.getTop() + axaVar.b + axaVar.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r0
  0x001d: PHI (r0v8 int) = (r0v7 int), (r0v11 int) binds: [B:16:0x002f, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int bX(int r7) {
        /*
            r6 = this;
            int r0 = r6.n
            r1 = r0 & 64
            r2 = 1
            if (r1 != 0) goto L32
            r0 = r0 & 3
            if (r0 == r2) goto L32
            if (r7 <= 0) goto L1f
            bbg r0 = r6.T
            bbf r1 = r0.d
            boolean r1 = r1.f()
            if (r1 != 0) goto L32
            bbf r0 = r0.d
            int r0 = r0.c
            if (r7 <= r0) goto L32
        L1d:
            r7 = r0
            goto L32
        L1f:
            if (r7 >= 0) goto L32
            bbg r0 = r6.T
            bbf r1 = r0.d
            boolean r1 = r1.g()
            if (r1 != 0) goto L32
            bbf r0 = r0.d
            int r0 = r0.d
            if (r7 >= r0) goto L32
            goto L1d
        L32:
            r0 = 0
            if (r7 != 0) goto L36
            return r0
        L36:
            int r1 = -r7
            int r3 = r6.at()
            int r4 = r6.e
            if (r4 != r2) goto L4c
            r4 = r0
        L40:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.aI(r4)
            r5.offsetTopAndBottom(r1)
            int r4 = r4 + 1
            goto L40
        L4c:
            r4 = r0
        L4d:
            if (r4 >= r3) goto L59
            android.view.View r5 = r6.aI(r4)
            r5.offsetLeftAndRight(r1)
            int r4 = r4 + 1
            goto L4d
        L59:
            int r1 = r6.n
            r1 = r1 & 3
            if (r1 != r2) goto L63
            r6.bE()
            return r7
        L63:
            int r1 = r6.at()
            int r3 = r6.n
            r4 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L71
            if (r7 <= 0) goto L77
            goto L73
        L71:
            if (r7 >= 0) goto L77
        L73:
            r6.cd()
            goto L7a
        L77:
            r6.bZ()
        L7a:
            int r3 = r6.at()
            if (r3 <= r1) goto L82
            r1 = r2
            goto L83
        L82:
            r1 = r0
        L83:
            int r3 = r6.at()
            int r5 = r6.n
            r4 = r4 & r5
            if (r4 == 0) goto L8f
            if (r7 <= 0) goto L95
            goto L91
        L8f:
            if (r7 >= 0) goto L95
        L91:
            r6.ce()
            goto L98
        L95:
            r6.cf()
        L98:
            int r4 = r6.at()
            if (r4 >= r3) goto L9f
            goto La0
        L9f:
            r2 = r0
        La0:
            r0 = r1 | r2
            if (r0 == 0) goto La7
            r6.ci()
        La7:
            awj r0 = r6.d
            r0.invalidate()
            r6.bE()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bX(int):int");
    }

    private final int bY(int i) {
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = -i;
        int iAt = at();
        if (this.e == 0) {
            while (i2 < iAt) {
                aI(i2).offsetTopAndBottom(i3);
                i2++;
            }
        } else {
            while (i2 < iAt) {
                aI(i2).offsetLeftAndRight(i3);
                i2++;
            }
        }
        this.K += i;
        cj();
        this.d.invalidate();
        return i;
    }

    private final void bZ() {
        this.R.l((this.n & 262144) != 0 ? (-this.V) - this.i : this.ah + this.V + this.i, false);
    }

    private final void ca() {
        this.R = null;
        this.ae = null;
        this.n &= -1025;
    }

    private final void cb() {
        awj awjVar = this.d;
        int[] iArr = ahj.a;
        awjVar.postOnAnimation(this.ak);
    }

    private final void cc() {
        int i = this.Z - 1;
        this.Z = i;
        if (i == 0) {
            this.m = null;
            this.g = null;
            this.h = 0;
            this.i = 0;
        }
    }

    private final void cd() {
        this.R.o((this.n & 262144) != 0 ? this.ah + this.V + this.i : (-this.V) - this.i, false);
    }

    private final void ce() {
        int i = this.n;
        if ((65600 & i) == 65536) {
            awv awvVar = this.R;
            int i2 = this.p;
            int i3 = (i & 262144) != 0 ? -this.V : this.ah + this.V;
            while (true) {
                int i4 = awvVar.g;
                if (i4 < awvVar.f || i4 <= i2) {
                    break;
                }
                if (!awvVar.c) {
                    if (awvVar.b.c(i4) < i3) {
                        break;
                    }
                    awvVar.b.f(awvVar.g);
                    awvVar.g--;
                } else {
                    if (awvVar.b.c(i4) > i3) {
                        break;
                    }
                    awvVar.b.f(awvVar.g);
                    awvVar.g--;
                }
            }
            awvVar.i();
        }
    }

    private final void cf() {
        int i = this.n;
        if ((65600 & i) == 65536) {
            awv awvVar = this.R;
            int i2 = this.p;
            int i3 = (i & 262144) != 0 ? this.ah + this.V : -this.V;
            while (true) {
                int i4 = awvVar.g;
                int i5 = awvVar.f;
                if (i4 < i5 || i5 >= i2) {
                    break;
                }
                int iD = awvVar.b.d(i5);
                if (!awvVar.c) {
                    if (awvVar.b.c(awvVar.f) + iD > i3) {
                        break;
                    }
                    awvVar.b.f(awvVar.f);
                    awvVar.f++;
                } else {
                    if (awvVar.b.c(awvVar.f) - iD < i3) {
                        break;
                    }
                    awvVar.b.f(awvVar.f);
                    awvVar.f++;
                }
            }
            awvVar.i();
        }
    }

    private final void cg(ql qlVar, qs qsVar) {
        int i = this.Z;
        if (i == 0) {
            this.m = qlVar;
            this.g = qsVar;
            i = 0;
            this.h = 0;
            this.i = 0;
        }
        this.Z = i + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ch(android.view.View r8) {
        /*
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            axa r0 = (defpackage.axa) r0
            ayj r1 = r0.l
            if (r1 != 0) goto L21
            ayh r1 = r7.U
            ayg r2 = r1.c
            int r3 = r2.a
            int r2 = defpackage.ayk.a(r8, r2, r3)
            r0.i = r2
            ayg r1 = r1.b
            int r2 = r1.a
            int r8 = defpackage.ayk.a(r8, r1, r2)
            r0.j = r8
            return
        L21:
            int r2 = r7.e
            ayi[] r1 = r1.a
            int[] r3 = r0.k
            r4 = 0
            if (r3 == 0) goto L2e
            int r5 = r1.length
            int r3 = r3.length
            if (r3 == r5) goto L33
        L2e:
            int r3 = r1.length
            int[] r3 = new int[r3]
            r0.k = r3
        L33:
            r3 = r4
        L34:
            int r5 = r1.length
            if (r3 >= r5) goto L44
            int[] r5 = r0.k
            r6 = r1[r3]
            int r6 = defpackage.ayk.a(r8, r6, r2)
            r5[r3] = r6
            int r3 = r3 + 1
            goto L34
        L44:
            if (r2 != 0) goto L4d
            int[] r1 = r0.k
            r1 = r1[r4]
            r0.i = r1
            goto L53
        L4d:
            int[] r1 = r0.k
            r1 = r1[r4]
            r0.j = r1
        L53:
            int r1 = r7.e
            if (r1 != 0) goto L64
            ayh r1 = r7.U
            ayg r1 = r1.b
            int r2 = r1.a
            int r8 = defpackage.ayk.a(r8, r1, r2)
            r0.j = r8
            return
        L64:
            ayh r1 = r7.U
            ayg r1 = r1.c
            int r2 = r1.a
            int r8 = defpackage.ayk.a(r8, r1, r2)
            r0.i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.ch(android.view.View):void");
    }

    private final void ci() {
        int i = (this.n & (-1025)) | (true == ck(false) ? 1024 : 0);
        this.n = i;
        if ((i & 1024) != 0) {
            cb();
        }
    }

    private final void cj() {
        bbf bbfVar = this.T.e;
        int i = bbfVar.i - this.K;
        int iBT = bT() + i;
        bbfVar.e(i, iBT, i, iBT);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean ck(boolean r18) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.ck(boolean):boolean");
    }

    @Override // defpackage.qd
    public final void A(int i, int i2) {
        awv awvVar;
        int i3;
        int i4;
        int i5 = this.p;
        if (i5 != -1 && (awvVar = this.R) != null && awvVar.f >= 0 && (i3 = this.ab) != Integer.MIN_VALUE && i <= (i4 = i5 + i3)) {
            if (i + i2 > i4) {
                this.p = i5 + i3 + (i - i4);
                this.ab = Integer.MIN_VALUE;
            } else {
                this.ab = i3 - i2;
            }
        }
        this.W.b();
    }

    public final int I(boolean z, int i) {
        awv awvVar = this.R;
        if (awvVar == null) {
            return i;
        }
        int i2 = this.p;
        int iE = i2 != -1 ? awvVar.e(i2) : -1;
        int iAt = at();
        View view = null;
        for (int i3 = 0; i3 < iAt && i != 0; i3++) {
            int i4 = i > 0 ? i3 : (iAt - 1) - i3;
            View viewAI = aI(i4);
            if (bF(viewAI)) {
                int iBQ = bQ(aI(i4));
                int iE2 = this.R.e(iBQ);
                if (iE == -1) {
                    i2 = iBQ;
                    view = viewAI;
                    iE = iE2;
                } else if (iE2 == iE && ((i > 0 && iBQ > i2) || (i < 0 && iBQ < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = iBQ;
                    view = viewAI;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (bl()) {
                    this.n |= 32;
                    view.requestFocus();
                    this.n &= -33;
                }
                this.p = i2;
                this.q = 0;
                return i;
            }
            aa(view, view.findFocus(), true, 0, 0);
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View J(int i) {
        awr awrVar;
        awq awqVarE;
        View viewP = this.m.p(i);
        axa axaVar = (axa) viewP.getLayoutParams();
        qv qvVarL = this.d.l(viewP);
        Object objDy = qvVarL instanceof awq ? ((awq) qvVarL).dy(ayj.class) : null;
        if (objDy == null && (awrVar = this.aj) != null && (awqVarE = awrVar.e(qvVarL.f)) != null) {
            objDy = awqVarE.dy(ayj.class);
        }
        axaVar.l = (ayj) objDy;
        return viewP;
    }

    public final void K(aze azeVar) {
        if (this.aa == null) {
            this.aa = new ArrayList();
        }
        this.aa.add(azeVar);
    }

    public final void L(awg awgVar) {
        if (this.o == null) {
            this.o = new ArrayList();
        }
        this.o.add(awgVar);
    }

    public final void M() {
        if (this.X != null || bK()) {
            int i = this.p;
            View viewT = i == -1 ? null : T(i);
            if (viewT != null) {
                qv qvVarL = this.d.l(viewT);
                ayt aytVar = this.X;
                if (aytVar != null) {
                    aytVar.a(viewT);
                }
                O(this.d, qvVarL, this.p, this.q);
            } else {
                ayt aytVar2 = this.X;
                if (aytVar2 != null) {
                    aytVar2.a(null);
                }
                O(this.d, null, -1, 0);
            }
            if ((this.n & 3) == 1 || this.d.isLayoutRequested()) {
                return;
            }
            int iAt = at();
            for (int i2 = 0; i2 < iAt; i2++) {
                if (aI(i2).isLayoutRequested()) {
                    cb();
                    return;
                }
            }
        }
    }

    public final void N() {
        if (bK()) {
            int i = this.p;
            View viewT = i == -1 ? null : T(i);
            if (viewT != null) {
                bP(this.d.l(viewT), this.p);
                return;
            }
            ayt aytVar = this.X;
            if (aytVar != null) {
                aytVar.a(null);
            }
            bP(null, -1);
        }
    }

    final void O(RecyclerView recyclerView, qv qvVar, int i, int i2) {
        ArrayList arrayList = this.aa;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((aze) this.aa.get(size)).a(recyclerView, qvVar, i, i2);
            }
        }
    }

    public final void P(int i, View view, int i2, int i3, int i4) {
        int iBS;
        int i5;
        int i6;
        int iC = this.e == 0 ? c(view) : i(view);
        int i7 = this.ad;
        if (i7 > 0) {
            iC = Math.min(iC, i7);
        }
        int i8 = this.P;
        int i9 = i8 & 112;
        int absoluteGravity = (this.n & 786432) != 0 ? Gravity.getAbsoluteGravity(i8 & 8388615, 1) : i8 & 7;
        int i10 = this.e;
        if ((i10 == 0 && i9 == 48) || (i10 == 1 && absoluteGravity == 3)) {
            i5 = i4;
        } else {
            if ((i10 == 0 && i9 == 80) || (i10 == 1 && absoluteGravity == 5)) {
                iBS = bS(i) - iC;
            } else {
                if ((i10 == 0 && i9 == 16) || (i10 == 1 && absoluteGravity == 1)) {
                    iBS = (bS(i) - iC) / 2;
                }
                i5 = i4;
            }
            i5 = iBS + i4;
        }
        int i11 = iC + i5;
        int i12 = this.e;
        int i13 = 1 != i12 ? i11 : i3;
        if (1 != i12) {
            i11 = i3;
        }
        if (1 != i12) {
            i6 = i5;
        } else {
            i6 = i5;
            i5 = i2;
        }
        if (1 != i12) {
            i6 = i2;
        }
        axa axaVar = (axa) view.getLayoutParams();
        int i14 = i11;
        int i15 = i6;
        aR(view, i15, i5, i14, i13);
        Rect rect = Y;
        RecyclerView.O(view, rect);
        int i16 = i15 - rect.left;
        int i17 = i5 - rect.top;
        int i18 = rect.right - i14;
        int i19 = rect.bottom - i13;
        axaVar.a = i16;
        axaVar.b = i17;
        axaVar.g = i18;
        axaVar.h = i19;
        ch(view);
    }

    @Override // defpackage.qd
    public final Parcelable Q() {
        SavedState savedState = new SavedState();
        savedState.a = this.p;
        bbe bbeVar = this.W;
        wt wtVar = bbeVar.c;
        Bundle bundle = null;
        if (wtVar != null && wtVar.c() != 0) {
            Map mapH = bbeVar.c.h();
            bundle = new Bundle();
            for (Map.Entry entry : mapH.entrySet()) {
                bundle.putSparseParcelableArray((String) entry.getKey(), (SparseArray) entry.getValue());
            }
        }
        int iAt = at();
        for (int i = 0; i < iAt; i++) {
            View viewAI = aI(i);
            int iBQ = bQ(viewAI);
            if (iBQ != -1 && bbeVar.a != 0) {
                String string = Integer.toString(iBQ);
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                viewAI.saveHierarchyState(sparseArray);
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray(string, sparseArray);
            }
        }
        savedState.b = bundle;
        return savedState;
    }

    public final void R(View view) {
        int childMeasureSpec;
        int childMeasureSpec2;
        axa axaVar = (axa) view.getLayoutParams();
        Rect rect = Y;
        aM(view, rect);
        int i = axaVar.leftMargin + axaVar.rightMargin + rect.left + rect.right;
        int i2 = axaVar.topMargin + axaVar.bottomMargin + rect.top + rect.bottom;
        int iMakeMeasureSpec = this.ac == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.ad, 1073741824);
        if (this.e == 0) {
            childMeasureSpec = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i, axaVar.width);
            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i2, axaVar.height);
        } else {
            int childMeasureSpec3 = ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), i2, axaVar.height);
            childMeasureSpec = ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, i, axaVar.width);
            childMeasureSpec2 = childMeasureSpec3;
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
    
        r2 = 3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void S(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L9
            boolean r0 = r5.bI()
            if (r0 != 0) goto Lf
            goto L10
        L9:
            boolean r0 = r5.bH()
            if (r0 == 0) goto L10
        Lf:
            return
        L10:
            axb r0 = r5.s
            r1 = -1
            r2 = 1
            if (r0 != 0) goto L2d
            if (r2 == r6) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            axb r0 = new axb
            int r3 = r5.Q
            r4 = 0
            if (r3 <= r2) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r4
        L24:
            r0.<init>(r5, r1, r3)
            r5.ab = r4
            r5.bk(r0)
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
            if (r0 != 0) goto L5e
            android.support.v7.widget.RecyclerView r0 = r5.u
            int r0 = r0.getLayoutDirection()
            r1 = 3
            r3 = 4
            if (r0 != r2) goto L58
            if (r2 == r6) goto L5a
            goto L5c
        L58:
            if (r2 == r6) goto L5c
        L5a:
            r2 = r1
            goto L62
        L5c:
            r2 = r3
            goto L62
        L5e:
            if (r2 == r6) goto L61
            goto L62
        L61:
            r2 = 2
        L62:
            android.media.AudioManager r6 = r5.l
            if (r6 != 0) goto L76
            awj r6 = r5.d
            android.content.Context r6 = r6.getContext()
            java.lang.String r0 = "audio"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.media.AudioManager r6 = (android.media.AudioManager) r6
            r5.l = r6
        L76:
            android.media.AudioManager r6 = r5.l
            r6.playSoundEffect(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.S(boolean):void");
    }

    public final void V(aze azeVar) {
        ArrayList arrayList = this.aa;
        if (arrayList != null) {
            arrayList.remove(azeVar);
        }
    }

    public final void W(awg awgVar) {
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            arrayList.remove(awgVar);
        }
    }

    @Override // defpackage.qd
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.p = savedState.a;
            this.ab = 0;
            bbe bbeVar = this.W;
            Bundle bundle = savedState.b;
            wt wtVar = bbeVar.c;
            if (wtVar != null && bundle != null) {
                wtVar.i(-1);
                for (String str : bundle.keySet()) {
                    bbeVar.c.f(str, bundle.getSparseParcelableArray(str));
                }
            }
            this.n |= 256;
            be();
        }
    }

    @Override // defpackage.qd
    public final void Z(int i) {
        bO(i, false);
    }

    @Override // defpackage.qd
    public final int aA(View view) {
        return (view.getTop() - aF(view)) + ((axa) view.getLayoutParams()).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View aK(android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.aK(android.view.View, int):android.view.View");
    }

    @Override // defpackage.qd
    public final void aQ(View view, Rect rect) {
        RecyclerView.O(view, rect);
        axa axaVar = (axa) view.getLayoutParams();
        rect.left += axaVar.a;
        rect.top += axaVar.b;
        rect.right -= axaVar.g;
        rect.bottom -= axaVar.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qd
    public final void aU(pq pqVar, pq pqVar2) {
        if (pqVar != null) {
            ca();
            this.p = -1;
            this.ab = 0;
            this.W.b();
        }
        if (pqVar2 instanceof awr) {
            this.aj = (awr) pqVar2;
        } else {
            this.aj = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aX(defpackage.ql r7, defpackage.qs r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.aX(ql, qs, int, int):void");
    }

    public final void aa(View view, View view2, boolean z, int i, int i2) {
        if ((this.n & 64) != 0) {
            return;
        }
        int iBQ = bQ(view);
        int iS = s(view, view2);
        if (iBQ != this.p || iS != this.q) {
            this.p = iBQ;
            this.q = iS;
            this.ab = 0;
            if ((this.n & 3) != 1) {
                M();
            }
            if (this.d.aE()) {
                this.d.invalidate();
            }
        }
        if (view != null) {
            if (!view.hasFocus() && this.d.hasFocus()) {
                view.requestFocus();
            }
            if ((this.n & 131072) == 0) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            int[] iArr = a;
            if (!bG(view, view2, iArr) && i == 0) {
                if (i2 == 0) {
                    return;
                } else {
                    i = 0;
                }
            }
            int i3 = iArr[0] + i;
            int i4 = iArr[1] + i2;
            if ((this.n & 3) == 1) {
                bX(i3);
                bY(i4);
                return;
            }
            int i5 = this.e;
            int i6 = 1 != i5 ? i4 : i3;
            if (1 == i5) {
                i3 = i4;
            }
            if (z) {
                this.d.aA(i3, i6, false);
            } else {
                this.d.scrollBy(i3, i6);
                N();
            }
        }
    }

    public final void ab(boolean z, boolean z2) {
        this.n = (true != z ? 0 : 2048) | (this.n & (-6145)) | (true == z2 ? 4096 : 0);
    }

    public final void ac(int i) {
        int i2 = this.e;
        this.L = i;
        if (i2 == 0) {
            this.N = i;
        } else {
            this.O = i;
        }
    }

    @Override // defpackage.qd
    public final boolean ad() {
        return this.e == 0 || this.Q > 1;
    }

    @Override // defpackage.qd
    public final boolean ae() {
        return this.e == 1 || this.Q > 1;
    }

    final void ag(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.ag = i;
    }

    public final void ai(aze azeVar) {
        if (azeVar == null) {
            this.aa = null;
            return;
        }
        ArrayList arrayList = this.aa;
        if (arrayList == null) {
            this.aa = new ArrayList();
        } else {
            arrayList.clear();
        }
        this.aa.add(azeVar);
    }

    @Override // defpackage.qd
    public final void ak(int i, int i2, qs qsVar, oe oeVar) {
        try {
            cg(null, qsVar);
            if (1 == this.e) {
                i = i2;
            }
            if (at() != 0 && i != 0) {
                this.R.q(i < 0 ? -this.V : this.ah + this.V, i, oeVar);
            }
        } finally {
            cc();
        }
    }

    @Override // defpackage.qd
    public final void al(int i, oe oeVar) {
        int i2 = this.d.af;
        if (i == 0 || i2 == 0) {
            return;
        }
        int iMax = Math.max(0, Math.min(this.p - ((i2 - 1) / 2), i - i2));
        for (int i3 = iMax; i3 < i && i3 < iMax + i2; i3++) {
            oeVar.a(i3, 0);
        }
    }

    public final void am(int i) {
        bbf bbfVar;
        if (i != 0) {
            i = 1;
        }
        this.e = i;
        this.f = pg.p(this, i);
        bbg bbgVar = this.T;
        bbgVar.a = i;
        if (i == 0) {
            bbgVar.d = bbgVar.c;
            bbfVar = bbgVar.b;
        } else {
            bbgVar.d = bbgVar.b;
            bbfVar = bbgVar.c;
        }
        bbgVar.e = bbfVar;
        ayh ayhVar = this.U;
        ayhVar.a = i;
        ayhVar.d = i == 0 ? ayhVar.c : ayhVar.b;
        this.n |= 256;
    }

    public final void an(boolean z) {
        int i = this.n;
        if (((i & 65536) != 0) != z) {
            this.n = (i & (-65537)) | (true != z ? 0 : 65536);
            if (z) {
                be();
            }
        }
    }

    final void ap(int i) {
        if (i < 0 && i != -2) {
            throw new IllegalArgumentException(a.b(i, "Invalid row height: "));
        }
        this.ac = i;
    }

    @Override // defpackage.qd
    public final void aq(RecyclerView recyclerView, int i) {
        bO(i, true);
    }

    @Override // defpackage.qd
    public final int av(View view) {
        return (view.getBottom() + as(view)) - ((axa) view.getLayoutParams()).h;
    }

    @Override // defpackage.qd
    public final int aw(View view) {
        return (view.getLeft() - aC(view)) + ((axa) view.getLayoutParams()).a;
    }

    @Override // defpackage.qd
    public final int az(View view) {
        return (view.getRight() + aE(view)) - ((axa) view.getLayoutParams()).g;
    }

    public final void bA(int i) {
        int i2 = this.e;
        this.M = i;
        if (i2 == 1) {
            this.N = i;
        } else {
            this.O = i;
        }
    }

    final void bB() {
        awz awzVar = this.r;
        if (awzVar != null) {
            awzVar.n = true;
        }
    }

    public final void bC() {
        int iAt = at();
        for (int i = 0; i < iAt; i++) {
            ch(aI(i));
        }
    }

    final void bD() {
        if (at() <= 0) {
            this.h = 0;
        } else {
            this.h = this.R.f - ((axa) aI(0).getLayoutParams()).c.c();
        }
    }

    public final void bE() {
        int iA;
        int i;
        int i2;
        int i3;
        int iA2;
        int iBU;
        int iC;
        int iBU2;
        int length;
        if (this.g.a() == 0) {
            return;
        }
        if ((this.n & 262144) == 0) {
            i = this.R.g;
            int iA3 = this.g.a() - 1;
            i2 = this.R.f;
            i3 = iA3;
            iA = 0;
        } else {
            awv awvVar = this.R;
            int i4 = awvVar.f;
            int i5 = awvVar.g;
            iA = this.g.a() - 1;
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
            bbg bbgVar = this.T;
            if (bbgVar.d.f() && !z2 && bbgVar.d.g()) {
                return;
            }
        }
        if (z) {
            awv awvVar2 = this.R;
            int[] iArr = a;
            iA2 = awvVar2.a(true, iArr);
            View viewT = T(iArr[1]);
            iBU = bU(viewT);
            int[] iArr2 = ((axa) viewT.getLayoutParams()).k;
            if (iArr2 != null && (length = iArr2.length) > 0) {
                iBU += iArr2[length - 1] - iArr2[0];
            }
        } else {
            iA2 = Integer.MAX_VALUE;
            iBU = Integer.MAX_VALUE;
        }
        if (z2) {
            awv awvVar3 = this.R;
            int[] iArr3 = a;
            iC = awvVar3.c(false, iArr3);
            iBU2 = bU(T(iArr3[1]));
        } else {
            iC = Integer.MIN_VALUE;
            iBU2 = Integer.MIN_VALUE;
        }
        this.T.d.e(iC, iA2, iBU2, iBU);
    }

    public final boolean bF(View view) {
        if (view.getVisibility() == 0) {
            return !bl() || view.hasFocusable();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bG(android.view.View r12, android.view.View r13, int[] r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bG(android.view.View, android.view.View, int[]):boolean");
    }

    public final boolean bH() {
        return aB() == 0 || this.d.j(0) != null;
    }

    public final boolean bI() {
        int iAB = aB();
        return iAB == 0 || this.d.j(iAB + (-1)) != null;
    }

    final boolean bJ() {
        return this.R != null;
    }

    final boolean bK() {
        ArrayList arrayList = this.aa;
        return arrayList != null && arrayList.size() > 0;
    }

    final boolean bL(int i) {
        qv qvVarJ = this.d.j(i);
        if (qvVarJ == null) {
            return false;
        }
        View view = qvVarJ.a;
        return view.getLeft() >= 0 && view.getRight() <= this.d.getWidth() && view.getTop() >= 0 && view.getBottom() <= this.d.getHeight();
    }

    public final boolean bM() {
        return (this.n & 64) != 0;
    }

    public final void bN(int i, int i2, boolean z) {
        View viewT = T(i);
        boolean zBn = bn();
        if (!zBn && !this.d.isLayoutRequested() && viewT != null && bQ(viewT) == i) {
            this.n |= 32;
            aa(viewT, viewT.findFocus(), z, 0, 0);
            this.n &= -33;
            return;
        }
        int i3 = this.n;
        if ((i3 & 512) == 0 || (i3 & 64) != 0) {
            this.p = i;
            this.q = i2;
            this.ab = Integer.MIN_VALUE;
            return;
        }
        if (!z || this.d.isLayoutRequested()) {
            if (zBn) {
                bB();
                this.d.ao();
            }
            if (!this.d.isLayoutRequested() && viewT != null && bQ(viewT) == i) {
                this.n |= 32;
                aa(viewT, viewT.findFocus(), z, 0, 0);
                this.n &= -33;
                return;
            } else {
                this.p = i;
                this.q = i2;
                this.ab = Integer.MIN_VALUE;
                this.n |= 256;
                be();
                return;
            }
        }
        this.p = i;
        this.q = i2;
        this.ab = Integer.MIN_VALUE;
        if (!bJ()) {
            Log.w("GridLayoutManager:" + this.d.getId(), "setSelectionSmooth should not be called before first layout pass");
            return;
        }
        awy awyVar = new awy(this);
        awyVar.g = i;
        bk(awyVar);
        int i4 = awyVar.g;
        if (i4 != this.p) {
            this.p = i4;
            this.q = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void bO(int r2, boolean r3) {
        /*
            r1 = this;
            int r0 = r1.p
            if (r0 == r2) goto L8
            r0 = -1
            if (r2 != r0) goto Ld
            r2 = r0
        L8:
            int r0 = r1.q
            if (r0 != 0) goto Ld
            return
        Ld:
            r0 = 0
            r1.bN(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bO(int, boolean):void");
    }

    final void bP(qv qvVar, int i) {
        ArrayList arrayList = this.aa;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((aze) this.aa.get(size)).b(qvVar, i);
            }
        }
    }

    @Override // defpackage.qd
    public final void ba(ql qlVar) {
        int iAt = at();
        while (true) {
            iAt--;
            if (iAt < 0) {
                return;
            } else {
                bc(iAt, qlVar);
            }
        }
    }

    @Override // defpackage.qd
    public final void bk(qr qrVar) {
        bB();
        super.bk(qrVar);
        if (!qrVar.k || !(qrVar instanceof awz)) {
            this.r = null;
            this.s = null;
            return;
        }
        awz awzVar = (awz) qrVar;
        this.r = awzVar;
        if (awzVar instanceof axb) {
            this.s = (axb) awzVar;
        } else {
            this.s = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[PHI: r4
  0x006e: PHI (r4v6 int) = (r4v5 int), (r4v10 int) binds: [B:34:0x0069, B:36:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6, types: [boolean] */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bo(android.support.v7.widget.RecyclerView r19, java.util.ArrayList r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bo(android.support.v7.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean bp(defpackage.ql r6, defpackage.qs r7, int r8, android.os.Bundle r9) {
        /*
            r5 = this;
            int r9 = r5.n
            r0 = 131072(0x20000, float:1.83671E-40)
            r9 = r9 & r0
            r0 = 1
            if (r9 == 0) goto L87
            r5.cg(r6, r7)
            int r6 = r5.n
            r9 = 262144(0x40000, float:3.67342E-40)
            r6 = r6 & r9
            int r9 = r5.e
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 4096(0x1000, float:5.74E-42)
            if (r9 != 0) goto L2e
            ajo r9 = defpackage.ajo.h
            int r9 = r9.a()
            if (r8 != r9) goto L23
            if (r6 == 0) goto L36
            goto L40
        L23:
            ajo r9 = defpackage.ajo.j
            int r9 = r9.a()
            if (r8 != r9) goto L41
            if (r6 == 0) goto L40
            goto L36
        L2e:
            ajo r6 = defpackage.ajo.g
            int r6 = r6.a()
            if (r8 != r6) goto L38
        L36:
            r8 = r1
            goto L41
        L38:
            ajo r6 = defpackage.ajo.i
            int r6 = r6.a()
            if (r8 != r6) goto L41
        L40:
            r8 = r2
        L41:
            int r6 = r5.p
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
            r5.S(r9)
            r5.I(r9, r4)
            goto L84
        L6f:
            r5.S(r0)
            r5.I(r9, r0)
            goto L84
        L76:
            android.view.accessibility.AccessibilityEvent r6 = android.view.accessibility.AccessibilityEvent.obtain(r2)
            awj r7 = r5.d
            r7.onInitializeAccessibilityEvent(r6)
            awj r7 = r5.d
            r7.requestSendAccessibilityEvent(r7, r6)
        L84:
            r5.cc()
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.bp(ql, qs, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.qd
    public final boolean bq(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    @Override // defpackage.qd
    public final void bu(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.W.c(i3);
        }
    }

    @Override // defpackage.qd
    public final boolean bv(RecyclerView recyclerView, View view, View view2) {
        if ((this.n & 32768) != 0 || bQ(view) == -1 || (this.n & 35) != 0) {
            return true;
        }
        aa(view, view2, true, 0, 0);
        return true;
    }

    public final void bz(boolean z) {
        int i;
        int i2 = this.n;
        if (((i2 & 131072) != 0) != z) {
            int i3 = (i2 & (-131073)) | (true == z ? 131072 : 0);
            this.n = i3;
            if ((i3 & 131072) == 0 || this.S != 0 || (i = this.p) == -1) {
                return;
            }
            bN(i, this.q, true);
        }
    }

    public final int c(View view) {
        axa axaVar = (axa) view.getLayoutParams();
        return ax(view) + axaVar.topMargin + axaVar.bottomMargin;
    }

    @Override // defpackage.qd
    public final int d(int i, ql qlVar, qs qsVar) {
        if ((this.n & 512) == 0 || !bJ()) {
            return 0;
        }
        cg(qlVar, qsVar);
        this.n = (this.n & (-4)) | 2;
        int iBX = this.e == 0 ? bX(i) : bY(i);
        cc();
        this.n &= -4;
        return iBX;
    }

    @Override // defpackage.qd
    public final int e(int i, ql qlVar, qs qsVar) {
        int i2 = this.n;
        if ((i2 & 512) == 0 || !bJ()) {
            return 0;
        }
        this.n = (i2 & (-4)) | 2;
        cg(qlVar, qsVar);
        int iBX = this.e == 1 ? bX(i) : bY(i);
        cc();
        this.n &= -4;
        return iBX;
    }

    @Override // defpackage.qd
    public final int eF(ql qlVar, qs qsVar) {
        awv awvVar;
        return (this.e != 1 || (awvVar = this.R) == null) ? super.eF(qlVar, qsVar) : awvVar.e;
    }

    @Override // defpackage.qd
    public final int eG(ql qlVar, qs qsVar) {
        awv awvVar;
        return (this.e != 0 || (awvVar = this.R) == null) ? super.eG(qlVar, qsVar) : awvVar.e;
    }

    @Override // defpackage.qd
    public final qe eH(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof axa ? new axa((axa) layoutParams) : layoutParams instanceof qe ? new axa((qe) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new axa((ViewGroup.MarginLayoutParams) layoutParams) : new axa(layoutParams);
    }

    @Override // defpackage.qd
    public final void eJ(ql qlVar, qs qsVar, ajr ajrVar) {
        cg(qlVar, qsVar);
        int iA = qsVar.a();
        int i = this.n;
        int i2 = 262144 & i;
        if ((i & 2048) == 0 || (iA > 1 && !bL(0))) {
            if (this.e == 0) {
                ajrVar.c(i2 != 0 ? ajo.j : ajo.h);
            } else {
                ajrVar.c(ajo.g);
            }
            ajrVar.j();
        }
        if ((this.n & 4096) == 0 || (iA > 1 && !bL(iA - 1))) {
            if (this.e == 0) {
                ajrVar.c(i2 != 0 ? ajo.h : ajo.j);
            } else {
                ajrVar.c(ajo.i);
            }
            ajrVar.j();
        }
        ajrVar.d(ajp.a(eG(qlVar, qsVar), eF(qlVar, qsVar)));
        ajrVar.a.setClassName(GridView.class.getName());
        cc();
    }

    @Override // defpackage.qd
    public final void eK(ql qlVar, qs qsVar, View view, ajr ajrVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.R == null || !(layoutParams instanceof axa)) {
            return;
        }
        int iCs = ((axa) layoutParams).c.cs();
        int iE = iCs >= 0 ? this.R.e(iCs) : -1;
        if (iE >= 0) {
            int i = iCs / this.R.e;
            if (this.e == 0) {
                ajrVar.e(ajq.b(iE, 1, i, 1, false));
            } else {
                ajrVar.e(ajq.b(i, 1, iE, 1, false));
            }
        }
    }

    @Override // defpackage.qd
    public final qe f() {
        return new axa();
    }

    @Override // defpackage.qd
    public final qe h(Context context, AttributeSet attributeSet) {
        return new axa(context, attributeSet);
    }

    public final int i(View view) {
        axa axaVar = (axa) view.getLayoutParams();
        return ay(view) + axaVar.leftMargin + axaVar.rightMargin;
    }

    public final int k(View view) {
        return this.T.d.c(bU(view));
    }

    public final int l(int i) {
        int iBS = 0;
        if ((this.n & 524288) == 0) {
            int iBS2 = 0;
            while (iBS < i) {
                iBS2 += bS(iBS) + this.O;
                iBS++;
            }
            return iBS2;
        }
        int i2 = this.Q;
        while (true) {
            i2--;
            if (i2 <= i) {
                return iBS;
            }
            iBS += bS(i2) + this.O;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x028d A[LOOP:3: B:118:0x028b->B:119:0x028d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a5 A[LOOP:4: B:122:0x02a5->B:340:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0396 A[LOOP:13: B:167:0x0396->B:364:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0580 A[PHI: r1
  0x0580: PHI (r1v29 int) = (r1v28 int), (r1v46 int) binds: [B:287:0x0564, B:295:0x057a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05ab A[PHI: r1 r2
  0x05ab: PHI (r1v40 int) = (r1v36 int), (r1v43 int) binds: [B:319:0x05d8, B:307:0x05a9] A[DONT_GENERATE, DONT_INLINE]
  0x05ab: PHI (r2v45 int) = (r2v41 int), (r2v48 int) binds: [B:319:0x05d8, B:307:0x05a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.qd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.ql r26, defpackage.qs r27) {
        /*
            Method dump skipped, instructions count: 1517
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.GridLayoutManager.o(ql, qs):void");
    }

    @Override // defpackage.qd
    public final void p(qs qsVar) {
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((awg) this.o.get(size)).a(qsVar);
            }
        }
    }

    public final int r(View view) {
        return this.T.e.c(this.e == 0 ? bW(view) : bV(view));
    }

    public final int s(View view, View view2) {
        ayj ayjVar;
        if (view != null && view2 != null && (ayjVar = ((axa) view.getLayoutParams()).l) != null) {
            ayi[] ayiVarArr = ayjVar.a;
            if (ayiVarArr.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i = 1; i < ayiVarArr.length; i++) {
                            ayi ayiVar = ayiVarArr[i];
                            int i2 = ayiVar.c;
                            if (ayiVar.b == id) {
                                return i;
                            }
                        }
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    @Override // defpackage.qd
    public final boolean t(qe qeVar) {
        return qeVar instanceof axa;
    }

    @Override // defpackage.qd
    public final boolean v() {
        return true;
    }

    public final int w(View view) {
        Rect rect = Y;
        aQ(view, rect);
        return this.e == 0 ? rect.width() : rect.height();
    }

    @Override // defpackage.qd
    public final void x(int i, int i2) {
        awv awvVar;
        int i3;
        int i4 = this.p;
        if (i4 != -1 && (awvVar = this.R) != null && awvVar.f >= 0 && (i3 = this.ab) != Integer.MIN_VALUE && i <= i4 + i3) {
            this.ab = i3 + i2;
        }
        this.W.b();
    }

    @Override // defpackage.qd
    public final void y() {
        this.ab = 0;
        this.W.b();
    }

    @Override // defpackage.qd
    public final void z(int i, int i2) {
        int i3;
        int i4;
        int i5 = this.p;
        if (i5 != -1 && (i3 = this.ab) != Integer.MIN_VALUE) {
            int i6 = i5 + i3;
            if (i <= i6 && i6 < i + 1) {
                i4 = i3 + (i2 - i);
            } else if (i < i6 && i2 > i6 - 1) {
                i4 = i3 - 1;
            } else if (i > i6 && i2 < i6) {
                i4 = i3 + 1;
            }
            this.ab = i4;
        }
        this.W.b();
    }

    public GridLayoutManager(awj awjVar) {
        this.b = 1.0f;
        this.c = 10;
        this.e = 0;
        this.f = new pe(this);
        this.j = new SparseIntArray();
        this.n = 221696;
        this.X = null;
        this.aa = null;
        this.o = null;
        this.p = -1;
        this.q = 0;
        this.ab = 0;
        this.P = 8388659;
        this.ag = 1;
        this.S = 0;
        this.T = new bbg();
        this.U = new ayh();
        this.ai = new int[2];
        this.W = new bbe();
        this.ak = new aww(this);
        this.al = new awx(this);
        this.d = awjVar;
        this.J = -1;
        bg(false);
    }
}
