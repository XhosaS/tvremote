package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rru extends rrx implements rqf {
    public final rqd a;

    static {
        new LinkedHashSet();
    }

    public rru(yyh yyhVar, xbw xbwVar, Executor executor) {
        super(null);
        new ArrayDeque();
        this.a = yyhVar.f(executor, xbwVar, null);
    }

    @Override // defpackage.rqf
    public final void k() {
        Thread.setDefaultUncaughtExceptionHandler(new rrt(this, Thread.getDefaultUncaughtExceptionHandler(), 0));
    }
}
