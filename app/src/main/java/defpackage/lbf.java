package defpackage;

import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbf extends FutureTask implements Comparable {
    final boolean a;
    final /* synthetic */ lbh b;
    private final long c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbf(lbh lbhVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.b = lbhVar;
        long andIncrement = lbh.a.getAndIncrement();
        this.c = andIncrement;
        this.d = str;
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            lbk lbkVar = lbhVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        lbf lbfVar = (lbf) obj;
        boolean z = lbfVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = this.c;
        long j2 = lbfVar.c;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        lbk lbkVar = this.b.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.d.b("Two tasks share the same index. index", Long.valueOf(j));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        lbk lbkVar = this.b.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.c.b(this.d, th);
        if ((th instanceof lbd) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbf(lbh lbhVar, Callable callable, boolean z) {
        super(callable);
        this.b = lbhVar;
        long andIncrement = lbh.a.getAndIncrement();
        this.c = andIncrement;
        this.d = "Task exception on worker thread";
        this.a = z;
        if (andIncrement == Long.MAX_VALUE) {
            lbk lbkVar = lbhVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Tasks index overflow");
        }
    }
}
