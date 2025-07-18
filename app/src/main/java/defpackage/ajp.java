package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajp {
    final Object a;

    public ajp(Object obj) {
        this.a = obj;
    }

    public static ajp a(int i, int i2) {
        return new ajp(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, 0));
    }
}
