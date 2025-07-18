package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxj {
    private final boolean a;
    private final yyk b;

    public zxj(boolean z, yyk yykVar) {
        this.a = z;
        this.b = yykVar;
    }

    public final zyd a(Callable callable, Executor executor) {
        return new zwj(this.b, this.a, executor, callable);
    }

    public final zyd b(zvh zvhVar, Executor executor) {
        return new zwj(this.b, this.a, executor, zvhVar);
    }
}
