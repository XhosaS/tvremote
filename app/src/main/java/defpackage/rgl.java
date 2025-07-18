package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgl {
    public final void a(final Level level, Executor executor, final Throwable th, final String str, final Object... objArr) {
        executor.execute(wyo.h(new Runnable() { // from class: rgj
            @Override // java.lang.Runnable
            public final void run() {
                ((zdv) ((zdv) rgk.a.a(level).p(th)).q("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 44, "Phlogger.java")).M(str, objArr);
            }
        }));
    }
}
