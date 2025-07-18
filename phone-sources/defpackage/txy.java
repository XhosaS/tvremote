package defpackage;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txy<T> extends AbstractSet<T> {
    final int a;
    final /* synthetic */ txz b;

    public txy(txz txzVar, int i) {
        this.b = txzVar;
        this.a = i;
    }

    final int a() {
        return this.b.c[this.a + 1];
    }

    final int b() {
        int i = this.a;
        if (i == -1) {
            return 0;
        }
        return this.b.c[i];
    }

    final Object c(int i) {
        return this.b.b[b() + i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.b.b, b(), a(), obj, this.a == -1 ? txz.a : tyb.a) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        return new txx(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a() - b();
    }
}
