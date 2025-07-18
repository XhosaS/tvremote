package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqn {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public rqn(Context context) throws Throwable {
        rpd.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
