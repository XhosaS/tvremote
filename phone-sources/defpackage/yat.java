package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yat extends xqe {
    long a;
    final /* synthetic */ ybb b;
    private final yaz c;

    public yat(ybb ybbVar, yaz yazVar) {
        this.b = ybbVar;
        this.c = yazVar;
    }

    @Override // defpackage.ykn
    public final void c(long j) {
        ybb ybbVar = this.b;
        if (ybbVar.r.f != null) {
            return;
        }
        synchronized (ybbVar.m) {
            if (ybbVar.r.f == null) {
                yaz yazVar = this.c;
                if (!yazVar.b) {
                    long j2 = this.a + j;
                    this.a = j2;
                    long j3 = ybbVar.v;
                    if (j2 <= j3) {
                        return;
                    }
                    if (j2 > ybbVar.n) {
                        yazVar.c = true;
                    } else {
                        long jC = ybbVar.G.c(j2 - j3);
                        ybbVar.v = this.a;
                        if (jC > ybbVar.o) {
                            yazVar.c = true;
                        }
                    }
                    Runnable runnableC = yazVar.c ? ybbVar.c(yazVar) : null;
                    if (runnableC != null) {
                        runnableC.run();
                    }
                }
            }
        }
    }
}
