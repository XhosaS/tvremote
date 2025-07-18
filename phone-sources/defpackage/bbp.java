package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbp implements Iterator, yli {
    private final bdg a;
    private final int b;
    private int c;
    private final int d;

    public bbp(bdg bdgVar, int i, int i2) {
        this.a = bdgVar;
        this.b = i2;
        this.c = i;
        this.d = bdgVar.g;
        if (bdgVar.f) {
            bdi.g();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        bdg bdgVar = this.a;
        int i = bdgVar.g;
        int i2 = this.d;
        if (i != i2) {
            bdi.g();
        }
        int i3 = this.c;
        this.c = bdi.a(bdgVar.a, i3) + i3;
        return new bdh(bdgVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
