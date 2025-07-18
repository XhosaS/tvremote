package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvo {
    static {
        TimeUnit.DAYS.toMillis(365L);
        TimeUnit.HOURS.toMillis(6L);
    }

    public qvo(Context context) throws Throwable {
        qth.b();
        Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
