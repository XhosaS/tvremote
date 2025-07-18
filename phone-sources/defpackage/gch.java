package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gch<T> implements Iterable<T>, yli {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        Iterator<T> it = this.a.iterator();
        it.getClass();
        return it;
    }
}
