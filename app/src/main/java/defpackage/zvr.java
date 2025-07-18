package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zvr implements zxe {
    final /* synthetic */ zwc a;
    final /* synthetic */ Executor b;

    public zvr(zwc zwcVar, Executor executor) {
        this.a = zwcVar;
        this.b = executor;
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.c.a.a((AutoCloseable) obj, this.b);
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
    }
}
