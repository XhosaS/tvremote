package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.cqv;
import defpackage.cww;
import defpackage.cyp;
import defpackage.dar;
import defpackage.das;
import defpackage.gmq;
import defpackage.spc;
import defpackage.zft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends cqv<V> {
    public das a;
    public boolean b;
    public zft f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final dar h = new spc(this);

    public static float E(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    public boolean D(View view) {
        return true;
    }

    @Override // defpackage.cqv
    public boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zG = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zG = coordinatorLayout.g(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = zG;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (zG) {
            if (this.a == null) {
                this.a = das.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqv
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        cww.n(view, 1048576);
        if (!D(view)) {
            return false;
        }
        cww.x(view, cyp.f, new gmq(this, 2));
        return false;
    }

    @Override // defpackage.cqv
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }
}
