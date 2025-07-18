package com.google.android.spannedgridlayoutmanager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.eph;
import defpackage.pja;
import defpackage.thw;
import defpackage.thx;
import defpackage.thy;
import defpackage.thz;
import defpackage.tia;
import defpackage.tib;
import defpackage.tic;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SpannedGridLayoutManager extends RecyclerView.LayoutManager {
    public thy a;
    public tic b;
    int[] c;
    public int d;
    public int e;
    public int f;
    OrientationHelper l;
    OrientationHelper m;
    public eph n;
    private int o;
    private boolean p;
    private int t;
    int g = 0;
    private final Rect q = new Rect();
    private final tia r = new tia();
    private final tib s = new tib(this);
    final ArrayList h = new ArrayList();
    final ArrayList i = new ArrayList();
    final ArrayList j = new ArrayList();
    final ArrayList k = new ArrayList();

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        int[] iArr;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pja.a, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, 1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        float[] fArr = null;
        if (resourceId != -1) {
            TypedArray typedArrayObtainTypedArray = context.getResources().obtainTypedArray(resourceId);
            iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = typedArrayObtainTypedArray.getDimensionPixelSize(i4, 0);
            }
            typedArrayObtainTypedArray.recycle();
        } else {
            iArr = null;
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(3, -1);
        if (resourceId2 != -1) {
            TypedArray typedArrayObtainTypedArray2 = context.getResources().obtainTypedArray(resourceId2);
            fArr = new float[i3];
            for (int i5 = 0; i5 < i3; i5++) {
                fArr[i5] = typedArrayObtainTypedArray2.getFloat(i5, 1.0f);
            }
            typedArrayObtainTypedArray2.recycle();
        }
        this.n = new eph(i3, fArr, iArr);
        int i6 = typedArrayObtainStyledAttributes.getInt(0, 1);
        typedArrayObtainStyledAttributes.recycle();
        m(i6);
        setAutoMeasureEnabled(true);
    }

    private final int j() {
        int[] iArr = this.c;
        return iArr[this.n.a] - iArr[0];
    }

    private final tib k(int i, int i2, boolean z) {
        tib tibVar = this.s;
        tibVar.d = i;
        tibVar.e = i2;
        tibVar.f = z;
        tibVar.g = false;
        tibVar.c = z ? this.o : this.f;
        tibVar.h = false;
        return tibVar;
    }

    private final void l(tib tibVar) {
        int iIntValue;
        int iIntValue2;
        int i;
        boolean z = true;
        boolean zA = true;
        while (true) {
            if (tibVar.e <= 0 && !tibVar.h) {
                return;
            }
            if (tibVar.f && tibVar.i.e >= tibVar.b.getItemCount() - 1) {
                return;
            }
            if ((!tibVar.f && tibVar.i.d <= 0) || !zA) {
                return;
            }
            tia tiaVar = this.r;
            int i2 = 0;
            tiaVar.a = 0;
            tiaVar.b = z;
            int iA = this.b.a(tibVar.c);
            int iB = this.b.b(tibVar.c);
            int i3 = iB - iA;
            int iD = this.b.d(iA);
            int iMax = 0;
            for (int i4 = iA; i4 <= iB; i4++) {
                iMax = Math.max(iMax, (this.b.d(i4) - iD) + this.b.e(i4).b);
            }
            int i5 = i3 + 1;
            ArrayList arrayList = this.h;
            r(arrayList, i5);
            ArrayList arrayList2 = this.j;
            r(arrayList2, i5);
            ArrayList arrayList3 = this.i;
            r(arrayList3, i5);
            ArrayList arrayList4 = this.k;
            r(arrayList4, iMax + 1);
            View[] viewArr = new View[i5];
            int i6 = 0;
            while (i2 < i5) {
                int i7 = i2 + iA;
                int i8 = i5;
                View viewForPosition = tibVar.a.getViewForPosition(i7);
                thz thzVar = (thz) viewForPosition.getLayoutParams();
                ArrayList arrayList5 = arrayList;
                tiaVar.b = tiaVar.b && !thzVar.isItemRemoved();
                thx thxVarE = this.b.e(i7);
                viewArr[i2] = viewForPosition;
                int[] iArr = this.c;
                int i9 = thxVarE.c;
                ArrayList arrayList6 = arrayList4;
                int i10 = iD;
                ArrayList arrayList7 = arrayList2;
                int i11 = iB;
                ArrayList arrayList8 = arrayList3;
                n(viewForPosition, thzVar, iArr[i9 + thxVarE.d] - iArr[i9], this.t == 1 ? thzVar.height : thzVar.width, 0);
                arrayList8.set(i2, Integer.valueOf(this.l.getDecoratedMeasurement(viewForPosition)));
                arrayList5.set(i2, 0);
                arrayList7.set(i2, Integer.valueOf(thxVarE.b));
                i2++;
                i5 = i8;
                arrayList4 = arrayList6;
                arrayList3 = arrayList8;
                arrayList = arrayList5;
                arrayList2 = arrayList7;
                i3 = i3;
                iD = i10;
                iB = i11;
                iA = iA;
                z = true;
                viewArr = viewArr;
            }
            boolean z2 = z;
            View[] viewArr2 = viewArr;
            int i12 = iA;
            int i13 = iB;
            int i14 = i3;
            int i15 = iD;
            int i16 = i5;
            ArrayList arrayList9 = arrayList;
            ArrayList arrayList10 = arrayList2;
            ArrayList arrayList11 = arrayList3;
            ArrayList arrayList12 = arrayList4;
            for (int i17 = 0; i17 < iMax; i17++) {
                arrayList12.set(i17, null);
            }
            int i18 = 0;
            while (i18 < iMax) {
                int i19 = -1;
                int i20 = -1;
                int i21 = i6;
                while (i21 < i16) {
                    thx thxVarE2 = this.b.e(i21 + i12);
                    Integer num = (Integer) arrayList10.get(i21);
                    if (num.intValue() > 0) {
                        int iIntValue3 = ((Integer) arrayList11.get(i21)).intValue() / num.intValue();
                        int i22 = thxVarE2.b;
                        i = i18;
                        int i23 = i6;
                        while (i23 < i22) {
                            int i24 = i23;
                            int i25 = (i24 + thxVarE2.a) - i15;
                            if (arrayList12.get(i25) == null && iIntValue3 > i20) {
                                i19 = i25;
                                i20 = iIntValue3;
                            }
                            i23 = i24 + 1;
                        }
                    } else {
                        i = i18;
                    }
                    i21++;
                    i18 = i;
                }
                int i26 = i18;
                arrayList12.set(i19, Integer.valueOf(i20));
                int i27 = i19 + i15;
                int i28 = i6;
                while (i28 < i16) {
                    thx thxVarE3 = this.b.e(i28 + i12);
                    int i29 = thxVarE3.a;
                    if (i29 <= i27 && i29 + thxVarE3.b > i27) {
                        arrayList10.set(i28, Integer.valueOf(((Integer) arrayList10.get(i28)).intValue() - 1));
                        arrayList11.set(i28, Integer.valueOf(Math.max(i6, ((Integer) arrayList11.get(i28)).intValue() - i20)));
                        arrayList9.set(i28, Integer.valueOf(((Integer) arrayList9.get(i28)).intValue() + i20));
                    }
                    i28++;
                    i6 = 0;
                }
                i18 = i26 + 1;
                i6 = 0;
            }
            if (tibVar.f) {
                int i30 = tibVar.d;
                int i31 = 0;
                while (i31 < iMax) {
                    int iIntValue4 = ((Integer) arrayList12.get(i31)).intValue() + i30;
                    arrayList12.set(i31, Integer.valueOf(i30));
                    i31++;
                    i30 = iIntValue4;
                }
                arrayList12.set(iMax, Integer.valueOf(i30));
                for (int i32 = 0; i32 < i16; i32++) {
                    thx thxVarE4 = this.b.e(i32 + i12);
                    int iIntValue5 = ((Integer) arrayList12.get(thxVarE4.a - i15)).intValue();
                    View view = viewArr2[i32];
                    if (tibVar.g) {
                        addDisappearingView(view);
                    } else {
                        addView(view);
                    }
                    h(thxVarE4, view, ((Integer) arrayList9.get(i32)).intValue(), iIntValue5, true);
                }
                iIntValue = ((Integer) arrayList12.get(iMax)).intValue();
                iIntValue2 = tibVar.d;
            } else {
                int iIntValue6 = tibVar.d;
                while (iMax > 0) {
                    arrayList12.set(iMax, Integer.valueOf(iIntValue6));
                    iMax--;
                    iIntValue6 -= ((Integer) arrayList12.get(iMax)).intValue();
                }
                arrayList12.set(0, Integer.valueOf(iIntValue6));
                for (int i33 = i14; i33 >= 0; i33--) {
                    thx thxVarE5 = this.b.e(i33 + i12);
                    int iIntValue7 = ((Integer) arrayList12.get((thxVarE5.a + thxVarE5.b) - i15)).intValue();
                    View view2 = viewArr2[i33];
                    if (tibVar.g) {
                        addDisappearingView(view2, 0);
                    } else {
                        addView(view2, 0);
                    }
                    h(thxVarE5, view2, ((Integer) arrayList9.get(i33)).intValue(), iIntValue7, false);
                }
                iIntValue = tibVar.d;
                iIntValue2 = ((Integer) arrayList12.get(0)).intValue();
            }
            tiaVar.a = iIntValue - iIntValue2;
            if (!tibVar.g) {
                if (i12 < this.d) {
                    this.d = i12;
                    this.f = this.b.d(i12);
                }
                if (i13 > this.e) {
                    this.e = i13;
                    this.o = this.b.d(i13);
                }
            }
            if (tiaVar.b) {
                tibVar.e -= tiaVar.a;
            }
            int i34 = tiaVar.a;
            if (tibVar.f) {
                tibVar.d += i34;
            } else {
                tibVar.d -= i34;
            }
            zA = tibVar.a();
            z = z2;
        }
    }

    private final void m(int i) {
        this.t = i;
        if (i == 1) {
            this.l = OrientationHelper.createVerticalHelper(this);
            this.m = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.l = OrientationHelper.createHorizontalHelper(this);
            this.m = OrientationHelper.createVerticalHelper(this);
        }
    }

    private final void n(View view, thz thzVar, int i, int i2, int i3) {
        int childMeasureSpec;
        int childMeasureSpec2;
        if (this.t == 1) {
            childMeasureSpec2 = getChildMeasureSpec(i, 1073741824, 0, thzVar.width, false);
            childMeasureSpec = getChildMeasureSpec(getHeight(), i3, 0, i2, true);
        } else {
            int childMeasureSpec3 = getChildMeasureSpec(i, 1073741824, 0, thzVar.height, false);
            int childMeasureSpec4 = getChildMeasureSpec(getWidth(), i3, 0, i2, true);
            childMeasureSpec = childMeasureSpec3;
            childMeasureSpec2 = childMeasureSpec4;
        }
        Rect rect = this.q;
        calculateItemDecorationsForChild(view, rect);
        view.measure(s(childMeasureSpec2, thzVar.leftMargin + rect.left, thzVar.rightMargin + rect.right), s(childMeasureSpec, thzVar.topMargin + rect.top, thzVar.bottomMargin + rect.bottom));
    }

    private final void o(int i, RecyclerView.Recycler recycler) {
        int iA = this.b.a(i);
        int iB = this.b.b(i);
        for (int i2 = iB; i2 >= iA; i2--) {
            removeAndRecycleViewAt(i2 - this.d, recycler);
        }
        if (i == this.f) {
            int i3 = iB + 1;
            this.d = i3;
            this.f = this.b.d(i3);
        }
        if (i == this.o) {
            int i4 = iA - 1;
            this.e = i4;
            this.o = this.b.d(i4);
        }
    }

    private final void p() {
        int iA = this.b.a(this.f);
        this.d = iA;
        this.o = this.f;
        this.e = iA;
    }

    private final void q(RecyclerView.Recycler recycler, RecyclerView.State state) {
        tib tibVar = this.s;
        tibVar.a = recycler;
        tibVar.b = state;
    }

    private static final void r(ArrayList arrayList, int i) {
        arrayList.ensureCapacity(i);
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int s(int r2, int r3, int r4) {
        /*
            if (r3 != 0) goto L5
            if (r4 == 0) goto L13
            r3 = 0
        L5:
            int r0 = android.view.View.MeasureSpec.getMode(r2)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L14
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 != r1) goto L13
            r0 = r1
            goto L14
        L13:
            return r2
        L14:
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = r2 - r3
            int r2 = r2 - r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.s(int, int, int):int");
    }

    final int a() {
        if (getChildCount() == 0) {
            return 0;
        }
        return this.d;
    }

    final int b() {
        tic ticVar = this.b;
        if (ticVar == null) {
            return 0;
        }
        return ticVar.a;
    }

    final int c() {
        return this.m.getTotalSpace();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.t == 1) {
            return i();
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.t == 1) {
            return true;
        }
        return i();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof thz;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return this.t == 1 ? c() : getChildCount();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return this.t == 1 ? d() : a();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return this.t == 1 ? e() : b();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return this.t == 1 ? getChildCount() : c();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return this.t == 1 ? a() : d();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return this.t == 1 ? b() : e();
    }

    final int d() {
        if (getChildCount() == 0) {
            return 0;
        }
        return this.g;
    }

    final int e() {
        if (getChildCount() == 0) {
            return 0;
        }
        return j() - this.m.getTotalSpace();
    }

    final int f(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        q(recycler, state);
        int decoratedStart = this.l.getDecoratedStart(getChildAt(0));
        if (i < 0) {
            if (this.f == 0) {
                i = Math.max(i, -(this.l.getStartAfterPadding() - decoratedStart));
            }
            int i2 = decoratedStart - i;
            if (i2 > 0) {
                tib tibVarK = k(decoratedStart, i2, false);
                if (tibVarK.a()) {
                    l(tibVarK);
                    i = Math.max(i, tibVarK.e + i);
                }
            }
            int decoratedStart2 = this.l.getDecoratedStart(getChildAt(this.b.a(this.o) - this.d));
            while (decoratedStart2 - i > this.l.getTotalSpace()) {
                o(this.o, recycler);
                decoratedStart2 = this.l.getDecoratedStart(getChildAt(this.b.a(this.o) - this.d));
            }
        } else {
            int decoratedEnd = this.l.getDecoratedEnd(getChildAt(getChildCount() - 1));
            if (this.e == getItemCount() - 1) {
                i = Math.min(i, Math.max(decoratedEnd - this.l.getEndAfterPadding(), 0));
            }
            int i3 = decoratedEnd - i;
            if (i3 < this.l.getTotalSpace()) {
                tib tibVarK2 = k(this.l.getDecoratedEnd(getChildAt(getChildCount() - 1)), this.l.getTotalSpace() - i3, true);
                if (tibVarK2.a()) {
                    l(tibVarK2);
                    i = Math.min(i, i - tibVarK2.e);
                }
            }
            int decoratedEnd2 = this.l.getDecoratedEnd(getChildAt(this.b.b(this.f) - this.d));
            while (decoratedEnd2 - i < 0) {
                o(this.f, recycler);
                decoratedEnd2 = this.l.getDecoratedEnd(getChildAt(this.b.b(this.f) - this.d));
            }
        }
        this.l.offsetChildren(-i);
        return i;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i) {
        int i2 = this.d;
        if (i < i2 || i > this.e) {
            return null;
        }
        return getChildAt(i - i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int g(int r4) {
        /*
            r3 = this;
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L2d
            if (r4 != 0) goto L9
            goto L2d
        L9:
            int r0 = r3.e()
            if (r4 >= 0) goto L17
            int r1 = r3.g
            int r2 = r4 + r1
            if (r2 >= 0) goto L17
            int r4 = -r1
            goto L21
        L17:
            if (r4 <= 0) goto L21
            int r1 = r3.g
            int r2 = r4 + r1
            if (r2 <= r0) goto L21
            int r4 = r0 - r1
        L21:
            int r0 = r3.g
            int r0 = r0 + r4
            r3.g = r0
            android.support.v7.widget.OrientationHelper r0 = r3.m
            int r1 = -r4
            r0.offsetChildren(r1)
            return r4
        L2d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.g(int):int");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new thz();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new thz(context, attributeSet);
    }

    final void h(thx thxVar, View view, int i, int i2, boolean z) {
        int decoratedMeasurement;
        int decoratedMeasurement2;
        thz thzVar = (thz) view.getLayoutParams();
        int[] iArr = this.c;
        int i3 = thxVar.c;
        int i4 = thxVar.d;
        n(view, thzVar, iArr[i3 + i4] - iArr[i3], i, 1073741824);
        int i5 = this.c[i3] - this.g;
        int decoratedMeasurementInOther = this.l.getDecoratedMeasurementInOther(view) + i5;
        if (z) {
            decoratedMeasurement2 = this.l.getDecoratedMeasurement(view) + i2;
            decoratedMeasurement = i2;
        } else {
            decoratedMeasurement = i2 - this.l.getDecoratedMeasurement(view);
            decoratedMeasurement2 = i2;
        }
        if (this.t != 1) {
            layoutDecorated(view, decoratedMeasurement + thzVar.getMarginStart(), i5 - thzVar.bottomMargin, decoratedMeasurement2 + thzVar.getMarginStart(), decoratedMeasurementInOther - thzVar.bottomMargin);
        } else if (getLayoutDirection() == 1) {
            int i6 = this.c[r6.length - 1];
            layoutDecorated(view, i6 - (decoratedMeasurementInOther + thzVar.getMarginEnd()), decoratedMeasurement + thzVar.topMargin, i6 - (i5 + thzVar.getMarginEnd()), decoratedMeasurement2 + thzVar.topMargin);
        } else {
            layoutDecorated(view, i5 + thzVar.getMarginStart(), decoratedMeasurement + thzVar.topMargin, decoratedMeasurementInOther + thzVar.getMarginStart(), decoratedMeasurement2 + thzVar.topMargin);
        }
        thzVar.a = i4;
        thzVar.b = thxVar.b;
    }

    final boolean i() {
        return getChildCount() > 0 && j() > this.m.getTotalSpace();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
        this.b = null;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.o = 0;
        this.p = false;
        this.g = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler r11, android.support.v7.widget.RecyclerView.State r12) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):void");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.t == 1 ? g(i) : f(i, recycler, state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        if (i >= getItemCount()) {
            i = getItemCount() - 1;
        }
        this.f = this.b.d(i);
        p();
        this.p = true;
        removeAllViews();
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return this.t == 1 ? f(i, recycler, state) : g(i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (i >= getItemCount()) {
            i = getItemCount() - 1;
        }
        thw thwVar = new thw(this, recyclerView.getContext());
        thwVar.setTargetPosition(i);
        startSmoothScroll(thwVar);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new thz((ViewGroup.MarginLayoutParams) layoutParams) : new thz(layoutParams);
    }

    public SpannedGridLayoutManager(thy thyVar, int i) {
        this.a = thyVar;
        this.n = new eph(i);
        setAutoMeasureEnabled(true);
        m(1);
    }
}
