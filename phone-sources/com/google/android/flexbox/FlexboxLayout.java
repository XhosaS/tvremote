package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.cww;
import defpackage.nfw;
import defpackage.nfx;
import defpackage.nfy;
import defpackage.nfz;
import defpackage.nga;
import defpackage.ngb;
import defpackage.ngg;
import defpackage.rhz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexboxLayout extends ViewGroup implements nfw {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private Drawable g;
    private Drawable h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int[] m;
    private SparseIntArray n;
    private List o;
    private nfz p;
    private rhz q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private final void A(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void B(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.B(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void C(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.C(boolean, boolean, int, int, int, int):void");
    }

    private final void D(int i, int i2, int i3, int i4) {
        int iL;
        int iJ;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            iL = l() + getPaddingTop() + getPaddingBottom();
            iJ = j();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(a.cf(i, "Invalid flex direction: "));
            }
            iL = j();
            iJ = l() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < iJ) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = iJ;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(iJ, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(a.cf(mode, "Unknown width mode is set: "));
            }
            if (size < iJ) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < iL) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = iL;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(iL, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(a.cf(mode2, "Unknown height mode is set: "));
            }
            if (size2 < iL) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private final void E() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean F(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewU = u(i - i3);
            if (viewU != null && viewU.getVisibility() != 8) {
                return t() ? (this.j & 2) != 0 : (this.i & 2) != 0;
            }
        }
        return t() ? (this.j & 1) != 0 : (this.i & 1) != 0;
    }

    private final boolean G(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((nfy) this.o.get(i2)).a() > 0) {
                    return t() ? (this.i & 2) != 0 : (this.j & 2) != 0;
                }
            }
            if (t()) {
                return (this.i & 1) != 0;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean H(int i) {
        if (i >= 0 && i < this.o.size()) {
            for (int i2 = i + 1; i2 < this.o.size(); i2++) {
                if (((nfy) this.o.get(i2)).a() > 0) {
                    return false;
                }
            }
            if (t()) {
                return (this.i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private final void x(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            nfy nfyVar = (nfy) this.o.get(i);
            for (int i2 = 0; i2 < nfyVar.h; i2++) {
                int i3 = nfyVar.o + i2;
                View viewU = u(i3);
                if (viewU != null && viewU.getVisibility() != 8) {
                    ngb ngbVar = (ngb) viewU.getLayoutParams();
                    if (F(i3, i2)) {
                        A(canvas, z ? viewU.getRight() + ngbVar.rightMargin : (viewU.getLeft() - ngbVar.leftMargin) - this.l, nfyVar.b, nfyVar.g);
                    }
                    if (i2 == nfyVar.h - 1 && (this.j & 4) > 0) {
                        A(canvas, z ? (viewU.getLeft() - ngbVar.leftMargin) - this.l : viewU.getRight() + ngbVar.rightMargin, nfyVar.b, nfyVar.g);
                    }
                }
            }
            if (G(i)) {
                z(canvas, paddingLeft, z2 ? nfyVar.d : nfyVar.b - this.k, iMax);
            }
            if (H(i) && (this.i & 4) > 0) {
                z(canvas, paddingLeft, z2 ? nfyVar.b - this.k : nfyVar.d, iMax);
            }
        }
    }

    private final void y(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.o.size();
        for (int i = 0; i < size; i++) {
            nfy nfyVar = (nfy) this.o.get(i);
            for (int i2 = 0; i2 < nfyVar.h; i2++) {
                int i3 = nfyVar.o + i2;
                View viewU = u(i3);
                if (viewU != null && viewU.getVisibility() != 8) {
                    ngb ngbVar = (ngb) viewU.getLayoutParams();
                    if (F(i3, i2)) {
                        z(canvas, nfyVar.a, z2 ? viewU.getBottom() + ngbVar.bottomMargin : (viewU.getTop() - ngbVar.topMargin) - this.k, nfyVar.g);
                    }
                    if (i2 == nfyVar.h - 1 && (this.i & 4) > 0) {
                        z(canvas, nfyVar.a, z2 ? (viewU.getTop() - ngbVar.topMargin) - this.k : viewU.getBottom() + ngbVar.bottomMargin, nfyVar.g);
                    }
                }
            }
            if (G(i)) {
                A(canvas, z ? nfyVar.c : nfyVar.a - this.l, paddingTop, iMax);
            }
            if (H(i) && (this.j & 4) > 0) {
                A(canvas, z ? nfyVar.a - this.l : nfyVar.c, paddingTop, iMax);
            }
        }
    }

    private final void z(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    @Override // defpackage.nfw
    public final int a() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, nfw] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        rhz rhzVar = this.q;
        SparseIntArray sparseIntArray = this.n;
        ?? r2 = rhzVar.a;
        int iH = r2.h();
        List listA = rhzVar.a(iH);
        nga ngaVar = new nga();
        if (view == null || !(layoutParams instanceof nfx)) {
            ngaVar.b = 1;
        } else {
            ngaVar.b = ((nfx) layoutParams).n();
        }
        if (i == -1 || i == iH || i >= r2.h()) {
            ngaVar.a = iH;
        } else {
            ngaVar.a = i;
            for (int i2 = i; i2 < iH; i2++) {
                ((nga) listA.get(i2)).a++;
            }
        }
        listA.add(ngaVar);
        this.m = rhz.r(iH + 1, listA, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.nfw
    public final int b() {
        return this.d;
    }

    @Override // defpackage.nfw
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ngb;
    }

    @Override // defpackage.nfw
    public final int d(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.nfw
    public final int e(View view) {
        return 0;
    }

    @Override // defpackage.nfw
    public final int f(View view, int i, int i2) {
        int i3;
        int i4;
        if (t()) {
            i3 = F(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = F(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // defpackage.nfw
    public final int g() {
        return this.a;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ngb(getContext(), attributeSet);
    }

    @Override // defpackage.nfw
    public final int h() {
        return getChildCount();
    }

    @Override // defpackage.nfw
    public final int i() {
        return this.b;
    }

    @Override // defpackage.nfw
    public final int j() {
        Iterator it = this.o.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((nfy) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.nfw
    public final int k() {
        return this.f;
    }

    @Override // defpackage.nfw
    public final int l() {
        int size = this.o.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            nfy nfyVar = (nfy) this.o.get(i2);
            if (G(i2)) {
                i += t() ? this.k : this.l;
            }
            if (H(i2)) {
                i += t() ? this.k : this.l;
            }
            i += nfyVar.g;
        }
        return i;
    }

    @Override // defpackage.nfw
    public final View m(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.nfw
    public final View n(int i) {
        return u(i);
    }

    @Override // defpackage.nfw
    public final List o() {
        return this.o;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            x(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            x(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection != 1;
            boolean z2 = layoutDirection == 1;
            if (this.b != 2) {
                z = z2;
            }
            y(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z3 = layoutDirection != 1;
        boolean z4 = layoutDirection == 1;
        if (this.b != 2) {
            z3 = z4;
        }
        y(canvas, z3, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        FlexboxLayout flexboxLayout;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        FlexboxLayout flexboxLayout2;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = cww.a;
        int layoutDirection = getLayoutDirection();
        int i13 = this.a;
        if (i13 == 0) {
            if (layoutDirection == 1) {
                z2 = true;
                flexboxLayout = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                flexboxLayout = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            flexboxLayout.B(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                C(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, false, i, i2, i3, i4);
                return;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException(a.cf(i13, "Invalid flex direction is set: "));
                }
                C(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, true, i, i2, i3, i4);
                return;
            }
        }
        if (layoutDirection != 1) {
            z3 = true;
            flexboxLayout2 = this;
            i9 = i;
            i12 = i2;
            i11 = i4;
            i10 = i3;
        } else {
            z3 = false;
            flexboxLayout2 = this;
            i9 = i;
            i10 = i3;
            i11 = i4;
            i12 = i2;
        }
        flexboxLayout2.B(z3, i9, i12, i10, i11);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nfw] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, nfw] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        rhz rhzVar = this.q;
        SparseIntArray sparseIntArray = this.n;
        ?? r0 = rhzVar.a;
        int iH = r0.h();
        if (sparseIntArray.size() != iH) {
            rhz rhzVar2 = this.q;
            SparseIntArray sparseIntArray2 = this.n;
            int iH2 = rhzVar2.a.h();
            this.m = rhz.r(iH2, rhzVar2.a(iH2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < iH; i3++) {
            View viewM = r0.m(i3);
            if (viewM != null && ((nfx) viewM.getLayoutParams()).n() != sparseIntArray.get(i3)) {
                rhz rhzVar22 = this.q;
                SparseIntArray sparseIntArray22 = this.n;
                int iH22 = rhzVar22.a.h();
                this.m = rhz.r(iH22, rhzVar22.a(iH22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.a;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException(a.cf(i4, "Invalid value for the flex direction is set: "));
            }
            this.o.clear();
            this.p.a();
            this.q.b(this.p, i2, i, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, -1, null);
            this.o = this.p.b;
            this.q.g(i, i2);
            this.q.f(i, i2, getPaddingLeft() + getPaddingRight());
            this.q.n();
            D(this.a, i, i2, this.p.a);
            return;
        }
        this.o.clear();
        this.p.a();
        this.q.b(this.p, i, i2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0, -1, null);
        this.o = this.p.b;
        this.q.g(i, i2);
        if (this.d == 3) {
            for (nfy nfyVar : this.o) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < nfyVar.h; i5++) {
                    View viewU = u(nfyVar.o + i5);
                    if (viewU != null && viewU.getVisibility() != 8) {
                        ngb ngbVar = (ngb) viewU.getLayoutParams();
                        iMax = this.b != 2 ? Math.max(iMax, viewU.getMeasuredHeight() + Math.max(nfyVar.l - viewU.getBaseline(), ngbVar.topMargin) + ngbVar.bottomMargin) : Math.max(iMax, viewU.getMeasuredHeight() + ngbVar.topMargin + Math.max((nfyVar.l - viewU.getMeasuredHeight()) + viewU.getBaseline(), ngbVar.bottomMargin));
                    }
                }
                nfyVar.g = iMax;
            }
        }
        this.q.f(i, i2, getPaddingTop() + getPaddingBottom());
        this.q.n();
        D(this.a, i, i2, this.p.a);
    }

    @Override // defpackage.nfw
    public final void p(View view, int i, int i2, nfy nfyVar) {
        int i3;
        int i4;
        if (F(i, i2)) {
            if (t()) {
                i3 = nfyVar.e;
                i4 = this.l;
            } else {
                i3 = nfyVar.e;
                i4 = this.k;
            }
            nfyVar.e = i3 + i4;
            nfyVar.f += i4;
        }
    }

    @Override // defpackage.nfw
    public final void q(nfy nfyVar) {
        int i;
        int i2;
        if (t()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = nfyVar.e;
            i2 = this.l;
        } else {
            if ((this.i & 4) <= 0) {
                return;
            }
            i = nfyVar.e;
            i2 = this.k;
        }
        nfyVar.e = i + i2;
        nfyVar.f += i2;
    }

    @Override // defpackage.nfw
    public final void r(List list) {
        this.o = list;
    }

    @Override // defpackage.nfw
    public final boolean t() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final View u(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void v(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        this.k = drawable.getIntrinsicHeight();
        E();
        requestLayout();
    }

    public final void w(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        this.l = drawable.getIntrinsicWidth();
        E();
        requestLayout();
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ngb ? new ngb((ngb) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ngb((ViewGroup.MarginLayoutParams) layoutParams) : new ngb(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.q = new rhz(this);
        this.o = new ArrayList();
        this.p = new nfz();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ngg.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 4);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            v(drawable);
            w(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            v(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            w(drawable3);
        }
        int i2 = typedArrayObtainStyledAttributes.getInt(9, 0);
        if (i2 != 0) {
            this.j = i2;
            this.i = i2;
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(11, 0);
        if (i3 != 0) {
            this.j = i3;
        }
        int i4 = typedArrayObtainStyledAttributes.getInt(10, 0);
        if (i4 != 0) {
            this.i = i4;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.nfw
    public final void s(int i, View view) {
    }
}
