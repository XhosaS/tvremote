package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnr implements Iterator {
    final /* synthetic */ cnt a;
    private int b = -1;
    private boolean c;
    private Iterator d;

    public cnr(cnt cntVar) {
        this.a = cntVar;
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
        cnt cntVar = this.a;
        if (i >= cntVar.b) {
            return !cntVar.c.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.c = true;
        int i = this.b + 1;
        this.b = i;
        cnt cntVar = this.a;
        return i < cntVar.b ? (cnq) cntVar.a[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        cnt cntVar = this.a;
        cntVar.e();
        int i = this.b;
        if (i >= cntVar.b) {
            a().remove();
        } else {
            this.b = i - 1;
            cntVar.c(i);
        }
    }
}
