package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bzk {
    Object[] a;
    int b;
    boolean c;

    public bzk(int i) {
        bit.h(i, "initialCapacity");
        this.a = new Object[i];
        this.b = 0;
    }

    static int a(int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    private final void f(int i) {
        int length = this.a.length;
        int iA = a(length, this.b + i);
        if (iA > length || this.c) {
            this.a = Arrays.copyOf(this.a, iA);
            this.c = false;
        }
    }

    public final void b(Object[] objArr, int i) {
        bjz.i(objArr, i);
        f(i);
        System.arraycopy(objArr, 0, this.a, this.b, i);
        this.b += i;
    }

    public final void c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public /* bridge */ /* synthetic */ void d(Object obj) {
        throw null;
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof bzl) {
                this.b = ((bzl) collection).a(this.a, this.b);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }
}
