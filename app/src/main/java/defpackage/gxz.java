package defpackage;

import android.app.usage.UsageStatsManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxz {
    public static final gxz a = new gxz();
    public static final zdy b = zdy.h("com/google/android/apps/tvsearch/platform/context/SingletonModule");

    private gxz() {
    }

    public final UsageStatsManager a(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("usagestats");
        systemService.getClass();
        return (UsageStatsManager) systemService;
    }
}
