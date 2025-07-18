package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dod implements Iterator {
    private final Object[] a;
    private int b;
    private final /* synthetic */ int c;

    public dod(Object[] objArr, int i) {
        this.c = i;
        this.b = 0;
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c != 0 ? this.b < this.a.length : this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == 0) {
            int i = this.b;
            Object[] objArr = this.a;
            if (i == objArr.length) {
                throw new NoSuchElementException(b.e(i, "Out of elements: "));
            }
            this.b = i + 1;
            return objArr[i];
        }
        try {
            Object[] objArr2 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            return objArr2[i2];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.c == 0) {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
        ii.U();
    }

    public dod(Object[] objArr, int i, byte[] bArr) {
        this.c = i;
        this.a = objArr;
    }
}
