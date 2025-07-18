package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs extends cii implements RunnableFuture {
    private volatile ciy a;

    public cjs(chs chsVar) {
        this.a = new cjq(this, chsVar);
    }

    public static cjs f(Runnable runnable, Object obj) {
        return new cjs(Executors.callable(runnable, obj));
    }

    @Override // defpackage.cgx
    protected final String a() {
        ciy ciyVar = this.a;
        return ciyVar != null ? b.i(ciyVar, "task=[", "]") : super.a();
    }

    @Override // defpackage.cgx
    protected final void b() {
        ciy ciyVar;
        if (r() && (ciyVar = this.a) != null) {
            ciyVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        ciy ciyVar = this.a;
        if (ciyVar != null) {
            ciyVar.run();
        }
        this.a = null;
    }

    public cjs(Callable callable) {
        this.a = new cjr(this, callable);
    }
}
