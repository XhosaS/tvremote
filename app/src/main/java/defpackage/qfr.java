package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfr extends zxb {
    private qfr(zyd zydVar) {
        super(zydVar);
    }

    public static qfr c(zyd zydVar) {
        return zydVar instanceof qfr ? (qfr) zydVar : new qfr(zydVar);
    }

    public final qfr a(Class cls, yqi yqiVar, Executor executor) {
        return new qfr(zud.g(this.b, cls, wyo.a(yqiVar), executor));
    }

    public final qfr b(Class cls, zvi zviVar, Executor executor) {
        return new qfr(zud.h(this.b, cls, wyo.c(zviVar), executor));
    }

    public final qfr e(yqi yqiVar, Executor executor) {
        return new qfr(zuz.g(this.b, wyo.a(yqiVar), executor));
    }

    public final qfr g(zvi zviVar, Executor executor) {
        return new qfr(zuz.h(this.b, wyo.c(zviVar), executor));
    }
}
