package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxh implements Runnable {
    final Future a;
    final zxe b;

    public zxh(Future future, zxe zxeVar) {
        this.a = future;
        this.b = zxeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thK;
        Future future = this.a;
        if ((future instanceof zzf) && (thK = ((zzf) future).k()) != null) {
            this.b.a(thK);
            return;
        }
        try {
            this.b.b(zxn.o(future));
        } catch (ExecutionException e) {
            this.b.a(e.getCause());
        } catch (Throwable th) {
            this.b.a(th);
        }
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.a().b = this.b;
        return yqqVarB.toString();
    }
}
