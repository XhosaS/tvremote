package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.videos.R;
import defpackage.cmq;
import defpackage.cqu;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.cvl;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cyh;
import defpackage.czn;
import defpackage.dam;
import defpackage.gio;
import defpackage.sim;
import defpackage.sin;
import defpackage.sip;
import defpackage.sns;
import defpackage.snz;
import defpackage.soa;
import defpackage.sob;
import defpackage.soc;
import defpackage.soi;
import defpackage.soj;
import defpackage.sok;
import defpackage.son;
import defpackage.ssr;
import defpackage.suy;
import defpackage.szg;
import defpackage.szk;
import defpackage.tbo;
import defpackage.tde;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements cqu {
    public boolean a;
    public int b;
    public cyh c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g;
    public final LinkedHashSet h;
    public int i;
    public Drawable j;
    public Integer k;
    public final float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private WeakReference t;
    private ValueAnimator u;
    private ValueAnimator.AnimatorUpdateListener v;
    private final long w;
    private final TimeInterpolator x;
    private int[] y;
    private Behavior z;

    /* compiled from: PG */
    public class BaseBehavior<T extends AppBarLayout> extends soi<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private soa e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View L(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((cqx) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void R(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (cww.a(coordinatorLayout) != null) {
                return;
            }
            cww.p(coordinatorLayout, new snz(this, appBarLayout, coordinatorLayout));
        }

        private final void S(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iF = F() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                soc socVar = (soc) childAt.getLayoutParams();
                if (T(socVar.a, 32)) {
                    top -= socVar.topMargin;
                    bottom += socVar.bottomMargin;
                }
                int i2 = -iF;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                soc socVar2 = (soc) childAt2.getLayoutParams();
                int i3 = socVar2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (T(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (T(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iF < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (T(i3, 32)) {
                        iE2 += socVar2.topMargin;
                        minimumHeight -= socVar2.bottomMargin;
                    }
                    if (iF < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    U(coordinatorLayout, appBarLayout, cmq.l(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean T(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float fAbs = Math.abs(F() - i);
            float fAbs2 = Math.abs(0.0f);
            int iRound = fAbs2 > 0.0f ? Math.round((fAbs / fAbs2) * 1000.0f) * 3 : (int) (((fAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iF = F();
            if (iF == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(sns.e);
                this.d.addUpdateListener(new tbo(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(iRound, 600));
            this.d.setIntValues(iF, i);
            this.d.start();
        }

        private static final View V(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof cvl) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void W(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8, int r9, boolean r10) {
            /*
                int r0 = java.lang.Math.abs(r8)
                int r1 = r7.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r7.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                if (r4 == 0) goto L5a
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                soc r0 = (defpackage.soc) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5a
                int r1 = r4.getMinimumHeight()
                r3 = 1
                if (r9 <= 0) goto L48
                r9 = r0 & 12
                if (r9 == 0) goto L48
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.e()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L48:
                r9 = r0 & 2
                if (r9 == 0) goto L5a
                int r8 = -r8
                int r9 = r4.getBottom()
                int r9 = r9 - r1
                int r0 = r7.e()
                int r9 = r9 - r0
                if (r8 < r9) goto L5a
                goto L5b
            L5a:
                r3 = r2
            L5b:
                boolean r8 = r7.f
                if (r8 == 0) goto L67
                android.view.View r8 = V(r6)
                boolean r3 = r7.n(r8)
            L67:
                boolean r8 = r7.m(r3)
                if (r10 != 0) goto L95
                if (r8 == 0) goto Lbc
                java.util.List r6 = r6.b(r7)
                int r8 = r6.size()
            L77:
                if (r2 >= r8) goto Lbc
                java.lang.Object r9 = r6.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                cqx r9 = (defpackage.cqx) r9
                cqv r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto L92
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r6 = r9.d
                if (r6 == 0) goto Lbc
                goto L95
            L92:
                int r2 = r2 + 1
                goto L77
            L95:
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                if (r6 == 0) goto La2
                android.graphics.drawable.Drawable r6 = r7.getBackground()
                r6.jumpToCurrentState()
            La2:
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                if (r6 == 0) goto Laf
                android.graphics.drawable.Drawable r6 = r7.getForeground()
                r6.jumpToCurrentState()
            Laf:
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                if (r6 == 0) goto Lbc
                android.animation.StateListAnimator r6 = r7.getStateListAnimator()
                r6.jumpToCurrentState()
            Lbc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.W(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // defpackage.soi
        public final /* bridge */ /* synthetic */ int D(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.soi
        public final /* synthetic */ int E(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.soi
        public final int F() {
            return P() + this.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
        @Override // defpackage.soi
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* bridge */ /* synthetic */ int G(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        final soa H(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iP = P();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iP;
                if (childAt.getTop() + iP <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = dam.EMPTY_STATE;
                    }
                    soa soaVar = new soa(parcelable);
                    boolean z = iP == 0;
                    soaVar.b = z;
                    soaVar.a = !z && (-iP) >= appBarLayout.f();
                    soaVar.c = i;
                    soaVar.e = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    soaVar.d = bottom / childAt.getHeight();
                    return soaVar;
                }
            }
            return null;
        }

        @Override // defpackage.soi
        public final /* bridge */ /* synthetic */ void I(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            S(coordinatorLayout, appBarLayout);
            if (appBarLayout.f) {
                appBarLayout.m(appBarLayout.n(V(coordinatorLayout)));
            }
        }

        final void J(soa soaVar, boolean z) {
            if (this.e == null || z) {
                this.e = soaVar;
            }
        }

        @Override // defpackage.soi
        public final /* bridge */ /* synthetic */ boolean K(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void M(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L25
                if (r12 >= 0) goto Lf
                int r0 = r10.f()
                int r0 = -r0
                int r1 = r10.b()
                int r1 = r1 + r0
                goto L15
            Lf:
                int r0 = r10.f()
                int r0 = -r0
                r1 = 0
            L15:
                r6 = r0
                r7 = r1
                if (r6 == r7) goto L25
                r0 = 1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r12
                int r9 = r2.N(r3, r4, r5, r6, r7)
                r13[r0] = r9
                goto L26
            L25:
                r4 = r10
            L26:
                boolean r9 = r4.f
                if (r9 == 0) goto L31
                boolean r9 = r4.n(r11)
                r4.m(r9)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.M(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                S(coordinatorLayout, appBarLayout);
                if (appBarLayout.f) {
                    appBarLayout.m(appBarLayout.n(view2));
                }
            }
            this.f = new WeakReference(view2);
        }

        @Override // defpackage.sol, defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.f(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            soa soaVar = this.e;
            if (soaVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            U(coordinatorLayout, appBarLayout, i4);
                        } else {
                            O(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            U(coordinatorLayout, appBarLayout, 0);
                        } else {
                            O(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (soaVar.a) {
                O(coordinatorLayout, appBarLayout, -appBarLayout.f());
            } else if (soaVar.b) {
                O(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(soaVar.c);
                O(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.e.e ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * this.e.d)));
            }
            appBarLayout.b = 0;
            this.e = null;
            Q(cmq.l(P(), -appBarLayout.f(), 0));
            W(coordinatorLayout, appBarLayout, P(), 0, true);
            appBarLayout.i(P());
            R(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0 && (appBarLayout.f || appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((cqx) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.i(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            M(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                i4 = i3;
                coordinatorLayout2 = coordinatorLayout;
                iArr[1] = N(coordinatorLayout2, appBarLayout, i4, -appBarLayout.c(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                i4 = i3;
            }
            if (i4 == 0) {
                R(coordinatorLayout2, appBarLayout);
            }
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            if (!(parcelable instanceof soa)) {
                this.e = null;
            } else {
                J((soa) parcelable, true);
                this.e.getSuperState();
            }
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            soa soaVarH = H(absSavedState, (AppBarLayout) view);
            return soaVarH == null ? absSavedState : soaVarH;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public class ScrollingViewBehavior extends soj {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout G(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.soj
        public final float D(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iF = appBarLayout.f();
            int iB = appBarLayout.b();
            cqv cqvVar = ((cqx) appBarLayout.getLayoutParams()).a;
            int iF2 = cqvVar instanceof BaseBehavior ? ((BaseBehavior) cqvVar).F() : 0;
            if ((iB == 0 || iF + iF2 > iB) && (i = iF - iB) != 0) {
                return (iF2 / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.soj
        public final int E(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.soj
        public final /* bridge */ /* synthetic */ View F(List list) {
            return G(list);
        }

        @Override // defpackage.sol, defpackage.cqv
        public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.f(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.cqv
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutG = G(coordinatorLayout.a(view));
            if (appBarLayoutG != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutG.k(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.cqv
        public final boolean j(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.cqv
        public void k(CoordinatorLayout coordinatorLayout, View view, View view2) {
            cqv cqvVar = ((cqx) view2.getLayoutParams()).a;
            if (cqvVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cqvVar).a) + this.c) - H(view2);
                int[] iArr = cww.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f) {
                    appBarLayout.m(appBarLayout.n(view));
                }
            }
        }

        @Override // defpackage.cqv
        public final void l(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                cww.p(coordinatorLayout, null);
            }
        }

        @Override // defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            cyh cyhVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewF = F(coordinatorLayout.a(view));
            if (viewF == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (viewF.getFitsSystemWindows() && (cyhVar = coordinatorLayout.e) != null) {
                size += cyhVar.d() + cyhVar.a();
            }
            int iE = size + E(viewF);
            int measuredHeight = viewF.getMeasuredHeight();
            if (J()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                iE -= measuredHeight;
            }
            coordinatorLayout.i(view, i, i2, View.MeasureSpec.makeMeasureSpec(iE, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sok.f);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    protected static final soc o(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new soc((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new soc((ViewGroup.MarginLayoutParams) layoutParams) : new soc(layoutParams);
    }

    private final void p() {
        Behavior behavior = this.z;
        soa soaVarH = null;
        if (behavior != null && this.n != -1 && this.b == 0) {
            soaVarH = behavior.H(dam.EMPTY_STATE, this);
        }
        this.n = -1;
        this.o = -1;
        this.p = -1;
        if (soaVarH != null) {
            this.z.J(soaVarH, false);
        }
    }

    private final void q(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    private final void r(float f, float f2) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.w);
        this.u.setInterpolator(this.x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.v;
        if (animatorUpdateListener != null) {
            this.u.addUpdateListener(animatorUpdateListener);
        }
        this.u.start();
    }

    private final boolean s() {
        return this.j != null && e() > 0;
    }

    private final boolean t() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqu
    public final cqv a() {
        Behavior behavior = new Behavior();
        this.z = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                soc socVar = (soc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = socVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = socVar.topMargin + socVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.o = iMax;
        return iMax;
    }

    final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                soc socVar = (soc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + socVar.topMargin + socVar.bottomMargin;
                int i3 = socVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.p = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof soc;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = minimumHeight + minimumHeight + iE;
            return i < getHeight() ? i : minimumHeight + iE;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = minimumHeight2 + minimumHeight2 + iE;
        return i2 < getHeight() ? i2 : minimumHeight2 + iE;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (s()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.m);
            this.j.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.j;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        cyh cyhVar = this.c;
        if (cyhVar != null) {
            return cyhVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                soc socVar = (soc) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = socVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + socVar.topMargin + socVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.n = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final soc generateLayoutParams(AttributeSet attributeSet) {
        return new soc(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new soc();
    }

    public final void h(sob sobVar) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        if (sobVar == null || this.d.contains(sobVar)) {
            return;
        }
        this.d.add(sobVar);
    }

    final void i(int i) {
        this.m = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                sob sobVar = (sob) this.d.get(i2);
                if (sobVar != null) {
                    sobVar.b(i);
                }
            }
        }
    }

    public final void j(boolean z) {
        k(z, isLaidOut());
    }

    public final void k(boolean z, boolean z2) {
        q(z, z2, true);
    }

    public final void l() {
        setWillNotDraw(!s());
    }

    final boolean m(boolean z) {
        if (this.e == z) {
            return false;
        }
        this.e = z;
        refreshDrawableState();
        if (getBackground() instanceof szk) {
            if (this.r != null) {
                r(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
                return true;
            }
            if (this.f) {
                r(z ? 0.0f : this.l, z ? this.l : 0.0f);
            }
        }
        return true;
    }

    final boolean n(View view) {
        int i;
        if (this.t == null && (i = this.s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.s);
            }
            if (viewFindViewById != null) {
                this.t = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        szg.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.y == null) {
            this.y = new int[4];
        }
        int[] iArr = this.y;
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.q;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970428 : R.attr.state_liftable;
        if (z2) {
            i = this.e ? R.attr.state_lifted : -2130970429;
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = i;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970424;
        int i2 = -2130970423;
        if (z && this.e) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && t()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int[] iArr = cww.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        p();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((soc) getChildAt(i5).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.f) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((soc) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.q != z2) {
            this.q = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && t()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = cmq.l(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        final szk szkVar;
        boolean z = drawable instanceof szk;
        Context context = getContext();
        if (z) {
            szkVar = (szk) drawable;
        } else {
            ColorStateList colorStateListB = ssr.b(drawable);
            if (colorStateListB == null) {
                szkVar = null;
            } else {
                szk szkVar2 = new szk();
                szkVar2.N(colorStateListB);
                szkVar = szkVar2;
            }
        }
        if (szkVar != null && szkVar.C() != null) {
            this.i = szkVar.C().getDefaultColor();
            final ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                final Integer numH = sip.h(getContext(), R.attr.colorSurface);
                this.v = new ValueAnimator.AnimatorUpdateListener() { // from class: sny
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ColorStateList colorStateList2 = colorStateList;
                        AppBarLayout appBarLayout = this.a;
                        int iF = sip.f(appBarLayout.i, colorStateList2.getDefaultColor(), fFloatValue);
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iF);
                        szk szkVar3 = szkVar;
                        szkVar3.N(colorStateListValueOf);
                        if (appBarLayout.j != null && (num = appBarLayout.k) != null && num.equals(numH)) {
                            appBarLayout.j.setTint(iF);
                        }
                        List<sod> list = appBarLayout.g;
                        if (!list.isEmpty()) {
                            for (sod sodVar : list) {
                                if (szkVar3.C() != null) {
                                    sodVar.a();
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet = appBarLayout.h;
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            ((zft) it.next()).o(fFloatValue);
                        }
                    }
                };
            } else {
                szkVar.J(context);
                this.v = new gio(this, szkVar, 4);
            }
            drawable = szkVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        szg.d(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.j;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new soc();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        Integer numValueOf;
        super(tde.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.b = 0;
        this.g = new ArrayList();
        this.h = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = son.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = son.a;
        Context context3 = getContext();
        TypedArray typedArrayA = suy.a(context3, attributeSet, son.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = suy.a(context2, attributeSet, sok.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.r = sin.h(context2, typedArrayA2, 6);
            this.w = sim.b(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.x = sim.k(context2, R.attr.motionEasingStandardInterpolator, sns.a);
            if (typedArrayA2.hasValue(4)) {
                q(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                son.a(this, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayA2.getDrawable(0));
            if (Build.VERSION.SDK_INT >= 26) {
                if (typedArrayA2.hasValue(2)) {
                    setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
                }
                if (typedArrayA2.hasValue(1)) {
                    setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
                }
            }
            this.l = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f = typedArrayA2.getBoolean(5, false);
            this.s = typedArrayA2.getResourceId(7, -1);
            Drawable drawable = typedArrayA2.getDrawable(8);
            Drawable drawable2 = this.j;
            if (drawable2 != drawable) {
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.j = drawableMutate;
                if (drawableMutate instanceof szk) {
                    numValueOf = Integer.valueOf(((szk) drawableMutate).y);
                } else {
                    ColorStateList colorStateListB = ssr.b(drawableMutate);
                    numValueOf = colorStateListB != null ? Integer.valueOf(colorStateListB.getDefaultColor()) : null;
                }
                this.k = numValueOf;
                Drawable drawable3 = this.j;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.j.setState(getDrawableState());
                    }
                    this.j.setLayoutDirection(getLayoutDirection());
                    this.j.setVisible(getVisibility() == 0, false);
                    this.j.setCallback(this);
                }
                l();
                postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            czn cznVar = new czn(this, 14, null);
            int[] iArr3 = cww.a;
            cwm.l(this, cznVar);
        } catch (Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }
}
