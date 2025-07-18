package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afm extends View.AccessibilityDelegate {
    final afn a;

    public afm(afn afnVar) {
        this.a = afnVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        aju ajuVarA = this.a.a(view);
        if (ajuVarA != null) {
            return (AccessibilityNodeProvider) ajuVarA.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        ajr ajrVar = new ajr(accessibilityNodeInfo);
        int[] iArr = ahj.a;
        Boolean bool = (Boolean) new agu(Boolean.class).d(view);
        boolean z = bool != null && bool.booleanValue();
        AccessibilityNodeInfo accessibilityNodeInfo2 = ajrVar.a;
        accessibilityNodeInfo2.setScreenReaderFocusable(z);
        Boolean bool2 = (Boolean) new agx(Boolean.class).d(view);
        accessibilityNodeInfo2.setHeading(bool2 != null && bool2.booleanValue());
        accessibilityNodeInfo2.setPaneTitle(ahj.f(view));
        CharSequence charSequence = (CharSequence) new agw(CharSequence.class).d(view);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityNodeInfo2.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.c(view, ajrVar);
        accessibilityNodeInfo.getText();
        List listK = afn.k(view);
        for (int i = 0; i < listK.size(); i++) {
            ajrVar.c((ajo) listK.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
