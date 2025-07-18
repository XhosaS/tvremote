package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvg {
    private static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(cvg.class, Object.class, "a");
    public volatile Object a;
    private final dnx c;

    public cvg(Object obj, dnx dnxVar) {
        this.c = dnxVar;
        this.a = obj;
    }

    public final Object a(Object obj) {
        Object andSet = b.getAndSet(this, obj);
        if (this.c != cvh.a) {
            Objects.toString(obj);
            Objects.toString(andSet);
        }
        return andSet;
    }

    public final void b(Object obj) {
        this.a = obj;
        if (this.c != cvh.a) {
            Objects.toString(obj);
        }
    }

    public final boolean c(Object obj, Object obj2) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, obj2)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                z = false;
                break;
            }
        }
        if (!z || this.c == cvh.a) {
            return z;
        }
        Objects.toString(obj);
        Objects.toString(obj2);
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
