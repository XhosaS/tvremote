package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class soy implements View.OnAttachStateChangeListener {
    final /* synthetic */ cqv a;
    private final /* synthetic */ int b;

    public soy(cqv cqvVar, int i) {
        this.b = i;
        this.a = cqvVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        if (this.b != 0) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.a;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.c;
            if (touchExplorationStateChangeListener == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.b) == null) {
                return;
            }
            accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            hideBottomViewOnScrollBehavior.c = null;
            return;
        }
        HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.a;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideViewOnScrollBehavior.b;
        if (touchExplorationStateChangeListener2 == null || (accessibilityManager = hideViewOnScrollBehavior.a) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
        hideViewOnScrollBehavior.b = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
