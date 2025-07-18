package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqo implements Iterator {
    final /* synthetic */ AbstractMap a;
    private int b = -1;
    private boolean c;
    private Iterator d;
    private final /* synthetic */ int e;

    public dqo(AbstractMap abstractMap, int i) {
        this.e = i;
        this.a = abstractMap;
    }

    private final Iterator a() {
        if (this.d == null) {
            this.d = ((dqq) this.a).b.entrySet().iterator();
        }
        return this.d;
    }

    private final Iterator b() {
        if (this.d == null) {
            this.d = ((dfw) this.a).b.entrySet().iterator();
        }
        return this.d;
    }

    private final Iterator c() {
        if (this.d == null) {
            this.d = ((vwc) this.a).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        if (i == 0) {
            int i2 = this.b + 1;
            dqq dqqVar = (dqq) this.a;
            if (i2 >= dqqVar.a.size()) {
                return !dqqVar.b.isEmpty() && a().hasNext();
            }
            return true;
        }
        if (i != 1) {
            int i3 = this.b + 1;
            vwc vwcVar = (vwc) this.a;
            if (i3 >= vwcVar.b) {
                return !vwcVar.c.isEmpty() && c().hasNext();
            }
            return true;
        }
        int i4 = this.b + 1;
        dfw dfwVar = (dfw) this.a;
        if (i4 >= dfwVar.a.size()) {
            return !dfwVar.b.isEmpty() && b().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.e;
        if (i == 0) {
            this.c = true;
            int i2 = this.b + 1;
            this.b = i2;
            dqq dqqVar = (dqq) this.a;
            return i2 < dqqVar.a.size() ? (Map.Entry) dqqVar.a.get(this.b) : (Map.Entry) a().next();
        }
        if (i != 1) {
            this.c = true;
            int i3 = this.b + 1;
            this.b = i3;
            vwc vwcVar = (vwc) this.a;
            return i3 < vwcVar.b ? (vwa) vwcVar.a[i3] : (Map.Entry) c().next();
        }
        this.c = true;
        int i4 = this.b + 1;
        this.b = i4;
        dfw dfwVar = (dfw) this.a;
        return i4 < dfwVar.a.size() ? (Map.Entry) dfwVar.a.get(this.b) : (Map.Entry) b().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.e;
        if (i == 0) {
            if (!this.c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c = false;
            dqq dqqVar = (dqq) this.a;
            dqqVar.f();
            if (this.b >= dqqVar.a.size()) {
                a().remove();
                return;
            }
            int i2 = this.b;
            this.b = i2 - 1;
            dqqVar.d(i2);
            return;
        }
        if (i != 1) {
            if (!this.c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.c = false;
            vwc vwcVar = (vwc) this.a;
            vwcVar.e();
            int i3 = this.b;
            if (i3 >= vwcVar.b) {
                c().remove();
                return;
            } else {
                this.b = i3 - 1;
                vwcVar.c(i3);
                return;
            }
        }
        if (!this.c) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.c = false;
        dfw dfwVar = (dfw) this.a;
        dfwVar.f();
        if (this.b >= dfwVar.a.size()) {
            b().remove();
            return;
        }
        int i4 = this.b;
        this.b = i4 - 1;
        dfwVar.d(i4);
    }
}
