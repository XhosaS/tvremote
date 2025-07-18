package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.tv.remote.service.R;
import defpackage.bgz;
import defpackage.bhj;
import defpackage.bhk;
import defpackage.bho;
import defpackage.bhp;
import defpackage.mo;
import defpackage.xo;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends mo {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private final LinkedHashSet d;
    private int e;
    private int f;
    private TimeInterpolator g;
    private TimeInterpolator h;
    private int i;
    private int j;

    public HideBottomViewOnScrollBehavior() {
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }

    private final void W(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new bhj(this));
    }

    private final void X(int i) {
        this.j = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((bhk) it.next()).a();
        }
    }

    public final void a(View view) {
        if (this.j == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        X(2);
        W(view, 0, this.e, this.g);
    }

    public final boolean b() {
        return this.j == 1;
    }

    @Override // defpackage.mo
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.e = xo.g(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = xo.g(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = xo.j(view.getContext(), bgz.c);
        this.h = xo.j(view.getContext(), bgz.b);
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.a == null || this.b != null) {
            return false;
        }
        bho bhoVar = new bho(this, view, 1);
        this.b = bhoVar;
        this.a.addTouchExplorationStateChangeListener(bhoVar);
        view.addOnAttachStateChangeListener(new bhp(this, 1));
        return false;
    }

    @Override // defpackage.mo
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                a(view);
            }
        } else if (!b() && ((accessibilityManager = this.a) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            X(1);
            W(view, this.i, this.f, this.h);
        }
    }

    @Override // defpackage.mo
    public final boolean r(View view, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }
}
