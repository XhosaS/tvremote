package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahkn implements zyd {
    public final zyu a = new zyu();
    private final ahdl b;
    private boolean c;

    public ahkn(ahdl ahdlVar) {
        this.b = ahdlVar;
    }

    private final void b(Object obj) throws Throwable {
        if (obj instanceof ahkm) {
            throw new CancellationException().initCause(((ahkm) obj).a);
        }
    }

    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            this.a.p(new ahkm((CancellationException) th));
        } else if (this.a.q(th)) {
            this.c = true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.a.cancel(z)) {
            return false;
        }
        this.b.s(null);
        return true;
    }

    @Override // defpackage.zyd
    public final void d(Runnable runnable, Executor executor) {
        this.a.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object objS = this.a.s();
        b(objS);
        return objS;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        zyu zyuVar = this.a;
        if (zyuVar.valueField instanceof zue) {
            return true;
        }
        if (!zyuVar.isDone() || this.c) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.c = true;
        }
        return zze.a(zyuVar) instanceof ahkm;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        zyu zyuVar = this.a;
        if (zyuVar.isDone()) {
            try {
                Object objA = zze.a(zyuVar);
                if (objA instanceof ahkm) {
                    sb.append("CANCELLED, cause=[" + ((ahkm) objA).a + "]");
                } else {
                    sb.append(a.c(objA, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.a + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object objT = this.a.t(j, timeUnit);
        b(objT);
        return objT;
    }
}
