package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfz implements Serializable, yft {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(yfz.class, Object.class, "c");
    private volatile yjk b;
    private volatile Object c = ygf.a;

    public yfz(yjk yjkVar) {
        this.b = yjkVar;
    }

    private final Object writeReplace() {
        return new yfr(a());
    }

    @Override // defpackage.yft
    public final Object a() {
        Object obj = this.c;
        ygf ygfVar = ygf.a;
        if (obj != ygfVar) {
            return obj;
        }
        yjk yjkVar = this.b;
        if (yjkVar != null) {
            Object objA = yjkVar.a();
            if (a.F(a, this, ygfVar, objA)) {
                this.b = null;
                return objA;
            }
        }
        return this.c;
    }

    @Override // defpackage.yft
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.c != ygf.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
