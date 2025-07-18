package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class abbo implements Iterator {
    abbp a;
    abbp b = null;
    int c;
    final /* synthetic */ abbq d;

    public abbo(abbq abbqVar) {
        this.d = abbqVar;
        this.a = abbqVar.e.d;
        this.c = abbqVar.d;
    }

    public final abbp a() {
        abbq abbqVar = this.d;
        abbp abbpVar = this.a;
        if (abbpVar == abbqVar.e) {
            throw new NoSuchElementException();
        }
        if (abbqVar.d != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = abbpVar.d;
        this.b = abbpVar;
        return abbpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        abbp abbpVar = this.b;
        if (abbpVar == null) {
            throw new IllegalStateException();
        }
        abbq abbqVar = this.d;
        abbqVar.e(abbpVar, true);
        this.b = null;
        this.c = abbqVar.d;
    }
}
