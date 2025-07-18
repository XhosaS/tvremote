package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyf implements Callable {
    final /* synthetic */ wwq a;
    final /* synthetic */ Callable b;

    public wyf(wwq wwqVar, Callable callable) {
        this.a = wwqVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        wwq wwqVarG = wum.g(wum.c(), this.a);
        try {
            return this.b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
