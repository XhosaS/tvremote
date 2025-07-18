package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
class axz extends View.AccessibilityDelegate {
    final /* synthetic */ ayb a;

    public axz(ayb aybVar) {
        this.a = aybVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        axh axhVar = this.a.s;
        boolean z = false;
        if (axhVar != null && axhVar.e()) {
            z = true;
        }
        accessibilityEvent.setChecked(z);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        boolean z = false;
        accessibilityNodeInfo.setCheckable(false);
        axh axhVar = this.a.s;
        if (axhVar != null && axhVar.e()) {
            z = true;
        }
        accessibilityNodeInfo.setChecked(z);
    }
}
