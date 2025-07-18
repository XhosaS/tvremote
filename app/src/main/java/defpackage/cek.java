package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cek implements Runnable {
    private final zyd a;
    private final ahap b;

    public cek(zyd zydVar, ahap ahapVar) {
        this.a = zydVar;
        this.b = ahapVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zyd zydVar = this.a;
        if (zydVar.isCancelled()) {
            this.b.k(null);
            return;
        }
        try {
            this.b.e(cgm.b(zydVar));
        } catch (ExecutionException e) {
            ahap ahapVar = this.b;
            String str = cgm.a;
            Throwable cause = e.getCause();
            cause.getClass();
            ahapVar.e(agpl.a(cause));
        }
    }
}
