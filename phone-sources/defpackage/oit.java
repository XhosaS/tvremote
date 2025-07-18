package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oit {
    public static volatile oit a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final oce d;

    public oit(Context context) {
        this.d = new ocl(context, new ocf("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
            return;
        }
        this.d.a(new ocd(0, Arrays.asList(new obv(i, i2, -1, j, j2, null, null, 368, i3)))).p(new ofn(this, 3));
    }
}
