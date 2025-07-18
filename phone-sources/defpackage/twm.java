package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twm implements Iterator {
    final /* synthetic */ twn a;
    private int b = 0;

    public twm(twn twnVar) {
        this.a = twnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        twp twpVar = this.a.a;
        return twpVar.e(twpVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
