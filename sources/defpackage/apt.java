package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apt implements cim {
    final /* synthetic */ cja a;
    final /* synthetic */ adx b;
    final /* synthetic */ adx c;

    public apt(adx adxVar, cja cjaVar, adx adxVar2) {
        this.b = adxVar;
        this.a = cjaVar;
        this.c = adxVar2;
    }

    @Override // defpackage.cim
    public final void a(Throwable th) {
        if (this.a.isCancelled()) {
            this.c.i();
        } else if (th instanceof Exception) {
            this.b.e((Exception) th);
        } else {
            this.b.e(new ExecutionException(th));
        }
    }

    @Override // defpackage.cim
    public final void b(Object obj) {
        this.b.f(obj);
    }
}
