package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.videos.R;
import defpackage.cqv;
import defpackage.sim;
import defpackage.sns;
import defpackage.sos;
import defpackage.sot;
import defpackage.sox;
import defpackage.soy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends cqv<V> {
    public int a;
    public AccessibilityManager b;
    public AccessibilityManager.TouchExplorationStateChangeListener c;
    public int d;
    public int e;
    public ViewPropertyAnimator f;
    private final LinkedHashSet g;
    private int h;
    private int i;
    private TimeInterpolator j;
    private TimeInterpolator k;

    public HideBottomViewOnScrollBehavior() {
        this.g = new LinkedHashSet();
        this.a = 0;
        this.d = 2;
        this.e = 0;
    }

    private final void F(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new sos(this));
    }

    private final void G(int i) {
        this.d = i;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((sot) it.next()).a();
        }
    }

    public final void D(View view) {
        if (this.d == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        G(2);
        F(view, 0, this.h, this.j);
    }

    public final boolean E() {
        return this.d == 1;
    }

    @Override // defpackage.cqv
    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.h = sim.b(view.getContext(), R.attr.motionDurationLong2, 225);
        this.i = sim.b(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.j = sim.k(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.d);
        this.k = sim.k(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, sns.c);
        if (this.b == null) {
            this.b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.b == null || this.c != null) {
            return false;
        }
        sox soxVar = new sox(this, view, 1);
        this.c = soxVar;
        this.b.addTouchExplorationStateChangeListener(soxVar);
        view.addOnAttachStateChangeListener(new soy(this, 1));
        return false;
    }

    @Override // defpackage.cqv
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // defpackage.cqv
    public final void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                D(view);
            }
        } else if (!E() && ((accessibilityManager = this.b) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.f;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            G(1);
            F(view, this.a + this.e, this.i, this.k);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new LinkedHashSet();
        this.a = 0;
        this.d = 2;
        this.e = 0;
    }
}
