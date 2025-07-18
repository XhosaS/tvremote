package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.katniss.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import defpackage.aam;
import defpackage.uxu;
import defpackage.uyh;
import defpackage.uyi;
import defpackage.uyj;
import defpackage.vav;
import defpackage.vaz;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class HideBottomViewOnScrollBehavior extends aam {
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

    private final void u(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.c = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new uyi(this));
    }

    private final void v(int i) {
        this.j = i;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((uyj) it.next()).a();
        }
    }

    @Override // defpackage.aam
    public final boolean d(CoordinatorLayout coordinatorLayout, final View view, int i) {
        this.i = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.e = vaz.a(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f = vaz.a(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.g = vav.a(view.getContext(), uxu.c);
        this.h = vav.a(view.getContext(), uxu.b);
        if (this.a == null) {
            this.a = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        if (this.a == null || this.b != null) {
            return false;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: uyg
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                if (z) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = this.a;
                    if (hideBottomViewOnScrollBehavior.s()) {
                        hideBottomViewOnScrollBehavior.t(view);
                    }
                }
            }
        };
        this.b = touchExplorationStateChangeListener;
        this.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new uyh(this));
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
            v(1);
            u(view, this.i, this.f, this.h);
        }
    }

    @Override // defpackage.aam
    public final boolean q(View view, int i, int i2) {
        return i == 2;
    }

    public final boolean s() {
        return this.j == 1;
    }

    public final void t(View view) {
        if (this.j != 2) {
            ViewPropertyAnimator viewPropertyAnimator = this.c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            v(2);
            u(view, 0, this.e, this.g);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinkedHashSet();
        this.i = 0;
        this.j = 2;
    }
}
