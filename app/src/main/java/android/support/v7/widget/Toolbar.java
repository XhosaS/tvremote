package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
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
import androidx.customview.view.AbsSavedState;
import com.google.android.katniss.R;
import defpackage.agc;
import defpackage.age;
import defpackage.ahj;
import defpackage.cr;
import defpackage.fq;
import defpackage.hs;
import defpackage.ip;
import defpackage.jj;
import defpackage.jm;
import defpackage.kw;
import defpackage.ls;
import defpackage.lu;
import defpackage.nc;
import defpackage.ra;
import defpackage.rc;
import defpackage.rv;
import defpackage.rx;
import defpackage.ry;
import defpackage.rz;
import defpackage.sa;
import defpackage.sb;
import defpackage.sc;
import defpackage.sd;
import defpackage.sg;
import defpackage.sm;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements agc {
    private int A;
    private int B;
    private CharSequence C;
    private CharSequence D;
    private ColorStateList E;
    private ColorStateList F;
    private boolean G;
    private boolean H;
    private final ArrayList I;
    private final int[] J;
    private sg K;
    private final Runnable L;
    private final rx M;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageButton d;
    public ImageButton e;
    public View f;
    public Context g;
    public int h;
    public int i;
    public int j;
    public int k;
    public rc l;
    public final ArrayList m;
    public final age n;
    public ArrayList o;
    public kw p;
    public sb q;
    private ImageView r;
    private Drawable s;
    private CharSequence t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    private final int A(View view, int i, int[] iArr, int i2) {
        sc scVar = (sc) view.getLayoutParams();
        int i3 = scVar.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iX = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iX, iMax + measuredWidth, view.getMeasuredHeight() + iX);
        return iMax + measuredWidth + scVar.rightMargin;
    }

    private final int B(View view, int i, int[] iArr, int i2) {
        sc scVar = (sc) view.getLayoutParams();
        int i3 = scVar.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iX = x(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iX, iMax, view.getMeasuredHeight() + iX);
        return iMax - (measuredWidth + scVar.leftMargin);
    }

    private final int C(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void D(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                sc scVar = (sc) childAt.getLayoutParams();
                if (scVar.b == 0 && I(childAt) && w(scVar.a) == absoluteGravity) {
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
            sc scVar2 = (sc) childAt2.getLayoutParams();
            if (scVar2.b == 0 && I(childAt2) && w(scVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void E(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        sc scVar = layoutParams == null ? new sc() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (sc) layoutParams;
        scVar.b = 1;
        if (!z || this.f == null) {
            addView(view, scVar);
        } else {
            view.setLayoutParams(scVar);
            this.m.add(view);
        }
    }

    private final void F() {
        if (this.r == null) {
            this.r = new lu(getContext());
        }
    }

    private final void G() {
        g();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu menu = actionMenuView.getMenu();
            if (this.q == null) {
                this.q = new sb(this);
            }
            this.a.c.i = true;
            ((jj) menu).f(this.q, this.g);
            s();
        }
    }

    private final boolean H(View view) {
        return view.getParent() == this || this.m.contains(view);
    }

    private final boolean I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final void J(View view, int i, int i2, int i3, int i4) {
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

    private final int w(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int x(View view, int i) {
        sc scVar = (sc) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = scVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - scVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < scVar.topMargin) {
            iMax = scVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < scVar.bottomMargin) {
                iMax = Math.max(0, iMax - (scVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int y(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private final int z(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final sc generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof sc ? new sc((sc) layoutParams) : layoutParams instanceof fq ? new sc((fq) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new sc((ViewGroup.MarginLayoutParams) layoutParams) : new sc(layoutParams);
    }

    public final MenuInflater b() {
        return new ip(getContext());
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof sc);
    }

    public final void d() {
        sb sbVar = this.q;
        jm jmVar = sbVar == null ? null : sbVar.b;
        if (jmVar != null) {
            jmVar.collapseActionView();
        }
    }

    @Override // defpackage.agc
    public final void dr(cr crVar) {
        this.n.d(crVar);
    }

    @Override // defpackage.agc
    public final void ds(cr crVar) {
        this.n.e(crVar);
    }

    public final void e() {
        if (this.e == null) {
            ls lsVar = new ls(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.e = lsVar;
            lsVar.setImageDrawable(this.s);
            this.e.setContentDescription(this.t);
            sc scVar = new sc();
            scVar.a = (this.k & 112) | 8388611;
            scVar.b = 2;
            this.e.setLayoutParams(scVar);
            this.e.setOnClickListener(new sa(this));
        }
    }

    public final void f() {
        if (this.l == null) {
            this.l = new rc();
        }
    }

    public final void g() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.setPopupTheme(this.h);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.M;
            actionMenuView2.d = new rz(this);
            sc scVar = new sc();
            scVar.a = (this.k & 112) | 8388613;
            this.a.setLayoutParams(scVar);
            E(this.a, false);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new sc();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new sc(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        rc rcVar = this.l;
        if (rcVar != null) {
            return rcVar.g ? rcVar.a : rcVar.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        rc rcVar = this.l;
        if (rcVar != null) {
            return rcVar.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        rc rcVar = this.l;
        if (rcVar != null) {
            return rcVar.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        rc rcVar = this.l;
        if (rcVar != null) {
            return rcVar.g ? rcVar.b : rcVar.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        jj jjVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (jjVar = actionMenuView.a) == null || !jjVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.A, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.r;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.r;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        G();
        return this.a.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public Drawable getOverflowIcon() {
        G();
        return this.a.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.h;
    }

    public CharSequence getSubtitle() {
        return this.D;
    }

    public CharSequence getTitle() {
        return this.C;
    }

    public int getTitleMarginBottom() {
        return this.y;
    }

    public int getTitleMarginEnd() {
        return this.w;
    }

    public int getTitleMarginStart() {
        return this.v;
    }

    public int getTitleMarginTop() {
        return this.x;
    }

    public nc getWrapper() {
        if (this.K == null) {
            this.K = new sg(this);
        }
        return this.K;
    }

    public final void h() {
        if (this.d == null) {
            this.d = new ls(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            sc scVar = new sc();
            scVar.a = (this.k & 112) | 8388611;
            this.d.setLayoutParams(scVar);
        }
    }

    public final void i(Drawable drawable) {
        if (drawable != null) {
            F();
            if (!H(this.r)) {
                E(this.r, true);
            }
        } else {
            ImageView imageView = this.r;
            if (imageView != null && H(imageView)) {
                removeView(this.r);
                this.m.remove(this.r);
            }
        }
        ImageView imageView2 = this.r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void j(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            F();
        }
        ImageView imageView = this.r;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public final void k(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.d.setTooltipText(charSequence);
        }
    }

    public void l(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!H(this.d)) {
                E(this.d, true);
            }
        } else {
            ImageButton imageButton = this.d;
            if (imageButton != null && H(imageButton)) {
                removeView(this.d);
                this.m.remove(this.d);
            }
        }
        ImageButton imageButton2 = this.d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public final void m(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && H(textView)) {
                removeView(this.c);
                this.m.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.j;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.F;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!H(this.c)) {
                E(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.D = charSequence;
    }

    public final void n(ColorStateList colorStateList) {
        this.F = colorStateList;
        TextView textView = this.c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void o(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && H(textView)) {
                removeView(this.b);
                this.m.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.i;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!H(this.b)) {
                E(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.L);
        s();
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0 A[LOOP:0: B:103:0x029e->B:104:0x02a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b8 A[LOOP:1: B:106:0x02b6->B:107:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d9 A[LOOP:2: B:109:0x02d7->B:110:0x02d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0327 A[LOOP:3: B:118:0x0325->B:119:0x0327, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 824
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
        boolean zA = sm.a(this);
        int i3 = !zA ? 1 : 0;
        int iMax2 = 0;
        if (I(this.d)) {
            J(this.d, i, 0, i2, this.u);
            measuredWidth = this.d.getMeasuredWidth() + y(this.d);
            iMax = Math.max(0, this.d.getMeasuredHeight() + z(this.d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (I(this.e)) {
            J(this.e, i, 0, i2, this.u);
            measuredWidth = this.e.getMeasuredWidth() + y(this.e);
            iMax = Math.max(iMax, this.e.getMeasuredHeight() + z(this.e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int[] iArr = this.J;
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zA ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (I(this.a)) {
            J(this.a, i, iMax3, i2, this.u);
            measuredWidth2 = this.a.getMeasuredWidth() + y(this.a);
            iMax = Math.max(iMax, this.a.getMeasuredHeight() + z(this.a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i3] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (I(this.f)) {
            iMax4 += C(this.f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f.getMeasuredHeight() + z(this.f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f.getMeasuredState());
        }
        if (I(this.r)) {
            iMax4 += C(this.r, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.r.getMeasuredHeight() + z(this.r));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (((sc) childAt.getLayoutParams()).b == 0 && I(childAt)) {
                iMax4 += C(childAt, i, iMax4, i2, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + z(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.x + this.y;
        int i7 = this.v + this.w;
        if (I(this.b)) {
            C(this.b, i, i5 + i7, i2, i6, iArr);
            iMax2 = this.b.getMeasuredWidth() + y(this.b);
            int measuredHeight2 = this.b.getMeasuredHeight() + z(this.b);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (I(this.c)) {
            iMax2 = Math.max(iMax2, C(this.c, i, i5 + i7, i2, i6 + measuredHeight, iArr));
            measuredHeight += this.c.getMeasuredHeight() + z(this.c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, measuredHeight);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.a;
        jj jjVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.q != null && jjVar != null && (menuItemFindItem = jjVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.b) {
            Runnable runnable = this.L;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        f();
        rc rcVar = this.l;
        boolean z = rcVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        rcVar.g = z2;
        if (!rcVar.h) {
            rcVar.a = rcVar.e;
            rcVar.b = rcVar.f;
            return;
        }
        if (z2) {
            int i2 = rcVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rcVar.e;
            }
            rcVar.a = i2;
            int i3 = rcVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rcVar.f;
            }
            rcVar.b = i3;
            return;
        }
        int i4 = rcVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rcVar.e;
        }
        rcVar.a = i4;
        int i5 = rcVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rcVar.f;
        }
        rcVar.b = i5;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        jm jmVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        sb sbVar = this.q;
        if (sbVar != null && (jmVar = sbVar.b) != null) {
            savedState.a = jmVar.a;
        }
        savedState.b = u();
        return savedState;
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

    public final void r(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void s() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!t() || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            isAttachedToWindow();
        }
    }

    public void setCollapseContentDescription(int i) {
        CharSequence text = i != 0 ? getContext().getText(i) : null;
        if (!TextUtils.isEmpty(text)) {
            e();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(text);
        }
    }

    public void setCollapseIcon(int i) {
        Drawable drawableC = ra.e().c(getContext(), i);
        if (drawableC != null) {
            e();
            this.e.setImageDrawable(drawableC);
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.s);
            }
        }
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A) {
            this.A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.z) {
            this.z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        i(ra.e().c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        j(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        k(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        l(ra.e().c(getContext(), i));
    }

    public void setPopupTheme(int i) {
        if (this.h != i) {
            this.h = i;
            if (i == 0) {
                this.g = getContext();
            } else {
                this.g = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        m(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        n(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        o(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.y = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.v = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.x = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        r(ColorStateList.valueOf(i));
    }

    public final boolean t() {
        sb sbVar = this.q;
        return (sbVar == null || sbVar.b == null) ? false : true;
    }

    public final boolean u() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.l();
    }

    public final boolean v() {
        kw kwVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (kwVar = actionMenuView.c) == null || !kwVar.p()) ? false : true;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new sd();
        int a;
        boolean b;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 8388627;
        this.I = new ArrayList();
        this.m = new ArrayList();
        this.J = new int[2];
        this.n = new age(new Runnable() { // from class: rw
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar toolbar = this.a;
                ArrayList arrayList = toolbar.o;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    toolbar.getMenu().removeItem(((MenuItem) arrayList.get(i2)).getItemId());
                }
                Menu menu = toolbar.getMenu();
                ArrayList arrayListC = toolbar.c();
                toolbar.n.a(menu, toolbar.b());
                ArrayList arrayListC2 = toolbar.c();
                arrayListC2.removeAll(arrayListC);
                toolbar.o = arrayListC2;
            }
        });
        this.o = new ArrayList();
        this.M = new rx(this);
        this.L = new ry(this);
        Context context2 = getContext();
        int[] iArr = hs.x;
        rv rvVarF = rv.f(context2, attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, rvVarF.b, i, 0);
        this.i = rvVarF.b.getResourceId(28, 0);
        this.j = rvVarF.b.getResourceId(19, 0);
        this.B = rvVarF.b.getInteger(0, this.B);
        this.k = rvVarF.b.getInteger(2, 48);
        int dimensionPixelOffset = rvVarF.b.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = rvVarF.b.hasValue(27) ? rvVarF.b.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.y = dimensionPixelOffset;
        this.x = dimensionPixelOffset;
        this.w = dimensionPixelOffset;
        this.v = dimensionPixelOffset;
        int dimensionPixelOffset2 = rvVarF.b.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.v = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = rvVarF.b.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.w = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = rvVarF.b.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.x = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = rvVarF.b.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.y = dimensionPixelOffset5;
        }
        this.u = rvVarF.b.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = rvVarF.b.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = rvVarF.b.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = rvVarF.b.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = rvVarF.b.getDimensionPixelSize(8, 0);
        f();
        rc rcVar = this.l;
        rcVar.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            rcVar.e = dimensionPixelSize;
            rcVar.a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            rcVar.f = dimensionPixelSize2;
            rcVar.b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            rcVar.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.z = rvVarF.b.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.A = rvVarF.b.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.s = rvVarF.b(4);
        this.t = rvVarF.b.getText(3);
        CharSequence text = rvVarF.b.getText(21);
        if (!TextUtils.isEmpty(text)) {
            o(text);
        }
        CharSequence text2 = rvVarF.b.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            m(text2);
        }
        this.g = getContext();
        setPopupTheme(rvVarF.b.getResourceId(17, 0));
        Drawable drawableB = rvVarF.b(16);
        if (drawableB != null) {
            l(drawableB);
        }
        CharSequence text3 = rvVarF.b.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            k(text3);
        }
        Drawable drawableB2 = rvVarF.b(11);
        if (drawableB2 != null) {
            i(drawableB2);
        }
        CharSequence text4 = rvVarF.b.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            j(text4);
        }
        if (rvVarF.b.hasValue(29)) {
            r(rvVarF.a(29));
        }
        if (rvVarF.b.hasValue(20)) {
            n(rvVarF.a(20));
        }
        if (rvVarF.b.hasValue(14)) {
            b().inflate(rvVarF.b.getResourceId(14, 0), getMenu());
        }
        rvVarF.b.recycle();
    }
}
