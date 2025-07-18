package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hox {
    static final int a;
    public final ActivityManager b;
    public float c;
    public final hfx d;

    static {
        a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public hox(Context context) {
        this.c = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.b = activityManager;
        this.d = new hfx(context.getResources().getDisplayMetrics(), (byte[]) null);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.c = 0.0f;
    }
}
