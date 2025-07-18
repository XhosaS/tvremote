package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxc implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener, bdy {
    public final AccessibilityManager a;
    private final bcb b;
    private final bcb c;

    public jxc(AccessibilityManager accessibilityManager) {
        this.a = accessibilityManager;
        Boolean boolValueOf = Boolean.valueOf(accessibilityManager.isEnabled());
        bcz bczVar = bcz.c;
        this.b = new bci(boolValueOf, bczVar);
        this.c = new bci(Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled()), bczVar);
    }

    @Override // defpackage.bdy
    public final /* bridge */ /* synthetic */ Object a() {
        boolean z = false;
        if (((Boolean) this.b.a()).booleanValue() && ((Boolean) this.c.a()).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final void b(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        this.c.b(Boolean.valueOf(z));
    }

    public final void d() {
        AccessibilityManager accessibilityManager = this.a;
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
        accessibilityManager.removeAccessibilityStateChangeListener(this);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        b(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        c(z);
    }
}
