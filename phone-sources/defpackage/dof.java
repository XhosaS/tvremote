package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dof implements Iterator {
    final /* synthetic */ Object a;
    private int b = 0;
    private final int c;
    private final /* synthetic */ int d;

    public dof(dds ddsVar, int i) {
        this.d = i;
        this.a = ddsVar;
        this.c = ddsVar.c();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != 0 ? this.b < this.c : this.b < this.c;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (this.d != 0) {
            int i = this.b;
            if (i >= this.c) {
                throw new NoSuchElementException();
            }
            this.b = i + 1;
            return Byte.valueOf(((dds) this.a).b(i));
        }
        int i2 = this.b;
        if (i2 >= this.c) {
            throw new NoSuchElementException();
        }
        this.b = i2 + 1;
        return Byte.valueOf(((dol) this.a).b(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d == 0) {
            throw new UnsupportedOperationException();
        }
        throw new UnsupportedOperationException();
    }

    public dof(dol dolVar, int i) {
        this.d = i;
        this.a = dolVar;
        this.c = dolVar.c();
    }
}
