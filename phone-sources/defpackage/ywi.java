package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ywi implements uhp {
    private final yqe a;
    private final uic b = new uic();
    private boolean c;

    public ywi(yqe yqeVar) {
        this.a = yqeVar;
    }

    private static final void d(Object obj) throws Throwable {
        if (obj instanceof ywh) {
            throw new CancellationException().initCause(((ywh) obj).a);
        }
    }

    public final void a(Object obj) {
        this.b.b(obj);
    }

    public final void b(Throwable th) {
        if (th instanceof CancellationException) {
            this.b.b(new ywh((CancellationException) th));
        } else if (this.b.e(th)) {
            this.c = true;
        }
    }

    @Override // defpackage.uhp
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.t(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object objS = this.b.s();
        d(objS);
        return objS;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        uic uicVar = this.b;
        if (uicVar.isCancelled()) {
            return true;
        }
        if (!isDone() || this.c) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.c = true;
        }
        return a.G(uicVar) instanceof ywh;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objG = a.G(this.b);
                if (objG instanceof ywh) {
                    sb.append("CANCELLED, cause=[" + ((ywh) objG).a + "]");
                } else {
                    sb.append(a.cj(objG, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object objT = this.b.t(j, timeUnit);
        d(objT);
        return objT;
    }
}
