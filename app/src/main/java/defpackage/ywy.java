package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ywy implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ ywz d;

    public ywy(ywz ywzVar) {
        this.d = ywzVar;
        this.a = ywzVar.b;
        this.b = ywzVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        ywz ywzVar = this.d;
        Object[] objArr = ywzVar.a;
        objArr.getClass();
        Object obj = objArr[i];
        this.b = ywzVar.b(i);
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        yqw.M(this.c >= 0, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        ywz ywzVar = this.d;
        Object[] objArr = ywzVar.a;
        objArr.getClass();
        ywzVar.remove(objArr[i]);
        this.b--;
        this.c = -1;
    }
}
