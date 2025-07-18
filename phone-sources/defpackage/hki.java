package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hki implements Callable {
    final /* synthetic */ hkm a;

    public hki(hkm hkmVar) {
        this.a = hkmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        hkm hkmVar = this.a;
        synchronized (hkmVar) {
            if (hkmVar.f == null) {
                return null;
            }
            hkmVar.f();
            if (hkmVar.g()) {
                hkmVar.d();
                hkmVar.h = 0;
            }
            return null;
        }
    }
}
