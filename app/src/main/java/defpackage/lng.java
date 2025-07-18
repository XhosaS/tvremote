package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lng {
    public static volatile lng a;
    public static final Object b = new Object();
    final AtomicLong c = new AtomicLong(-1);
    private final kkt d;

    public lng(Context context) {
        this.d = new klb(context, new kku("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        ((lvn) this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, -1, j, j2, null, null, 368, i3))))).m(lvm.a, new lux() { // from class: lnf
            @Override // defpackage.lux
            public final void c(Exception exc) {
                ConnectionResult connectionResult;
                if ((exc instanceof kej) && (connectionResult = ((kej) exc).a.i) != null && connectionResult.c == 24) {
                    this.a.c.set(SystemClock.elapsedRealtime());
                }
            }
        });
    }
}
