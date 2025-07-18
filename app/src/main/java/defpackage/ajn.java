package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajn implements AccessibilityManager.AccessibilityStateChangeListener {
    final ajm a;

    public ajn(ajm ajmVar) {
        this.a = ajmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajn) {
            return this.a.equals(((ajn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        dra.a();
        dvz dvzVar = (dvz) ((dvw) this.a).a.get();
        if (dvzVar == null) {
            return;
        }
        dvzVar.h(z);
        dvzVar.q = true;
        dvzVar.requestLayout();
    }
}
