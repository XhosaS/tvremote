package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.videos.R;
import defpackage.cqv;
import defpackage.cqx;
import defpackage.sim;
import defpackage.sns;
import defpackage.sou;
import defpackage.sov;
import defpackage.sow;
import defpackage.sox;
import defpackage.soy;
import defpackage.soz;
import defpackage.spa;
import defpackage.spb;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends cqv<V> {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private spb d;
    private final LinkedHashSet e;
    private int f;
    private int g;
    private TimeInterpolator h;
    private TimeInterpolator i;
    private int j;
    private int k;

    public HideViewOnScrollBehavior() {
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }

    private final void F(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = this.d.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new soz(this));
    }

    private final void G(int i) {
        spb spbVar = this.d;
        if (spbVar == null || spbVar.b() != i) {
            this.d = i != 0 ? i != 1 ? new sov() : new sou() : new sow();
        }
    }

    private final void H(int i) {
        this.k = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((spa) it.next()).a();
        }
    }

    public final void D(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        H(2);
        this.d.d();
        F(view, 0, this.f, this.h);
    }

    public final boolean E() {
        return this.k == 1;
    }

    @Override // defpackage.cqv
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        int i2 = 0;
        if (this.a != null && this.b == null) {
            sox soxVar = new sox(this, view, i2);
            this.b = soxVar;
            this.a.addTouchExplorationStateChangeListener(soxVar);
            view.addOnAttachStateChangeListener(new soy(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((cqx) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            G(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            G(i4);
        }
        this.j = this.d.a(view, marginLayoutParams);
        this.f = sim.b(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = sim.b(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = sim.k(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.d);
        this.i = sim.k(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.c);
        return false;
    }

    @Override // defpackage.cqv
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // defpackage.cqv
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                D(view);
            }
        } else if (!E() && ((accessibilityManager = this.a) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            H(1);
            F(view, this.j, this.g, this.i);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
