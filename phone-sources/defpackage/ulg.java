package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ulg implements uli {
    public final /* synthetic */ ulh a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TimeUnit e;
    private final /* synthetic */ int f;

    public /* synthetic */ ulg(ulh ulhVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f = i;
        this.a = ulhVar;
        this.b = runnable;
        this.c = j;
        this.d = j2;
        this.e = timeUnit;
    }

    @Override // defpackage.uli
    public final ScheduledFuture a(zft zftVar) {
        if (this.f != 0) {
            Runnable runnable = this.b;
            ulh ulhVar = this.a;
            rvp rvpVar = new rvp(ulhVar, runnable, zftVar, 4, (byte[]) null);
            TimeUnit timeUnit = this.e;
            long j = this.d;
            return ulhVar.b.scheduleAtFixedRate(rvpVar, this.c, j, timeUnit);
        }
        Runnable runnable2 = this.b;
        ulh ulhVar2 = this.a;
        rvp rvpVar2 = new rvp(ulhVar2, runnable2, zftVar, 3, (byte[]) null);
        TimeUnit timeUnit2 = this.e;
        long j2 = this.d;
        return ulhVar2.b.scheduleWithFixedDelay(rvpVar2, this.c, j2, timeUnit2);
    }
}
