package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
class eqy implements Iterator {
    final /* synthetic */ era a;
    private int b = 0;

    public eqy(era eraVar) {
        this.a = eraVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        if (i >= this.a.a.length()) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return new era(String.valueOf(i));
    }
}
