package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vp extends vq implements Iterator {
    vn a;
    vn b;

    public vp(vn vnVar, vn vnVar2) {
        this.a = vnVar2;
        this.b = vnVar;
    }

    private final vn d() {
        vn vnVar = this.b;
        vn vnVar2 = this.a;
        if (vnVar == vnVar2 || vnVar2 == null) {
            return null;
        }
        return b(vnVar);
    }

    public abstract vn a(vn vnVar);

    public abstract vn b(vn vnVar);

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map.Entry next() {
        vn vnVar = this.b;
        this.b = d();
        return vnVar;
    }

    @Override // defpackage.vq
    public final void co(vn vnVar) {
        if (this.a == vnVar && vnVar == this.b) {
            this.b = null;
            this.a = null;
        }
        vn vnVar2 = this.a;
        if (vnVar2 == vnVar) {
            this.a = a(vnVar2);
        }
        if (this.b == vnVar) {
            this.b = d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
