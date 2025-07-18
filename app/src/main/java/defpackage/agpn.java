package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpn implements Serializable, agpc {
    private agum a;
    private volatile Object b = agpr.a;
    private final Object c = this;

    public agpn(agum agumVar) {
        this.a = agumVar;
    }

    private final Object writeReplace() {
        return new agpa(a());
    }

    @Override // defpackage.agpc
    public final Object a() {
        Object objA;
        Object obj = this.b;
        agpr agprVar = agpr.a;
        if (obj != agprVar) {
            return obj;
        }
        synchronized (this.c) {
            objA = this.b;
            if (objA == agprVar) {
                agum agumVar = this.a;
                agumVar.getClass();
                objA = agumVar.a();
                this.b = objA;
                this.a = null;
            }
        }
        return objA;
    }

    @Override // defpackage.agpc
    public final boolean b() {
        return this.b != agpr.a;
    }

    public final String toString() {
        return b() ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
