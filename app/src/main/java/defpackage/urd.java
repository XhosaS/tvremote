package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urd implements urc {
    public final urk a;

    public urd(final urk urkVar) {
        this.a = urkVar;
        if (urkVar.e) {
            return;
        }
        final zyd zydVarEN = urkVar.c.eN(new Callable() { // from class: urg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
            /* JADX WARN: Type inference failed for: r2v2 */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 232
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.urg.call():java.lang.Object");
            }
        });
        zydVarEN.d(new Runnable() { // from class: urh
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    urkVar.d.set((urj) zxn.o(zydVarEN));
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }
        }, zwk.a);
        urkVar.e = true;
    }
}
