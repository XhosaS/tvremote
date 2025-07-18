package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agha extends AtomicReference implements aggi {
    private static final long serialVersionUID = 5718521705281392066L;

    public agha(aggx aggxVar) {
        super(aggxVar);
    }

    @Override // defpackage.aggi
    public final void dispose() {
        aggx aggxVar;
        if (get() == null || (aggxVar = (aggx) getAndSet(null)) == null) {
            return;
        }
        try {
            aggxVar.a();
        } catch (Exception e) {
            aggq.a(e);
            agoh.e(e);
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
