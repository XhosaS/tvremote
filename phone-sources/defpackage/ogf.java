package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ogf {
    public static final int a;

    static {
        a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent a(Context context, Intent intent, int i) {
        return PendingIntent.getBroadcast(context, 0, intent, i);
    }
}
