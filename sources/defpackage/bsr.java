package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsr {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/clearcut/EnabledOptInObserver");
    public static final long b = TimeUnit.MILLISECONDS.convert(5, TimeUnit.MINUTES);
    private final Consumer c;

    public bsr(Consumer consumer) {
        this.c = consumer;
    }

    public final void a(boolean z) {
        this.c.accept(Boolean.valueOf(z));
    }

    public final void b(agb agbVar) {
        agbVar.d().f(new bsq(this, 0));
    }
}
