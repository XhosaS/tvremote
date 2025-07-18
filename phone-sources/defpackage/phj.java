package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class phj extends cuo {
    final /* synthetic */ tst a;
    final /* synthetic */ phk b;

    public phj(phk phkVar, tst tstVar) {
        this.a = tstVar;
        this.b = phkVar;
    }

    @Override // defpackage.cuo
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 65536) {
            this.b.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.cuo
    public final void onInitializeAccessibilityNodeInfo(View view, cyq cyqVar) {
        super.onInitializeAccessibilityNodeInfo(view, cyqVar);
        if (TextUtils.isEmpty(cyqVar.f())) {
            cyqVar.U(this.a.c());
            return;
        }
        cyqVar.U(String.valueOf(cyqVar.f()) + ", " + ((String) this.a.c()));
    }
}
