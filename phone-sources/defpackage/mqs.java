package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mqs extends View.AccessibilityDelegate {
    final /* synthetic */ mqv a;

    public mqs(mqv mqvVar) {
        this.a = mqvVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        mqv mqvVar = this.a;
        int iIntValue = ((Integer) mqvVar.h.a()).intValue();
        int iIntValue2 = ((Integer) mqvVar.k.a()).intValue();
        if (i == 4096) {
            int i2 = iIntValue + WVMediaCrypto.TYPE;
            if (i2 > iIntValue2) {
                mqvVar.t(iIntValue2);
                return true;
            }
            mqvVar.t(i2);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        if (iIntValue < 10000) {
            mqvVar.t(0);
            return true;
        }
        mqvVar.t(iIntValue - 10000);
        return true;
    }
}
