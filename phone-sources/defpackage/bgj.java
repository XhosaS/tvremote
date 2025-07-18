package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgj<T> extends bgh<T> {
    private final Object[] c;

    public bgj(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // defpackage.bgh, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return (T) objArr[i];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = this.c;
        int i = this.a - 1;
        this.a = i;
        return (T) objArr[i];
    }
}
