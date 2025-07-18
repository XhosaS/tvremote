package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.ahj;
import defpackage.jve;
import defpackage.jvf;
import defpackage.jvg;
import defpackage.jvh;
import defpackage.jvi;
import defpackage.jvj;
import defpackage.jvo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FlexboxLayout extends ViewGroup implements jve {
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
    private jvi o;
    private List p;
    private jvg q;

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    private final void h(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            jvf jvfVar = (jvf) this.p.get(i);
            for (int i2 = 0; i2 < jvfVar.h; i2++) {
                int i3 = jvfVar.o + i2;
                View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                    if (w(i3, i2)) {
                        r(canvas, z ? viewD.getRight() + layoutParams.rightMargin : (viewD.getLeft() - layoutParams.leftMargin) - this.l, jvfVar.b, jvfVar.g);
                    }
                    if (i2 == jvfVar.h - 1 && (this.j & 4) > 0) {
                        r(canvas, z ? (viewD.getLeft() - layoutParams.leftMargin) - this.l : viewD.getRight() + layoutParams.rightMargin, jvfVar.b, jvfVar.g);
                    }
                }
            }
            if (x(i)) {
                p(canvas, paddingLeft, z2 ? jvfVar.d : jvfVar.b - this.k, iMax);
            }
            if (y(i) && (this.i & 4) > 0) {
                p(canvas, paddingLeft, z2 ? jvfVar.b - this.k : jvfVar.d, iMax);
            }
        }
    }

    private final void o(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.p.size();
        for (int i = 0; i < size; i++) {
            jvf jvfVar = (jvf) this.p.get(i);
            for (int i2 = 0; i2 < jvfVar.h; i2++) {
                int i3 = jvfVar.o + i2;
                View viewD = d(i3);
                if (viewD != null && viewD.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                    if (w(i3, i2)) {
                        p(canvas, jvfVar.a, z2 ? viewD.getBottom() + layoutParams.bottomMargin : (viewD.getTop() - layoutParams.topMargin) - this.k, jvfVar.g);
                    }
                    if (i2 == jvfVar.h - 1 && (this.i & 4) > 0) {
                        p(canvas, jvfVar.a, z2 ? (viewD.getTop() - layoutParams.topMargin) - this.k : viewD.getBottom() + layoutParams.bottomMargin, jvfVar.g);
                    }
                }
            }
            if (x(i)) {
                r(canvas, z ? jvfVar.c : jvfVar.a - this.l, paddingTop, iMax);
            }
            if (y(i) && (this.j & 4) > 0) {
                r(canvas, z ? jvfVar.a - this.l : jvfVar.c, paddingTop, iMax);
            }
        }
    }

    private final void p(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.k + i2);
        this.g.draw(canvas);
    }

    private final void r(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.l + i, i3 + i2);
        this.h.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void s(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.s(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.t(boolean, boolean, int, int, int, int):void");
    }

    private final void u(int i, int i2, int i3, int i4) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(a.b(i, "Invalid flex direction: "));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException(a.b(mode, "Unknown width mode is set: "));
            }
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i3, i4);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException(a.b(mode2, "Unknown height mode is set: "));
            }
            if (size2 < sumOfCrossSize) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private final void v() {
        if (this.g == null && this.h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private final boolean w(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View viewD = d(i - i3);
            if (viewD != null && viewD.getVisibility() != 8) {
                return q() ? (this.j & 2) != 0 : (this.i & 2) != 0;
            }
        }
        return q() ? (this.j & 1) != 0 : (this.i & 1) != 0;
    }

    private final boolean x(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = 0; i2 < i; i2++) {
                jvf jvfVar = (jvf) this.p.get(i2);
                if (jvfVar.h - jvfVar.i > 0) {
                    return q() ? (this.i & 2) != 0 : (this.j & 2) != 0;
                }
            }
            if (q()) {
                return (this.i & 1) != 0;
            }
            if ((this.j & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean y(int i) {
        if (i >= 0 && i < this.p.size()) {
            for (int i2 = i + 1; i2 < this.p.size(); i2++) {
                jvf jvfVar = (jvf) this.p.get(i2);
                if (jvfVar.h - jvfVar.i > 0) {
                    return false;
                }
            }
            if (q()) {
                return (this.i & 4) != 0;
            }
            if ((this.j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jve
    public final int a(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        jvi jviVar = this.o;
        SparseIntArray sparseIntArray = this.n;
        jve jveVar = jviVar.a;
        int flexItemCount = jveVar.getFlexItemCount();
        List listB = jviVar.b(flexItemCount);
        jvh jvhVar = new jvh();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            jvhVar.b = 1;
        } else {
            jvhVar.b = ((FlexItem) layoutParams).n();
        }
        if (i == -1 || i == flexItemCount || i >= jveVar.getFlexItemCount()) {
            jvhVar.a = flexItemCount;
        } else {
            jvhVar.a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((jvh) listB.get(i2)).a++;
            }
        }
        listB.add(jvhVar);
        this.m = jviVar.m(flexItemCount + 1, listB, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.jve
    public final int b(int i, int i2, int i3) {
        return getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.jve
    public final int c(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final View d(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.m;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void e(Drawable drawable) {
        if (drawable == this.g) {
            return;
        }
        this.g = drawable;
        this.k = drawable.getIntrinsicHeight();
        v();
        requestLayout();
    }

    public final void f(Drawable drawable) {
        if (drawable == this.h) {
            return;
        }
        this.h = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
        } else {
            this.l = 0;
        }
        v();
        requestLayout();
    }

    @Override // defpackage.jve
    public final int g(View view, int i, int i2) {
        int i3;
        int i4;
        if (q()) {
            i3 = w(i, i2) ? this.l : 0;
            if ((this.j & 4) <= 0) {
                return i3;
            }
            i4 = this.l;
        } else {
            i3 = w(i, i2) ? this.k : 0;
            if ((this.i & 4) <= 0) {
                return i3;
            }
            i4 = this.k;
        }
        return i3 + i4;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.jve
    public int getAlignContent() {
        return this.e;
    }

    @Override // defpackage.jve
    public int getAlignItems() {
        return this.d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.h;
    }

    @Override // defpackage.jve
    public int getFlexDirection() {
        return this.a;
    }

    @Override // defpackage.jve
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List getFlexLines() {
        ArrayList arrayList = new ArrayList(this.p.size());
        for (jvf jvfVar : this.p) {
            if (jvfVar.h - jvfVar.i != 0) {
                arrayList.add(jvfVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.jve
    public List getFlexLinesInternal() {
        return this.p;
    }

    @Override // defpackage.jve
    public int getFlexWrap() {
        return this.b;
    }

    public int getJustifyContent() {
        return this.c;
    }

    @Override // defpackage.jve
    public int getLargestMainSize() {
        Iterator it = this.p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((jvf) it.next()).e);
        }
        return iMax;
    }

    @Override // defpackage.jve
    public int getMaxLine() {
        return this.f;
    }

    public int getShowDividerHorizontal() {
        return this.i;
    }

    public int getShowDividerVertical() {
        return this.j;
    }

    @Override // defpackage.jve
    public int getSumOfCrossSize() {
        int size = this.p.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jvf jvfVar = (jvf) this.p.get(i2);
            if (x(i2)) {
                i += q() ? this.k : this.l;
            }
            if (y(i2)) {
                i += q() ? this.k : this.l;
            }
            i += jvfVar.g;
        }
        return i;
    }

    @Override // defpackage.jve
    public final View i(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.jve
    public final View j(int i) {
        return d(i);
    }

    @Override // defpackage.jve
    public final void k(View view, int i, int i2, jvf jvfVar) {
        int i3;
        int i4;
        if (w(i, i2)) {
            if (q()) {
                i3 = jvfVar.e;
                i4 = this.l;
            } else {
                i3 = jvfVar.e;
                i4 = this.k;
            }
            jvfVar.e = i3 + i4;
            jvfVar.f += i4;
        }
    }

    @Override // defpackage.jve
    public final void l(jvf jvfVar) {
        int i;
        int i2;
        if (q()) {
            if ((this.j & 4) <= 0) {
                return;
            }
            i = jvfVar.e;
            i2 = this.l;
        } else {
            if ((this.i & 4) <= 0) {
                return;
            }
            i = jvfVar.e;
            i2 = this.k;
        }
        jvfVar.e = i + i2;
        jvfVar.f += i2;
    }

    @Override // defpackage.jve
    public final void m(List list) {
        this.p = list;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.h == null && this.g == null) {
            return;
        }
        if (this.i == 0 && this.j == 0) {
            return;
        }
        int[] iArr = ahj.a;
        int layoutDirection = getLayoutDirection();
        int i = this.a;
        if (i == 0) {
            h(canvas, layoutDirection == 1, this.b == 2);
            return;
        }
        if (i == 1) {
            h(canvas, layoutDirection != 1, this.b == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection != 1;
            boolean z2 = layoutDirection == 1;
            if (this.b != 2) {
                z = z2;
            }
            o(canvas, z, false);
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
        o(canvas, z3, true);
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
        int[] iArr = ahj.a;
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
            flexboxLayout.s(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                t(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, false, i, i2, i3, i4);
                return;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException(a.b(i13, "Invalid flex direction is set: "));
                }
                t(this.b != 2 ? layoutDirection == 1 : layoutDirection != 1, true, i, i2, i3, i4);
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
        flexboxLayout2.s(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.n == null) {
            this.n = new SparseIntArray(getChildCount());
        }
        jvi jviVar = this.o;
        SparseIntArray sparseIntArray = this.n;
        jve jveVar = jviVar.a;
        int flexItemCount = jveVar.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            jvi jviVar2 = this.o;
            SparseIntArray sparseIntArray2 = this.n;
            int flexItemCount2 = jviVar2.a.getFlexItemCount();
            this.m = jviVar2.m(flexItemCount2, jviVar2.b(flexItemCount2), sparseIntArray2);
            break;
        }
        for (int i3 = 0; i3 < flexItemCount; i3++) {
            View viewI = jveVar.i(i3);
            if (viewI != null && ((FlexItem) viewI.getLayoutParams()).n() != sparseIntArray.get(i3)) {
                jvi jviVar22 = this.o;
                SparseIntArray sparseIntArray22 = this.n;
                int flexItemCount22 = jviVar22.a.getFlexItemCount();
                this.m = jviVar22.m(flexItemCount22, jviVar22.b(flexItemCount22), sparseIntArray22);
                break;
            }
        }
        int i4 = this.a;
        if (i4 != 0 && i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                throw new IllegalStateException(a.b(i4, "Invalid value for the flex direction is set: "));
            }
            this.p.clear();
            this.q.a();
            this.o.c(this.q, i2, i, Integer.MAX_VALUE, 0, -1, null);
            this.p = this.q.a;
            this.o.f(i, i2, 0);
            this.o.e(i, i2, getPaddingLeft() + getPaddingRight());
            this.o.l(0);
            u(this.a, i, i2, this.q.b);
            return;
        }
        this.p.clear();
        this.q.a();
        this.o.c(this.q, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.p = this.q.a;
        this.o.f(i, i2, 0);
        if (this.d == 3) {
            for (jvf jvfVar : this.p) {
                int iMax = Integer.MIN_VALUE;
                for (int i5 = 0; i5 < jvfVar.h; i5++) {
                    View viewD = d(jvfVar.o + i5);
                    if (viewD != null && viewD.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewD.getLayoutParams();
                        iMax = this.b != 2 ? Math.max(iMax, viewD.getMeasuredHeight() + Math.max(jvfVar.l - viewD.getBaseline(), layoutParams.topMargin) + layoutParams.bottomMargin) : Math.max(iMax, viewD.getMeasuredHeight() + layoutParams.topMargin + Math.max((jvfVar.l - viewD.getMeasuredHeight()) + viewD.getBaseline(), layoutParams.bottomMargin));
                    }
                }
                jvfVar.g = iMax;
            }
        }
        this.o.e(i, i2, getPaddingTop() + getPaddingBottom());
        this.o.l(0);
        u(this.a, i, i2, this.q.b);
    }

    @Override // defpackage.jve
    public final boolean q() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public void setAlignContent(int i) {
        if (this.e != i) {
            this.e = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.a != i) {
            this.a = i;
            requestLayout();
        }
    }

    public void setFlexWrap(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.c != i) {
            this.c = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.i) {
            this.i = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.j) {
            this.j = i;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        this.o = new jvi(this);
        this.p = new ArrayList();
        this.q = new jvg();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jvo.a, i, 0);
        this.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.b = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.c = typedArrayObtainStyledAttributes.getInt(7, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(1, 4);
        this.e = typedArrayObtainStyledAttributes.getInt(0, 5);
        this.f = typedArrayObtainStyledAttributes.getInt(8, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            e(drawable);
            f(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(3);
        if (drawable2 != null) {
            e(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable3 != null) {
            f(drawable3);
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

    /* compiled from: PG */
    public class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator CREATOR = new jvj();
        private int a;
        private float b;
        private float c;
        private int d;
        private float e;
        private int f;
        private int g;
        private int h;
        private int i;
        private boolean j;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jvo.b);
            this.a = typedArrayObtainStyledAttributes.getInt(8, 1);
            this.b = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
            this.c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            this.d = typedArrayObtainStyledAttributes.getInt(0, -1);
            this.e = typedArrayObtainStyledAttributes.getFraction(1, 1, 1, -1.0f);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, 0);
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, 16777215);
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 16777215);
            this.j = typedArrayObtainStyledAttributes.getBoolean(9, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float a() {
            return this.e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float b() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float c() {
            return this.c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int d() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int e() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int k() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int l() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.a;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void p(int i) {
            this.g = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final void q(int i) {
            this.f = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean r() {
            return this.j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeFloat(this.b);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d);
            parcel.writeFloat(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = parcel.readInt();
            this.b = parcel.readFloat();
            this.c = parcel.readFloat();
            this.d = parcel.readInt();
            this.e = parcel.readFloat();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.a = 1;
            this.b = 0.0f;
            this.c = 1.0f;
            this.d = -1;
            this.e = -1.0f;
            this.h = 16777215;
            this.i = 16777215;
            this.a = layoutParams.a;
            this.b = layoutParams.b;
            this.c = layoutParams.c;
            this.d = layoutParams.d;
            this.e = layoutParams.e;
            this.f = layoutParams.f;
            this.g = layoutParams.g;
            this.h = layoutParams.h;
            this.i = layoutParams.i;
            this.j = layoutParams.j;
        }
    }

    @Override // defpackage.jve
    public final void n(int i, View view) {
    }
}
