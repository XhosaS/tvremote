package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chw extends chx {
    final /* synthetic */ chy a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chw(chy chyVar, Callable callable, Executor executor) {
        super(chyVar, executor);
        this.a = chyVar;
        this.c = callable;
    }

    @Override // defpackage.ciy
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.ciy
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.chx
    public final void c(Object obj) {
        this.a.c(obj);
    }
}
