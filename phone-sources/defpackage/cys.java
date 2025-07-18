package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cys extends cyr {
    public cys(cyt cytVar) {
        super(cytVar);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        this.a.c(i, new cyq(accessibilityNodeInfo), str, bundle);
    }
}
