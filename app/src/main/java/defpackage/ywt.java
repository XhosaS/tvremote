package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class ywt implements Iterator {
    int b;
    int c;
    int d = -1;
    final /* synthetic */ ywx e;

    public ywt(ywx ywxVar) {
        this.e = ywxVar;
        this.b = ywxVar.f;
        this.c = ywxVar.a();
    }

    private final void b() {
        if (this.e.f != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.c;
        this.d = i;
        Object objA = a(i);
        this.c = this.e.b(this.c);
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        yqw.M(this.d >= 0, "no calls to next() since the last call to remove()");
        this.b += 32;
        int i = this.d;
        ywx ywxVar = this.e;
        Object[] objArr = ywxVar.d;
        objArr.getClass();
        ywxVar.remove(objArr[i]);
        this.c--;
        this.d = -1;
    }
}
