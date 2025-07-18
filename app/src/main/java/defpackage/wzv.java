package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzv {
    public final zwc a;

    public wzv(zwc zwcVar) {
        this.a = zwcVar;
    }

    public final wzv a(Class cls, zvy zvyVar, Executor executor) {
        zvy zvyVarE = wyo.e(zvyVar);
        zwc zwcVar = this.a;
        return new wzv(zwcVar.a((zwx) zud.h(zwcVar.d, cls, new zvu(zwcVar, zvyVarE), executor)));
    }

    public final wzv b(zvy zvyVar, Executor executor) {
        return new wzv(this.a.d(wyo.e(zvyVar), executor));
    }

    public final wzv c(zvv zvvVar, Executor executor) {
        return new wzv(this.a.e(wyo.d(zvvVar), executor));
    }

    public final wzx d() {
        return wzx.g(this.a.f());
    }

    public final String toString() {
        return "PropagatedClosingFuture[" + this.a.toString() + "]";
    }
}
