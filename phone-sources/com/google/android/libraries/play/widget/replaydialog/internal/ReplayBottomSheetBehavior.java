package com.google.android.libraries.play.widget.replaydialog.internal;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.sfs;
import defpackage.sfy;
import defpackage.tko;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReplayBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public tko a;

    public ReplayBottomSheetBehavior() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.cqv
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        AccessibilityManager accessibilityManager;
        tko tkoVar = this.a;
        if (tkoVar != null) {
            int measuredHeight = view.getMeasuredHeight();
            sfs sfsVar = (sfs) tkoVar.b;
            boolean z = false;
            if (sfsVar.h) {
                Activity activity = sfsVar.a;
                if (sfy.h(activity) && !activity.isInMultiWindowMode() && measuredHeight >= ((int) (sfy.g(activity) * sfy.b(activity))) && ((accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility")) == null || !accessibilityManager.isTouchExplorationEnabled())) {
                    z = true;
                }
            }
            sfsVar.g = z;
            if (z) {
                ReplayBottomSheetBehavior replayBottomSheetBehavior = sfsVar.b;
                Context context = sfsVar.getContext();
                replayBottomSheetBehavior.O((int) (sfy.g(context) * (sfy.b(context) - 0.1f)));
            } else {
                sfsVar.b.O(((CoordinatorLayout) tkoVar.a).getHeight());
            }
        }
        super.f(coordinatorLayout, view, i);
        return true;
    }

    public ReplayBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
