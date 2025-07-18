package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nyi implements oao {
    public final boolean a;
    private final WeakReference b;
    private final jzs c;

    public nyi(nyr nyrVar, jzs jzsVar, boolean z) {
        this.b = new WeakReference(nyrVar);
        this.c = jzsVar;
        this.a = z;
    }

    @Override // defpackage.oao
    public final void a(nve nveVar) {
        nyr nyrVar = (nyr) this.b.get();
        if (nyrVar == null) {
            return;
        }
        ocv.aA(Looper.myLooper() == nyrVar.a.l.f, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        Lock lock = nyrVar.b;
        lock.lock();
        try {
            if (!nyrVar.l(0)) {
                lock.unlock();
                return;
            }
            if (!nveVar.c()) {
                nyrVar.o(nveVar, this.c, this.a);
            }
            if (nyrVar.m()) {
                nyrVar.k();
            }
        } finally {
            nyrVar.b.unlock();
        }
    }
}
