package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnm implements Iterator {
    private final ArrayDeque a;
    private cks b;

    public cnm(ckv ckvVar) {
        if (!(ckvVar instanceof cnn)) {
            this.a = null;
            this.b = (cks) ckvVar;
            return;
        }
        cnn cnnVar = (cnn) ckvVar;
        ArrayDeque arrayDeque = new ArrayDeque(cnnVar.g);
        this.a = arrayDeque;
        arrayDeque.push(cnnVar);
        this.b = b(cnnVar.e);
    }

    private final cks b(ckv ckvVar) {
        while (ckvVar instanceof cnn) {
            cnn cnnVar = (cnn) ckvVar;
            this.a.push(cnnVar);
            int[] iArr = cnn.a;
            ckvVar = cnnVar.e;
        }
        return (cks) ckvVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cks next() {
        cks cksVarB;
        cks cksVar = this.b;
        if (cksVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            cksVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            cnn cnnVar = (cnn) arrayDeque.pop();
            int[] iArr = cnn.a;
            cksVarB = b(cnnVar.f);
        } while (cksVarB.s());
        this.b = cksVarB;
        return cksVar;
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
