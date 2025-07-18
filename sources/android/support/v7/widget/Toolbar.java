package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.google.android.tv.remote.service.R;
import defpackage.ac;
import defpackage.aps;
import defpackage.bi;
import defpackage.byj;
import defpackage.bzt;
import defpackage.cu;
import defpackage.de;
import defpackage.du;
import defpackage.dw;
import defpackage.fa;
import defpackage.fo;
import defpackage.fp;
import defpackage.gm;
import defpackage.ii;
import defpackage.jf;
import defpackage.jq;
import defpackage.jr;
import defpackage.js;
import defpackage.ju;
import defpackage.jx;
import defpackage.kc;
import defpackage.pr;
import defpackage.qv;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements pr {
    private int A;
    private int B;
    private int C;
    private int D;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList I;
    private final int[] J;
    private jx K;
    private final Runnable L;
    private final byj M;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageView e;
    public Drawable f;
    public CharSequence g;
    public ImageButton h;
    public View i;
    public Context j;
    public int k;
    public int l;
    public int m;
    public int n;
    public jf o;
    public CharSequence p;
    public CharSequence q;
    public final ArrayList r;
    public ArrayList s;
    public fa t;
    public jr u;
    public final bzt v;
    private int w;
    private int x;
    private int y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int A(View view, int i) {
        js jsVar = (js) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = jsVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.D & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - jsVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < jsVar.topMargin) {
            iMax = jsVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < jsVar.bottomMargin) {
                iMax = Math.max(0, iMax - (jsVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int B(View view, int i, int[] iArr, int i2) {
        js jsVar = (js) view.getLayoutParams();
        int i3 = jsVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iA = A(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iA, iMax + measuredWidth, view.getMeasuredHeight() + iA);
        return iMax + measuredWidth + jsVar.rightMargin;
    }

    private final int C(View view, int i, int[] iArr, int i2) {
        js jsVar = (js) view.getLayoutParams();
        int i3 = jsVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iA = A(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iA, iMax, view.getMeasuredHeight() + iA);
        return iMax - (measuredWidth + jsVar.leftMargin);
    }

    private final int D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void E(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                js jsVar = (js) childAt.getLayoutParams();
                if (jsVar.b == 0 && I(childAt) && z(jsVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            js jsVar2 = (js) childAt2.getLayoutParams();
            if (jsVar2.b == 0 && I(childAt2) && z(jsVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void F(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        js jsVar = layoutParams == null ? new js() : !checkLayoutParams(layoutParams) ? y(layoutParams) : (js) layoutParams;
        jsVar.b = 1;
        if (!z || this.i == null) {
            addView(view, jsVar);
        } else {
            view.setLayoutParams(jsVar);
            this.r.add(view);
        }
    }

    private final void G() {
        if (this.e == null) {
            this.e = new fp(getContext(), null);
        }
    }

    private final boolean H(View view) {
        return view.getParent() == this || this.r.contains(view);
    }

    private final boolean I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int J(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int K(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void L(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    protected static final js y(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof js ? new js((js) layoutParams) : layoutParams instanceof bi ? new js((bi) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new js((ViewGroup.MarginLayoutParams) layoutParams) : new js(layoutParams);
    }

    private final int z(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int a() {
        jf jfVar = this.o;
        if (jfVar != null) {
            return jfVar.g ? jfVar.a : jfVar.b;
        }
        return 0;
    }

    public final int b() {
        jf jfVar = this.o;
        if (jfVar != null) {
            return jfVar.g ? jfVar.b : jfVar.a;
        }
        return 0;
    }

    public final int c() {
        du duVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (duVar = actionMenuView.a) == null || !duVar.hasVisibleItems()) ? a() : Math.max(a(), Math.max(this.C, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof js);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.B, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Menu f() {
        l();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menuG = actionMenuView.g();
            if (this.u == null) {
                this.u = new jr(this);
            }
            this.a.c.o();
            ((du) menuG).h(this.u, this.j);
            t();
        }
        return this.a.g();
    }

    public final MenuInflater g() {
        return new de(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new js();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new js(getContext(), attributeSet);
    }

    public final CharSequence h() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        jr jrVar = this.u;
        dw dwVar = jrVar == null ? null : jrVar.b;
        if (dwVar != null) {
            dwVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.o == null) {
            this.o = new jf();
        }
    }

    public final void l() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.i(this.k);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.M;
            actionMenuView2.d = new jq(this, 0);
            js jsVar = new js();
            jsVar.a = (this.n & 112) | 8388613;
            this.a.setLayoutParams(jsVar);
            F(this.a, false);
        }
    }

    public final void m() {
        if (this.d == null) {
            this.d = new fo(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            js jsVar = new js();
            jsVar.a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(jsVar);
        }
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            G();
            if (!H(this.e)) {
                F(this.e, true);
            }
        } else {
            ImageView imageView = this.e;
            if (imageView != null && H(imageView)) {
                removeView(this.e);
                this.r.remove(this.e);
            }
        }
        ImageView imageView2 = this.e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            ii.r(this.d, charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.L);
        t();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lc
            r5.H = r1
            r0 = r2
        Lc:
            boolean r3 = r5.H
            r4 = 1
            if (r3 != 0) goto L1c
            boolean r6 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1c
            if (r6 != 0) goto L1d
            r5.H = r4
            goto L1d
        L1c:
            r2 = r0
        L1d:
            r6 = 10
            if (r2 == r6) goto L24
            r6 = 3
            if (r2 != r6) goto L26
        L24:
            r5.H = r1
        L26:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x02be A[LOOP:0: B:113:0x02bc->B:114:0x02be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d6 A[LOOP:1: B:116:0x02d4->B:117:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7 A[LOOP:2: B:119:0x02f5->B:120:0x02f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0345 A[LOOP:3: B:128:0x0343->B:129:0x0345, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        boolean zA = kc.a(this);
        int i3 = !zA ? 1 : 0;
        int iMax2 = 0;
        if (I(this.d)) {
            L(this.d, i, 0, i2, this.w);
            measuredWidth = this.d.getMeasuredWidth() + J(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + K(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (I(this.h)) {
            L(this.h, i, 0, i2, this.w);
            measuredWidth = this.h.getMeasuredWidth() + J(this.h);
            iMax = Math.max(iMax, this.h.getMeasuredHeight() + K(this.h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int[] iArr = this.J;
        int iD = d();
        int iMax3 = Math.max(iD, measuredWidth);
        iArr[zA ? 1 : 0] = Math.max(0, iD - measuredWidth);
        if (I(this.a)) {
            L(this.a, i, iMax3, i2, this.w);
            measuredWidth2 = this.a.getMeasuredWidth() + J(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + K(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + Math.max(iC, measuredWidth2);
        iArr[i3] = Math.max(0, iC - measuredWidth2);
        if (I(this.i)) {
            iMax4 += D(this.i, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + K(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        if (I(this.e)) {
            iMax4 += D(this.e, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + K(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((js) childAt.getLayoutParams()).b == 0 && I(childAt)) {
                iMax4 += D(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + K(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.z + this.A;
        int i7 = this.x + this.y;
        if (I(this.b)) {
            D(this.b, i, i5 + i7, i2, i6, iArr);
            iMax2 = this.b.getMeasuredWidth() + J(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + K(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (I(this.c)) {
            iMax2 = Math.max(iMax2, D(this.c, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + K(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof ju)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ju juVar = (ju) parcelable;
        super.onRestoreInstanceState(juVar.d);
        ActionMenuView actionMenuView = this.a;
        du duVar = actionMenuView != null ? actionMenuView.a : null;
        int i = juVar.a;
        if (i != 0 && this.u != null && duVar != null && (menuItemFindItem = duVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (juVar.b) {
            Runnable runnable = this.L;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        jf jfVar = this.o;
        boolean z = jfVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        jfVar.g = z2;
        if (!jfVar.h) {
            jfVar.a = jfVar.e;
            jfVar.b = jfVar.f;
            return;
        }
        if (z2) {
            int i2 = jfVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = jfVar.e;
            }
            jfVar.a = i2;
            int i3 = jfVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = jfVar.f;
            }
            jfVar.b = i3;
            return;
        }
        int i4 = jfVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = jfVar.e;
        }
        jfVar.a = i4;
        int i5 = jfVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = jfVar.f;
        }
        jfVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        dw dwVar;
        ju juVar = new ju(super.onSaveInstanceState());
        jr jrVar = this.u;
        if (jrVar != null && (dwVar = jrVar.b) != null) {
            juVar.a = dwVar.a;
        }
        juVar.b = v();
        return juVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G = false;
            actionMasked = 0;
        }
        if (!this.G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.G = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    public void p(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!H(this.d)) {
                F(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && H(imageButton)) {
                removeView(this.d);
                this.r.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void q(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void r(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && H(textView)) {
                removeView(this.c);
                this.r.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                gm gmVar = new gm(context);
                this.c = gmVar;
                gmVar.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!H(this.c)) {
                F(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.q = charSequence;
    }

    public final void s(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && H(textView)) {
                removeView(this.b);
                this.r.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                gm gmVar = new gm(context);
                this.b = gmVar;
                gmVar.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!H(this.b)) {
                F(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.p = charSequence;
    }

    public final void t() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!u() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            isAttachedToWindow();
        }
    }

    public final boolean u() {
        jr jrVar = this.u;
        return (jrVar == null || jrVar.b == null) ? false : true;
    }

    public final boolean v() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.l();
    }

    public final boolean w() {
        fa faVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (faVar = actionMenuView.c) == null || !faVar.m()) ? false : true;
    }

    public final jx x() {
        if (this.K == null) {
            this.K = new jx(this);
        }
        return this.K;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return y(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = 8388627;
        this.I = new ArrayList();
        this.r = new ArrayList();
        this.J = new int[2];
        this.v = new bzt(new ac(this, 16));
        this.s = new ArrayList();
        this.M = new byj(this, null);
        this.L = new ac(this, 17, null);
        Context context2 = getContext();
        int[] iArr = cu.w;
        aps apsVarR = aps.r(context2, attributeSet, iArr, i, 0);
        qv.k(this, context, iArr, attributeSet, (TypedArray) apsVarR.a, i, 0);
        this.l = apsVarR.g(28, 0);
        this.m = apsVarR.g(19, 0);
        this.D = apsVarR.e(0, this.D);
        this.n = apsVarR.e(2, 48);
        int iB = apsVarR.b(22, 0);
        iB = apsVarR.o(27) ? apsVarR.b(27, iB) : iB;
        this.A = iB;
        this.z = iB;
        this.y = iB;
        this.x = iB;
        int iB2 = apsVarR.b(25, -1);
        if (iB2 >= 0) {
            this.x = iB2;
        }
        int iB3 = apsVarR.b(24, -1);
        if (iB3 >= 0) {
            this.y = iB3;
        }
        int iB4 = apsVarR.b(26, -1);
        if (iB4 >= 0) {
            this.z = iB4;
        }
        int iB5 = apsVarR.b(23, -1);
        if (iB5 >= 0) {
            this.A = iB5;
        }
        this.w = apsVarR.c(13, -1);
        int iB6 = apsVarR.b(9, Integer.MIN_VALUE);
        int iB7 = apsVarR.b(5, Integer.MIN_VALUE);
        int iC = apsVarR.c(7, 0);
        int iC2 = apsVarR.c(8, 0);
        k();
        jf jfVar = this.o;
        jfVar.h = false;
        if (iC != Integer.MIN_VALUE) {
            jfVar.e = iC;
            jfVar.a = iC;
        }
        if (iC2 != Integer.MIN_VALUE) {
            jfVar.f = iC2;
            jfVar.b = iC2;
        }
        if (iB6 != Integer.MIN_VALUE || iB7 != Integer.MIN_VALUE) {
            jfVar.a(iB6, iB7);
        }
        this.B = apsVarR.b(10, Integer.MIN_VALUE);
        this.C = apsVarR.b(6, Integer.MIN_VALUE);
        this.f = apsVarR.i(4);
        this.g = apsVarR.k(3);
        CharSequence charSequenceK = apsVarR.k(21);
        if (!TextUtils.isEmpty(charSequenceK)) {
            s(charSequenceK);
        }
        CharSequence charSequenceK2 = apsVarR.k(18);
        if (!TextUtils.isEmpty(charSequenceK2)) {
            r(charSequenceK2);
        }
        this.j = getContext();
        q(apsVarR.g(17, 0));
        Drawable drawableI = apsVarR.i(16);
        if (drawableI != null) {
            p(drawableI);
        }
        CharSequence charSequenceK3 = apsVarR.k(15);
        if (!TextUtils.isEmpty(charSequenceK3)) {
            o(charSequenceK3);
        }
        Drawable drawableI2 = apsVarR.i(11);
        if (drawableI2 != null) {
            n(drawableI2);
        }
        CharSequence charSequenceK4 = apsVarR.k(12);
        if (!TextUtils.isEmpty(charSequenceK4)) {
            if (!TextUtils.isEmpty(charSequenceK4)) {
                G();
            }
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceK4);
            }
        }
        if (apsVarR.o(29)) {
            ColorStateList colorStateListH = apsVarR.h(29);
            this.E = colorStateListH;
            TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListH);
            }
        }
        if (apsVarR.o(20)) {
            ColorStateList colorStateListH2 = apsVarR.h(20);
            this.F = colorStateListH2;
            TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListH2);
            }
        }
        if (apsVarR.o(14)) {
            g().inflate(apsVarR.g(14, 0), f());
        }
        apsVarR.m();
    }
}
