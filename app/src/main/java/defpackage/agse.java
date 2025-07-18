package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agse extends agsc implements Iterator {
    public agse(agsf agsfVar) {
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
        Object[] objArr = agsfVar.d;
        objArr.getClass();
        Object obj = objArr[i];
        b();
        return obj;
    }
}
