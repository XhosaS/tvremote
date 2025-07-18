package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aam;
import defpackage.ahj;
import defpackage.ajo;
import defpackage.alo;
import defpackage.alp;
import defpackage.uys;
import defpackage.uyt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwipeDismissBehavior extends aam {
    public alp a;
    public boolean b;
    private boolean f;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final alo g = new uys(this);

    public static float t(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.aam
    public boolean c(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zL = this.f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zL = coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f = zL;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f = false;
        }
        if (zL) {
            if (this.a == null) {
                this.a = alp.b(coordinatorLayout, this.g);
            }
            if (!this.b && this.a.j(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aam
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        ahj.l(view, 1048576);
        if (!s(view)) {
            return false;
        }
        ahj.h(view, ajo.e.c(new uyt(this)));
        return false;
    }

    @Override // defpackage.aam
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
