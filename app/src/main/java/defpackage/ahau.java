package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahau extends ahbc {
    public final agzv a;

    public ahau(agsw agswVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.c(agswVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new agzv(false, agzz.a);
    }
}
