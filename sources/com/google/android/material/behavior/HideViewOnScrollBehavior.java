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
import com.google.android.tv.remote.service.R;
import defpackage.bgz;
import defpackage.bhl;
import defpackage.bhm;
import defpackage.bhn;
import defpackage.bho;
import defpackage.bhp;
import defpackage.bhq;
import defpackage.bhr;
import defpackage.bhs;
import defpackage.mo;
import defpackage.mr;
import defpackage.xo;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HideViewOnScrollBehavior extends mo {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private bhs d;
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

    private final void W(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = this.d.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new bhq(this));
    }

    private final void X(int i) {
        bhs bhsVar = this.d;
        if (bhsVar == null || bhsVar.b() != i) {
            this.d = i != 0 ? i != 1 ? new bhm() : new bhl() : new bhn();
        }
    }

    private final void Y(int i) {
        this.k = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((bhr) it.next()).a();
        }
    }

    public final void a(View view) {
        if (this.k == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        Y(2);
        this.d.d();
        W(view, 0, this.f, this.h);
    }

    public final boolean b() {
        return this.k == 1;
    }

    @Override // defpackage.mo
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        int i2 = 0;
        if (this.a != null && this.b == null) {
            bho bhoVar = new bho(this, view, i2);
            this.b = bhoVar;
            this.a.addTouchExplorationStateChangeListener(bhoVar);
            view.addOnAttachStateChangeListener(new bhp(this, 0));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((mr) view.getLayoutParams()).c;
        if (i3 == 80 || i3 == 81) {
            X(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            int i4 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i4 = 0;
            }
            X(i4);
        }
        this.j = this.d.a(view, marginLayoutParams);
        this.f = xo.g(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = xo.g(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = xo.j(view.getContext(), bgz.c);
        this.i = xo.j(view.getContext(), bgz.b);
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
            Y(1);
            W(view, this.j, this.g, this.i);
        }
    }

    @Override // defpackage.mo
    public final boolean r(View view, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
