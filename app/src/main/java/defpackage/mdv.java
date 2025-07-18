package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mdv extends mdy {
    final /* synthetic */ zyh a;
    final /* synthetic */ agow b;

    public mdv(zyh zyhVar, agow agowVar) {
        this.a = zyhVar;
        this.b = agowVar;
    }

    @Override // defpackage.mdy, defpackage.zxd
    public final /* synthetic */ zyg e() {
        return this.a;
    }

    @Override // defpackage.zwy, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(new mdx(runnable, this.b));
    }

    @Override // defpackage.zwy, defpackage.yxq
    public final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.zxd, defpackage.zwy
    public final /* synthetic */ ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.mdy
    public final zyh h() {
        return this.a;
    }

    @Override // defpackage.zwy, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zwy, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yxq
    public final String toString() {
        return "ExceptionHandling[" + f().toString() + "]";
    }
}
