package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vag extends afn {
    final /* synthetic */ CheckableImageButton a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vag(CheckableImageButton checkableImageButton) {
        super(afn.c);
        this.a = checkableImageButton;
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        super.c(view, ajrVar);
        CheckableImageButton checkableImageButton = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
        accessibilityNodeInfo.setCheckable(checkableImageButton.b);
        accessibilityNodeInfo.setChecked(checkableImageButton.a);
    }
}
