package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ahfx {
    public static final void a(ahgg ahggVar, Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = ahcz.a("Channel was consumed, consumer had failed", th);
            }
        }
        ahggVar.s(cancellationExceptionA);
    }
}
