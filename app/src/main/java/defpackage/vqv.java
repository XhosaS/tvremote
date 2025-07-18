package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqv {
    public static zyd a(zyd zydVar, Callable callable, Executor executor) {
        zye zyeVar = new zye(callable);
        zydVar.d(zyeVar, executor);
        c(zydVar, zyeVar);
        return zyeVar;
    }

    public static zyd b(final zyd zydVar, zvh zvhVar, final Executor executor) {
        zyd zydVarL = zxn.l(new vqu(zvhVar, zydVar), new Executor() { // from class: vqt
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zydVar.d(runnable, executor);
            }
        });
        c(zydVar, zydVarL);
        return zydVarL;
    }

    private static void c(final zyd zydVar, final zyd zydVar2) {
        zydVar2.d(new Runnable() { // from class: vqs
            @Override // java.lang.Runnable
            public final void run() {
                if (zydVar2.isCancelled()) {
                    zydVar.cancel(true);
                }
            }
        }, zwk.a);
    }
}
