package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class eit implements Iterator {
    private final boolean a;
    private final List b;
    private int c;
    private int d;

    public eit(List list, int i, int i2, boolean z) {
        this.b = new ArrayList(list);
        this.c = z ? i - 1 : i + 1;
        this.d = i2;
        this.a = z;
    }

    private final void b() {
        this.c += true == this.a ? -1 : 1;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized efn next() {
        if (!hasNext()) {
            return null;
        }
        efn efnVar = (efn) this.b.get(this.c);
        b();
        this.d--;
        return efnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (this.d > 0 && (i = this.c) >= 0) {
            List list = this.b;
            if (i >= list.size()) {
                return false;
            }
            efn efnVar = (efn) list.get(this.c);
            efnVar.c().l();
            if (!efnVar.o()) {
                return true;
            }
            b();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
    }
}
