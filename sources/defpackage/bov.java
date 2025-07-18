package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bov {
    private static final cbt a = cbt.k("com/google/android/tv/remote/service/LowPowerStandbyUtil");

    public static boolean a(Context context) {
        int i = Build.VERSION.SDK_INT;
        int iA = nf.a(context, "android.permission.MANAGE_LOW_POWER_STANDBY");
        int iA2 = nf.a(context, "android.permission.SET_LOW_POWER_STANDBY_PORTS");
        boolean z = iA == 0;
        boolean z2 = iA2 == 0;
        boolean z3 = i >= 34;
        if (z3 && z && z2) {
            return ((PowerManager) context.getSystemService("power")).isLowPowerStandbySupported();
        }
        ((cbs) a.e().j("com/google/android/tv/remote/service/LowPowerStandbyUtil", "isLowPowerStandbySupported", 35, "LowPowerStandbyUtil.java")).A("Device does not support low power standby mode: Android 14+: %s, MANAGE_LOW_POWER_STANDBY: %s, SET_LOW_POWER_STANDBY_PORTS: %s", Boolean.valueOf(z3), Boolean.valueOf(z), Boolean.valueOf(z2));
        return false;
    }
}
