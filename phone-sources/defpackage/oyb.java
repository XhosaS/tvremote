package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oyb {
    private static final tvn a = tvn.n("GnpSdk");

    public static String a(Context context) {
        return crh.l(context.getResources().getConfiguration()).f(0).toLanguageTag();
    }

    public static boolean b(Context context) {
        if (context == null) {
            ((tvk) ((tvk) a.g()).j("com/google/android/libraries/internal/growth/growthkit/internal/common/DeviceUtils", "isTalkBackEnabled", 64, "DeviceUtils.java")).s("Null context passed to isTalkBackEnabled");
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(AccessibilityManager.class);
        return (accessibilityManager == null || !accessibilityManager.isEnabled() || accessibilityManager.getEnabledAccessibilityServiceList(1).isEmpty()) ? false : true;
    }
}
