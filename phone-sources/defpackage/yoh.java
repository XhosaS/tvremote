package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yoh extends yon {
    public final ynr a;

    public yoh(yih yihVar, Throwable th, boolean z) {
        super(th == null ? new CancellationException(a.cj(yihVar, "Continuation ", " was cancelled normally")) : th, z);
        this.a = new ynr(false, ynv.a);
    }
}
