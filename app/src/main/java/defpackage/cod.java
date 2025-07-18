package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class cod implements Executor {
    final /* synthetic */ coe a;

    public cod(coe coeVar) {
        this.a = coeVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c.post(runnable);
    }
}
