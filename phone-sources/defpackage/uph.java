package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uph {
    public static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static onm c;

    public static void a(Context context) {
        if (c == null) {
            onm onmVar = new onm(context);
            c = onmVar;
            synchronized (onmVar.a) {
                onmVar.c = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (b) {
            if (c != null && d(intent)) {
                c(intent, false);
                onm onmVar = c;
                if (onmVar.f.decrementAndGet() < 0) {
                    ocv ocvVar = onm.h;
                    Log.w("WakeLock", String.format("%s release without a matched acquire!", onmVar.d));
                }
                synchronized (onmVar.a) {
                    onmVar.d();
                    Map map = onmVar.e;
                    if (map.containsKey(null)) {
                        ydk ydkVar = (ydk) map.get(null);
                        if (ydkVar != null) {
                            int i = ydkVar.a - 1;
                            ydkVar.a = i;
                            if (i == 0) {
                                map.remove(null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", onmVar.d + " counter does not exist");
                    }
                    onmVar.e();
                }
            }
        }
    }

    public static void c(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
