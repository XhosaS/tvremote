package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjz implements bdu {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final cjx b;
    private final byg c;

    public cjz(cjx cjxVar, byg bygVar) {
        this.b = cjxVar;
        this.c = bygVar;
    }

    @Override // defpackage.bdu
    public final void a() {
        if (Process.isIsolated() || a.getAndSet(true)) {
            return;
        }
        bxb bxbVarG = awo.g("AndroidLoggerConfig");
        try {
            cjx cjxVar = this.b;
            byg bygVar = this.c;
            ces cesVar = bygVar.f() ? (ces) bygVar.b() : null;
            if (!ceh.a.compareAndSet(false, true)) {
                throw new IllegalStateException("Logger backend configuration may only occur once.");
            }
            AtomicReference atomicReference = cen.d;
            while (!atomicReference.compareAndSet(null, cjxVar)) {
                if (atomicReference.get() != null) {
                    throw new IllegalStateException("Logger backends can only be configured once.");
                }
            }
            cen.d();
            AtomicReference atomicReference2 = ceo.a.b;
            if (cesVar == null) {
                cesVar = ceu.a;
            }
            atomicReference2.set(cesVar);
            bxbVarG.close();
        } catch (Throwable th) {
            try {
                bxbVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
