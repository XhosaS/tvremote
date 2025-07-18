package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cyr extends AccessibilityNodeProvider {
    final cyt a;

    public cyr(cyt cytVar) {
        this.a = cytVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        cyq cyqVarA = this.a.a(i);
        if (cyqVarA == null) {
            return null;
        }
        return cyqVarA.b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        cyq cyqVarB = this.a.b(i);
        if (cyqVarB == null) {
            return null;
        }
        return cyqVarB.b;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.d(i, i2, bundle);
    }
}
