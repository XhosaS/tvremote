package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwh extends zwi {
    final /* synthetic */ zwj a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwh(zwj zwjVar, Callable callable, Executor executor) {
        super(zwjVar, executor);
        this.a = zwjVar;
        this.c = callable;
    }

    @Override // defpackage.zyb
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.zyb
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.zwi
    public final void c(Object obj) {
        this.a.p(obj);
    }
}
