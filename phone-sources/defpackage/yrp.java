package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yrp extends ysa implements yrq {
    public yrp(yil yilVar, yrz yrzVar, boolean z) {
        super(yilVar, yrzVar, false, z);
        I((yqe) yilVar.get(yqe.c));
    }

    @Override // defpackage.yql
    protected final void J(Throwable th) {
        if (th != null) {
            cancellationExceptionAj = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionAj == null) {
                cancellationExceptionAj = ylh.aj(String.valueOf(yoz.a(this)).concat(" was cancelled"), th);
            }
        }
        this.b.t(cancellationExceptionAj);
    }

    @Override // defpackage.yql
    protected final boolean O(Throwable th) {
        yks.k(((ynw) this).a, th);
        return true;
    }
}
