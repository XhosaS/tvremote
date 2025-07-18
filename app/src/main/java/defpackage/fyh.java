package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyh implements wlk {
    public static final Duration a;
    public final fjn b;
    public final fxv c;
    public final JobScheduler d;
    private final ahbt e;

    static {
        Duration durationOfSeconds = Duration.ofSeconds(10L);
        durationOfSeconds.getClass();
        a = durationOfSeconds;
    }

    public fyh(Context context, ahbt ahbtVar, fjn fjnVar, fxv fxvVar, JobScheduler jobScheduler) {
        context.getClass();
        ahbtVar.getClass();
        fjnVar.getClass();
        this.e = ahbtVar;
        this.b = fjnVar;
        this.c = fxvVar;
        this.d = jobScheduler;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        intent.getAction();
        return ahkr.c(this.e, 0, new fyg(this, intent, null), 3);
    }
}
