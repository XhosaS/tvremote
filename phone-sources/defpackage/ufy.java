package defpackage;

import java.io.Closeable;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ufy implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public ufy(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, tqt] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.c == 0) {
            Closeable closeable = ((Closeable[]) ((zft) this.b).a)[0];
            Object obj = this.a;
            ((ugb) obj).a.d(closeable, ugk.a);
            return null;
        }
        tqt tqtVarE = tqg.e(tqg.d(), this.b);
        try {
            return this.a.call();
        } finally {
        }
    }

    public final String toString() {
        if (this.c == 0) {
            return ((zft) this.b).toString();
        }
        return "propagating=[" + this.a + "]";
    }
}
