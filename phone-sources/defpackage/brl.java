package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brl implements Iterator, yli {
    public final Iterator a;
    private final /* synthetic */ int b;

    public brl(bgw bgwVar, int i) {
        this.b = i;
        bhd[] bhdVarArr = new bhd[8];
        for (int i2 = 0; i2 < 8; i2++) {
            bhdVarArr[i2] = new bhg(this);
        }
        this.a = new bgx(bgwVar, bhdVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != 0 ? ((bgv) this.a).c : this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.b != 0 ? (Map.Entry) ((bgv) this.a).next() : (brx) this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.b == 0) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        ((bgv) this.a).remove();
    }

    public brl(brm brmVar, int i) {
        this.b = i;
        this.a = brmVar.j.iterator();
    }
}
