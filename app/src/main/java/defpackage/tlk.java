package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlk implements emk {
    public final tln a;

    public tlk(Executor executor) {
        this.a = new tln(executor);
    }

    @Override // defpackage.emk
    public final void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override // defpackage.emk
    public final void c(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // defpackage.emk
    public final void b() {
    }
}
