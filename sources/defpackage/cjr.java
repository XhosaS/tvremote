package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cjr extends ciy {
    final /* synthetic */ cjs a;
    private final Callable b;

    public cjr(cjs cjsVar, Callable callable) {
        this.a = cjsVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.ciy
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.ciy
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.ciy
    public final void d(Throwable th) {
        this.a.d(th);
    }

    @Override // defpackage.ciy
    public final void e(Object obj) {
        this.a.c(obj);
    }

    @Override // defpackage.ciy
    public final boolean g() {
        return this.a.isDone();
    }
}
