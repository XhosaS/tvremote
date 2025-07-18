package defpackage;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cck extends ccv {
    public cck(Class cls, long j, TimeUnit timeUnit) {
        super(cls);
        cld cldVar = this.c;
        long millis = timeUnit.toMillis(j);
        if (millis < 900000) {
            cbx.c();
            Log.w(cld.b, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        cldVar.b(millis < 900000 ? 900000L : millis, millis < 900000 ? 900000L : millis);
    }

    @Override // defpackage.ccv
    public final /* bridge */ /* synthetic */ ccw a() {
        if (this.a && this.c.l.d) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        if (this.c.s) {
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        return new ccl(this);
    }

    public cck(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        this.c.b(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }
}
