package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class aggj extends AtomicReference implements aggi {
    private static final long serialVersionUID = 6537757548749041217L;

    public aggj(Object obj) {
        super(obj);
    }

    protected abstract void a(Object obj);

    @Override // defpackage.aggi
    public final void dispose() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // defpackage.aggi
    public final boolean f() {
        return get() == null;
    }
}
