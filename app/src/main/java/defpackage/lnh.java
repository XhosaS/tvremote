package defpackage;

import android.content.Context;
import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lnh implements AutoCloseable {
    public int a = 13;
    private final long b = System.currentTimeMillis();
    private final long c = SystemClock.uptimeMillis();
    private final int d;
    private final Context e;
    private final float f;

    public lnh(Context context, int i, float f) {
        this.d = i;
        this.e = context;
        this.f = f;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.e;
        if (lng.a == null) {
            synchronized (lng.b) {
                if (lng.a == null) {
                    lng.a = new lng(context);
                }
            }
        }
        int i = this.d;
        lng lngVar = lng.a;
        int i2 = this.a;
        long j = this.b;
        long j2 = this.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - j2;
        if (ThreadLocalRandom.current().nextFloat() < this.f) {
            lngVar.a(i, i2, j, jCurrentTimeMillis, (int) jUptimeMillis);
        }
    }
}
