package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsd extends agsc implements Iterator {
    public agsd(agsf agsfVar) {
        super(agsfVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        agsf agsfVar = this.a;
        int i = this.b;
        if (i >= agsfVar.f) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        Object obj = agsfVar.c[i];
        b();
        return obj;
    }
}
