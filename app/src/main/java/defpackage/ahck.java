package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahck implements Executor {
    public final ahbm a;

    public ahck(ahbm ahbmVar) {
        this.a = ahbmVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ahbm ahbmVar = this.a;
        agtf agtfVar = agtf.a;
        if (ahle.c(ahbmVar, agtfVar)) {
            ahle.b(ahbmVar, agtfVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
