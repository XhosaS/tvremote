package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvw implements Iterator {
    private final ArrayDeque a;
    private vsv b;

    public vvw(vsz vszVar) {
        if (!(vszVar instanceof vvx)) {
            this.a = null;
            this.b = (vsv) vszVar;
            return;
        }
        vvx vvxVar = (vvx) vszVar;
        ArrayDeque arrayDeque = new ArrayDeque(vvxVar.g);
        this.a = arrayDeque;
        arrayDeque.push(vvxVar);
        this.b = b(vvxVar.e);
    }

    private final vsv b(vsz vszVar) {
        while (vszVar instanceof vvx) {
            vvx vvxVar = (vvx) vszVar;
            this.a.push(vvxVar);
            int[] iArr = vvx.a;
            vszVar = vvxVar.e;
        }
        return (vsv) vszVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vsv next() {
        vsv vsvVarB;
        vsv vsvVar = this.b;
        if (vsvVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            vsvVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            vvx vvxVar = (vvx) arrayDeque.pop();
            int[] iArr = vvx.a;
            vsvVarB = b(vvxVar.f);
        } while (vsvVarB.v());
        this.b = vsvVarB;
        return vsvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
