package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcq extends View.AccessibilityDelegate {
    final /* synthetic */ tcr a;

    public tcq(tcr tcrVar) {
        this.a = tcrVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.a.b.c;
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
