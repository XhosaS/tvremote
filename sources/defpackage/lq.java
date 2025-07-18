package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lq extends lr implements Iterator {
    lo a;
    lo b;

    public lq(lo loVar, lo loVar2) {
        this.a = loVar2;
        this.b = loVar;
    }

    private final lo d() {
        lo loVar = this.b;
        lo loVar2 = this.a;
        if (loVar == loVar2 || loVar2 == null) {
            return null;
        }
        return b(loVar);
    }

    public abstract lo a(lo loVar);

    @Override // defpackage.lr
    public final void aG(lo loVar) {
        if (this.a == loVar && loVar == this.b) {
            this.b = null;
            this.a = null;
        }
        lo loVar2 = this.a;
        if (loVar2 == loVar) {
            this.a = a(loVar2);
        }
        if (this.b == loVar) {
            this.b = d();
        }
    }

    public abstract lo b(lo loVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        lo loVar = this.b;
        this.b = d();
        return loVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
