package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sty extends cuo {
    final /* synthetic */ CheckableImageButton a;

    public sty(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        CheckableImageButton checkableImageButton = this.a;
        cyqVar.r(checkableImageButton.b);
        cyqVar.s(checkableImageButton.a);
    }
}
