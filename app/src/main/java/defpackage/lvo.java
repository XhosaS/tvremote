package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
class lvo implements Runnable {
    final /* synthetic */ lvn a;
    final /* synthetic */ Callable b;

    public lvo(lvn lvnVar, Callable callable) {
        this.a = lvnVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.p(this.b.call());
        } catch (Exception e) {
            this.a.o(e);
        } catch (Throwable th) {
            this.a.o(new RuntimeException(th));
        }
    }
}
