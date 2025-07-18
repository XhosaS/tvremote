package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahdm extends CancellationException implements ahbf {
    private final transient ahdl a;

    public ahdm(String str, Throwable th, ahdl ahdlVar) {
        super(str);
        this.a = ahdlVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.ahbf
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!ahbx.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new ahdm(message, this, b());
    }

    public final ahdl b() {
        ahdl ahdlVar = this.a;
        return ahdlVar == null ? aheb.a : ahdlVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahdm) {
            ahdm ahdmVar = (ahdm) obj;
            if (agvy.c(ahdmVar.getMessage(), getMessage()) && agvy.c(ahdmVar.b(), b()) && agvy.c(ahdmVar.getCause(), getCause())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (ahbx.a) {
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
