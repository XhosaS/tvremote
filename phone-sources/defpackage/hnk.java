package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hnk implements Runnable {
    final /* synthetic */ hnn a;
    private final hvd b;
    private final /* synthetic */ int c;

    public hnk(hnn hnnVar, hvd hvdVar, int i) {
        this.c = i;
        this.a = hnnVar;
        this.b = hvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hms hmsVar;
        if (this.c != 0) {
            hvd hvdVar = this.b;
            synchronized (hvdVar.a()) {
                hnn hnnVar = this.a;
                synchronized (hnnVar) {
                    if (hnnVar.a.d(hvdVar)) {
                        try {
                            hvdVar.d(hnnVar.f);
                        } finally {
                        }
                    }
                    this.a.b();
                }
            }
            return;
        }
        hvd hvdVar2 = this.b;
        synchronized (hvdVar2.a()) {
            hnn hnnVar2 = this.a;
            synchronized (hnnVar2) {
                if (hnnVar2.a.d(hvdVar2)) {
                    hnnVar2.h.d();
                    try {
                        hvdVar2.g(hnnVar2.h, hnnVar2.j);
                        this.a.h(this.b);
                    } finally {
                    }
                }
                this.a.b();
            }
        }
    }
}
