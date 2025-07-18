package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ulf implements uli {
    public final /* synthetic */ ulh a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TimeUnit c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ulf(ulh ulhVar, Object obj, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.a = ulhVar;
        this.d = obj;
        this.b = j;
        this.c = timeUnit;
    }

    @Override // defpackage.uli
    public final ScheduledFuture a(zft zftVar) {
        if (this.e != 0) {
            Object obj = this.d;
            ulh ulhVar = this.a;
            hbn hbnVar = new hbn((Object) ulhVar, obj, (Object) zftVar, 14, (byte[]) null);
            TimeUnit timeUnit = this.c;
            return ulhVar.b.schedule(hbnVar, this.b, timeUnit);
        }
        Object obj2 = this.d;
        ulh ulhVar2 = this.a;
        rvp rvpVar = new rvp(ulhVar2, obj2, zftVar, 2, (byte[]) null);
        TimeUnit timeUnit2 = this.c;
        return ulhVar2.b.schedule(rvpVar, this.b, timeUnit2);
    }
}
