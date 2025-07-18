package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class yeu {
    public final xpz a;
    public final xpy b;

    protected yeu(xpz xpzVar, xpy xpyVar) {
        this.a = xpzVar;
        this.b = xpyVar;
    }

    public final yeu K(long j, TimeUnit timeUnit) {
        return a(this.a, this.b.b(xqp.c(j, timeUnit)));
    }

    public final yeu L(xqc... xqcVarArr) {
        return a(wbb.y(this.a, xqcVarArr), this.b);
    }

    public final yeu M(xpx xpxVar, Object obj) {
        return a(this.a, this.b.f(xpxVar, obj));
    }

    protected abstract yeu a(xpz xpzVar, xpy xpyVar);
}
