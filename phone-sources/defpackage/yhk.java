package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yhk<T> extends ygp<T> implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public yhk(Object[] objArr, int i) {
        objArr.getClass();
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(a.cf(i, "ring buffer filled size should not be negative but it is "));
        }
        int length = objArr.length;
        if (i > length) {
            throw new IllegalArgumentException(a.ce(length, i, "ring buffer filled size: ", " cannot be larger than the buffer size: "));
        }
        this.b = length;
        this.d = i;
    }

    @Override // defpackage.ygk
    public final int a() {
        return this.d;
    }

    public final void b(int i) {
        int i2 = this.d;
        if (i > i2) {
            throw new IllegalArgumentException(a.ce(i2, i, "n shouldn't be greater than the buffer size: n = ", ", size = "));
        }
        int i3 = this.c;
        int i4 = this.b;
        int i5 = (i3 + i) % i4;
        if (i3 > i5) {
            Object[] objArr = this.a;
            yfm.aD(objArr, null, i3, i4);
            yfm.aD(objArr, null, 0, i5);
        } else {
            yfm.aD(this.a, null, i3, i5);
        }
        this.c = i5;
        this.d -= i;
    }

    public final boolean c() {
        return this.d == this.b;
    }

    @Override // defpackage.ygp, java.util.List
    public final T get(int i) {
        a.aA(i, this.d);
        return (T) this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.ygp, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<T> iterator() {
        return new ygl(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ygk, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[this.d]);
    }

    @Override // defpackage.ygk, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        tArr.getClass();
        int length = tArr.length;
        int i = this.d;
        if (length < i) {
            tArr = (T[]) Arrays.copyOf(tArr, i);
            tArr.getClass();
        }
        int i2 = this.d;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = this.c; i4 < i2 && i5 < this.b; i5++) {
            tArr[i4] = this.a[i5];
            i4++;
        }
        while (i4 < i2) {
            tArr[i4] = this.a[i3];
            i4++;
            i3++;
        }
        yfm.y(i2, tArr);
        return tArr;
    }
}
