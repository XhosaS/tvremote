package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class rpk {
    static {
        i().a();
    }

    public static rpj i() {
        rox roxVar = new rox();
        roxVar.c(false);
        roxVar.b();
        zwk zwkVar = zwk.a;
        if (zwkVar == null) {
            throw new NullPointerException("Null listenerExecutor");
        }
        roxVar.d = zwkVar;
        roxVar.a = "Unknown";
        return roxVar;
    }

    public abstract yqt a();

    public abstract yqt b();

    public abstract yqt c();

    public abstract yzq d();

    public abstract String e();

    public abstract Executor f();

    public abstract boolean g();

    public abstract boolean h();
}
