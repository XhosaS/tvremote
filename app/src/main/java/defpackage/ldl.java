package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
class ldl implements Executor {
    final /* synthetic */ leo a;

    public ldl(leo leoVar) {
        this.a = leoVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        lbk lbkVar = this.a.y;
        lbh lbhVar = lbkVar.g;
        lbkVar.o(lbhVar);
        lbhVar.h(runnable);
    }
}
