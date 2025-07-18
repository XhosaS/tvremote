package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
class eqz implements Iterator {
    final /* synthetic */ era a;
    private int b = 0;

    public eqz(era eraVar) {
        this.a = eraVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str = this.a.a;
        int i = this.b;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        return new era(String.valueOf(str.charAt(i)));
    }
}
