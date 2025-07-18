package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwt implements Runnable {
    final /* synthetic */ afwv a;

    public afwt(afwv afwvVar) {
        this.a = afwvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afwv afwvVar = this.a;
        if (!afwvVar.e) {
            afwvVar.f = null;
            return;
        }
        long jA = afwvVar.d - afwvVar.a();
        if (jA > 0) {
            afwvVar.f = afwvVar.a.schedule(new afwu(afwvVar), jA, TimeUnit.NANOSECONDS);
            return;
        }
        afwvVar.e = false;
        afwvVar.f = null;
        afwvVar.c.run();
    }
}
