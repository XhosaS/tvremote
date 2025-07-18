package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afsz implements Runnable {
    final /* synthetic */ aftc a;

    public afsz(aftc aftcVar) {
        this.a = aftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        aftc aftcVar = this.a;
        synchronized (aftcVar) {
            aftcVar.d = null;
            int i = aftcVar.i;
            if (i == 2) {
                aftcVar.i = 4;
                aftcVar.c = aftcVar.a.schedule(aftcVar.e, aftcVar.h, TimeUnit.NANOSECONDS);
                z = true;
            } else {
                if (i == 3) {
                    aftcVar.d = aftcVar.a.schedule(aftcVar.f, aftcVar.g - aftcVar.b.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                    aftcVar.i = 2;
                }
                z = false;
            }
        }
        if (z) {
            aftb aftbVar = this.a.j;
            aftbVar.a.i(new afta(aftbVar), zwk.a);
        }
    }
}
