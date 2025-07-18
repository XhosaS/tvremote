package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uyo implements View.OnAttachStateChangeListener {
    final /* synthetic */ HideViewOnScrollBehavior a;

    public uyo(HideViewOnScrollBehavior hideViewOnScrollBehavior) {
        this.a = hideViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        HideViewOnScrollBehavior hideViewOnScrollBehavior = this.a;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideViewOnScrollBehavior.b;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = hideViewOnScrollBehavior.a) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        hideViewOnScrollBehavior.b = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
