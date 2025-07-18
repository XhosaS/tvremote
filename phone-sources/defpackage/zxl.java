package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zxl<T> implements Iterator<T> {
    private int a = -1;
    private final /* synthetic */ int b;
    private final Object c;

    public zxl(oai oaiVar, int i) {
        this.b = i;
        this.c = oaiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != 0) {
            return this.a < ((oai) this.c).a.h + (-1);
        }
        return this.a < ((zih[]) this.c).length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b == 0) {
            int i = this.a;
            zih[] zihVarArr = (zih[]) this.c;
            if (i == zihVarArr.length) {
                throw new NoSuchElementException(a.cf(i, "Out of elements: "));
            }
            this.a = i + 1;
            return zihVarArr[i];
        }
        if (hasNext()) {
            Object obj = this.c;
            int i2 = this.a + 1;
            this.a = i2;
            return new oaj(((oai) obj).a, i2);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b == 0) {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }

    public zxl(Object[] objArr, int i) {
        this.b = i;
        this.c = objArr;
    }
}
