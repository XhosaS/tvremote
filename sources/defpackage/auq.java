package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auq {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public auq(Context context) throws Throwable {
        atb.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
