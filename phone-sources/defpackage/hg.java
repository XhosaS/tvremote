package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hg extends hn {
    public final HashMap a = new HashMap();

    @Override // defpackage.hn
    public final hj a(Object obj) {
        return (hj) this.a.get(obj);
    }

    @Override // defpackage.hn
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.a.remove(obj);
        return objB;
    }

    public final boolean c(Object obj) {
        return this.a.containsKey(obj);
    }
}
