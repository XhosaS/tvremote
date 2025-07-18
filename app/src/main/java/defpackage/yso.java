package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yso extends AbstractQueue {
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return zcp.b.f().listIterator(0);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return 0;
    }
}
