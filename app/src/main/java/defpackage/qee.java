package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qee {
    public final Executor b;
    public final qed c;
    public final qfq a = new qfq();
    public final Map d = new HashMap();

    public qee(Executor executor, qed qedVar) {
        this.b = executor;
        this.c = qedVar;
    }

    public static qee a(Executor executor) {
        return new qee(executor, new qec());
    }

    public final zyd b(final String str) {
        int i = qce.a;
        return this.a.a.a(new Callable() { // from class: qdz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return yqt.h((zyd) this.a.d.get(str));
            }
        }, this.b);
    }
}
