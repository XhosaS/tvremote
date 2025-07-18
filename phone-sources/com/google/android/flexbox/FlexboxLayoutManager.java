package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import defpackage.nfw;
import defpackage.nfy;
import defpackage.nfz;
import defpackage.ngc;
import defpackage.ngd;
import defpackage.nge;
import defpackage.ngf;
import defpackage.rhz;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider, nfw {
    private static final Rect h = new Rect();
    public int a;
    public int b;
    public boolean c;
    public OrientationHelper e;
    public OrientationHelper f;
    private int i;
    private boolean k;
    private RecyclerView.Recycler l;
    private RecyclerView.State m;
    private nge n;
    private ngf p;
    private final Context v;
    private View w;
    private final int j = -1;
    public List d = new ArrayList();
    public final rhz g = new rhz(this);
    private final ngc o = new ngc(this);
    private int q = -1;
    private int r = Integer.MIN_VALUE;
    private int s = Integer.MIN_VALUE;
    private int t = Integer.MIN_VALUE;
    private final SparseArray u = new SparseArray();
    private int x = -1;
    private final nfz y = new nfz();

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.Properties properties = getProperties(context, attributeSet, i, i2);
        int i3 = properties.orientation;
        if (i3 != 0) {
            if (i3 == 1) {
                if (properties.reverseLayout) {
                    v(3);
                } else {
                    v(2);
                }
            }
        } else if (properties.reverseLayout) {
            v(1);
        } else {
            v(0);
        }
        if (this.b != 1) {
            removeAllViews();
            K();
            this.b = 1;
            this.e = null;
            this.f = null;
            requestLayout();
        }
        if (this.i != 4) {
            removeAllViews();
            K();
            this.i = 4;
            requestLayout();
        }
        this.v = context;
    }

    private final int A(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iC;
        int endAfterPadding;
        if (t() || !this.c) {
            int endAfterPadding2 = this.e.getEndAfterPadding() - i;
            if (endAfterPadding2 <= 0) {
                return 0;
            }
            iC = -C(-endAfterPadding2, recycler, state);
        } else {
            int startAfterPadding = i - this.e.getStartAfterPadding();
            if (startAfterPadding <= 0) {
                return 0;
            }
            iC = C(startAfterPadding, recycler, state);
        }
        int i2 = i + iC;
        if (!z || (endAfterPadding = this.e.getEndAfterPadding() - i2) <= 0) {
            return iC;
        }
        this.e.offsetChildren(endAfterPadding);
        return endAfterPadding + iC;
    }

    private final int B(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int iC;
        int startAfterPadding;
        if (t() || !this.c) {
            int startAfterPadding2 = i - this.e.getStartAfterPadding();
            if (startAfterPadding2 <= 0) {
                return 0;
            }
            iC = -C(startAfterPadding2, recycler, state);
        } else {
            int endAfterPadding = this.e.getEndAfterPadding() - i;
            if (endAfterPadding <= 0) {
                return 0;
            }
            iC = C(-endAfterPadding, recycler, state);
        }
        int i2 = i + iC;
        if (!z || (startAfterPadding = i2 - this.e.getStartAfterPadding()) <= 0) {
            return iC;
        }
        this.e.offsetChildren(-startAfterPadding);
        return iC - startAfterPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int C(int r18, android.support.v7.widget.RecyclerView.Recycler r19, android.support.v7.widget.RecyclerView.State r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.C(int, android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):int");
    }

    private final int D(int i) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        M();
        boolean zT = t();
        int width = zT ? this.w.getWidth() : this.w.getHeight();
        int width2 = zT ? getWidth() : getHeight();
        if (getLayoutDirection() == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((width2 + this.o.d) - width, iAbs);
            }
            int i2 = this.o.d;
            if (i2 + i > 0) {
                return -i2;
            }
        } else {
            if (i > 0) {
                return Math.min((width2 - this.o.d) - width, i);
            }
            int i3 = this.o.d;
            if (i3 + i < 0) {
                return -i3;
            }
        }
        return i;
    }

    private final View E(int i) {
        View viewI = I(0, getChildCount(), i);
        if (viewI == null) {
            return null;
        }
        int i2 = ((int[]) this.g.b)[getPosition(viewI)];
        if (i2 != -1) {
            return F(viewI, (nfy) this.d.get(i2));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View F(android.view.View r6, defpackage.nfy r7) {
        /*
            r5 = this;
            boolean r0 = r5.t()
            int r7 = r7.h
            r1 = 1
        L7:
            if (r1 >= r7) goto L3e
            android.view.View r2 = r5.getChildAt(r1)
            if (r2 == 0) goto L3b
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L3b
            boolean r3 = r5.c
            if (r3 == 0) goto L2c
            if (r0 != 0) goto L2c
            android.support.v7.widget.OrientationHelper r3 = r5.e
            int r3 = r3.getDecoratedEnd(r6)
            android.support.v7.widget.OrientationHelper r4 = r5.e
            int r4 = r4.getDecoratedEnd(r2)
            if (r3 >= r4) goto L3b
            goto L3a
        L2c:
            android.support.v7.widget.OrientationHelper r3 = r5.e
            int r3 = r3.getDecoratedStart(r6)
            android.support.v7.widget.OrientationHelper r4 = r5.e
            int r4 = r4.getDecoratedStart(r2)
            if (r3 <= r4) goto L3b
        L3a:
            r6 = r2
        L3b:
            int r1 = r1 + 1
            goto L7
        L3e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.F(android.view.View, nfy):android.view.View");
    }

    private final View G(int i) {
        View viewI = I(getChildCount() - 1, -1, i);
        if (viewI == null) {
            return null;
        }
        return H(viewI, (nfy) this.d.get(((int[]) this.g.b)[getPosition(viewI)]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.view.View H(android.view.View r6, defpackage.nfy r7) {
        /*
            r5 = this;
            boolean r0 = r5.t()
            int r1 = r5.getChildCount()
            int r1 = r1 + (-2)
            int r2 = r5.getChildCount()
            int r7 = r7.h
            int r2 = r2 - r7
        L11:
            int r7 = r2 + (-1)
            if (r1 <= r7) goto L4a
            android.view.View r7 = r5.getChildAt(r1)
            if (r7 == 0) goto L47
            int r3 = r7.getVisibility()
            r4 = 8
            if (r3 == r4) goto L47
            boolean r3 = r5.c
            if (r3 == 0) goto L38
            if (r0 != 0) goto L38
            android.support.v7.widget.OrientationHelper r3 = r5.e
            int r3 = r3.getDecoratedStart(r6)
            android.support.v7.widget.OrientationHelper r4 = r5.e
            int r4 = r4.getDecoratedStart(r7)
            if (r3 <= r4) goto L47
            goto L46
        L38:
            android.support.v7.widget.OrientationHelper r3 = r5.e
            int r3 = r3.getDecoratedEnd(r6)
            android.support.v7.widget.OrientationHelper r4 = r5.e
            int r4 = r4.getDecoratedEnd(r7)
            if (r3 >= r4) goto L47
        L46:
            r6 = r7
        L47:
            int r1 = r1 + (-1)
            goto L11
        L4a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.H(android.view.View, nfy):android.view.View");
    }

    private final View I(int i, int i2, int i3) {
        int position;
        M();
        L();
        int startAfterPadding = this.e.getStartAfterPadding();
        int endAfterPadding = this.e.getEndAfterPadding();
        View view = null;
        int i4 = i;
        View view2 = null;
        while (i4 != i2) {
            View childAt = getChildAt(i4);
            if (childAt != null && (position = getPosition(childAt)) >= 0 && position < i3) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.e.getDecoratedStart(childAt) >= startAfterPadding && this.e.getDecoratedEnd(childAt) <= endAfterPadding) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i4 += i2 > i ? 1 : -1;
        }
        return view != null ? view : view2;
    }

    private final View J() {
        return getChildAt(0);
    }

    private final void K() {
        this.d.clear();
        ngc ngcVar = this.o;
        ngcVar.b();
        ngcVar.d = 0;
    }

    private final void L() {
        if (this.n == null) {
            this.n = new nge();
        }
    }

    private final void M() {
        if (this.e != null) {
            return;
        }
        if (t()) {
            if (this.b == 0) {
                this.e = OrientationHelper.createHorizontalHelper(this);
                this.f = OrientationHelper.createVerticalHelper(this);
                return;
            } else {
                this.e = OrientationHelper.createVerticalHelper(this);
                this.f = OrientationHelper.createHorizontalHelper(this);
                return;
            }
        }
        if (this.b == 0) {
            this.e = OrientationHelper.createVerticalHelper(this);
            this.f = OrientationHelper.createHorizontalHelper(this);
        } else {
            this.e = OrientationHelper.createHorizontalHelper(this);
            this.f = OrientationHelper.createVerticalHelper(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void N(android.support.v7.widget.RecyclerView.Recycler r12, defpackage.nge r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.N(android.support.v7.widget.RecyclerView$Recycler, nge):void");
    }

    private final void O(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            removeAndRecycleViewAt(i2, recycler);
            i2--;
        }
    }

    private final void P() {
        int heightMode = t() ? getHeightMode() : getWidthMode();
        nge ngeVar = this.n;
        boolean z = true;
        if (heightMode != 0 && heightMode != Integer.MIN_VALUE) {
            z = false;
        }
        ngeVar.b = z;
    }

    private final void Q(int i) {
        if (i >= u()) {
            return;
        }
        int childCount = getChildCount();
        rhz rhzVar = this.g;
        rhzVar.j(childCount);
        rhzVar.k(childCount);
        rhzVar.i(childCount);
        if (i < ((int[]) rhzVar.b).length) {
            this.x = i;
            View viewJ = J();
            if (viewJ != null) {
                this.q = getPosition(viewJ);
                if (t() || !this.c) {
                    this.r = this.e.getDecoratedStart(viewJ) - this.e.getStartAfterPadding();
                } else {
                    this.r = this.e.getDecoratedEnd(viewJ) + this.e.getEndPadding();
                }
            }
        }
    }

    private final void R(ngc ngcVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            P();
        } else {
            this.n.b = false;
        }
        if (t() || !this.c) {
            this.n.a = this.e.getEndAfterPadding() - ngcVar.c;
        } else {
            this.n.a = ngcVar.c - getPaddingRight();
        }
        nge ngeVar = this.n;
        ngeVar.d = ngcVar.a;
        ngeVar.h = 1;
        nge ngeVar2 = this.n;
        ngeVar2.i = 1;
        ngeVar2.e = ngcVar.c;
        ngeVar2.f = Integer.MIN_VALUE;
        ngeVar2.c = ngcVar.b;
        if (!z || this.d.size() <= 1 || (i = ngcVar.b) < 0 || i >= this.d.size() - 1) {
            return;
        }
        nfy nfyVar = (nfy) this.d.get(ngcVar.b);
        nge ngeVar3 = this.n;
        ngeVar3.c++;
        ngeVar3.d += nfyVar.h;
    }

    private final void S(ngc ngcVar, boolean z, boolean z2) {
        if (z2) {
            P();
        } else {
            this.n.b = false;
        }
        if (t() || !this.c) {
            this.n.a = ngcVar.c - this.e.getStartAfterPadding();
        } else {
            this.n.a = (this.w.getWidth() - ngcVar.c) - this.e.getStartAfterPadding();
        }
        nge ngeVar = this.n;
        ngeVar.d = ngcVar.a;
        ngeVar.h = 1;
        nge ngeVar2 = this.n;
        ngeVar2.i = -1;
        ngeVar2.e = ngcVar.c;
        ngeVar2.f = Integer.MIN_VALUE;
        ngeVar2.c = ngcVar.b;
        if (!z || ngcVar.b <= 0) {
            return;
        }
        int size = this.d.size();
        int i = ngcVar.b;
        if (size > i) {
            nfy nfyVar = (nfy) this.d.get(i);
            r4.c--;
            this.n.d -= nfyVar.h;
        }
    }

    private static boolean T(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private final boolean U(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return (!view.isLayoutRequested() && isMeasurementCacheEnabled() && T(view.getWidth(), i, layoutParams.width) && T(view.getHeight(), i2, layoutParams.height)) ? false : true;
    }

    private final View V(int i, int i2) {
        int i3 = i;
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int decoratedLeft = getDecoratedLeft(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).leftMargin;
            int decoratedTop = getDecoratedTop(childAt) - ((RecyclerView.LayoutParams) childAt.getLayoutParams()).topMargin;
            int decoratedRight = getDecoratedRight(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            int decoratedBottom = getDecoratedBottom(childAt) + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            int i4 = 1;
            boolean z = decoratedLeft >= width || decoratedRight >= paddingLeft;
            boolean z2 = decoratedTop >= height || decoratedBottom >= paddingTop;
            if (z && z2) {
                return childAt;
            }
            if (i2 <= i) {
                i4 = -1;
            }
            i3 += i4;
        }
        return null;
    }

    private final int w(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        M();
        View viewE = E(itemCount);
        View viewG = G(itemCount);
        if (state.getItemCount() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        return Math.min(this.e.getTotalSpace(), this.e.getDecoratedEnd(viewG) - this.e.getDecoratedStart(viewE));
    }

    private final int x(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        int itemCount = state.getItemCount();
        View viewE = E(itemCount);
        View viewG = G(itemCount);
        if (state.getItemCount() == 0 || viewE == null || viewG == null) {
            return 0;
        }
        int position = getPosition(viewE);
        int position2 = getPosition(viewG);
        int decoratedEnd = this.e.getDecoratedEnd(viewG) - this.e.getDecoratedStart(viewE);
        rhz rhzVar = this.g;
        int iAbs = Math.abs(decoratedEnd);
        int i = ((int[]) rhzVar.b)[position];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((r3[position2] - i) + 1))) + (this.e.getStartAfterPadding() - this.e.getDecoratedStart(viewE)));
    }

    private final int y(RecyclerView.State state) {
        if (getChildCount() != 0) {
            int itemCount = state.getItemCount();
            View viewE = E(itemCount);
            View viewG = G(itemCount);
            if (state.getItemCount() != 0 && viewE != null && viewG != null) {
                View viewV = V(0, getChildCount());
                int position = viewV == null ? -1 : getPosition(viewV);
                return (int) ((Math.abs(this.e.getDecoratedEnd(viewG) - this.e.getDecoratedStart(viewE)) / ((u() - position) + 1)) * state.getItemCount());
            }
        }
        return 0;
    }

    private final int z(RecyclerView.Recycler recycler, RecyclerView.State state, nge ngeVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float measuredHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        float f;
        int i10;
        int i11;
        int i12 = ngeVar.f;
        if (i12 != Integer.MIN_VALUE) {
            int i13 = ngeVar.a;
            if (i13 < 0) {
                ngeVar.f = i12 + i13;
            }
            N(recycler, ngeVar);
        }
        int i14 = ngeVar.a;
        boolean zT = t();
        int i15 = i14;
        int i16 = 0;
        while (true) {
            if (i15 <= 0 && !this.n.b) {
                break;
            }
            List list = this.d;
            int i17 = ngeVar.d;
            if (i17 < 0 || i17 >= state.getItemCount() || (i = ngeVar.c) < 0 || i >= list.size()) {
                break;
            }
            nfy nfyVar = (nfy) this.d.get(ngeVar.c);
            ngeVar.d = nfyVar.o;
            if (t()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int width = getWidth();
                int i18 = ngeVar.e;
                if (ngeVar.i == -1) {
                    i18 -= nfyVar.g;
                }
                int i19 = ngeVar.d;
                float f2 = this.o.d;
                float fMax = Math.max(0.0f, 0.0f);
                int i20 = nfyVar.h;
                float measuredWidth = (width - paddingRight) - f2;
                float measuredWidth2 = paddingLeft - f2;
                int i21 = i19;
                int i22 = 0;
                while (i21 < i19 + i20) {
                    int i23 = i20;
                    View viewM = m(i21);
                    if (viewM == null) {
                        i8 = i14;
                        i9 = i19;
                        z2 = zT;
                        i11 = i21;
                        i10 = i23;
                    } else {
                        i8 = i14;
                        i9 = i19;
                        if (ngeVar.i == 1) {
                            calculateItemDecorationsForChild(viewM, h);
                            addView(viewM);
                        } else {
                            calculateItemDecorationsForChild(viewM, h);
                            addView(viewM, i22);
                            i22++;
                        }
                        int i24 = i22;
                        int i25 = i21;
                        rhz rhzVar = this.g;
                        long j = ((long[]) rhzVar.e)[i25];
                        z2 = zT;
                        int i26 = (int) j;
                        int iQ = rhz.q(j);
                        if (U(viewM, i26, iQ, (ngd) viewM.getLayoutParams())) {
                            viewM.measure(i26, iQ);
                        }
                        float leftDecorationWidth = measuredWidth2 + r4.leftMargin + getLeftDecorationWidth(viewM);
                        float rightDecorationWidth = measuredWidth - (r4.rightMargin + getRightDecorationWidth(viewM));
                        int topDecorationHeight = i18 + getTopDecorationHeight(viewM);
                        if (this.c) {
                            i11 = i25;
                            i10 = i23;
                            f = rightDecorationWidth;
                            rhzVar.l(viewM, nfyVar, Math.round(rightDecorationWidth) - viewM.getMeasuredWidth(), topDecorationHeight, Math.round(rightDecorationWidth), topDecorationHeight + viewM.getMeasuredHeight());
                        } else {
                            f = rightDecorationWidth;
                            i10 = i23;
                            i11 = i25;
                            rhzVar.l(viewM, nfyVar, Math.round(leftDecorationWidth), topDecorationHeight, Math.round(leftDecorationWidth) + viewM.getMeasuredWidth(), topDecorationHeight + viewM.getMeasuredHeight());
                        }
                        measuredWidth2 = leftDecorationWidth + viewM.getMeasuredWidth() + r4.rightMargin + getRightDecorationWidth(viewM) + fMax;
                        measuredWidth = f - (((viewM.getMeasuredWidth() + r4.leftMargin) + getLeftDecorationWidth(viewM)) + fMax);
                        i22 = i24;
                    }
                    i21 = i11 + 1;
                    i20 = i10;
                    i14 = i8;
                    i19 = i9;
                    zT = z2;
                }
                i2 = i14;
                z = zT;
                ngeVar.c += this.n.i;
                i4 = nfyVar.g;
            } else {
                i2 = i14;
                z = zT;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i27 = ngeVar.e;
                if (ngeVar.i == -1) {
                    int i28 = nfyVar.g;
                    i3 = i27 + i28;
                    i27 -= i28;
                } else {
                    i3 = i27;
                }
                int i29 = ngeVar.d;
                int i30 = height - paddingBottom;
                float f3 = this.o.d;
                float fMax2 = Math.max(0.0f, 0.0f);
                int i31 = nfyVar.h;
                float measuredHeight2 = i30 - f3;
                float f4 = paddingTop - f3;
                int i32 = i29;
                int i33 = 0;
                while (i32 < i29 + i31) {
                    int i34 = i31;
                    View viewM2 = m(i32);
                    if (viewM2 != null) {
                        int i35 = i29;
                        rhz rhzVar2 = this.g;
                        float f5 = f4;
                        i5 = i32;
                        long j2 = ((long[]) rhzVar2.e)[i5];
                        int i36 = (int) j2;
                        int iQ2 = rhz.q(j2);
                        if (U(viewM2, i36, iQ2, (ngd) viewM2.getLayoutParams())) {
                            viewM2.measure(i36, iQ2);
                        }
                        float topDecorationHeight2 = f5 + r5.topMargin + getTopDecorationHeight(viewM2);
                        float bottomDecorationHeight = measuredHeight2 - (r5.rightMargin + getBottomDecorationHeight(viewM2));
                        if (ngeVar.i == 1) {
                            calculateItemDecorationsForChild(viewM2, h);
                            addView(viewM2);
                        } else {
                            calculateItemDecorationsForChild(viewM2, h);
                            addView(viewM2, i33);
                            i33++;
                        }
                        int i37 = i33;
                        int leftDecorationWidth2 = getLeftDecorationWidth(viewM2) + i27;
                        int rightDecorationWidth2 = i3 - getRightDecorationWidth(viewM2);
                        if (!this.c) {
                            i7 = i34;
                            i6 = i35;
                            if (this.k) {
                                rhzVar2.m(viewM2, nfyVar, false, leftDecorationWidth2, Math.round(bottomDecorationHeight) - viewM2.getMeasuredHeight(), leftDecorationWidth2 + viewM2.getMeasuredWidth(), Math.round(bottomDecorationHeight));
                            } else {
                                rhzVar2.m(viewM2, nfyVar, false, leftDecorationWidth2, Math.round(topDecorationHeight2), leftDecorationWidth2 + viewM2.getMeasuredWidth(), Math.round(topDecorationHeight2) + viewM2.getMeasuredHeight());
                            }
                        } else if (this.k) {
                            i6 = i35;
                            i7 = i34;
                            rhzVar2.m(viewM2, nfyVar, true, rightDecorationWidth2 - viewM2.getMeasuredWidth(), Math.round(bottomDecorationHeight) - viewM2.getMeasuredHeight(), rightDecorationWidth2, Math.round(bottomDecorationHeight));
                        } else {
                            i7 = i34;
                            i6 = i35;
                            rhzVar2.m(viewM2, nfyVar, true, rightDecorationWidth2 - viewM2.getMeasuredWidth(), Math.round(topDecorationHeight2), rightDecorationWidth2, Math.round(topDecorationHeight2) + viewM2.getMeasuredHeight());
                        }
                        measuredHeight2 = bottomDecorationHeight - (((viewM2.getMeasuredHeight() + r5.bottomMargin) + getTopDecorationHeight(viewM2)) + fMax2);
                        i33 = i37;
                        measuredHeight = topDecorationHeight2 + viewM2.getMeasuredHeight() + r5.topMargin + getBottomDecorationHeight(viewM2) + fMax2;
                    } else {
                        measuredHeight = f4;
                        i5 = i32;
                        i6 = i29;
                        i7 = i34;
                    }
                    i32 = i5 + 1;
                    i31 = i7;
                    f4 = measuredHeight;
                    i29 = i6;
                }
                ngeVar.c += this.n.i;
                i4 = nfyVar.g;
            }
            i16 += i4;
            if (z || !this.c) {
                ngeVar.e += nfyVar.g * ngeVar.i;
            } else {
                ngeVar.e -= nfyVar.g * ngeVar.i;
            }
            i15 -= nfyVar.g;
            i14 = i2;
            zT = z;
        }
        int i38 = i14;
        int i39 = ngeVar.a - i16;
        ngeVar.a = i39;
        int i40 = ngeVar.f;
        if (i40 != Integer.MIN_VALUE) {
            int i41 = i40 + i16;
            ngeVar.f = i41;
            if (i39 < 0) {
                ngeVar.f = i41 + i39;
            }
            N(recycler, ngeVar);
        }
        return i38 - ngeVar.a;
    }

    @Override // defpackage.nfw
    public final int a() {
        return 5;
    }

    @Override // defpackage.nfw
    public final int b() {
        return this.i;
    }

    @Override // defpackage.nfw
    public final int c(int i, int i2, int i3) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i2, i3, canScrollVertically());
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        if (this.b == 0) {
            return t();
        }
        if (!t()) {
            return true;
        }
        int width = getWidth();
        View view = this.w;
        return width > (view != null ? view.getWidth() : 0);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        if (this.b == 0) {
            return !t();
        }
        if (!t()) {
            int height = getHeight();
            View view = this.w;
            if (height <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof ngd;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return w(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return x(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return y(state);
    }

    @Override // android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        float f = i < getPosition(childAt) ? -1 : 1;
        return t() ? new PointF(0.0f, f) : new PointF(f, 0.0f);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return w(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return x(state);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return y(state);
    }

    @Override // defpackage.nfw
    public final int d(int i, int i2, int i3) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i2, i3, canScrollHorizontally());
    }

    @Override // defpackage.nfw
    public final int e(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (t()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // defpackage.nfw
    public final int f(View view, int i, int i2) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (t()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // defpackage.nfw
    public final int g() {
        return this.a;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new ngd();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new ngd(context, attributeSet);
    }

    @Override // defpackage.nfw
    public final int h() {
        return this.m.getItemCount();
    }

    @Override // defpackage.nfw
    public final int i() {
        return this.b;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // defpackage.nfw
    public final int j() {
        if (this.d.size() == 0) {
            return 0;
        }
        int size = this.d.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((nfy) this.d.get(i)).e);
        }
        return iMax;
    }

    @Override // defpackage.nfw
    public final int k() {
        return this.j;
    }

    @Override // defpackage.nfw
    public final int l() {
        int size = this.d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((nfy) this.d.get(i2)).g;
        }
        return i;
    }

    @Override // defpackage.nfw
    public final View m(int i) {
        View view = (View) this.u.get(i);
        return view != null ? view : this.l.getViewForPosition(i);
    }

    @Override // defpackage.nfw
    public final View n(int i) {
        return m(i);
    }

    @Override // defpackage.nfw
    public final List o() {
        return this.d;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        removeAllViews();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        this.w = (View) recyclerView.getParent();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        Q(i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        Q(Math.min(i, i2));
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        Q(i);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        Q(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, java.util.List] */
    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler r18, android.support.v7.widget.RecyclerView.State r19) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.onLayoutChildren(android.support.v7.widget.RecyclerView$Recycler, android.support.v7.widget.RecyclerView$State):void");
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        this.p = null;
        this.q = -1;
        this.r = Integer.MIN_VALUE;
        this.x = -1;
        this.o.b();
        this.u.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ngf) {
            this.p = (ngf) parcelable;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        ngf ngfVar = this.p;
        if (ngfVar != null) {
            return new ngf(ngfVar);
        }
        ngf ngfVar2 = new ngf();
        if (getChildCount() <= 0) {
            ngfVar2.a();
            return ngfVar2;
        }
        View viewJ = J();
        ngfVar2.a = getPosition(viewJ);
        ngfVar2.b = this.e.getDecoratedStart(viewJ) - this.e.getStartAfterPadding();
        return ngfVar2;
    }

    @Override // defpackage.nfw
    public final void p(View view, int i, int i2, nfy nfyVar) {
        calculateItemDecorationsForChild(view, h);
        if (t()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            nfyVar.e += leftDecorationWidth;
            nfyVar.f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            nfyVar.e += topDecorationHeight;
            nfyVar.f += topDecorationHeight;
        }
    }

    @Override // defpackage.nfw
    public final void r(List list) {
        this.d = list;
    }

    @Override // defpackage.nfw
    public final void s(int i, View view) {
        this.u.put(i, view);
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!t() || this.b == 0) {
            int iC = C(i, recycler, state);
            this.u.clear();
            return iC;
        }
        int iD = D(i);
        this.o.d += iD;
        this.f.offsetChildren(-iD);
        return iD;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        this.q = i;
        this.r = Integer.MIN_VALUE;
        ngf ngfVar = this.p;
        if (ngfVar != null) {
            ngfVar.a();
        }
        requestLayout();
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (t() || (this.b == 0 && !t())) {
            int iC = C(i, recycler, state);
            this.u.clear();
            return iC;
        }
        int iD = D(i);
        this.o.d += iD;
        this.f.offsetChildren(-iD);
        return iD;
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // defpackage.nfw
    public final boolean t() {
        int i = this.a;
        return i == 0 || i == 1;
    }

    public final int u() {
        View viewV = V(getChildCount() - 1, -1);
        if (viewV == null) {
            return -1;
        }
        return getPosition(viewV);
    }

    public final void v(int i) {
        if (this.a != i) {
            removeAllViews();
            this.a = i;
            this.e = null;
            this.f = null;
            K();
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.onItemsUpdated(recyclerView, i, i2, obj);
        Q(i);
    }

    @Override // defpackage.nfw
    public final void q(nfy nfyVar) {
    }
}
