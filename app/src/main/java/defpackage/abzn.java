package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abzn implements Iterator {
    final /* synthetic */ abzp a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public abzn(abzp abzpVar) {
        this.a = abzpVar;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = this.a.c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b + 1;
        abzp abzpVar = this.a;
        if (i >= abzpVar.b) {
            return !abzpVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        abzp abzpVar = this.a;
        return i < abzpVar.b ? (abzm) abzpVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        abzp abzpVar = this.a;
        abzpVar.e();
        int i = this.b;
        if (i >= abzpVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            abzpVar.c(i);
        }
    }
}
