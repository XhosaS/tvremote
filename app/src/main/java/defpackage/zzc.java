package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zzc extends zww implements RunnableFuture {
    private volatile zyb a;

    public zzc(zvh zvhVar) {
        this.a = new zza(this, zvhVar);
    }

    static zzc e(Runnable runnable, Object obj) {
        return new zzc(Executors.callable(runnable, obj));
    }

    @Override // defpackage.zum
    protected final String a() {
        zyb zybVar = this.a;
        return zybVar != null ? a.t(zybVar, "task=[", "]") : super.a();
    }

    @Override // defpackage.zum
    protected final void b() {
        zyb zybVar;
        if (r() && (zybVar = this.a) != null) {
            zybVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zyb zybVar = this.a;
        if (zybVar != null) {
            zybVar.run();
        }
        this.a = null;
    }

    public zzc(Callable callable) {
        this.a = new zzb(this, callable);
    }
}
