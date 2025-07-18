package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvu {
    public static volatile jvu a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final kkt d;

    public jvu(Context context) {
        this.d = new klb(context, new kku("ads_identifier:api"));
    }

    public final synchronized void a(int i, long j, long j2, int i2) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.c;
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((lvn) this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, null, null, 0, i2))))).m(lvm.a, new lux() { // from class: jvt
            @Override // defpackage.lux
            public final void c(Exception exc) {
                ConnectionResult connectionResult;
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof kej) && (connectionResult = ((kej) exc).a.i) != null && connectionResult.c == 24) {
                    this.a.c.set(jElapsedRealtime);
                }
            }
        });
    }
}
