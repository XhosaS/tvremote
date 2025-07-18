package defpackage;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class avz extends se implements auh {
    public final aue a;

    static {
        new LinkedHashSet();
    }

    public avz(auf aufVar, cov covVar, Executor executor) {
        this.a = aufVar.a(executor, covVar, null);
    }

    @Override // defpackage.auh
    public final void t() {
        Thread.setDefaultUncaughtExceptionHandler(new bdz(this, Thread.getDefaultUncaughtExceptionHandler(), 1));
    }
}
