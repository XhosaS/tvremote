package defpackage;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzx {
    private static kzx b;
    public final AtomicLong a = new AtomicLong(-1);
    private final lbk c;
    private final kkt d;

    private kzx(Context context, lbk lbkVar) {
        this.d = new klb(context, new kku("measurement:api"));
        this.c = lbkVar;
    }

    static kzx a(lbk lbkVar) {
        if (b == null) {
            b = new kzx(lbkVar.a, lbkVar);
        }
        return b;
    }

    public final synchronized void b(int i, long j, long j2, int i2) {
        klk klkVar = this.c.B;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = this.a;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((lvn) this.d.a(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i, 0, j, j2, null, null, 0, i2))))).m(lvm.a, new lux() { // from class: kzw
            @Override // defpackage.lux
            public final void c(Exception exc) {
                this.a.a.set(jElapsedRealtime);
            }
        });
    }
}
