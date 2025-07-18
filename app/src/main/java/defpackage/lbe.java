package defpackage;

import java.lang.Thread;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbe implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ lbh a;
    private final String b;

    public lbe(lbh lbhVar, String str) {
        this.a = lbhVar;
        this.b = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        lbk lbkVar = this.a.y;
        lab labVar = lbkVar.f;
        lbkVar.o(labVar);
        labVar.c.b(this.b, th);
    }
}
