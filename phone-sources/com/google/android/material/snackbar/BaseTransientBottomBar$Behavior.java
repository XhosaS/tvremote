package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.tay;
import defpackage.tbe;
import defpackage.xzg;
import defpackage.zft;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final xzg g = new xzg(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean D(View view) {
        return view instanceof tay;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.cqv
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        xzg xzgVar = this.g;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                tbe.a().f((zft) xzgVar.a);
            }
        } else if (coordinatorLayout.g(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            tbe.a().e((zft) xzgVar.a);
        }
        return super.e(coordinatorLayout, view, motionEvent);
    }
}
