package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agpv implements Serializable, agpc {
    private agum a;
    private Object b = agpr.a;

    public agpv(agum agumVar) {
        this.a = agumVar;
    }

    private final Object writeReplace() {
        return new agpa(a());
    }

    @Override // defpackage.agpc
    public final Object a() {
        if (this.b == agpr.a) {
            agum agumVar = this.a;
            agumVar.getClass();
            this.b = agumVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.agpc
    public final boolean b() {
        throw null;
    }

    public final String toString() {
        return this.b != agpr.a ? String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
