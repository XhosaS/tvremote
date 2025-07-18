package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agsa extends agsc implements Iterator {
    public agsa(agsf agsfVar) {
        super(agsfVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        agsf agsfVar = this.a;
        int i = this.b;
        if (i >= agsfVar.f) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        agsb agsbVar = new agsb(agsfVar, i);
        b();
        return agsbVar;
    }
}
