package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class zid implements Iterator {
    final /* synthetic */ zie a;
    private int b = 0;

    public zid(zie zieVar) {
        this.a = zieVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        zie zieVar = this.a;
        return i < zieVar.a() - zieVar.b();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        zie zieVar = this.a;
        if (i >= zieVar.a() - zieVar.b()) {
            throw new NoSuchElementException();
        }
        zif zifVar = zieVar.b;
        Object obj = zifVar.b[zieVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
