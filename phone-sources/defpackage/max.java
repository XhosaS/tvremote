package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class max implements Executor {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public max(aaai aaaiVar, Executor executor, int i) {
        this.c = i;
        this.a = executor;
        this.b = aaaiVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            may mayVar = (may) obj;
            if (mfm.b(mayVar.b)) {
                return;
            }
            ?? r2 = this.b;
            mayVar.b();
            r2.execute(new lik(obj, runnable, 12));
            return;
        }
        int i2 = 1;
        if (i == 1) {
            this.b.execute(runnable);
            return;
        }
        if (i == 2) {
            this.b.execute(new utm(this.a, runnable, i2));
        } else {
            try {
                this.a.execute(runnable);
            } catch (RejectedExecutionException e) {
                ((aaai) this.b).g(e);
            }
        }
    }

    public /* synthetic */ max(Object obj, Executor executor, int i) {
        this.c = i;
        this.a = obj;
        this.b = executor;
    }

    public max(Executor executor, ecq ecqVar, int i) {
        this.c = i;
        this.b = executor;
        this.a = ecqVar;
    }
}
