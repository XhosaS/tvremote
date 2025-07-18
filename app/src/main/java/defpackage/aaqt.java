package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaqt {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    public static final Object b = new Object();
    public static lue c;

    public static void a(Context context) {
        if (c == null) {
            lue lueVar = new lue(context);
            c = lueVar;
            synchronized (lueVar.a) {
                lueVar.c = true;
            }
        }
    }

    static void b(Intent intent) {
        synchronized (b) {
            if (c != null && c(intent)) {
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                lue lueVar = c;
                if (lueVar.g.decrementAndGet() < 0) {
                    lub lubVar = lue.h;
                    Log.w("WakeLock", String.format("%s release without a matched acquire!", lueVar.e));
                }
                synchronized (lueVar.a) {
                    lueVar.d();
                    Map map = lueVar.f;
                    if (map.containsKey(null)) {
                        luc lucVar = (luc) map.get(null);
                        if (lucVar != null) {
                            int i = lucVar.a - 1;
                            lucVar.a = i;
                            if (i == 0) {
                                map.remove(null);
                            }
                        }
                    } else {
                        Log.w("WakeLock", lueVar.e + " counter does not exist");
                    }
                    lueVar.e();
                }
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }
}
