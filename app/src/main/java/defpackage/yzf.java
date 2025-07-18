package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzf extends zdl {
    int a;
    Object b;
    final /* synthetic */ Iterator c;

    public yzf(Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iA = this.a;
        if (iA <= 0) {
            zbo zboVar = (zbo) this.c.next();
            this.b = zboVar.b();
            iA = zboVar.a();
        }
        this.a = iA - 1;
        Object obj = this.b;
        obj.getClass();
        return obj;
    }
}
