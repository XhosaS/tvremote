package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynu {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ynu.class, Object.class, "a");
    public volatile Object a;
    private final ykn c;

    public ynu(Object obj, ykn yknVar) {
        this.c = yknVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != ynv.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        b.lazySet(this, obj);
        if (this.c != ynv.a) {
            Objects.toString(obj);
        }
    }

    public final void c(Object obj) {
        this.a = obj;
        if (this.c != ynv.a) {
            Objects.toString(obj);
        }
    }

    public final boolean d(Object obj, Object obj2) {
        boolean zF = a.F(b, this, obj, obj2);
        if (!zF || this.c == ynv.a) {
            return zF;
        }
        Objects.toString(obj);
        Objects.toString(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
