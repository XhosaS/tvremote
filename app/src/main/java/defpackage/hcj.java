package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcj {
    public static final Duration a;
    public final gph b;
    public final JobScheduler c;
    public final iyj d;
    public final iyu e;
    public final izq f;

    static {
        Duration durationOfHours = Duration.ofHours(60L);
        durationOfHours.getClass();
        a = durationOfHours;
    }

    public hcj(Context context, gph gphVar, JobScheduler jobScheduler, iyj iyjVar, iyu iyuVar, izq izqVar) {
        context.getClass();
        iyjVar.getClass();
        this.b = gphVar;
        this.c = jobScheduler;
        this.d = iyjVar;
        this.e = iyuVar;
        this.f = izqVar;
    }
}
