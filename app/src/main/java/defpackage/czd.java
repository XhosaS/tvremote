package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class czd implements Callable {
    final /* synthetic */ czi a;

    public czd(czi cziVar) {
        this.a = cziVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        czi cziVar = this.a;
        synchronized (cziVar) {
            if (cziVar.f == null) {
                return null;
            }
            cziVar.h();
            if (cziVar.i()) {
                cziVar.f();
                cziVar.h = 0;
            }
            return null;
        }
    }
}
