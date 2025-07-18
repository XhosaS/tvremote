package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abzg implements Iterator {
    private final ArrayDeque a;
    private abvl b;

    public abzg(abvo abvoVar) {
        if (!(abvoVar instanceof abzi)) {
            this.a = null;
            this.b = (abvl) abvoVar;
            return;
        }
        abzi abziVar = (abzi) abvoVar;
        ArrayDeque arrayDeque = new ArrayDeque(abziVar.g);
        this.a = arrayDeque;
        arrayDeque.push(abziVar);
        this.b = b(abziVar.e);
    }

    private final abvl b(abvo abvoVar) {
        while (abvoVar instanceof abzi) {
            abzi abziVar = (abzi) abvoVar;
            this.a.push(abziVar);
            int i = abzi.h;
            abvoVar = abziVar.e;
        }
        return (abvl) abvoVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final abvl next() {
        abvl abvlVarB;
        abvl abvlVar = this.b;
        if (abvlVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.a;
            abvlVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            abzi abziVar = (abzi) arrayDeque.pop();
            int i = abzi.h;
            abvlVarB = b(abziVar.f);
        } while (abvlVarB.A());
        this.b = abvlVarB;
        return abvlVar;
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
