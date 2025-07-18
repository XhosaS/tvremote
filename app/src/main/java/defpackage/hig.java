package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hig {
    public final AccessibilityManager a;
    public final gph b;
    public final hid c;

    public hig(AccessibilityManager accessibilityManager, gph gphVar, hid hidVar) {
        this.a = accessibilityManager;
        this.b = gphVar;
        this.c = hidVar;
    }

    public final void a() {
        Object objEp = this.c.ep();
        if (objEp instanceof Activity) {
            ((Activity) objEp).finish();
        }
    }
}
