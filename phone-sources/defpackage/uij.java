package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uij extends uhn {
    final /* synthetic */ uik a;
    private final Callable b;

    public uij(uik uikVar, Callable callable) {
        this.a = uikVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.uhn
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.uhn
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.uhn
    public final void d(Throwable th) {
        this.a.e(th);
    }

    @Override // defpackage.uhn
    public final void e(Object obj) {
        this.a.b(obj);
    }

    @Override // defpackage.uhn
    public final boolean g() {
        return this.a.isDone();
    }
}
