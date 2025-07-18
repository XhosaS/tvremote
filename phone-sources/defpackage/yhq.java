package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhq extends yhs implements Iterator, yli {
    public yhq(yhu yhuVar) {
        super(yhuVar);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        a();
        yhu yhuVar = this.a;
        int i = this.b;
        if (i >= yhuVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        yhr yhrVar = new yhr(yhuVar, i);
        b();
        return yhrVar;
    }
}
