package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vla implements Executor {
    public final /* synthetic */ vle a;
    public final /* synthetic */ Executor b;

    public /* synthetic */ vla(vle vleVar, Executor executor) {
        this.a = vleVar;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final Executor executor = this.b;
        this.a.b.execute(new Runnable() { // from class: vlc
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        });
    }
}
