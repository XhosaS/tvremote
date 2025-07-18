package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uik extends ugt implements RunnableFuture {
    private volatile uhn a;

    public uik(ufv ufvVar) {
        this.a = new uii(this, ufvVar);
    }

    public static uik g(Runnable runnable, Object obj) {
        return new uik(Executors.callable(runnable, obj));
    }

    @Override // defpackage.ufb
    protected final void d() {
        uhn uhnVar;
        if (r() && (uhnVar = this.a) != null) {
            uhnVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.ufb
    protected final String dw() {
        uhn uhnVar = this.a;
        return uhnVar != null ? a.ch(uhnVar, "task=[", "]") : super.dw();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        uhn uhnVar = this.a;
        if (uhnVar != null) {
            uhnVar.run();
        }
        this.a = null;
    }

    public uik(Callable callable) {
        this.a = new uij(this, callable);
    }
}
