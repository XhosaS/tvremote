package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpv extends gqa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpv(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        timeUnit.getClass();
        guw guwVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            gpn.b();
            Log.w(guw.a, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        guwVar.b(ykn.m(millis, 900000L), ykn.m(millis, 900000L));
    }

    @Override // defpackage.gqa
    public final /* bridge */ /* synthetic */ cvi a() {
        if (this.a && this.c.k.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        guw guwVar = this.c;
        if (guwVar.q) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new cvi(this.b, guwVar, this.d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpv(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        timeUnit.getClass();
        timeUnit2.getClass();
        this.c.b(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
