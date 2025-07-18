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
import com.google.android.katniss.R;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import defpackage.aam;
import defpackage.aap;
import defpackage.uxu;
import defpackage.uyk;
import defpackage.uyl;
import defpackage.uym;
import defpackage.uyo;
import defpackage.uyp;
import defpackage.uyq;
import defpackage.uyr;
import defpackage.vav;
import defpackage.vaz;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HideViewOnScrollBehavior extends aam {
    public AccessibilityManager a;
    public AccessibilityManager.TouchExplorationStateChangeListener b;
    public ViewPropertyAnimator c;
    private uyr d;
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

    private final void u(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = this.d.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new uyp(this));
    }

    private final void v(int i) {
        uyr uyrVar = this.d;
        if (uyrVar == null || uyrVar.b() != i) {
            this.d = i != 0 ? i != 1 ? new uyl() : new uyk() : new uym();
        }
    }

    private final void w(int i) {
        this.k = i;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((uyq) it.next()).a();
        }
    }

    @Override // defpackage.aam
    public final boolean d(CoordinatorLayout coordinatorLayout, final View view, int i) {
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.a != null && this.b == null) {
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: uyn
                @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                public final void onTouchExplorationStateChanged(boolean z) {
                    if (z) {
                        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.a;
                        if (hideViewOnScrollBehavior.s()) {
                            hideViewOnScrollBehavior.t(view);
                        }
                    }
                }
            };
            this.b = touchExplorationStateChangeListener;
            this.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            view.addOnAttachStateChangeListener(new uyo(this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((aap) view.getLayoutParams()).c;
        if (i2 == 80 || i2 == 81) {
            v(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            int i3 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            }
            v(i3);
        }
        this.j = this.d.a(view, marginLayoutParams);
        this.f = vaz.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.g = vaz.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.h = vav.a(view.getContext(), uxu.c);
        this.i = vav.a(view.getContext(), uxu.b);
        return false;
    }

    @Override // defpackage.aam
    public final void m(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                t(view);
            }
        } else if (!s() && ((accessibilityManager = this.a) == null || !accessibilityManager.isTouchExplorationEnabled())) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            w(1);
            u(view, this.j, this.g, this.i);
        }
    }

    @Override // defpackage.aam
    public final boolean q(View view, int i, int i2) {
        return i == 2;
    }

    public final boolean s() {
        return this.k == 1;
    }

    public final void t(View view) {
        if (this.k != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            w(2);
            this.d.d();
            u(view, 0, this.f, this.h);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new LinkedHashSet();
        this.j = 0;
        this.k = 2;
    }
}
