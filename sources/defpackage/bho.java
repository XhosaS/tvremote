package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bho implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ mo b;
    private final /* synthetic */ int c;

    public /* synthetic */ bho(mo moVar, View view, int i) {
        this.c = i;
        this.b = moVar;
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.c != 0) {
            if (z) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.b;
                if (hideBottomViewOnScrollBehavior.b()) {
                    hideBottomViewOnScrollBehavior.a(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.b;
            if (hideViewOnScrollBehavior.b()) {
                hideViewOnScrollBehavior.a(this.a);
            }
        }
    }
}
