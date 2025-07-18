package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.att;
import defpackage.bkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public BaseTransientBottomBar$Behavior() {
        this.d = SwipeDismissBehavior.b(0.1f);
        this.e = SwipeDismissBehavior.b(0.6f);
        this.c = 0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean a(View view) {
        return view instanceof bkx;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.mo
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                synchronized (att.c().a) {
                }
            }
        } else if (coordinatorLayout.j(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            synchronized (att.c().a) {
            }
        }
        return super.e(coordinatorLayout, view, motionEvent);
    }
}
