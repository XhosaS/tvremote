package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.nestedscroll.NestedScrollElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmv extends ViewGroup implements cvo, bak, caa, cvq {
    public static final yjv a = ccu.g;
    private final int[] A;
    private final cvp B;
    private final bie C;
    private final int D;
    private final String E;
    private gmz F;
    public final bse b;
    public final View c;
    public final bzz d;
    public yjk e;
    public boolean f;
    public yjk g;
    public bkp h;
    public final yjv i;
    public clx j;
    public final yjv k;
    public dvk l;
    public ghe m;
    public final int[] n;
    public long o;
    public cyh p;
    public final yjk q;
    public final yjv r;
    public int s;
    public int t;
    public boolean u;
    public final bys v;
    public final View w;
    public yjv x;
    public yjv y;
    private final yjk z;

    public cmv(Context context, baw bawVar, View view, bse bseVar, bie bieVar, int i, bzz bzzVar) {
        super(context);
        this.b = bseVar;
        this.c = view;
        this.d = bzzVar;
        cec.b(this, bawVar);
        setSaveFromParentEnabled(false);
        addView(view);
        cmr cmrVar = new cmr(this);
        int[] iArr = cww.a;
        nxb.q(this, cmrVar);
        cwm.l(this, this);
        this.e = cmu.c;
        this.g = cmu.a;
        this.h = bkp.g;
        this.j = new cly(1.0f, 1.0f);
        this.n = new int[2];
        this.o = 0L;
        this.q = new cdq(this, 6);
        this.z = new cdq(this, 5);
        this.A = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.B = new cvp();
        bys bysVar = new bys(false, 3, 0 == true ? 1 : 0);
        bysVar.j = this;
        bkp bkpVarB = cfd.b(new NestedScrollElement(cmx.a, bseVar), true, ccu.i);
        btf btfVar = new btf();
        btfVar.a = new brj(this, 7);
        btj btjVar = new btj();
        btj btjVar2 = btfVar.b;
        if (btjVar2 != null) {
            btjVar2.a = null;
        }
        btfVar.b = btjVar;
        btj btjVar3 = btfVar.b;
        if (btjVar3 != null) {
            btjVar3.a = btfVar;
        }
        this.r = btjVar;
        bkp bkpVarT = fh.T(bga.s(bkpVarB.a(btfVar), new ma(this, bysVar, this, 5)), new lz(this, bysVar, 19, null));
        bysVar.X(this.h.a(bkpVarT));
        this.i = new lz(bysVar, bkpVarT, 16, null);
        bysVar.V(this.j);
        this.k = new cbq(bysVar, 10);
        bysVar.w = new lz(this, bysVar, 17, null);
        bysVar.x = new cbq(this, 11);
        bysVar.W(new cms(this, bysVar));
        this.v = bysVar;
        this.w = view;
        this.C = bieVar;
        this.D = i;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        this.E = strValueOf;
        Object objA = bieVar != null ? bieVar.a(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objA instanceof SparseArray ? (SparseArray) objA : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (bieVar != null) {
            i(bieVar.f(strValueOf, new dji(this, 1)));
        }
        yjv yjvVar = cna.a;
        this.x = yjvVar;
        this.y = yjvVar;
    }

    public static final csr g(csr csrVar, int i, int i2, int i3, int i4) {
        int i5 = csrVar.b - i;
        int i6 = csrVar.c - i2;
        int i7 = csrVar.d - i3;
        int i8 = csrVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return csr.e(i5, i6, i7, i8);
    }

    public static final int h(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(ykn.l(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.bak
    public final void a() {
        removeAllViewsInLayout();
    }

    @Override // defpackage.bak
    public final void b() {
        this.g.a();
    }

    @Override // defpackage.bak
    public final void c() {
        View view = this.c;
        if (view.getParent() != this) {
            addView(view);
        }
    }

    public final cab d() {
        if (!isAttachedToWindow()) {
            bty.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.i();
    }

    public final cyh e(cyh cyhVar) {
        csr csrVarF = cyhVar.f(-1);
        csr csrVar = csr.a;
        if (csrVarF.equals(csrVar) && cyhVar.g(-9).equals(csrVar) && cyhVar.j() == null) {
            return cyhVar;
        }
        bzq bzqVarN = this.v.n();
        if (!bzqVarN.s()) {
            return cyhVar;
        }
        long jD = cme.d(bty.q(bzqVarN));
        int iA = cmf.a(jD);
        if (iA < 0) {
            iA = 0;
        }
        int iB = cmf.b(jD);
        if (iB < 0) {
            iB = 0;
        }
        long jH = bty.w(bzqVarN).h();
        long j = jH >> 32;
        long j2 = jH & 4294967295L;
        long j3 = bzqVarN.c;
        long jD2 = cme.d(bzqVarN.j((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
        int iA2 = ((int) j) - cmf.a(jD2);
        if (iA2 < 0) {
            iA2 = 0;
        }
        int iB2 = ((int) j2) - cmf.b(jD2);
        int i = iB2 >= 0 ? iB2 : 0;
        return (iA == 0 && iB == 0 && iA2 == 0 && i == 0) ? cyhVar : cyhVar.n(iA, iB, iA2, i);
    }

    public final void f() {
        if (this.u) {
            this.c.postOnAnimation(new caw(this.z, 5));
        } else {
            this.v.E();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.A;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), iArr[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.B.a();
    }

    public final void i(gmz gmzVar) {
        gmz gmzVar2 = this.F;
        if (gmzVar2 != null) {
            gmzVar2.b();
        }
        this.F = gmzVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        f();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    @Override // defpackage.cvq
    public final cyh onApplyWindowInsets(View view, cyh cyhVar) {
        this.p = new cyh(cyhVar);
        return e(cyhVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        View view = this.c;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.s = i;
        this.t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float fB = cmx.b(f);
        float fB2 = cmx.b(f2);
        ykr.q(this.b.f(), null, 0, new cmt(z, this, a.j(fB, fB2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float fB = cmx.b(f);
        float fB2 = cmx.b(f2);
        ykr.q(this.b.f(), null, 0, new vo(this, a.j(fB, fB2), (yih) null, 5), 3);
        return false;
    }

    @Override // defpackage.cvn
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            bse bseVar = this.b;
            float fA = cmx.a(i);
            float fA2 = cmx.a(i2);
            long jB = bseVar.b((Float.floatToRawIntBits(fA2) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32), cmx.c(i3));
            iArr[0] = ccf.l(Float.intBitsToFloat((int) (jB >> 32)));
            iArr[1] = ccf.l(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // defpackage.cvn
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            bse bseVar = this.b;
            float fA = cmx.a(i);
            float fA2 = cmx.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = cmx.a(i3);
            float fA4 = cmx.a(i4);
            bseVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fA3) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L), cmx.c(i5));
        }
    }

    @Override // defpackage.cvn
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.B.b(i, i2);
    }

    @Override // defpackage.cvn
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // defpackage.cvn
    public final void onStopNestedScroll(View view, int i) {
        this.B.c(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        yjv yjvVar = this.r;
        if (yjvVar != null) {
            yjvVar.a(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.caa
    public final boolean v() {
        return isAttachedToWindow();
    }

    @Override // defpackage.cvo
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            bse bseVar = this.b;
            float fA = cmx.a(i);
            float fA2 = cmx.a(i2);
            long jFloatToRawIntBits = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fA2);
            float fA3 = cmx.a(i3);
            float fA4 = cmx.a(i4);
            long jA = bseVar.a((jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(fA3) << 32) | (Float.floatToRawIntBits(fA4) & 4294967295L), cmx.c(i5));
            iArr[0] = ccf.l(Float.intBitsToFloat((int) (jA >> 32)));
            iArr[1] = ccf.l(Float.intBitsToFloat((int) (jA & 4294967295L)));
        }
    }
}
