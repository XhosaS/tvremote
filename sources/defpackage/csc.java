package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csc implements Serializable, cry {
    private ctj a;
    private volatile Object b = csd.a;
    private final Object c = this;

    private final Object writeReplace() {
        return new crx(a());
    }

    @Override // defpackage.cry
    public final Object a() {
        Object objA;
        Object obj = this.b;
        csd csdVar = csd.a;
        if (obj != csdVar) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == csdVar) {
                ctj ctjVar = this.a;
                ctjVar.getClass();
                objA = ctjVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    public final String toString() {
        return this.b != csd.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
