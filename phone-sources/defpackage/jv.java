package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jv implements Iterator, yli {
    public int a = -1;
    final /* synthetic */ Object b;
    private final Iterator c;
    private final /* synthetic */ int d;

    public jv(jt jtVar, int i) {
        this.d = i;
        this.b = jtVar;
        this.c = ykr.e(new js(jtVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d != 0 ? this.c.hasNext() : this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.d != 0 ? this.c.next() : this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d != 0) {
            int i = this.a;
            if (i != -1) {
                ((jt) this.b).a.e(i);
                this.a = -1;
                return;
            }
            return;
        }
        int i2 = this.a;
        if (i2 != -1) {
            ((jw) this.b).a.i(i2);
            this.a = -1;
        }
    }

    public jv(jw jwVar, int i) {
        this.d = i;
        this.b = jwVar;
        this.c = ykr.e(new ju(jwVar, this, null));
    }
}
