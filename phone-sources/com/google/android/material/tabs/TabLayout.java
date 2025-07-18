package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.ActivityChooserView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.cuj;
import defpackage.cuk;
import defpackage.cul;
import defpackage.cxe;
import defpackage.cyq;
import defpackage.gll;
import defpackage.glo;
import defpackage.kwx;
import defpackage.sim;
import defpackage.sin;
import defpackage.sns;
import defpackage.spv;
import defpackage.ssr;
import defpackage.suy;
import defpackage.szg;
import defpackage.szk;
import defpackage.tbh;
import defpackage.tbi;
import defpackage.tbj;
import defpackage.tbk;
import defpackage.tbl;
import defpackage.tbn;
import defpackage.tbp;
import defpackage.tbq;
import defpackage.tbr;
import defpackage.tbs;
import defpackage.tbv;
import defpackage.tde;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@glo
/* loaded from: classes2.dex */
public class TabLayout extends HorizontalScrollView {
    private static final int F = 2132085098;
    private static final cuj G = new cul(16);
    public boolean A;
    public final TimeInterpolator B;
    public ViewPager C;
    public int D;
    public szg E;
    private final ArrayList H;
    private tbq I;
    private int J;
    private final int K;
    private final int L;
    private final int M;
    private int N;
    private final ArrayList O;
    private tbl P;
    private ValueAnimator Q;
    private gll R;
    private DataSetObserver S;
    private tbr T;
    private tbk U;
    private boolean V;
    private final cuj W;
    public int a;
    final tbp b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public PorterDuff.Mode n;
    public float o;
    public float p;
    public float q;
    public final int r;
    public int s;
    public int t;
    int u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    int z;

    public TabLayout(Context context) {
        this(context, null);
    }

    private final int r(int i, float f) {
        tbp tbpVar;
        View childAt;
        int i2 = this.w;
        if ((i2 != 0 && i2 != 2) || (childAt = (tbpVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < tbpVar.getChildCount() ? tbpVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int s() {
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int i2 = this.w;
        if (i2 == 0 || i2 == 2) {
            return this.M;
        }
        return 0;
    }

    private static ColorStateList t(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void u(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        tbq tbqVarD = d();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            tbqVarD.c(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            tbqVarD.a = drawable;
            TabLayout tabLayout = tbqVarD.g;
            if (tabLayout.t == 1 || tabLayout.w == 2) {
                tabLayout.p(true);
            }
            tbqVarD.b();
        }
        int i = tabItem.c;
        if (i != 0) {
            tbqVarD.e = LayoutInflater.from(tbqVarD.h.getContext()).inflate(i, (ViewGroup) tbqVarD.h, false);
            tbqVarD.b();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            tbqVarD.c = tabItem.getContentDescription();
            tbqVarD.b();
        }
        f(tbqVarD, this.H.isEmpty());
    }

    private final void v(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            tbp tbpVar = this.b;
            int childCount = tbpVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (tbpVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iR = r(i, 0.0f);
            if (scrollX != iR) {
                if (this.Q == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.Q = valueAnimator;
                    valueAnimator.setInterpolator(this.B);
                    this.Q.setDuration(this.u);
                    this.Q.addUpdateListener(new spv(this, 7));
                }
                this.Q.setIntValues(scrollX, iR);
                this.Q.start();
            }
            int i3 = this.u;
            ValueAnimator valueAnimator2 = tbpVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && tbpVar.b.a != i) {
                tbpVar.a.cancel();
            }
            tbpVar.d(true, i, i3);
            return;
        }
        q(i);
    }

    private final void w(int i) {
        tbp tbpVar = this.b;
        int childCount = tbpVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = tbpVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof tbs) {
                        ((tbs) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void x(LinearLayout.LayoutParams layoutParams) {
        if (this.w == 1 && this.t == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean y() {
        int i = this.w;
        return i == 0 || i == 2;
    }

    private final void z(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.C;
        if (viewPager2 != null) {
            tbr tbrVar = this.T;
            if (tbrVar != null && (list2 = viewPager2.f) != null) {
                list2.remove(tbrVar);
            }
            tbk tbkVar = this.U;
            if (tbkVar != null && (list = this.C.g) != null) {
                list.remove(tbkVar);
            }
        }
        tbl tblVar = this.P;
        if (tblVar != null) {
            j(tblVar);
            this.P = null;
        }
        if (viewPager != null) {
            this.C = viewPager;
            if (this.T == null) {
                this.T = new tbr(this);
            }
            tbr tbrVar2 = this.T;
            tbrVar2.b = 0;
            tbrVar2.a = 0;
            viewPager.d(tbrVar2);
            tbv tbvVar = new tbv(viewPager, 1);
            this.P = tbvVar;
            e(tbvVar);
            gll gllVar = viewPager.b;
            if (gllVar != null) {
                m(gllVar, true);
            }
            if (this.U == null) {
                this.U = new tbk(this);
            }
            tbk tbkVar2 = this.U;
            tbkVar2.a = true;
            if (viewPager.g == null) {
                viewPager.g = new ArrayList();
            }
            viewPager.g.add(tbkVar2);
            q(viewPager.c);
        } else {
            this.C = null;
            m(null, false);
        }
        this.V = z;
    }

    public final int a() {
        tbq tbqVar = this.I;
        if (tbqVar != null) {
            return tbqVar.d;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        u(view);
    }

    public final int b() {
        return this.H.size();
    }

    public final tbq c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (tbq) this.H.get(i);
    }

    public final tbq d() {
        tbq tbqVar = (tbq) G.a();
        if (tbqVar == null) {
            tbqVar = new tbq();
        }
        tbqVar.g = this;
        cuj cujVar = this.W;
        tbs tbsVar = cujVar != null ? (tbs) cujVar.a() : null;
        if (tbsVar == null) {
            tbsVar = new tbs(this, getContext());
        }
        tbsVar.a(tbqVar);
        tbsVar.setFocusable(true);
        tbsVar.setMinimumWidth(s());
        if (TextUtils.isEmpty(tbqVar.c)) {
            tbsVar.setContentDescription(tbqVar.b);
        } else {
            tbsVar.setContentDescription(tbqVar.c);
        }
        tbqVar.h = tbsVar;
        if (tbqVar.i != -1) {
            tbqVar.h.setId(0);
        }
        return tbqVar;
    }

    @Deprecated
    public final void e(tbl tblVar) {
        ArrayList arrayList = this.O;
        if (arrayList.contains(tblVar)) {
            return;
        }
        arrayList.add(tblVar);
    }

    public final void f(tbq tbqVar, boolean z) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        if (tbqVar.g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        tbqVar.d = size;
        arrayList.add(size, tbqVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((tbq) arrayList.get(i2)).d == this.a) {
                i = i2;
            }
            ((tbq) arrayList.get(i2)).d = i2;
        }
        this.a = i;
        tbs tbsVar = tbqVar.h;
        tbsVar.setSelected(false);
        tbsVar.setActivated(false);
        tbp tbpVar = this.b;
        int i3 = tbqVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        x(layoutParams);
        tbpVar.addView(tbsVar, i3, layoutParams);
        if (z) {
            tbqVar.a();
        }
    }

    public final void g() {
        int i = this.w;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.N - this.c) : 0;
        tbp tbpVar = this.b;
        tbpVar.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.w;
        if (i2 == 0) {
            int i3 = this.t;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                tbpVar.setGravity(1);
            } else if (i3 == 2) {
            }
            tbpVar.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.t == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            tbpVar.setGravity(1);
        }
        p(true);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        i();
        gll gllVar = this.R;
        if (gllVar != null) {
            int iJ = gllVar.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                tbq tbqVarD = d();
                tbqVarD.c(this.R.l(i2));
                f(tbqVarD, false);
            }
            ViewPager viewPager = this.C;
            if (viewPager == null || iJ <= 0 || (i = viewPager.c) == a() || i >= b()) {
                return;
            }
            k(c(i));
        }
    }

    public final void i() {
        tbp tbpVar = this.b;
        for (int childCount = tbpVar.getChildCount() - 1; childCount >= 0; childCount--) {
            tbs tbsVar = (tbs) tbpVar.getChildAt(childCount);
            tbpVar.removeViewAt(childCount);
            if (tbsVar != null) {
                tbsVar.a(null);
                tbsVar.setSelected(false);
                this.W.b(tbsVar);
            }
            requestLayout();
        }
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            tbq tbqVar = (tbq) it.next();
            it.remove();
            tbqVar.g = null;
            tbqVar.h = null;
            tbqVar.a = null;
            tbqVar.i = -1;
            tbqVar.b = null;
            tbqVar.c = null;
            tbqVar.d = -1;
            tbqVar.e = null;
            G.b(tbqVar);
        }
        this.I = null;
    }

    @Deprecated
    public final void j(tbl tblVar) {
        this.O.remove(tblVar);
    }

    public final void k(tbq tbqVar) {
        l(tbqVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038 A[PHI: r0
  0x0038: PHI (r0v13 tbq) = (r0v11 tbq), (r0v0 tbq) binds: [B:19:0x0032, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(defpackage.tbq r4, boolean r5) {
        /*
            r3 = this;
            tbq r0 = r3.I
            r1 = -1
            if (r0 != r4) goto L22
            if (r0 == 0) goto L74
            java.util.ArrayList r5 = r3.O
            int r0 = r5.size()
            int r0 = r0 + r1
        Le:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r5.get(r0)
            tbl r1 = (defpackage.tbl) r1
            r1.b()
            int r0 = r0 + (-1)
            goto Le
        L1c:
            int r4 = r4.d
            r3.v(r4)
            return
        L22:
            if (r4 == 0) goto L27
            int r2 = r4.d
            goto L28
        L27:
            r2 = r1
        L28:
            if (r5 == 0) goto L40
            if (r0 == 0) goto L31
            int r5 = r0.d
            if (r5 != r1) goto L38
            goto L32
        L31:
            r0 = 0
        L32:
            if (r2 == r1) goto L38
            r3.q(r2)
            goto L3b
        L38:
            r3.v(r2)
        L3b:
            if (r2 == r1) goto L40
            r3.w(r2)
        L40:
            r3.I = r4
            if (r0 == 0) goto L5d
            com.google.android.material.tabs.TabLayout r5 = r0.g
            if (r5 == 0) goto L5d
            java.util.ArrayList r5 = r3.O
            int r0 = r5.size()
            int r0 = r0 + r1
        L4f:
            if (r0 < 0) goto L5d
            java.lang.Object r2 = r5.get(r0)
            tbl r2 = (defpackage.tbl) r2
            r2.c()
            int r0 = r0 + (-1)
            goto L4f
        L5d:
            if (r4 == 0) goto L74
            java.util.ArrayList r5 = r3.O
            int r0 = r5.size()
            int r0 = r0 + r1
        L66:
            if (r0 < 0) goto L74
            java.lang.Object r1 = r5.get(r0)
            tbl r1 = (defpackage.tbl) r1
            r1.a(r4)
            int r0 = r0 + (-1)
            goto L66
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.l(tbq, boolean):void");
    }

    public final void m(gll gllVar, boolean z) {
        DataSetObserver dataSetObserver;
        gll gllVar2 = this.R;
        if (gllVar2 != null && (dataSetObserver = this.S) != null) {
            gllVar2.a.unregisterObserver(dataSetObserver);
        }
        this.R = gllVar;
        if (z && gllVar != null) {
            if (this.S == null) {
                this.S = new tbn(this);
            }
            gllVar.a.registerObserver(this.S);
        }
        h();
    }

    public final void n(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            tbp tbpVar = this.b;
            if (iRound >= tbpVar.getChildCount()) {
                return;
            }
            if (z2) {
                tbpVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = tbpVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    tbpVar.a.cancel();
                }
                tbpVar.c(tbpVar.getChildAt(i), tbpVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.Q;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Q.cancel();
            }
            int iR = r(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < a() && iR >= scrollX) || (i > a() && iR <= scrollX) || i == a();
            if (getLayoutDirection() == 1) {
                z4 = (i < a() && iR <= scrollX) || (i > a() && iR >= scrollX) || i == a();
            }
            if (z4 || this.D == 1 || z3) {
                if (i < 0) {
                    iR = 0;
                }
                scrollTo(iR, 0);
            }
            if (z) {
                w(iRound);
            }
        }
    }

    public final void o(ViewPager viewPager) {
        z(viewPager, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.e(this);
        if (this.C == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                z((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.V) {
            o(null);
            this.V = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        tbs tbsVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            tbp tbpVar = this.b;
            if (i >= tbpVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = tbpVar.getChildAt(i);
            if ((childAt instanceof tbs) && (drawable = (tbsVar = (tbs) childAt).d) != null) {
                drawable.setBounds(tbsVar.getLeft(), tbsVar.getTop(), tbsVar.getRight(), tbsVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new cyq(accessibilityNodeInfo).v(cxe.k(1, b(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return y() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.getContext()
            java.util.ArrayList r1 = r8.H
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            r5 = 48
            if (r4 >= r2) goto L2e
            java.lang.Object r6 = r1.get(r4)
            tbq r6 = (defpackage.tbq) r6
            if (r6 == 0) goto L2b
            android.graphics.drawable.Drawable r7 = r6.a
            if (r7 == 0) goto L2b
            java.lang.CharSequence r6 = r6.b
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L2b
            boolean r1 = r8.x
            if (r1 != 0) goto L2e
            r5 = 72
            goto L2e
        L2b:
            int r4 = r4 + 1
            goto Lc
        L2e:
            float r0 = defpackage.sil.f(r0, r5)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r10)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L53
            if (r1 == 0) goto L44
            goto L66
        L44:
            int r10 = r8.getPaddingTop()
            int r0 = r0 + r10
            int r10 = r8.getPaddingBottom()
            int r0 = r0 + r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L66
        L53:
            int r1 = r8.getChildCount()
            if (r1 != r5) goto L66
            int r1 = android.view.View.MeasureSpec.getSize(r10)
            if (r1 < r0) goto L66
            android.view.View r1 = r8.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L66:
            int r0 = android.view.View.MeasureSpec.getSize(r9)
            int r1 = android.view.View.MeasureSpec.getMode(r9)
            if (r1 == 0) goto L84
            int r1 = r8.L
            if (r1 <= 0) goto L75
            goto L82
        L75:
            float r0 = (float) r0
            android.content.Context r1 = r8.getContext()
            r2 = 56
            float r1 = defpackage.sil.f(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L82:
            r8.s = r1
        L84:
            super.onMeasure(r9, r10)
            int r9 = r8.getChildCount()
            if (r9 != r5) goto Lcf
            android.view.View r9 = r8.getChildAt(r3)
            int r0 = r8.w
            if (r0 == 0) goto La7
            if (r0 == r5) goto L9b
            r1 = 2
            if (r0 == r1) goto La7
            goto Lcf
        L9b:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 == r1) goto La6
            goto Lb1
        La6:
            return
        La7:
            int r0 = r9.getMeasuredWidth()
            int r1 = r8.getMeasuredWidth()
            if (r0 >= r1) goto Lcf
        Lb1:
            int r0 = r8.getPaddingTop()
            int r1 = r8.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            int r1 = r1.height
            int r10 = getChildMeasureSpec(r10, r0, r1)
            int r0 = r8.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r9.measure(r0, r10)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || y()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(boolean z) {
        int i = 0;
        while (true) {
            tbp tbpVar = this.b;
            if (i >= tbpVar.getChildCount()) {
                return;
            }
            View childAt = tbpVar.getChildAt(i);
            childAt.setMinimumWidth(s());
            x((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public final void q(int i) {
        n(i, 0.0f, true, true, true);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szg.d(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        u(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        szg tbhVar;
        int i2 = F;
        super(tde.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.H = new ArrayList();
        this.i = -1;
        this.J = 0;
        this.s = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.z = -1;
        this.O = new ArrayList();
        this.W = new cuk(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        tbp tbpVar = new tbp(this, context2);
        this.b = tbpVar;
        super.addView(tbpVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayA = suy.a(context2, attributeSet, tbj.b, i, i2, 24);
        ColorStateList colorStateListB = ssr.b(getBackground());
        if (colorStateListB != null) {
            szk szkVar = new szk();
            szkVar.N(colorStateListB);
            szkVar.J(context2);
            szkVar.M(getElevation());
            setBackground(szkVar);
        }
        Drawable drawableJ = sin.j(context2, typedArrayA, 5);
        Drawable drawableMutate = (drawableJ == null ? new GradientDrawable() : drawableJ).mutate();
        this.m = drawableMutate;
        ssr.g(drawableMutate, this.J);
        int i3 = this.z;
        tbpVar.b(i3 == -1 ? this.m.getIntrinsicHeight() : i3);
        int color = typedArrayA.getColor(8, 0);
        this.J = color;
        ssr.g(this.m, color);
        p(false);
        tbpVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i4 = typedArrayA.getInt(10, 0);
        if (this.v != i4) {
            this.v = i4;
            tbpVar.postInvalidateOnAnimation();
        }
        int i5 = typedArrayA.getInt(7, 0);
        if (i5 != 0) {
            if (i5 == 1) {
                tbhVar = new tbh();
            } else if (i5 == 2) {
                tbhVar = new tbi();
            } else {
                throw new IllegalArgumentException(i5 + " is not a valid TabIndicatorAnimationMode");
            }
            this.E = tbhVar;
        } else {
            this.E = new szg();
        }
        this.y = typedArrayA.getBoolean(9, true);
        tbpVar.a();
        tbpVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayA.getDimensionPixelSize(20, this.d);
        this.e = typedArrayA.getDimensionPixelSize(18, this.e);
        this.f = typedArrayA.getDimensionPixelSize(17, this.f);
        this.g = true != suy.e(context2) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayA.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, android.support.v7.appcompat.R.styleable.TextAppearance);
        try {
            this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
            this.j = sin.h(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.i = typedArrayA.getResourceId(22, resourceId);
            }
            int i6 = this.i;
            if (i6 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i6, android.support.v7.appcompat.R.styleable.TextAppearance);
                try {
                    this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, (int) this.o);
                    ColorStateList colorStateListH = sin.h(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListH != null) {
                        this.j = t(this.j.getDefaultColor(), colorStateListH.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListH.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.j = sin.h(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.j = t(this.j.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            this.k = sin.h(context2, typedArrayA, 3);
            this.n = a.ae(typedArrayA.getInt(4, -1), null);
            this.l = sin.h(context2, typedArrayA, 21);
            this.u = typedArrayA.getInt(6, kwx.JSON3);
            this.B = sim.k(context2, R.attr.motionEasingEmphasizedInterpolator, sns.b);
            this.K = typedArrayA.getDimensionPixelSize(14, -1);
            this.L = typedArrayA.getDimensionPixelSize(13, -1);
            this.r = typedArrayA.getResourceId(0, 0);
            this.N = typedArrayA.getDimensionPixelSize(1, 0);
            this.w = typedArrayA.getInt(15, 1);
            this.t = typedArrayA.getInt(2, 0);
            this.x = typedArrayA.getBoolean(12, false);
            this.A = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            Resources resources = getResources();
            this.q = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.M = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            g();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        u(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        u(view);
    }
}
