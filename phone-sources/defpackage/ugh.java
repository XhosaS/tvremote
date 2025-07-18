package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugh extends ugi {
    final /* synthetic */ ugj a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugh(ugj ugjVar, Callable callable, Executor executor) {
        super(ugjVar, executor);
        this.a = ugjVar;
        this.c = callable;
    }

    @Override // defpackage.uhn
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.uhn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ugi
    public final void c(Object obj) {
        this.a.b(obj);
    }
}
