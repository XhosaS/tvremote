package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jby {
    private final AtomicReference a = new AtomicReference(null);

    public final void a(Object obj) {
        Object obj2 = this.a.get();
        if (obj2 == null || obj2 == obj) {
            c(obj);
        }
    }

    public final void b(Object obj) {
        this.a.set(obj);
        d(obj);
    }

    protected abstract void c(Object obj);

    protected abstract void d(Object obj);
}
