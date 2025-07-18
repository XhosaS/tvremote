package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yga implements Serializable, yft {
    private yjk a;
    private volatile Object b = ygf.a;
    private final Object c = this;

    public /* synthetic */ yga(yjk yjkVar) {
        this.a = yjkVar;
    }

    private final Object writeReplace() {
        return new yfr(a());
    }

    @Override // defpackage.yft
    public final Object a() {
        Object objA;
        Object obj = this.b;
        ygf ygfVar = ygf.a;
        if (obj != ygfVar) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == ygfVar) {
                yjk yjkVar = this.a;
                yjkVar.getClass();
                objA = yjkVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    @Override // defpackage.yft
    public final boolean b() {
        return this.b != ygf.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
