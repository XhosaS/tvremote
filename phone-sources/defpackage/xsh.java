package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xsh implements Iterator {
    final /* synthetic */ xsi a;
    private boolean b = true;
    private int c;

    public xsh(xsi xsiVar) {
        this.a = xsiVar;
        this.c = xsiVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return true;
        }
        while (true) {
            int i = this.c;
            xsi xsiVar = this.a;
            xsm xsmVar = xsiVar.c;
            if (i >= xsmVar.f) {
                return false;
            }
            if (Arrays.equals(xsiVar.a.b, xsmVar.j(i))) {
                this.b = true;
                return true;
            }
            this.c++;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = false;
        xsi xsiVar = this.a;
        int i = this.c;
        this.c = i + 1;
        return xsiVar.c.d(i, xsiVar.a);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
