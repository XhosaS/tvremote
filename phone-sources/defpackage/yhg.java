package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhg implements Iterator, yli {
    private final long a;
    private boolean b;
    private long c;

    public yhg() {
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        long j = this.c;
        if (j != this.a) {
            this.c = 1 + j;
        } else {
            if (!this.b) {
                throw new NoSuchElementException();
            }
            this.b = false;
        }
        return Long.valueOf(j);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public yhg(byte[] bArr) {
        this.a = 4611686018427387903L;
        this.b = true;
        this.c = -4611686018427387903L;
    }
}
