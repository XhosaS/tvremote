package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygj implements Serializable, yft {
    private yjk a;
    private Object b = ygf.a;

    public ygj(yjk yjkVar) {
        this.a = yjkVar;
    }

    private final Object writeReplace() {
        return new yfr(a());
    }

    @Override // defpackage.yft
    public final Object a() {
        if (this.b == ygf.a) {
            yjk yjkVar = this.a;
            yjkVar.getClass();
            this.b = yjkVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.yft
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.b != ygf.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
