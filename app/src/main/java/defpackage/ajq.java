package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajq {
    final Object a;

    public ajq(Object obj) {
        this.a = obj;
    }

    public static ajq a(int i, int i2) {
        return new ajq(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false));
    }

    public static ajq b(int i, int i2, int i3, int i4, boolean z) {
        return new ajq(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
