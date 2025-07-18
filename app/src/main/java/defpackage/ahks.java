package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahks implements Runnable {
    private final zyd a;
    private final ahap b;

    public ahks(zyd zydVar, ahap ahapVar) {
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
            this.b.e(zze.a(zydVar));
        } catch (ExecutionException e) {
            ahap ahapVar = this.b;
            Throwable cause = e.getCause();
            cause.getClass();
            ahapVar.e(agpl.a(cause));
        }
    }
}
