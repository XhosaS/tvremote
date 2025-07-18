package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wzx extends zxb {
    private wzx(zyd zydVar) {
        super(zydVar);
    }

    public static wzx g(zyd zydVar) {
        return zydVar instanceof wzx ? (wzx) zydVar : new wzx(zydVar);
    }

    public final wzx c(Class cls, yqi yqiVar, Executor executor) {
        return new wzx(zud.g(this.b, cls, wyo.a(yqiVar), executor));
    }

    public final wzx e(Class cls, zvi zviVar, Executor executor) {
        return new wzx(zud.h(this.b, cls, wyo.c(zviVar), executor));
    }

    public final wzx h(yqi yqiVar, Executor executor) {
        return new wzx(zuz.g(this.b, wyo.a(yqiVar), executor));
    }

    public final wzx i(zvi zviVar, Executor executor) {
        return new wzx(zuz.h(this.b, wyo.c(zviVar), executor));
    }
}
