package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yqf extends CancellationException implements yoq {
    private final transient yqe a;

    public yqf(String str, Throwable th, yqe yqeVar) {
        super(str);
        this.a = yqeVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.yoq
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!yoy.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new yqf(message, this, b());
    }

    public final yqe b() {
        yqe yqeVar = this.a;
        return yqeVar == null ? yqr.a : yqeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yqf) {
            yqf yqfVar = (yqf) obj;
            if (yks.e(yqfVar.getMessage(), getMessage()) && yks.e(yqfVar.b(), b()) && yks.e(yqfVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (yoy.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = (message.hashCode() * 31) + b().hashCode();
        Throwable cause = getCause();
        return (iHashCode * 31) + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + b();
    }
}
