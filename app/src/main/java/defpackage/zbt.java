package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zbt implements Iterator {
    private final zbp a;
    private final Iterator b;
    private zbo c;
    private int d;
    private int e;
    private boolean f;

    public zbt(zbp zbpVar, Iterator it) {
        this.a = zbpVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.d;
        if (iA == 0) {
            zbo zboVar = (zbo) this.b.next();
            this.c = zboVar;
            iA = zboVar.a();
            this.e = iA;
        }
        this.d = iA - 1;
        this.f = true;
        zbo zboVar2 = this.c;
        zboVar2.getClass();
        return zboVar2.b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        yqw.M(this.f, "no calls to next() since the last call to remove()");
        if (this.e == 1) {
            this.b.remove();
        } else {
            zbp zbpVar = this.a;
            zbo zboVar = this.c;
            zboVar.getClass();
            zbpVar.remove(zboVar.b());
        }
        this.e--;
        this.f = false;
    }
}
