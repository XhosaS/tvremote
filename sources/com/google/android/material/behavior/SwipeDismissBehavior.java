package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.bht;
import defpackage.bhu;
import defpackage.mo;
import defpackage.qv;
import defpackage.sl;
import defpackage.tu;
import defpackage.tv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SwipeDismissBehavior extends mo {
    public tv a;
    public boolean b;
    private boolean f;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final tu g = new bht(this);

    public static float b(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    public boolean a(View view) {
        return true;
    }

    @Override // defpackage.mo
    public boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zJ = this.f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zJ = coordinatorLayout.j(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f = zJ;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f = false;
        }
        if (zJ) {
            if (this.a == null) {
                this.a = tv.b(coordinatorLayout, this.g);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mo
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        qv.j(view, 1048576);
        if (!a(view)) {
            return false;
        }
        qv.r(view, sl.e, new bhu(this));
        return false;
    }

    @Override // defpackage.mo
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
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
