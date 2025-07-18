package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class mer implements Executor {
    public final /* synthetic */ zyh a;

    public /* synthetic */ mer(zyh zyhVar) {
        this.a = zyhVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(wyo.h(runnable));
    }
}
