package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class dqa implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dqm.d().post(runnable);
    }
}
